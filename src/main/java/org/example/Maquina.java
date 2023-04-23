package org.example;

public class Maquina {

    private int agua;
    private int crema;
    private int cafe;
    private int vasos;

    public Maquina(int agua, int crema, int cafe, int vasos) {
        this.agua = agua;
        this.crema = crema;
        this.cafe = cafe;
        this.vasos = vasos;
    }

    public Maquina() {
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua >= 0 && agua <= 5000) {
            this.agua = agua;
        } else {
            System.out.println("Error: Dato incorrecto");
    }
    }
    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
            if (crema > 0 && crema < 1500) {
                this.crema = crema;
            } else {
                System.out.println("Error: Dato incorrecto");    }
        }
    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
                if (cafe > 0 && cafe < 1000) {
                    this.cafe = cafe;
                } else {
                    System.out.println("Error: Dato incorrecto");    }
            }
    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "agua=" + agua + " ml" +
                ", crema=" + crema + " ml" +
                ", cafe=" + cafe + " g" +
                ", vasos=" + vasos +
                '}';
    }

public void americano () {
        if (agua >= 180 && cafe >= 15 && vasos >= 1){
        boolean ame, exp, capu;
    agua = agua - 180;
    cafe = cafe - 15;
    vasos -= 1;
    System.out.println("_________________________");
    System.out.println("Sirviendo cafe...");
    if(agua >= 100 && cafe >= 14 && crema >= 70){
        capu = true;
    } else{  capu = false;}
    if(agua >= 120 && cafe >= 20){
        exp = true;
    } else{  exp = false;}
    if(agua >= 180 && cafe >= 15){
        ame = true;
    } else{  ame = false;}
    System.out.println("¿Puede seguir sirviendo?");
    System.out.println("Americano: " + ame);
    System.out.println("Expreso: " + exp);
    System.out.println("Capuchino: " + capu);
    System.out.println("_________________________");
        } else {System.out.println("Error_Recursos insuficientes"); System.out.println(toString());}
}
    public void expreso () {
        if(agua >= 120 && cafe >= 20 && vasos >= 1){
        boolean ame, exp, capu;
        agua = agua - 120;
        cafe = cafe - 20;
        vasos -= 1;
        System.out.println("_________________________");
        System.out.println("Sirviendo cafe...");
        if(agua >= 100 && cafe >= 14 && crema >= 70){
            capu = true;
        } else{  capu = false;}
        if(agua >= 120 && cafe >= 20){
            exp = true;
        } else{  exp = false;}
        if(agua >= 180 && cafe >= 15){
            ame = true;
        } else{  ame = false;}
        System.out.println("¿Puede seguir sirviendo?");
        System.out.println("Americano: " + ame);
        System.out.println("Expreso: " + exp);
        System.out.println("Capuchino: " + capu);
        System.out.println("_________________________");
        } else {System.out.println("Error_Recursos insuficientes"); System.out.println(toString());}
    }
    public void capuchino  () {
        if(agua >= 100 && cafe >= 14 && crema >= 70 && vasos >= 1){
        boolean ame, exp, capu;
        agua = agua - 100;
        cafe = cafe - 14;
        crema -= 70;
        vasos -= 1;
        System.out.println("_________________________");
        System.out.println("Sirviendo cafe...");
        if(agua >= 100 && cafe >= 14 && crema >= 70){
            capu = true;
        } else{  capu = false;}




        if(agua >= 120 && cafe >= 20){
            exp = true;
        } else{  exp = false;}
        if(agua >= 180 && cafe >= 15){
            ame = true;
        } else{  ame = false;}
        System.out.println("¿Puede seguir sirviendo?");
        System.out.println("Americano: " + ame);
        System.out.println("Expreso: " + exp);
        System.out.println("Capuchino: " + capu);
        System.out.println("_________________________");
        } else {System.out.println("Error_Recursos insuficientes"); System.out.println(toString());}
    }
    public void estado (){
        System.out.println("Niveles de: ");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
    }
}
