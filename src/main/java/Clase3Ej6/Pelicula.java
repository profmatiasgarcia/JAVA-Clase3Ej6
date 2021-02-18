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
public class Pelicula {

    private String m_codigo;
    private String m_titulo;
    private String m_genero;
    private String m_anio;
    private String m_director;
    private String m_acPrinc;
    private String m_stock;
    private String m_esEstreno;
    private String m_tipo;

    public String getM_tipo() {
        return m_tipo;
    }

    public void setM_tipo(String m_tipo) {
        this.m_tipo = m_tipo;
    }

    public String getM_codigo() {
        return m_codigo;
    }

    public void setM_codigo(String m_codigo) {
        this.m_codigo = m_codigo;
    }

    public String getM_esEstreno() {
        return m_esEstreno;
    }

    public void setM_esEstreno(String m_esEstreno) {
        this.m_esEstreno = m_esEstreno;
    }

    public String getM_stock() {
        return m_stock;
    }

    public void setM_stock(String m_stock) {
        this.m_stock = m_stock;
    }

    public String getM_acPrinc() {
        return m_acPrinc;
    }

    public void setM_acPrinc(String m_acPrinc) {
        this.m_acPrinc = m_acPrinc;
    }

    public String getM_ano() {
        return m_anio;
    }

    public void setM_years(String m_years) {
        this.m_anio = m_years;
    }

    public String getM_director() {
        return m_director;
    }

    public void setM_director(String m_director) {
        this.m_director = m_director;
    }

    public String getM_genero() {
        return m_genero;
    }

    public void setM_genero(String m_genero) {
        this.m_genero = m_genero;
    }

    public String getM_titulo() {
        return m_titulo;
    }

    public void setM_titulo(String m_titulo) {
        this.m_titulo = m_titulo;
    }

    public String toString() {
        return this.m_codigo + " - " + this.m_titulo + ", " + this.m_genero;

    }
}
