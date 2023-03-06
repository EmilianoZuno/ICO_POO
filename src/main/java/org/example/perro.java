package org.example;

import java.awt.*;

public class perro {

    private String nombre;
    private int edad;
    private String raza;
    private String tamanio;
    private Color color;

    //constructores


    public perro(String nombre, String raza, String tamanio, Color color, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 25) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad incorrecta");
    }
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color=" + color +
                '}';
    }

    public boolean comer ( ) {
        System.out.print(nombre + " quiere comer? ");
       boolean resultado = Math.random() > 0.51;
       return resultado;
}
public float ladrar () {
    System.out.print("Segundos que " + nombre + " tardó en ladrar después de que golpearan la puerta: ");
    float ladridos = (float)(Math.random());
    return ladridos;
}
public double caminar () {
    System.out.print("Metros que " + nombre + " recorrió a lo largo del día: ");
    double distancia = (Math.random())*1000;
return distancia;
}
}