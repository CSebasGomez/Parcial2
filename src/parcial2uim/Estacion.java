/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2uim;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Estacion {
    protected String nombre;
    protected String ciudad;
    protected String ubicacion;
    protected String fecha;
    protected ArrayList<Sensor> sensores;
    protected ArrayList<String> mediciones;
    

    public Estacion(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.mediciones=new ArrayList<String>();
    }
    
    
    public Estacion(String nombre, String ubicacion, String fecha,String marca1, String referencia1, String fechaInst1,String marca2, String referencia2, String fechaInst2,String marca3, String referencia3, String fechaInst3, String clasificacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.sensores=new ArrayList<Sensor>();
        this.sensores.add(new Lluvia(marca1,referencia1,fechaInst1));
        this.sensores.add(new Temperatura(marca2,referencia2,fechaInst2));
        this.sensores.add(new Electrica(marca3,referencia3,fechaInst3,clasificacion));
    }
    
    public void addMediciones(String fecha, String lluvia, String temperatura, String electrica){
        mediciones.add(fecha+" "+" "+lluvia+" "+temperatura+" "+electrica);
    }
    public void showMediciones(){
        for(int i=0;i<mediciones.size();i++){
            System.out.println(mediciones.get(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public ArrayList<String> getMediciones() {
        return mediciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setMediciones(ArrayList<String> mediciones) {
        this.mediciones = mediciones;
    }
    
    
}
