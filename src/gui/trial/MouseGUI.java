/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author AhmedOmar
 */
public class MouseGUI extends JFrame{
    
    
    JLabel statusBar;
    drawingPanel mousePanel;
    JButton rectangle;
    JButton line;
    JButton ellipse;
    
    JPanel buttons = new JPanel();
    
    
    
    
    MouseGUI(){
        super("Mouse JFrame title");
        mousePanel=new drawingPanel();
        
        
        
        add(mousePanel,BorderLayout.CENTER);
        
        
        rectangle = new JButton("RECTANGLE");
        line = new JButton("LINE");
        ellipse=new JButton("ELLIPSE");
        
        buttons.add(line,BorderLayout.NORTH);
        buttons.add(rectangle,BorderLayout.SOUTH);
        buttons.add(ellipse,BorderLayout.EAST);
        add(buttons, BorderLayout.SOUTH);
        
        buttonHandler handler=new buttonHandler();
        rectangle.addActionListener(handler);
        line.addActionListener(handler);
        ellipse.addActionListener(handler);
        
        //statusBar= new JLabel("Mouse outside JPanel");
        //add(statusBar,BorderLayout.SOUTH);
        
        /*
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler); 
        */
        
    }
    
    private class buttonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource()==rectangle) {mousePanel.setN(0);}
            else if (e.getSource()==line) {mousePanel.setN(1);}
            else if (e.getSource()==ellipse){mousePanel.setN(2);}
            //throw new ellipse("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
