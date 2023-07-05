import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    double calcularVolumen() {
        return 0;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Triángulo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
