package org.example.SQLiteDemo;

import org.example.SQLiteDemo.controlador.ControladorLibro;
import org.example.SQLiteDemo.modelo.Libro;
import org.example.SQLiteDemo.persistencia.DemoLibroDB;
import org.example.SQLiteDemo.persistencia.LibroDAO;
import org.example.SQLiteDemo.vista.VentanaLibro;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controller = new ControladorLibro(view);
    }
}
