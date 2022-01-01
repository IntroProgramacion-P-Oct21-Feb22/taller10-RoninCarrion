/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace, Ronin"};
        int[][] ventas = new int[2][5];
        String cadena_acumuladora = "";
        int num_dia;
        int suma = 0;
        for (int fila = 0; fila < vendedores.length; fila++) {
            num_dia = 1;
            for (int columna = 0; columna < ventas[0].length; columna++) {
                System.out.printf("Ingresar el numero de ventas realizadas "
                        + "por %s en el dia %d: ",
                         vendedores[fila],
                         num_dia);
                ventas[fila][columna] = entrada.nextInt();
                suma = suma + ventas[fila][columna];
                num_dia = num_dia + 1;
            }
            cadena_acumuladora = String.format("%s\n Vendedor(a) %s"
                                , cadena_acumuladora
                                , vendedores[fila]);
                                
        }
        System.out.printf("%s\n Ha realizado un total de %d en ventas.\n"
                            , cadena_acumuladora
                            , suma);
    }
}
