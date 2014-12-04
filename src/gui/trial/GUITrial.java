/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trial;

import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AhmedOmar
 */
public class GUITrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*int x= parseInt(JOptionPane.showInputDialog("Enter 1st"))+parseInt(JOptionPane.showInputDialog("Enter 2nd"));
        
        JOptionPane.showMessageDialog(null, "The sum is "+x, "THE SUM", JOptionPane.ERROR_MESSAGE );
        */
             
        
        MouseGUI labelFrame=new MouseGUI();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize( 500, 500 );
        labelFrame.setVisible( true );
        }
    
}
