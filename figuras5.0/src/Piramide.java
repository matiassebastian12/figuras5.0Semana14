import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Piramide extends Figura {
    private double base;
    private double altura;
    private double lado;

    public Piramide(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return (base * lado) + (base * Math.sqrt((lado * lado) - ((base * base) / 4)));
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    @Override
    double calcularVolumen() {
        return (base * base * altura) / 3;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Pirámide");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
