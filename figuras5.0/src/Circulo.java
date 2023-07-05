import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    double calcularVolumen() {
        return 0;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Círculo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
