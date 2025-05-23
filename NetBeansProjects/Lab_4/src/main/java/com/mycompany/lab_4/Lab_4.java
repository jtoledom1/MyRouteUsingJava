package com.mycompany.lab_4;
import javax.swing.JOptionPane;

/**
 *
 * @author José Toledo Muñoz
 * 
 */
public class Lab_4 {

    public static void main(String[] args) {
         String jst= "Justifica tu respuesta";
            String smt= JOptionPane.showInputDialog("Debería de ver the boys? "+jst);
         
            int resp =JOptionPane.showConfirmDialog(null, "Debes de estar muuuuuy seguro, estás seguro?"); 
            int resp2 =JOptionPane.showConfirmDialog(null, "Pero... enserio...estás seguro?"); 
            int resp3 =JOptionPane.showConfirmDialog(null, "Ultima oportunidad...(no hay otra oportunidad),realmente estás seguro?"); 
            int resp4 =JOptionPane.showConfirmDialog(null, "Yaaaaa... enserio.. pero muy enserio, estás seguro?");
            JOptionPane.showMessageDialog(null,"Tu elección erronea fue: "+smt); 
    }
}
