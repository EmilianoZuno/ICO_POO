package org.example;

public class MaquinaDriver {
    public static void main(String[] args) {
        Maquina cafe = new Maquina(5000, 1500, 1000, 50);

        for (int i = 0; i < 45; i++) {
            cafe.expreso();
        }


    }
}
