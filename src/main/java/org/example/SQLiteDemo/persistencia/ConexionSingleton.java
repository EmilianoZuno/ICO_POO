package org.example.SQLiteDemo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection connection;

    private ConexionSingleton(String dataBase){
        this.baseDatos = dataBase;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance (String baseDatos){
        if(_instance == null){
            _instance = new ConexionSingleton(baseDatos);
        }else{
            System.out.println("Ya fue creada.");
        }
        return _instance;
    }


    public Connection getConnection(){
        return connection;
    }
}
