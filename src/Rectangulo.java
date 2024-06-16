package PACKAGE_NAME;public class Rectangulo {
}
public static void main(String[] args) {
        System.out.println("Rectángulo  alto 7  ancho 7:");
        printRectangle(7, 7);
        System.out.println("\nRectángulo alto 5  ancho 14:");
        printRectangle(5, 14);
        System.out.println("\nRectángulo alto 8  ancho 20:");
        printRectangle(8, 20);
    }

    public static void printRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
