package org.example.Tarea6.herenciamultiple;

public class Alumno extends Persona{
    private int numeroCuenta;
    private String carrera;
    private double promedio;

    public Alumno(int numeroCuenta, String carrera, double promedio) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Alumno(String nombre, String edad, int numeroCuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String edad) {
        super(nombre, edad);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCuenta=" + numeroCuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
