/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String acumulador_cadena = " ";
        double suma;
        double[][] notasEstudiantes = {{9, 10, 7, 8},
                                        {10, 5, 7, 9},
                                        {7, 9.4, 10, 9}};
        double[] promediosEstudiantes = new double[3];
        String[] nombresEstudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        for (int fila = 0; fila < notasEstudiantes.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < notasEstudiantes[0].length; columna++) {
                suma = suma + notasEstudiantes[fila][columna];
            }
            promediosEstudiantes[fila] = suma / notasEstudiantes[0].length;
        }
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            acumulador_cadena = String.format("%s\nEstudiante: %s tiene un"
                    + " promedio de %.2f",
                     acumulador_cadena,
                     nombresEstudiantes[i],
                     promediosEstudiantes[i]);
        }
        System.out.println(acumulador_cadena);
    }

}
