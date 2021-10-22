/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Archivos
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21139
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home{ 
    JPanel panel = new JPanel();
    JFrame marco = new JFrame();

    public Home(){

    }

    public void homeBoton(){
        JFrame marco = new JFrame();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        marco.add(panel);
        marco.setTitle("Archivos del juego");
        marco.setSize(500, 500);
        marco.setResizable(true);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
