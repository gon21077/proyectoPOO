/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Archivos
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21239
 */

import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

/*Esta es la clase de archivos, aqui están los ll¡inks para tutoriales*/
public class Archivos {
   
    JPanel panel = new JPanel();
   
    public void Archivos(){
        
        Titulo();
        linksuma();
        linkresta();
        linkmult();
        linkdiv();
        
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

    public void Titulo(){
        JLabel titulo2 = new JLabel("Archivos del Juego");
        titulo2.setForeground(Color.WHITE);
        titulo2.setBounds(5, 0, 300, 80);
        titulo2.setFont(new Font("cooper black",3,20));
        panel.add(titulo2);
    }

    public void linksuma(){
        JLabel titulo3 = new JLabel("Video de Suma: " + " https://www.youtube.com/watch?v=oF-rZLIShC8");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 30, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        panel.add(titulo3);
    }

    public void linkresta(){
        JLabel titulo3 = new JLabel("Video de Resta: " + " https://www.youtube.com/watch?v=Lqf5WmulMYI");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 60, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        panel.add(titulo3);
    }

    public void linkmult(){
        JLabel titulo3 = new JLabel("Video de Multiplicación: " + " https://www.youtube.com/watch?v=YFtEaVw5k1A");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 90, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        panel.add(titulo3);
    }

    public void linkdiv(){
        JLabel titulo3 = new JLabel("Video de División: " + " https://www.youtube.com/watch?v=mQ4wKV9_pZs");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 120, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        panel.add(titulo3);
    }


    
    }
