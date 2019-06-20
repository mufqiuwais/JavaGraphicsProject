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
        
        Shape drawQuadCurve18 = new QuadCurve2D.Float(390,178,450,268,508,280);
        Shape drawQuadCurve17 = new QuadCurve2D.Float(435,290,403,238,395,188);
        Shape drawQuadCurve16 = new QuadCurve2D.Float(351,172,357,230,435,290);
        Shape drawQuadCurve15 = new QuadCurve2D.Float(326,200,326,200,351,182);
        Shape drawQuadCurve14 = new QuadCurve2D.Float(298,305,323,242,325,190);
        Shape drawQuadCurve13 = new QuadCurve2D.Float(298,342,298,342,298,305);
        Shape drawQuadCurve12 = new QuadCurve2D.Float(285,315,290,320,298,342);
        Shape drawQuadCurve11 = new QuadCurve2D.Float(260,310,270,300,285,315);
        Shape drawQuadCurve10 = new QuadCurve2D.Float(228,240,225,260,260,310);
        Shape drawQuadCurve9s4 = new QuadCurve2D.Float(243,229,233,229,228,240);
        Shape drawQuadCurve9s3 = new QuadCurve2D.Float(253,240,253,230,243,229);
        Shape drawQuadCurve9s2 = new QuadCurve2D.Float(243,250,250,250,253,240);
        Shape drawQuadCurve9s1 = new QuadCurve2D.Float(228,240,230,250,243,250);
        Shape drawQuadCurve8 = new QuadCurve2D.Float(230,180,217,205,228,240);
        Shape drawQuadCurve7 = new QuadCurve2D.Float(280,150,250,150,230,180);
        Shape drawQuadCurve6 = new QuadCurve2D.Float(300,45,230,100,300,170);
        Shape drawQuadCurve5 = new QuadCurve2D.Float(300,150,270,90,300,45);
        Shape drawQuadCurve1 = new QuadCurve2D.Float(300,150,320,70,400,68);
        Shape drawQuadCurve2 = new QuadCurve2D.Float(400,68,420,65,455,70);
        Shape drawQuadCurve3 = new QuadCurve2D.Float(455,70,500,74,555,150);
        Shape drawQuadCurve4 = new QuadCurve2D.Float(555,150,575,205,580,215);
        Shape drawQuadCurve4s1 = new QuadCurve2D.Float(570,190,580,215,600,228);
        Shape drawQuadCurve4s2 = new QuadCurve2D.Float(600,228,605,233,670,256);
        Shape drawQuadCurve4s3 = new QuadCurve2D.Float(670,256,628,268,588,268);
        Shape drawQuadCurve4s4 = new QuadCurve2D.Float(588,268,600,278,680,294);
        Shape drawQuadCurve4s5 = new QuadCurve2D.Float(680,294,600,310,578,305);
        Shape drawQuadCurve4s6 = new QuadCurve2D.Float(578,305,565,325,565,325);
        Shape drawQuadCurve20 = new QuadCurve2D.Float(565,325,555,305,545,305);
        Shape drawQuadCurve21 = new QuadCurve2D.Float(545,305,530,305,525,325);
        Shape drawQuadCurve22 = new QuadCurve2D.Float(525,325,525,325,512,365);
        Shape drawQuadCurve23 = new QuadCurve2D.Float(512,365,512,365,520,307);
        Shape drawQuadCurve24 = new QuadCurve2D.Float(520,307,520,307,508,280);
        
        
        int xValues[] = {227,243,253,243};
        int yValues[] = {240,250,240,222};
        Polygon polygon1 = new Polygon();
        polygon1.addPoint(227, 240);
        polygon1.addPoint(243, 251);
        polygon1.addPoint(254, 240);
        polygon1.addPoint(243, 228);
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(300, 150);
        polygon2.addPoint(400, 68);
        polygon2.addPoint(455, 70);
        polygon2.addPoint(555, 150);
        
        
        
        graph.setPaint(Color.WHITE);
        graph.setColor(Color.WHITE);
        //graph.setStroke(new BasicStroke(1.3f));
        graph.setStroke(new BasicStroke(4.0f));
        graph.drawPolygon(polygon1);
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve18);
        graph.draw(drawQuadCurve17);
        graph.draw(drawQuadCurve16);
        graph.draw(drawQuadCurve15);
        graph.draw(drawQuadCurve14);
        graph.draw(drawQuadCurve13);
        graph.draw(drawQuadCurve12);
        graph.draw(drawQuadCurve11);
        graph.draw(drawQuadCurve10);
        graph.draw(drawQuadCurve9s4);
        graph.draw(drawQuadCurve9s3);
        graph.draw(drawQuadCurve9s2);
        graph.draw(drawQuadCurve9s1);
        graph.draw(drawQuadCurve8);
        graph.draw(drawQuadCurve7);
        graph.draw(drawQuadCurve6);
        graph.draw(drawQuadCurve1);
        graph.draw(drawQuadCurve2);
        graph.draw(drawQuadCurve3);
        graph.draw(drawQuadCurve4);
        graph.draw(drawQuadCurve4s1);
        graph.draw(drawQuadCurve4s2);
        graph.draw(drawQuadCurve4s3);
        graph.draw(drawQuadCurve4s4);
        graph.draw(drawQuadCurve4s5);
        graph.draw(drawQuadCurve4s6);
        graph.draw(drawQuadCurve20);
        graph.draw(drawQuadCurve21);
        graph.draw(drawQuadCurve22);
        graph.draw(drawQuadCurve23);
        graph.draw(drawQuadCurve24);
        graph.setColor(Color.WHITE);
        graph.fill(drawQuadCurve6);
        graph.fill(drawQuadCurve7);
        graph.fill(drawQuadCurve8);
        graph.fill(drawQuadCurve10);
        graph.fill(drawQuadCurve14);
        graph.fill(drawQuadCurve16);
        graph.fill(drawQuadCurve18);
        graph.fill(drawQuadCurve4s3);
        graph.fill(drawQuadCurve4s5);
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve5);
        
        graph.setColor(Color.WHITE);
        graph.fill(drawQuadCurve1);
        graph.fill(drawQuadCurve2);
        graph.fill(drawQuadCurve3);
        graph.fill(drawQuadCurve9s1);
        graph.fill(drawQuadCurve9s2);
        graph.fill(drawQuadCurve9s3);
        graph.fill(drawQuadCurve9s4);
        graph.setStroke(new BasicStroke(2.0f));
        //graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        graph.fillPolygon(polygon1);
        graph.fillPolygon(polygon2);
    }
}
