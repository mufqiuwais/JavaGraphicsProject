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
        
        //==================================Hair Line=========================================
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
        Shape hairCurveLeft = new QuadCurve2D.Float(334,421,349,458,349,458);
        Shape hairCurveRight = new QuadCurve2D.Float(484,421,464,458,464,458);
        
        //=================================End of Hair Line===============================
        
        //=================================Face Line======================================
        Shape faceCurve1 = new QuadCurve2D.Float(298,342,308,411,388,470);
        Shape faceCurve2 = new QuadCurve2D.Float(388,470,408,488,428,470);
        Shape faceCurve3 = new QuadCurve2D.Float(428,470,505,411,512,365);
        Shape leftEarCurve1 = new QuadCurve2D.Float(260,309,230,330,260,380);
        Shape leftEarCurve2 = new QuadCurve2D.Float(260,380,292,410,318,400);
        Shape rightEarCurve1 = new QuadCurve2D.Float(565,325,575,350,555,380);
        Shape rightEarCurve2 = new QuadCurve2D.Float(555,380,540,400,500,400);
        Shape leftNeck = new QuadCurve2D.Float(348,438,359,530,348,600);
        Shape rightNeck = new QuadCurve2D.Float(465,440,460,530,465,600);
        //=================================End of Face Line===============================
        
        //=================================Shirt Line=====================================
        Shape leftShirt1 = new QuadCurve2D.Float(352,508,309,509,289,600);
        Shape leftShirt2 = new QuadCurve2D.Float(328,540,338,600,338,600);
        Shape rightShirt1 = new QuadCurve2D.Float(464,508,504,508,540,600);
        Shape rightShirt2 = new QuadCurve2D.Float(490,540,485,600,485,600);
        //=================================End of Shirt Line==============================
        
        //==================================Eye Line======================================
        //==================================Eye Brow======================================
        Shape leftEyeBrow1 = new QuadCurve2D.Float(340,240,343,238,372,241);
        Shape leftEyeBrow1s1 = new QuadCurve2D.Float(372,241,372,241,383,244);
        Shape leftEyeBrow2 = new QuadCurve2D.Float(340,240,335,238,318,250);
        Shape leftEyeBrow3 = new QuadCurve2D.Float(318,250,318,250,340,248);
        Shape leftEyeBrow4 = new QuadCurve2D.Float(340,248,340,248,389,252);
        Shape rightEyeBrow1 = new QuadCurve2D.Float(422,249,430,242,440,242);
        Shape rightEyeBrow2 = new QuadCurve2D.Float(422,249,432,252,450,252);
        //==================================End of Eye Brow===============================
        //==================================Left Eye======================================
        Shape leftEyeLid1 = new QuadCurve2D.Float(338, 282,362,278,370,295);
        Shape leftEyeLid2 = new QuadCurve2D.Float(323,293,337,281,340,282);
        Shape leftEyeLid2s1 = new QuadCurve2D.Float(323,287,330,290,340,282);
        Shape leftEyeLid2s2 = new QuadCurve2D.Float(322,294,322,294,318,292);
        Shape leftEyeLid3 = new QuadCurve2D.Float(338, 282,348, 280,370,287);
        //==================================End of Left Eye===============================
        //==================================Right Eye======================================
        Shape rightEyeLid1 = new QuadCurve2D.Float(443, 295,457, 277,475,283);
        Shape rightEyeLid2 = new QuadCurve2D.Float(489,293,477,281,473,281);
        Shape rightEyeLid2s1 = new QuadCurve2D.Float(490,287,480,289,473,281);
        Shape rightEyeLid2s2 = new QuadCurve2D.Float(490,294,489,293,494,292);
        Shape rightEyeLid3 = new QuadCurve2D.Float(443, 287,463,280,473,281);
        //==================================End of Right Eye===============================
        //==================================End of Eye Line===============================
        //==================================Nose Line=====================================
        Shape noseLine1 = new QuadCurve2D.Float(403,300,406,310,406,344);
        Shape noseLine2 = new QuadCurve2D.Float(406,366,406,366,406,371);
        Shape noseLine3 = new QuadCurve2D.Float(406,371,406,371,403,371);
        Shape noseLine4 = new QuadCurve2D.Float(394,369,394,366,400,357);
        Shape noseLine5 = new QuadCurve2D.Float(415,369,415,369,415,369);
        Shape noseLine6 = new QuadCurve2D.Float(400,357,400,360,406,366);
        //==================================End of Nose Line==============================
        //==================================Mouth Line====================================
        Shape mouthLine = new QuadCurve2D.Float(380,420,408,408,436,420);
        //==================================End of Mouth Line=============================
        
        
        int xValues[] = {227,243,253,243};
        int yValues[] = {240,250,240,222};
        Polygon polygon1 = new Polygon();
        polygon1.addPoint(227, 240);
        polygon1.addPoint(243, 251);
        polygon1.addPoint(254, 240);
        polygon1.addPoint(243, 228);
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(300, 145);
        polygon2.addPoint(400, 67);
        polygon2.addPoint(455, 69);
        polygon2.addPoint(555, 149);
        Polygon polygon3 = new Polygon();
        polygon3.addPoint(520,307);
        polygon3.addPoint(508,280);
        polygon3.addPoint(455, 69);
        polygon3.addPoint(555,150);
        polygon3.addPoint(580,215);
        Polygon polygon4 = new Polygon();
        polygon4.addPoint(388,178);
        polygon4.addPoint(455, 69);
        polygon4.addPoint(580,215);
        polygon4.addPoint(508,280);
        Polygon polygon5 = new Polygon();
        polygon5.addPoint(300,170);
        polygon5.addPoint(390,178);
        polygon5.addPoint(455, 69);
        polygon5.addPoint(400, 67);
        polygon5.addPoint(300, 145);
        Polygon polygon6 = new Polygon();
        polygon6.addPoint(520,306);
        polygon6.addPoint(580,214);
        polygon6.addPoint(588,268);
        polygon6.addPoint(680,294);
        polygon6.addPoint(578,305);
        Polygon polygon7 = new Polygon();
        polygon7.addPoint(579,212);
        polygon7.addPoint(600,228);
        polygon7.addPoint(670,256);
        polygon7.addPoint(588,268);
        Polygon polygon8 = new Polygon();
        polygon8.addPoint(348,171);
        polygon8.addPoint(390,178);
        polygon8.addPoint(395,188);
        polygon8.addPoint(435,290);
        Polygon polygon9 = new Polygon();
        polygon9.addPoint(300,170);
        polygon9.addPoint(351,172);
        polygon9.addPoint(351,182);
        polygon9.addPoint(326,200);
        Polygon polygon10 = new Polygon();
        polygon10.addPoint(230,180);
        polygon10.addPoint(280,150);
        polygon10.addPoint(300,170);
        polygon10.addPoint(326,200);
        polygon10.addPoint(298,305);
        polygon10.addPoint(260,310);
        polygon10.addPoint(228,240);
        
        //=================First Layer=================
        graph.setPaint(new Color(234, 37, 154));
        
        graph.setPaint(Color.WHITE);
        graph.drawPolygon(polygon2);
        graph.fillPolygon(polygon5);
        graph.fillPolygon(polygon8);
        graph.fillPolygon(polygon9);
        graph.setColor(Color.WHITE);
        //graph.setStroke(new BasicStroke(1.3f));
        graph.setStroke(new BasicStroke(4.0f));
        graph.drawPolygon(polygon1);
        graph.setPaint(new Color(241, 80, 111));
        graph.fill(faceCurve1);
        graph.fill(faceCurve2);
        graph.fill(faceCurve3);
        
        //=================Second Layer==================
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve18);
        graph.draw(drawQuadCurve17);
        graph.draw(drawQuadCurve16);
        graph.draw(drawQuadCurve15);
        graph.draw(drawQuadCurve13);
        graph.draw(drawQuadCurve8);
        graph.draw(drawQuadCurve7);
        graph.draw(drawQuadCurve1);
        graph.draw(drawQuadCurve3);
        graph.draw(drawQuadCurve4);
        graph.draw(drawQuadCurve22);
        graph.draw(drawQuadCurve23);
        graph.draw(drawQuadCurve24);
        graph.setColor(Color.WHITE);
        graph.fill(drawQuadCurve7);
        graph.fill(drawQuadCurve8);
        graph.fill(drawQuadCurve14);
        graph.fill(drawQuadCurve16);
        graph.fill(drawQuadCurve18);
        graph.fill(drawQuadCurve4s3);
        graph.fill(drawQuadCurve4s5);
        graph.fillPolygon(polygon6);
        graph.fillPolygon(polygon7);
        graph.fillPolygon(polygon10);
        
        //==================Third Layer=====================
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve2);
        graph.draw(drawQuadCurve20);
        graph.draw(drawQuadCurve21);
        graph.setStroke(new BasicStroke(1.8f));
        graph.draw(drawQuadCurve4s1);
        graph.draw(drawQuadCurve4s2);
        graph.draw(drawQuadCurve4s3);
        graph.draw(drawQuadCurve4s4);
        graph.draw(drawQuadCurve4s5);
        graph.draw(drawQuadCurve4s6);
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(drawQuadCurve6);
        graph.draw(drawQuadCurve12);
        graph.draw(drawQuadCurve11);
        graph.draw(drawQuadCurve10);
        graph.draw(drawQuadCurve9s4);
        graph.draw(drawQuadCurve9s3);
        graph.draw(drawQuadCurve9s2);
        graph.draw(drawQuadCurve9s1);
        graph.setStroke(new BasicStroke(2.0f));
        graph.draw(drawQuadCurve14);
        graph.draw(hairCurveLeft);
        graph.draw(hairCurveRight);
        graph.draw(leftShirt1);
        graph.draw(leftShirt2);
        graph.draw(rightShirt1);
        graph.draw(rightShirt2);
        
        //===================Face Layer 1======================
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(faceCurve1);
        graph.draw(faceCurve2);
        graph.draw(faceCurve3);
        graph.draw(leftEarCurve1);
        graph.draw(leftEarCurve2);
        graph.draw(rightEarCurve1);
        graph.draw(rightEarCurve2);
        graph.draw(leftNeck);
        graph.draw(rightNeck);
        //===================End of Face Layer 1===============
        
        graph.setColor(Color.WHITE);
        graph.fillPolygon(polygon2);
        graph.fillPolygon(polygon3);
        graph.fillPolygon(polygon4);
        graph.fillPolygon(polygon5);
        graph.fill(drawQuadCurve2);
        graph.fill(drawQuadCurve1);
        graph.fill(drawQuadCurve3);
        graph.fill(drawQuadCurve6);
        graph.fill(drawQuadCurve9s1);
        graph.fill(drawQuadCurve9s2);
        graph.fill(drawQuadCurve9s3);
        graph.fill(drawQuadCurve9s4);
        graph.fill(drawQuadCurve10);
        graph.setStroke(new BasicStroke(2.0f));
        //graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        graph.fillPolygon(polygon1);
        
        //=================FOURTH Layer==========================
        graph.setColor(Color.WHITE);
        graph.fillArc(340, 281, 18, 18, 0, 360);
        graph.fillArc(455, 281, 18, 18, 0, 360);
        graph.setPaint(new Color(234, 37, 154));
        graph.setStroke(new BasicStroke(1.8f));
        graph.draw(drawQuadCurve2);
        
        graph.setStroke(new BasicStroke(3.0f));
        graph.draw(drawQuadCurve5);
        //=================Eye Layer=============================
        graph.setStroke(new BasicStroke(2.2f));
        //left eye
        graph.drawArc(340, 281, 18, 18, 40, -270);
       
        //right eye
        graph.drawArc(455, 281, 18, 18, 50, -260);
        //left glass
        graph.drawArc(297, 243, 100, 100, 40, -265);
        graph.drawLine(397, 293, 420, 293);
        //right glass
        graph.drawArc(420, 243, 100, 100, 45, -263);
        //left nose
        graph.drawArc(394,366, 8, 8, -360, 180);
        graph.draw(leftEyeBrow1);
        graph.draw(leftEyeBrow1s1);
        graph.draw(leftEyeBrow2);
        graph.draw(leftEyeBrow3);
        graph.draw(leftEyeBrow4);
        graph.draw(rightEyeBrow1);
        graph.draw(rightEyeBrow2);
        graph.draw(leftEyeLid1);
        graph.draw(leftEyeLid2s1);
        graph.draw(leftEyeLid2s2);
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(leftEyeLid2);
        graph.draw(leftEyeLid3);
        graph.setStroke(new BasicStroke(2.2f));
        graph.draw(rightEyeLid1);
        graph.draw(rightEyeLid2s1);
        graph.draw(rightEyeLid2s2);
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(rightEyeLid2);
        graph.draw(rightEyeLid3);
        //=================End of Eye Layer======================
        //=================Nose Layer============================
        graph.setStroke(new BasicStroke(2.2f));
        graph.draw(noseLine1);
        graph.draw(noseLine2);
        graph.draw(noseLine3);
        graph.draw(noseLine4);
        graph.draw(noseLine6);
        graph.setStroke(new BasicStroke(4.0f));
        graph.draw(noseLine5);
        //=================End of Nose Layer=====================
        //=================Mouth Layer===========================
        graph.setStroke(new BasicStroke(2.2f));
        graph.draw(mouthLine);
        //=================End of Mouth Line=====================
    }
}
