package Clase3Ej6;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import java.io.BufferedReader;
import java.io.*;

public class teclado {

    public String pedirteclado() {

        String a = "";

        BufferedReader teclado;

        teclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            // System.out.println("Ingrese su Opcion: ");
            a = teclado.readLine();
        } catch (IOException e) {
            System.out.println("ERROR!! de Teclado " + e.getMessage());
        }

        return a;
    }

    public int tecladonum() {
        int opc = 0;

        try {
            BufferedReader tecla = new BufferedReader(new InputStreamReader(System.in));
            opc = Integer.parseInt(tecla.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        return opc;

    }

}
