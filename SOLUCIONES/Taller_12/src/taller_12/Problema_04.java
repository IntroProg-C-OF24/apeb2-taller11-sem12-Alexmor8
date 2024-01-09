package taller_12;
import java.util.Scanner;
public class Problema_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoKilowa, gastoKilowat, costoinmueble;
        int  opcion;
        System.out.println("Ingrese el | [1] para costo luz | [2] para prebio |");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el costo por kilowatio: ");
                costoKilowa = teclado.nextDouble();
                System.out.println("Ingrese el gasto de kilowats: ");
                gastoKilowat = teclado.nextDouble();
                pagoPlanilla("Ana Contreras","1100112233",costoKilowa,gastoKilowat);
                break;
            case 2:
                System.out.println("Ingrese el costo del inmueble: ");
                costoinmueble = teclado.nextDouble();
                pagoPredio("Ana Contreras","1100112233",costoinmueble);
                break;
        }
    }
   public static void pagoPlanilla(String nombre, String cedula, double costoKiwatio, double gastoKiwatio){
       double pagoTotal;
       pagoTotal = costoKiwatio * gastoKiwatio;
       System.out.println("Cliente "+nombre+" con cédula "+cedula+" debe cancelar el valor de "+pagoTotal);
   } 
   public static void pagoPredio(String nombre, String cedula, double costoinMueble){
       double pagoPredio;
       pagoPredio = (costoinMueble * 2)/100;
       System.out.println("Cliente "+nombre+" con cédula "+cedula+" Tiene un bien inmueble valorado en "+costoinMueble+" y tiene que pagar de predio "+pagoPredio);
   } 
}
/*
Ingrese el | [1] para costo luz | [2] para prebio |
1
Ingrese el costo por kilowatio: 
0,57
Ingrese el gasto de kilowats: 
125
Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de 71.25
/////////////////////////////////////////////////////////////////////////////////
Ingrese el | [1] para costo luz | [2] para prebio |
2
Ingrese el costo del inmueble: 
30000
Cliente Ana Contreras con cédula 1100112233 Tiene un bien inmueble valorado en 30000.0 y tiene que pagar de predio 600.0
*/