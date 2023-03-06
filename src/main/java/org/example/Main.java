package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("________________________________________________________________________________________________________");
        System.out.println("________________________________________________Perro___________________________________________________");
        System.out.println("________________________________________________________________________________________________________");
        perro dog = new perro ("Ghost", "Pastor Alemán", "Grande", Color.black, 4);
        System.out.println(dog);
        System.out.println(dog.comer());
        System.out.println(dog.ladrar());
        System.out.println(dog.caminar());

        System.out.println("________________________________________________________________________________________________________");
        System.out.println("_________________________________________________Casa___________________________________________________");
        System.out.println("________________________________________________________________________________________________________");
        casa house = new casa("Bosques de Aragon", 3, false, Color.white, 3);
        System.out.println(house);
        System.out.println(house.bloquearentrada());
        System.out.println(house.expandir());
        System.out.println(house.vender());

    }
    }
