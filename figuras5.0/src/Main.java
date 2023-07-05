import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("Elija una figura: ");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Pirámide");
            System.out.println("7. Imprimir todas las figuras con sus cálculos");
            System.out.println("8. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 8) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Ingrese el lado 1 del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Ingrese el lado 2 del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Ingrese el lado 3 del triángulo: ");
                    double lado3 = scanner.nextDouble();

                    Figura triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                    figuras.add(triangulo);
                    break;

                case 2:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();

                    Figura cuadrado = new Cuadrado(ladoCuadrado);
                    figuras.add(cuadrado);
                    break;

                case 3:
                    System.out.println("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();

                    Figura circulo = new Circulo(radio);
                    figuras.add(circulo);
                    break;

                case 4:
                    System.out.println("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();

                    Figura esfera = new Esfera(radioEsfera);
                    figuras.add(esfera);
                    break;

                case 5:
                    System.out.println("Ingrese el lado del cubo: ");
                    double ladoCubo = scanner.nextDouble();

                    Figura cubo = new Cubo(ladoCubo);
                    figuras.add(cubo);
                    break;

                case 6:
                    System.out.println("Ingrese la base de la pirámide: ");
                    double basePiramide = scanner.nextDouble();
                    System.out.println("Ingrese la altura de la pirámide: ");
                    double alturaPiramide = scanner.nextDouble();
                    System.out.println("Ingrese el lado de la pirámide: ");
                    double ladoPiramide = scanner.nextDouble();

                    Figura piramide = new Piramide(basePiramide, alturaPiramide, ladoPiramide);
                    figuras.add(piramide);
                    break;

                case 7:
                    for (Figura figura : figuras) {
                        figura.imprimirCalculos();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }
}