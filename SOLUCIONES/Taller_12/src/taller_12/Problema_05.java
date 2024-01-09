package taller_12;
public class Problema_05 {
    public static void main(String[] args) {
        int suma, resta, multipli;
        int lim = 3;
        int numero[][] = new int [lim][lim];
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                numero[i][j]=(int)(Math.random()*(10-1+1)+1);
                System.out.print(numero[i][j]+" ");
            }
            System.out.println("");
        }
        suma = suma(numero);
        System.out.println("La suma es = "+suma);
        resta = resta(numero);
        System.out.println("La resta es = "+resta);
        multipli = multiplicacion(numero);
        System.out.println("La multiplicacion es = "+multipli); 
    }
    public static int suma(int matriz[][]){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }
    public static int resta(int matriz[][]){
        int resta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                resta = resta - matriz[i][j];
            }
        }
        return resta;
    }
    public static int multiplicacion(int matriz[][]){
        int multipli = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                multipli = multipli * matriz[i][j];
            }
        }
        return multipli;
    }
}
/*
2 6 8 
9 1 2 
4 9 5 
La suma es = 46
La resta es = -46
La multiplicacion es = 311040
*/