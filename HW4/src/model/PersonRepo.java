package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonRepo implements AutoCloseable{
    //public class PersonRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hossein", "hossein7581");
        connection.setAutoCommit (false);
    }

    public void insert(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO importcommodity(name,gender,countryname,weight,price) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString (2,personEnti.getGender());
        preparedStatement.setString (3,personEnti.getCountryname());
        preparedStatement.setDouble (4,personEnti.getWeight());
        preparedStatement.setDouble (5,personEnti.getPrice());
        preparedStatement.executeUpdate ();
    }
    public void update(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("update  importcommodity set gender=?,countryname=?,weight=?,price=? where name=?");

        preparedStatement.setString (1,personEnti.getGender());
        preparedStatement.setString (2,personEnti.getCountryname());
        preparedStatement.setDouble (3,personEnti.getWeight());
        preparedStatement.setDouble (4,personEnti.getPrice());
        preparedStatement.setString(5,personEnti.getName());
        preparedStatement.executeUpdate ();
    }
    public void display() throws Exception{

        preparedStatement=connection.prepareStatement ("select * from importcommodity");

        ResultSet resultSet=preparedStatement.executeQuery();
        System.out.println("importcommodity are:");
        while (resultSet.next()){
            System.out.println("name:"+resultSet.getString("name"));
            System.out.println("gender:"+resultSet.getString("gender"));
            System.out.println("countryname:"+resultSet.getString("countryname"));
            System.out.println("weight:"+resultSet.getDouble("weight")+"gr");
            System.out.println("price:"+resultSet.getDouble("price")+"T");
        }

    }
    public void delete(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("delete from importcommodity where name=?");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.executeUpdate ();
    }





    public void insert1(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO exportcommodity(name,gender,countryname,weight,price) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString (2,personEnti.getGender());
        preparedStatement.setString (3,personEnti.getCountryname());
        preparedStatement.setDouble (4,personEnti.getWeight());
        preparedStatement.setDouble (5,personEnti.getPrice());
        preparedStatement.executeUpdate ();
    }
    public void update1(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("update  exportcommodity set gender=?,countryname=?,weight=?,price=? where name=?");

        preparedStatement.setString (1,personEnti.getGender());
        preparedStatement.setString (2,personEnti.getCountryname());
        preparedStatement.setDouble (3,personEnti.getWeight());
        preparedStatement.setDouble (4,personEnti.getPrice());
        preparedStatement.setString(5,personEnti.getName());
        preparedStatement.executeUpdate ();
    }
    public void display1() throws Exception{
        preparedStatement=connection.prepareStatement ("select * from exportcommodity");

        ResultSet resultSet=preparedStatement.executeQuery();
        System.out.println("exportcommodity are:");
        while (resultSet.next()){
            System.out.println("name:"+resultSet.getString("name"));
            System.out.println("gender:"+resultSet.getString("gender"));
            System.out.println("countryname:"+resultSet.getString("countryname"));
            System.out.println("weight:"+resultSet.getDouble("weight")+"gr");
            System.out.println("price:"+resultSet.getDouble("price")+"T");
        }

    }
    public void delete1(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("delete from exportcommodity where name=?");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.executeUpdate ();
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