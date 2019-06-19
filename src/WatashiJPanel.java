/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JPanel;
/**
 *
 * @author mufqi
 */
public class WatashiJPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graph = (Graphics2D)g;
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        this.setBackground(new Color(213,255,50));
        
        
        Shape drawQuadCurve5 = new QuadCurve2D.Float(300,150,270,90,300,60);
        Shape drawQuadCurve1 = new QuadCurve2D.Float(300,150,320,70,400,68);
        Shape drawQuadCurve2 = new QuadCurve2D.Float(400,68,420,65,455,70);
        Shape drawQuadCurve3 = new QuadCurve2D.Float(455,70,500,74,555,150);
        Shape drawQuadCurve4 = new QuadCurve2D.Float(555,150,560,180,625,190);
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve5);
        graph.draw(drawQuadCurve1);
        graph.draw(drawQuadCurve2);
        graph.draw(drawQuadCurve3);
        graph.draw(drawQuadCurve4);
        graph.setColor(Color.WHITE);
        graph.fill(drawQuadCurve1);
        graph.fill(drawQuadCurve2);
        
    }
}
