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
        
        Shape drawQuadCurve10 = new QuadCurve2D.Float(228,240,225,260,260,310);
        Shape drawQuadCurve9s4 = new QuadCurve2D.Float(243,229,233,229,228,240);
        Shape drawQuadCurve9s3 = new QuadCurve2D.Float(253,240,253,230,243,229);
        Shape drawQuadCurve9s2 = new QuadCurve2D.Float(243,250,250,250,253,240);
        Shape drawQuadCurve9s1 = new QuadCurve2D.Float(228,240,230,250,243,250);
        Shape drawQuadCurve8 = new QuadCurve2D.Float(230,180,217,195,228,240);
        Shape drawQuadCurve7 = new QuadCurve2D.Float(280,150,250,150,230,180);
        Shape drawQuadCurve6 = new QuadCurve2D.Float(300,45,230,100,300,170);
        Shape drawQuadCurve5 = new QuadCurve2D.Float(300,150,270,90,300,45);
        Shape drawQuadCurve1 = new QuadCurve2D.Float(300,150,320,70,400,68);
        Shape drawQuadCurve2 = new QuadCurve2D.Float(400,68,420,65,455,70);
        Shape drawQuadCurve3 = new QuadCurve2D.Float(455,70,500,74,555,150);
        Shape drawQuadCurve4 = new QuadCurve2D.Float(555,150,575,205,580,215);
        Shape drawQuadCurve4s1 = new QuadCurve2D.Float(570,190,580,215,600,228);
        Shape drawQuadCurve4s2 = new QuadCurve2D.Float(600,228,605,233,650,228);
        Shape drawQuadCurve4s3 = new QuadCurve2D.Float(650,228,600,260,580,260);
        Shape drawQuadCurve4s4 = new QuadCurve2D.Float(580,260,600,278,650,278);
        Shape drawQuadCurve4s5 = new QuadCurve2D.Float(650,278,600,310,568,305);
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve10);
        graph.draw(drawQuadCurve9s4);
        graph.draw(drawQuadCurve9s3);
        graph.draw(drawQuadCurve9s2);
        graph.draw(drawQuadCurve9s1);
        graph.draw(drawQuadCurve8);
        graph.draw(drawQuadCurve7);
        graph.draw(drawQuadCurve6);
        graph.draw(drawQuadCurve5);
        graph.draw(drawQuadCurve1);
        graph.draw(drawQuadCurve2);
        graph.draw(drawQuadCurve3);
        graph.draw(drawQuadCurve4);
        graph.draw(drawQuadCurve4s1);
        graph.draw(drawQuadCurve4s2);
        graph.draw(drawQuadCurve4s3);
        graph.draw(drawQuadCurve4s4);
        graph.draw(drawQuadCurve4s5);
        graph.setColor(Color.WHITE);
        graph.fill(drawQuadCurve1);
        graph.fill(drawQuadCurve2);
        
    }
}
