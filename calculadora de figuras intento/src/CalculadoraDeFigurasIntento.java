import java.util.Scanner;

public class CalculadoraDeFigurasIntento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu1 = 0;

        while (opcionMenu1 != 3) {
            System.out.println("----- Menú 1 -----");
            System.out.println("1: Conocer Área");
            System.out.println("2: Conocer Perímetro");
            System.out.println("3: Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenu1 = scanner.nextInt();

            switch (opcionMenu1) {
                case 1:
                    System.out.print("Ingrese la cantidad de figuras a calcular: ");
                    int cantidadFiguras = scanner.nextInt();

                    for (int i = 0; i < cantidadFiguras; i++) {
                        System.out.println("\n----- Figura " + (i + 1) + " -----");
                        System.out.println("1: Cuadrado");
                        System.out.println("2: Triángulo");
                        System.out.println("3: Rectángulo");
                        System.out.println("4: Pentágono");
                        System.out.print("Seleccione una opción: ");
                        int opcionMenu2 = scanner.nextInt();

                        switch (opcionMenu2) {
                            case 1:
                                System.out.print("Ingrese el lado del cuadrado: ");
                                double ladoCuadrado = scanner.nextDouble();
                                Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                                cuadrado.calcularArea();
                                break;
                            case 2:
                                System.out.print("Ingrese la base del triángulo: ");
                                double baseTriangulo = scanner.nextDouble();
                                System.out.print("Ingrese la altura del triángulo: ");
                                double alturaTriangulo = scanner.nextDouble();
                                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                                triangulo.calcularArea();
                                break;
                            case 3:
                                System.out.print("Ingrese la base del rectángulo: ");
                                double baseRectangulo = scanner.nextDouble();
                                System.out.print("Ingrese la altura del rectángulo: ");
                                double alturaRectangulo = scanner.nextDouble();
                                Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                                rectangulo.calcularArea();
                                break;
                            case 4:
                                System.out.print("Ingrese el lado del pentágono: ");
                                double ladoPentagono = scanner.nextDouble();
                                Pentagono pentagono = new Pentagono(ladoPentagono);
                                pentagono.calcularArea();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de figuras a calcular: ");
                    cantidadFiguras = scanner.nextInt();

                    for (int i = 0; i < cantidadFiguras; i++) {
                        System.out.println("\n----- Figura " + (i + 1) + " -----");
                        System.out.println("1: Cuadrado");
                        System.out.println("2: Triángulo");
                        System.out.println("3: Rectángulo");
                        System.out.println("4: Pentágono");
                        System.out.print("Seleccione una opción: ");
                        int opcionMenu2 = scanner.nextInt();

                        switch (opcionMenu2) {
                            case 1:
                                System.out.print("Ingrese el lado del cuadrado: ");
                                double ladoCuadrado = scanner.nextDouble();
                                Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                                cuadrado.calcularPerimetro();
                                break;
                            case 2:
                                System.out.println("El perímetro del triángulo no se puede calcular sin información adicional.");
                                break;
                            case 3:
                                System.out.print("Ingrese la base del rectángulo: ");
                                double baseRectangulo = scanner.nextDouble();
                                System.out.print("Ingrese la altura del rectángulo: ");
                                double alturaRectangulo = scanner.nextDouble();
                                Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                                rectangulo.calcularPerimetro();
                                break;
                            case 4:
                                System.out.print("Ingrese el lado del pentágono: ");
                                double ladoPentagono = scanner.nextDouble();
                                Pentagono pentagono = new Pentagono(ladoPentagono);
                                pentagono.calcularPerimetro();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
    }
}

// Clase padre
class Figuras {
    protected double area;
    protected double perimetro;

    public void calcularArea() {
        System.out.println("Área de la figura");
    }

    public void calcularPerimetro() {
        System.out.println("Perímetro de la figura");
    }
}

// Clase hija: Cuadrado
class Cuadrado extends Figuras {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
}

// Clase hija: Triángulo
class Triangulo extends Figuras {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del triángulo no se puede calcular sin información adicional.");
    }
}

// Clase hija: Rectángulo
class Rectangulo extends Figuras {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}

// Clase hija: Pentágono
class Pentagono extends Figuras {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del pentágono no se puede calcular sin información adicional.");
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 5 * lado;
        System.out.println("El perímetro del pentágono es: " + perimetro);
    }
}


    

