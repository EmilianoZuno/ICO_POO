package org.example;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a= 0;

        System.out.println("Introduce la cadena: ");
        String cadena = teclado.nextLine();

        char [] caracteres = new char [cadena.length()];

        for(int i=0; i < caracteres.length; i++){
            caracteres[i]= cadena.charAt(i);
            if (caracteres [i]!= 'o' && caracteres [i]!= 'x' && caracteres[i] != '_'){
                System.out.println("Caracter no valido: " + caracteres[i]);
            }
        }
        System.out.println("-----");
        for(int i=1; i <= 3;i++){
            System.out.println("|"+ caracteres[a] + caracteres[a+1] + caracteres[a+2] + "|");
            a+=3;
        }
        System.out.println("-----");
    }

    }

