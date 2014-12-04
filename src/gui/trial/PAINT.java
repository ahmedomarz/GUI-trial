/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import static java.awt.PageAttributes.ColorType.COLOR;
import java.util.List;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 *
 * @author AhmedOmar
 */
public class PAINT {
    Graphics2D board;
    Point pointStart;
    Point pointEnd;
    int n;
    
    List <Line2D> lines;
    List <Rectangle2D> rectangles;
    List <Ellipse2D> ellipses;
    
    
    PAINT(){
       
        lines = new ArrayList<>();
        rectangles = new ArrayList<>();
        ellipses = new ArrayList<>();
        
        
    }
    
//    public List<Rectangle2D> getRectangles(){
//        
//        return rectangles;
//    }
//    
//    public Graphics2D getBoard(){
//        return board;
//    }
//    
//    public void setBoard(Graphics2D board){
//        this.board=board;
//    }
//    
    
    public void released(){
        if (n==1) {
            lines.add(new Line2D.Double(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y));
        }
        
        else if (n==0) {
           
                 if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y > 0 ){
                rectangles.add(new Rectangle2D.Double(pointStart.x, pointStart.y, pointEnd.x-pointStart.x, pointEnd.y-pointStart.y));

                }
                
                else if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y < 0 ){
                    rectangles.add(new Rectangle2D.Double(pointStart.x, pointEnd.y, pointEnd.x-pointStart.x, pointStart.y-pointEnd.y));
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y < 0 ){
                    rectangles.add(new Rectangle2D.Double(pointEnd.x, pointEnd.y, pointStart.x-pointEnd.x, pointStart.y-pointEnd.y));
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y > 0 ){
                    rectangles.add(new Rectangle2D.Double(pointEnd.x, pointStart.y, pointStart.x-pointEnd.x, pointEnd.y-pointStart.y));
                }
            
            
                
                
            
        }
        
        else if (n==2) {
           
            if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y > 0 ){
                ellipses.add(new Ellipse2D.Double(pointStart.x, pointStart.y, pointEnd.x-pointStart.x, pointEnd.y-pointStart.y));

                }
                
                else if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y < 0 ){
                    ellipses.add(new Ellipse2D.Double(pointStart.x, pointEnd.y, pointEnd.x-pointStart.x, pointStart.y-pointEnd.y));
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y < 0 ){
                    ellipses.add(new Ellipse2D.Double(pointEnd.x, pointEnd.y, pointStart.x-pointEnd.x, pointStart.y-pointEnd.y));
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y > 0 ){
                    ellipses.add(new Ellipse2D.Double(pointEnd.x, pointStart.y, pointStart.x-pointEnd.x, pointEnd.y-pointStart.y));
                }
            
            
                
                
            
        }
        
        
    }
    
    public void changeColors(Point pointStart){
        for (Rectangle2D rectangle : rectangles) {
                board.setColor(Color.BLACK);
                //board.draw(rectangle);
                
                if (rectangle.contains(pointStart)) board.fill(rectangle);
                
                //System.out.println(rectangle.toString());
                
                
            }
        
        for (Ellipse2D ellipse : ellipses) {
                board.setColor(Color.BLACK);
                //board.draw(rectangle);
                
                if (ellipse.contains(pointStart)) board.fill(ellipse);
                
                //System.out.println(rectangle.toString());
                
                
            }
    }
    
    public void doIT(Graphics g, Point pointStart, Point pointEnd, int n){
        this.pointEnd=pointEnd;
        this.pointStart=pointStart;
        this.n=n;
        
        
        board= (Graphics2D) g;
        
        
                
        
        if (pointStart != null) {
           
            
            
            
            if (n==0) {
                
                //g.drawRect(pointEnd.x>pointStart.x?pointEnd.x:pointStart.x, pointEnd.y>pointStart.y?pointEnd.y:pointStart.y, pointStart.x-pointEnd.x>0?pointStart.x-pointEnd.x: pointEnd.x-pointStart.x , pointStart.y-pointEnd.y>0?pointStart.y-pointEnd.y: pointEnd.y-pointStart.y);
                
                
                /*if (pointEnd.x-pointStart.x>0){
                    if (pointEnd.y-pointStart.y > 0 ){
                        g.drawRect(pointStart.x, pointStart.y, pointEnd.x-pointStart.x, pointEnd.x-pointStart.x);
                    }
                
                    else if (pointEnd.y-pointStart.y < 0 ){
                        g.drawRect(pointStart.x, pointEnd.y, pointEnd.x-pointStart.x, pointEnd.x-pointStart.x);
                    }
                }
                */
                
                
                
                if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y > 0 ){
                    
                    board.drawRect(pointStart.x, pointStart.y, pointEnd.x-pointStart.x, pointEnd.y-pointStart.y);
                }
                
                else if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y < 0 ){
                    board.drawRect(pointStart.x, pointEnd.y, pointEnd.x-pointStart.x, pointStart.y-pointEnd.y);
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y < 0 ){
                    board.drawRect(pointEnd.x, pointEnd.y, pointStart.x-pointEnd.x, pointStart.y-pointEnd.y);
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y > 0 ){
                    board.drawRect(pointEnd.x, pointStart.y, pointStart.x-pointEnd.x, pointEnd.y-pointStart.y);
                }
                else ;
                
            
            
            }
            
            else if (n==1) {
                
                board.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
                
            }
            
            else if (n==2) {
                
                if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y > 0 ){
                    board.drawOval(pointStart.x, pointStart.y, pointEnd.x-pointStart.x, pointEnd.y-pointStart.y);
                }
                
                else if (pointEnd.x-pointStart.x>0 && pointEnd.y-pointStart.y < 0 ){
                    g.drawOval(pointStart.x, pointEnd.y, pointEnd.x-pointStart.x, pointStart.y-pointEnd.y);
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y < 0 ){
                    board.drawOval(pointEnd.x, pointEnd.y, pointStart.x-pointEnd.x, pointStart.y-pointEnd.y);
                }
                
                else if (pointEnd.x-pointStart.x<0 && pointEnd.y-pointStart.y > 0 ){
                    board.drawOval(pointEnd.x, pointStart.y, pointStart.x-pointEnd.x, pointEnd.y-pointStart.y);
                }
                
            }
            
            for (Line2D line : lines) {
                board.draw(line);
            }
            
            for (Rectangle2D rectangle : rectangles) {
                board.draw(rectangle);
            }
            
            for (Ellipse2D ellipse : ellipses) {
                board.draw(ellipse);
            }
             
        }
        
        
    }
    
}
