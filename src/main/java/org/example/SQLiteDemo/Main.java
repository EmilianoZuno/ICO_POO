package org.example.SQLiteDemo;

import org.example.SQLiteDemo.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DemoLibroDB demo = new DemoLibroDB();
        demo.insertarStatement();

        System.out.println("Con prepared");
        demo.insertarPreparedStatement();
    }
}
