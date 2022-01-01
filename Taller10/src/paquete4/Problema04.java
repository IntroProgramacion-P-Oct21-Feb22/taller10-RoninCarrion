/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        String acumulador = "";
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        for (int fila = 0; fila < datos.length; fila++) {
            acumulador = String.format("%s\n", acumulador);
            for (int columna = 0; columna < datos.length; columna++) {
                System.out.println("Ingrese un valor numérico para ser registrado: ");
                datos[fila][columna] = entrada.nextDouble();
                acumulador = String.format("%s%.2f\t", acumulador, datos[fila][columna]);
            }
        }
        System.out.printf("Los valores registrados son: %s\n",acumulador);
    }
}
