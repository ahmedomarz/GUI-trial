/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

import javax.swing.JPanel;

/**
 *
 * @author AhmedOmar
 */
public class drawingPanel extends JPanel implements MouseMotionListener, MouseListener{
    
    Graphics2D board;
    Point pointStart = null;
    Point pointEnd   = null;
    PAINT paint = new PAINT();
    
    
    int n;
    int x=0;
    
    
    //int i;
            
    drawingPanel(){
        //i=0;
        setBackground(Color.YELLOW);
        addMouseMotionListener(this);
        addMouseListener(this);
        
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        board = (Graphics2D) g;
        
        paint.doIT(board, pointStart, pointEnd,n);
        
        if (x==1){
            paint.changeColors(pointStart);repaint();x=0;
        }
        
        
        
        /*for (int k=0; k<i; k++){
            board.draw(rectangles[k]);
            //g.drawLine((int)lines[k].x1, (int)lines[k].y1, (int)lines[k].x2, (int)lines[k].y2);
        }*/
        
    }
    
    public void setN(int n){
        this.n=n;
    }
    
    
    
    

    @Override
    public void mouseDragged(MouseEvent e) {
        
        pointEnd = e.getPoint();
        
        
        repaint();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        pointEnd = e.getPoint();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Graphics2D board = paint.getBoard();
        /*
        for (Rectangle2D rectangle : rectangles) {
                board.setPaint(Color.WHITE);
                board.fillRect((int) rectangle.getX(), (int)rectangle.getY(), (int)rectangle.getHeight(), (int)rectangle.getWidth());
                
                System.out.println("hi");
            }
        
        
        paint.setBoard(board);*/
        
        x=1;
        pointStart=e.getPoint();
        
        //
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pointStart = e.getPoint();
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //rectangles[i]=new Rectangle2D.Double(  (int) pointStart.x, (int) pointStart.y,(int) Math.abs(pointEnd.x-pointStart.x), (int) Math.abs(pointEnd.y-pointStart.y) );
        // i++;
        
        paint.released();
        pointStart = null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
