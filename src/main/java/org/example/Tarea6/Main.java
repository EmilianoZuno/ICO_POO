package org.example.Tarea6;

import org.example.Tarea6.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area = " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del círculo = " + circulo.calcularArea());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basketball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
}
