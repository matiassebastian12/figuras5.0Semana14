import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    double calcularVolumen() {
        return 0;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Cuadrado");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
