package org.example;

import java.awt.*;
public class casa {
    private String direccion;
    private int puertas;
    private boolean alberca;
    private Color colorexterior;
    private int pisos;

    public casa(String direccion, int puertas, boolean alberca, Color colorexterior, int pisos) {
        this.direccion = direccion;
        this.puertas = puertas;
        this.alberca = alberca;
        this.colorexterior = colorexterior;
        this.pisos = pisos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAlberca() {
        return alberca;
    }

    public void setAlberca(boolean alberca) {
        this.alberca = alberca;
    }

    public Color getColorexterior() {
        return colorexterior;
    }

    public void setColorexterior(Color colorexterior) {
        this.colorexterior = colorexterior;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "casa{" +
                "direccion='" + direccion + '\'' +
                ", puertas=" + puertas +
                ", alberca=" + alberca +
                ", colorexterior=" + colorexterior +
                ", pisos=" + pisos +
                '}';
    }
    public boolean bloquearentrada() {
        System.out.print("Se bloqueó la entrada? ");
        boolean cerrado = Math.random() > 0.51;
        return cerrado;
    }
    public float expandir() {
        System.out.print("Metros que se expandió la casa en el año ");
        float metros = (float) (Math.random()*10);
        return metros;
    }
    public double vender() {
        System.out.print("Valor de la casa: $");
        double valor = Math.random()*10000000;
        return valor;
    }
}
