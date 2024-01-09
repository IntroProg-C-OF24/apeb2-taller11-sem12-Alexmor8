package taller_12;
public class Problema_01 {
    public static void main(String[] args) {
        int lim = 3;
        double promedio;
        int numero[][] = new int [lim][lim];
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                numero[i][j]=(int)(Math.random()*(10-1+1)+1);
                System.out.print(numero[i][j]+" ");
            }
            System.out.println("");
        }
        promedio = calcularPromedio(numero);
        System.out.printf("El promedio de la matriz es: %.2f \n", promedio);
        System.out.println("===================Elementos pares:===================");
        valoresPares(numero);
        System.out.println("===================Elementos impares:===================");
        valoresImpares(numero);
    }                             
    public static double calcularPromedio(int matriz[][]) {
        double totalElementos = 0, sumaTotal = 0, promedio;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaTotal = sumaTotal + matriz[i][j];
                totalElementos = totalElementos + 1;
            }
        }
        promedio = sumaTotal / totalElementos;
        return promedio;
    }
    public static void valoresPares(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                   System.out.println("Elemento en la posición [" + i + "][" + j + "]: " + matriz[i][j]); 
                }
            }
        }   
    }
    public static void valoresImpares(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 != 0) {
                   System.out.println("Elemento en la posición [" + i + "][" + j + "]: " + matriz[i][j]); 
                }
            }
        }   
    }
}
/*
7 1 7 
2 6 5 
6 10 3 
El promedio de la matriz es: 5,22 
===================Elementos pares:===================
Elemento en la posición [1][0]: 2
Elemento en la posición [1][1]: 6
Elemento en la posición [2][0]: 6
Elemento en la posición [2][1]: 10
===================Elementos impares:===================
Elemento en la posición [0][0]: 7
Elemento en la posición [0][1]: 1
Elemento en la posición [0][2]: 7
Elemento en la posición [1][2]: 5
Elemento en la posición [2][2]: 3
*/