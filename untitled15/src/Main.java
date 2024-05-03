import java.util.Scanner;
import java.util.ArrayList;

class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1. Вычислить площадь треугольника");
        menu.add("2. Завершить программу");
        boolean exit = false;

        while (!exit) {
            System.out.println("Меню:");
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите длины сторон треугольника (через пробел): ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println("Площадь треугольника: " + triangle.calculateArea());
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}
