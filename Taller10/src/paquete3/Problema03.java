/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String acumulador = "";
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        for (int filas = 0; filas < notasCuantitativas.length; filas++) {
            acumulador = String.format("%s\n", acumulador);
            for (int columnas = 0; columnas < notasCuantitativas[0].length; columnas++) {
                if (notasCuantitativas[filas][columnas] >= 0
                        && notasCuantitativas[filas][columnas] <= 2.9) {
                    notasCualitativas[filas][columnas] = "Insuficiente";
                } else {
                    if (notasCuantitativas[filas][columnas] > 2.9
                            && notasCuantitativas[filas][columnas] <= 4.9) {
                        notasCualitativas[filas][columnas] = "Regular";
                    } else {
                        if (notasCuantitativas[filas][columnas] > 4.9
                                && notasCuantitativas[filas][columnas] <= 7.9) {
                            notasCualitativas[filas][columnas] = "Buena";
                        } else {
                            if (notasCuantitativas[filas][columnas] > 7.9
                                    && notasCuantitativas[filas][columnas] <= 9.5) {
                                notasCualitativas[filas][columnas] = "Muy Buena";
                            } else {
                                notasCualitativas[filas][columnas] = "Sobresaliente";
                            }
                        }
                    }
                }
                acumulador = String.format("%s    [%d][%d]%s\t"
                         , acumulador
                         , filas
                         , columnas
                         , notasCualitativas[filas][columnas]);
            }
        }
        System.out.println(acumulador);
    }
}
