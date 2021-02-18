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
import java.util.ArrayList;

public class menu {

    private ArrayList<itemmenu> m_items;
    private itemmenu m_itemseleccionado;

    public menu() {
        m_items = new ArrayList<itemmenu>();
    }

    public void agregaritem(String id, String desc) {
        itemmenu miitem;
        miitem = new itemmenu();

        miitem.setId(id);
        miitem.setDesc(desc);
        m_items.add(miitem);
    }

    public void mostrar() {
        String textoitem;
        for (itemmenu actual : m_items) {
            textoitem = actual.getId() + " - " + actual.getDesc();
            System.out.println(textoitem);
        }
    }

    public itemmenu getitemsel() {
        String ing;
        int i;
        teclado tecla;
        cliente cli;

        tecla = new teclado();

        m_itemseleccionado = null;

        while (m_itemseleccionado == null) {

            ing = tecla.pedirteclado();

            for (i = 0; i < m_items.size(); i++) {
                if (ing.equals(m_items.get(i).getId())) {
                    m_itemseleccionado = m_items.get(i);
                }
            }
        }
        return m_itemseleccionado;
    }

}
