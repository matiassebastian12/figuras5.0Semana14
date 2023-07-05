import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cubo extends Figura {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    @Override
    double calcularVolumen() {
        return lado * lado * lado;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Cubo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
