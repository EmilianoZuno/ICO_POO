package org.example;

import java.util.Scanner;

    public class Tarea2 {
        public static void main(String[] args) {

            Scanner teclado = new Scanner (System.in);
            int a = 0; boolean cadena;

            System.out.print("Ingresar texto: ");
            String input = teclado.nextLine();


            Integer[] valores = new Integer[input.length()];

            for(int i = 0; i < input.length(); i++){
                valores[i] = (int)input.charAt(i);
            }

            while(valores[a] < valores[a+1]){
                a++;
                if(a == (valores.length-1)){
                    break;
                }

            }
            if(a == (valores.length-1)){
                cadena = true;
                System.out.println(cadena);
            } else{
                cadena = false;
                System.out.println(cadena);
            }
        }
}
