package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonRepo implements AutoCloseable {
    private  Connection connection;
    private  PreparedStatement preparedStatement;
    public PersonRepo()throws  Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hossein","hossein7581");
        connection.setAutoCommit(false);
    }
    public void insert (PersonEnti personEnti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into mellicard(name,family,dateofbirth,fathername) values (?,?,?,?)");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString(2,personEnti.getFamily());
        preparedStatement.setString(3,personEnti.getDateoofbirth());
        preparedStatement.setString(4,personEnti.getFathername());
        preparedStatement.executeUpdate();


    }

    public void update (PersonEnti personEnti)throws Exception{
        preparedStatement=connection.prepareStatement("update mellicard set name=?,dateofbirth=?,fathername=? where family=?");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString(2,personEnti.getDateoofbirth());
        preparedStatement.setString(3,personEnti.getFathername());
        preparedStatement.setString(4,personEnti.getFamily());
        preparedStatement.executeUpdate();

    }
    public void delete(String family)throws Exception{
        preparedStatement=connection.prepareStatement("delete from mellicard where family=?");
        preparedStatement.setString(1,family);
        preparedStatement.executeUpdate();
    }
    public void close()throws  Exception{
        connection.close();
        preparedStatement.close();
    }
    public void commit ()throws Exception{
    connection.commit();
    }

}
