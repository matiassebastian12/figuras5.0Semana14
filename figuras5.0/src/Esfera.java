import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    @Override
    double calcularVolumen() {
        return (4 * Math.PI * radio * radio * radio) / 3;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Esfera");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
