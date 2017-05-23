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
public class Electrica extends Sensor{
    private String clasificacion;
    public Electrica(String marca, String referencia, String fechaInstalacion, String clasificacion) {
        this.marca=marca;
        this.referencia=referencia;
        this.fechaInstalacion=fechaInstalacion;
        this.clasificacion= clasificacion;
    }
    @Override
    public void addMedicion(String valor, String fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
