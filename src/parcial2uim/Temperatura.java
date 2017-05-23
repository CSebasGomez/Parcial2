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
public class Temperatura extends Sensor{
    public Temperatura (String marca, String referencia, String fechaInstalacion) {
        this.marca=marca;
        this.referencia=referencia;
        this.fechaInstalacion=fechaInstalacion;
    }
    @Override
    public void addMedicion(String valor, String fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
