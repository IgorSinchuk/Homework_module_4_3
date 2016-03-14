
import java.util.Scanner;

public class Dots {

public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите координаты точки x1:");
    double x1 = scanner.nextDouble();

    System.out.println("Введите координаты точки y1:");
    double y1 = scanner.nextDouble();

    System.out.println("Введите координаты точки x2:");
    double x2 = scanner.nextDouble();

    System.out.println("Введите координаты точки y2:");
    double y2 = scanner.nextDouble();

    double distance = Math.sqrt(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    System.out.println("Длина между точками: " + distance);
}

}

