/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2uim;

/**
 *
 * @author Estudiante
 */
public abstract class Sensor {
    protected String marca;
    protected String referencia;
    protected String fechaInstalacion;
    public abstract void addMedicion(String valor, String fecha);
    //public abstract String[] datosMedicion();
}
