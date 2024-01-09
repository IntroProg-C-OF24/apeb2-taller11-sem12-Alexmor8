package taller_12;
import java.util.Scanner;
public class Problema_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double areaCua, areaTrian, areaRecta, lado, base, altura;
        System.out.println("Área del cuadrado = [1] | Área del triángulo = [2] | Área del rectángulo = [3]");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = teclado.nextDouble();
                areaCua = areaCuadrado(lado);
                System.out.println("El área es: " + areaCua);
                break;
            case 2:
                System.out.println("Ingrese la base: ");
                base = teclado.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura = teclado.nextDouble();
                areaTrian = areaTriangulo(base, altura);
                System.out.println("El área es: " + areaTrian);
                break;
            case 3:
                System.out.println("Ingrese la base: ");
                base = teclado.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura = teclado.nextDouble();
                areaRecta = areaRectangulo(base, altura);
                System.out.println("El área es: " + areaRecta);
                break;
        }
    }
    public static double areaCuadrado(double aC) {
        double area;
        area = aC * aC * aC * aC;
        return area;
    }
    public static double areaTriangulo(double ba, double alt) {
        double area;
        area = (ba * alt) / 2;
        return area;
    }
    public static double areaRectangulo(double ba, double alt) {
        double area;
        area = ba * alt;
        return area;
    }
}
/*
Área del cuadrado = [1] | Área del triángulo = [2] | Área del rectángulo = [3]
1
Ingrese el lado del cuadrado: 
5,5
El área es: 915.0625
////////////////////////////////////////////////////////////////////////////////
Área del cuadrado = [1] | Área del triángulo = [2] | Área del rectángulo = [3]
2
Ingrese la base: 
5
Ingrese la altura: 
2,2
El área es: 5.5
////////////////////////////////////////////////////////////////////////////////
Área del cuadrado = [1] | Área del triángulo = [2] | Área del rectángulo = [3]
3
Ingrese la base: 
8
Ingrese la altura: 
5
El área es: 40.0
*/