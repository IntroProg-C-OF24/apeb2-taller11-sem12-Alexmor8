package taller_12;
import java.util.Scanner;
public class Problema_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        String promedio;
        System.out.println("Ingrese la primera nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = teclado.nextDouble();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = teclado.nextDouble();
        
        promedio = promedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.println("Promedio es: "+promedio);
    }
    public static String promedioCualitativo(double nota1, double nota2, double nota3, double nota4) {
        double promedio;
        String proCua;
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            proCua = "REGULAR";
            return proCua;
        } else if (promedio >= 5.1 && promedio <= 8) {
            proCua = "BUENO";
            return proCua;
        } else if(promedio >= 8.1 && promedio <= 9){
            proCua = "MUY BUENO";
            return proCua;
        }else{
            proCua = "SOBRESALIENTE";
            return proCua;
        }
    }
}
/*
Ingrese la primera nota: 
10
Ingrese la segunda nota: 
10
Ingrese la tercera nota: 
9
Ingrese la cuarta nota: 
8
Promedio es: SOBRESALIENTE
///////////////////////////////////////////
Ingrese la primera nota: 
9
Ingrese la segunda nota: 
7
Ingrese la tercera nota: 
8,5
Ingrese la cuarta nota: 
9,6
Promedio es: MUY BUENO
////////////////////////////////////////////
Ingrese la primera nota: 
7,5
Ingrese la segunda nota: 
7
Ingrese la tercera nota: 
5,9
Ingrese la cuarta nota: 
6,5
Promedio es: BUENO
/////////////////////////////////////////////
Ingrese la primera nota: 
5,9
Ingrese la segunda nota: 
4
Ingrese la tercera nota: 
3,5
Ingrese la cuarta nota: 
2,4
Promedio es: REGULAR
*/