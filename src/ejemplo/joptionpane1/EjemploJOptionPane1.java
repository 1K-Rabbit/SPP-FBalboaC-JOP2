/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.joptionpane1;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class EjemploJOptionPane1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo de input Dialog
       
     String mensaje =  JOptionPane.showInputDialog(null,  "Nombre", "Ingrese su nombre de usuario.");
     
     JOptionPane.showMessageDialog(null, "Su nombre es "+ mensaje, "Mensaje de confirmación" ,JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
