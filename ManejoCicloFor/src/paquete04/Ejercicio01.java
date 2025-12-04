/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author ASUS
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        int total1 = 0;
        int total2 = 0;  // Inicializamos las variables, asignando valores
        int total3 = 0;
        int total4 = 0;
        
        String mensaje = "";
        
        // Realizamos el For para poder tener una acumulacion de variables

        for (int i = 30; i >= 10; i--) {
            /* Aqui utilizamos un contador el cual va a ir multiplicandose 
            despues para poder generar la sucesion*/
        int n1 = i;
        int n2 = i * 2;
        int n3 = i * 3;
        int n4 = i * 4;
        
        // Concatenamos la cadena

        mensaje = String.format("%s%d-%d-%d-%d\n", mensaje, n1, n2, n3, n4);
        
        // realizamos una operacion para que se den los totales de cada susecion

        total1 = total1 + n1;
        total2 = total2 + n2;
        total3 = total3 + n3;
        total4 = total4 + n4;
    }
        
        // Imprimimos la cadena

    mensaje += String.format("\nTotales = %d-%d-%d-%d", 
            total1, 
            total2, 
            total3, 
            total4);

    System.out.printf("%s", mensaje);
    }
}
