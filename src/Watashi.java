/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
/**
 *
 * @author mufqi
 */
public class Watashi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Watashi (The Tatami Galaxy)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WatashiJPanel watashiJPanel = new WatashiJPanel();
        frame.add(watashiJPanel);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
    
}
