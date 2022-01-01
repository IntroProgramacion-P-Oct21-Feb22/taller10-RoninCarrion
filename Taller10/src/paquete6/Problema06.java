/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        int num_caracteres;
        int limite = 11;
        String acumulador= "";
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columnas = 0; columnas < estudiantes[0].length; columnas++) {
                num_caracteres = estudiantes[fila][columnas].length();
                if(num_caracteres == limite){
                    acumulador = String.format("%s\n%s", acumulador
                                                , estudiantes[fila][columnas]);
                }
            }
        }
        System.out.println(acumulador);
    }
}
