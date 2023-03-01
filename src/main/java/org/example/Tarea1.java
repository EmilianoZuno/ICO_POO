package org.example;

import java.util.Scanner;


    public class Tarea1 {

        public static void main(String[] args) {

            System.out.println("Introduce nombre profesion y nacionalidad");
            Scanner teclado = new Scanner(System.in);
            String input = teclado.nextLine();

            String[] cadena = input.trim().split(" ");

            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    System.out.println("Nombre: " + cadena[i]);
                } else {
                    if (i == 1) {
                        System.out.println("Profesion: " + cadena[i]);
                    } else {
                        System.out.println("Nacionalidad: " + cadena[i]);

                    }
                }
            }
        }
    }


