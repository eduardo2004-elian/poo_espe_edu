package calculadoradefigurasintento2xd;

import java.util.Scanner;

public class Calculadoradefigurasintento2xd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Menú 1");
            System.out.println("1: Conocer Área");
            System.out.println("2: Conocer Perímetro");
            System.out.println("3: Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de figuras que desea conocer su área: ");
                    int cantidadFigurasArea = scanner.nextInt();

                    for (int i = 0; i < cantidadFigurasArea; i++) {
                        System.out.println("Menú 2");
                        System.out.println("1: Cuadrado");
                        System.out.println("2: Triángulo");
                        System.out.println("3: Rectángulo");
                        System.out.println("4: Paralelogramo");
                        System.out.print("Ingrese una opción: ");
                        int opcionMenu2 = scanner.nextInt();

                        double base, altura, lado1, lado2, lado3;

                        switch (opcionMenu2) {
                            case 1:
                                System.out.print("Ingrese el lado del cuadrado: ");
                                double ladoCuadrado = scanner.nextDouble();
                                Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                                System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                                break;

                            case 2:
                                System.out.print("Ingrese la base del triángulo: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del triángulo: ");
                                altura = scanner.nextDouble();
                                System.out.print("Ingrese el lado 1 del triángulo: ");
                                lado1 = scanner.nextDouble();
                                System.out.print("Ingrese el lado 2 del triángulo: ");
                                lado2 = scanner.nextDouble();
                                System.out.print("Ingrese el lado 3 del triángulo: ");
                                lado3 = scanner.nextDouble();
                                Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                                System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                                break;

                            case 3:
                                System.out.print("Ingrese la base del rectángulo: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del rectángulo: ");
                                altura = scanner.nextDouble();
                                System.out.print("Ingrese el lado 1 del rectángulo: ");
                                lado1 = scanner.nextDouble();
                                Rectangulo rectangulo = new Rectangulo(base, altura, lado1);
                                System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
                                break;

                            case 4:
                                System.out.print("Ingrese la base del paralelogramo: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del paralelogramo: ");
                                altura = scanner.nextDouble();
                                System.out.print("Ingrese el lado 1 del paralelogramo: ");
                                lado1 = scanner.nextDouble();
                                Paralelogramo paralelogramo = new Paralelogramo(base, altura, lado1);
                                System.out.println("El área del paralelogramo es: " + paralelogramo.calcularArea());
                                break;

                            default:
                                System.out.println("Opción inválida");
                                break;
                        }
                    }

                    break;

                case 2:
                    System.out.print("Ingrese la cantidad de figuras que desea conocer su perímetro: ");
                    int cantidadFigurasPerimetro = scanner.nextInt();

                    for (int i = 0; i < cantidadFigurasPerimetro; i++) {
                        System.out.println("Menú 2");
                        System.out.println("1: Cuadrado");
                        System.out.println("2: Triángulo");
                        System.out.println("3: Rectángulo");
                        System.out.println("4: Paralelogramo");
                        System.out.print("Ingrese una opción: ");
                        int opcionMenu2 = scanner.nextInt();

                        double lado, lado1, lado2, lado3;

                        switch (opcionMenu2) {
                            case 1:
                                System.out.print("Ingrese el lado del cuadrado: ");
                                lado = scanner.nextDouble();
                                Cuadrado cuadrado = new Cuadrado(lado);
                                System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                                break;

                            case 2:
                                System.out.print("Ingrese el lado 1 del triángulo: ");
                                lado1 = scanner.nextDouble();
                                System.out.print("Ingrese el lado 2 del triángulo: ");
                                lado2 = scanner.nextDouble();
                                System.out.print("Ingrese el lado 3 del triángulo: ");
                                lado3 = scanner.nextDouble();
                                Triangulo triangulo = new Triangulo(0, 0, lado1, lado2, lado3);
                                System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                                break;

                            case 3:
                                System.out.print("Ingrese la base del rectángulo: ");
                            double base = scanner.nextDouble();
                                System.out.print("Ingrese el lado 1 del rectángulo: ");
                                lado1 = scanner.nextDouble();
                                Rectangulo rectangulo = new Rectangulo(base, 0, lado1);
                                System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
                                break;


                            case 4:
                                System.out.print("Ingrese la base del paralelogramo: ");
                                base = scanner.nextDouble();
                                System.out.print("Ingrese el lado 1 del paralelogramo: ");
                                lado1 = scanner.nextDouble();
                                Paralelogramo paralelogramo = new Paralelogramo(base, 0, lado1);
                                System.out.println("El perímetro del paralelogramo es: " + paralelogramo.calcularPerimetro());
                                break;

                            default:
                                System.out.println("Opción inválida");
                                break;
                        }
                    }

                    break;

                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        scanner.close();
    }
    }
    
// Clase padre Figuras
class Figuras {
    // Atributos
    protected double base;
    protected double altura;

    // Constructor
    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return 0;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 0;
    }
}

// Clase hija Cuadrado
class Cuadrado extends Figuras {
    // Constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    // Redefinición del método para calcular el área
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Redefinición del método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 4 * base;
    }
}

// Clase hija Triángulo
class Triangulo extends Figuras {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super(base, altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Redefinición del método para calcular el área
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Redefinición del método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Clase hija Rectángulo
class Rectangulo extends Figuras {
    private double lado1;

    // Constructor
    public Rectangulo(double base, double altura, double lado1) {
        super(base, altura);
        this.lado1 = lado1;
    }

    // Redefinición del método para calcular el área
    @Override
    public double calcularArea() {
        return base * lado1;
    }

    // Redefinición del método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + lado1);
    }
}

// Clase hija Paralelogramo
class Paralelogramo extends Figuras {
    private double lado1;

    // Constructor
    public Paralelogramo(double base, double altura, double lado1) {
        super(base, altura);
        this.lado1 = lado1;
    }

    // Redefinición del método para calcular el área
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Redefinición del método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + lado1);
    }
}

