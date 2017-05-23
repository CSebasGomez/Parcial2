/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2uim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial2UIM {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
       Scanner in= new Scanner(new File("mediciones.txt"));
       BufferedReader br = new BufferedReader("mediciones.txt");
       ArrayList estaciones= new ArrayList<Estacion>();
       try{
          String line = br.readLine();
       while(line!=null) {
             String Ciudad= br.readLine();
             String EstacionesRegistrada=br.readLine();
             int estacionesnum= toInt(EstacionesRegistrada);
             for(int j=0;j<estacionesnum;j++){
                String NombreEstacion=br.readLine();
                Estacion registrada = new Estacion(NombreEstacion,Ciudad);
                estaciones.add(registrada);
                
                int NumeroDatos=br.read();
                for(int k=0;k<NumeroDatos;k++){
                    String medicionn= br.readLine();
                    char[] datos=toCharArray(medicionn);
                    String    temperatura= in.next();
                    String    agua= in.next();
                    String    electrica= in.next();
                    registrada.addMediciones(fecha, agua, temperatura, electrica);
                }
                registrada.showMediciones();//muestra todas las mediciones
            }
            br.readLine();
        }}catch(Exception e){
            System.out.println("algo Fallo");
        }
    }
}
