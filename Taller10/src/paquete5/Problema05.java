/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        char palabra;
        String acumulador = "";
        char [] inicialesReservadas = {'S', 'P', 'T'};
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columnas = 0; columnas < estudiantes[0].length; columnas++) {
                palabra = estudiantes[fila][columnas].charAt(0);
                for (int i = 0; i < inicialesReservadas.length; i++) {
                    if (palabra == (inicialesReservadas[i])) {
                        acumulador = String.format("%s%s\n",
                                 acumulador,
                                 estudiantes[fila][columnas]);
                    }
                }
            }
        }
        System.out.println(acumulador);
    }
}
