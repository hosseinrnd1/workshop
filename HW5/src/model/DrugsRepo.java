package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DrugsRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DrugsRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hossein", "hossein7581");
        connection.setAutoCommit (false);
    }

    public void insert(DrugsEntity drugsEntity) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO daroo(groop,name) VALUES (?,?)");
        preparedStatement.setString (1,drugsEntity.getGroup());
        preparedStatement.setString (2,drugsEntity.getName());

        preparedStatement.executeUpdate ();
    }
    public List<DrugsEntity> select(String group) throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM daroo where groop=?");
        preparedStatement.setString(1,group);
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<DrugsEntity> drugsEntiList=new ArrayList<>();
        while (resultSet.next ()){
            DrugsEntity drugsEntity=new DrugsEntity ();
            drugsEntity.setName (resultSet.getString ("name"));
            drugsEntity.setGroup(group);

            drugsEntiList.add (drugsEntity);
        }
        return drugsEntiList;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
