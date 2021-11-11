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

 /*imports */
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

/*Esta es la clase de archivos, aqui están los ll¡inks para tutoriales*/
public class Archivos {
   
   
    /*constructor */
    public void Archivos(JPanel j, JFrame i){

        /**
         * Limpiar frame para evitar texto duplicado.
         */
        j.removeAll();
        j.repaint();
        
        Titulo(j);
        linksuma(j);
        linkresta(j);
        linkmult(j);
        linkdiv(j);
        BotonHome(j, i);
        
        /*dar formato a la pantalla */
        j.setLayout(null);
        j.setBackground(Color.BLUE);
        i.add(j);
        i.setTitle("Archivos del juego");
        i.setSize(500, 500);
        i.setResizable(true);
        i.setLocationRelativeTo(null);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i.setVisible(true);

    }

    /*para el titulo */
    public void Titulo(JPanel j){
        JLabel titulo2 = new JLabel("Archivos del Juego");
        titulo2.setForeground(Color.WHITE);
        titulo2.setBounds(5, 50, 300, 80);
        titulo2.setFont(new Font("cooper black",3,20));
        j.add(titulo2);
    }

    /*para el link suma */
    public void linksuma(JPanel j){
        JLabel titulo3 = new JLabel("Video de Suma: " + " https://www.youtube.com/watch?v=oF-rZLIShC8");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 80, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    /*link resta */
    public void linkresta(JPanel j){
        JLabel titulo3 = new JLabel("Video de Resta: " + " https://www.youtube.com/watch?v=Lqf5WmulMYI");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 110, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    /*link multiplicacion */
    public void linkmult(JPanel j){
        JLabel titulo3 = new JLabel("Video de Multiplicación: " + " https://www.youtube.com/watch?v=YFtEaVw5k1A");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 140, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    /*link division */
    public void linkdiv(JPanel j){
        JLabel titulo3 = new JLabel("Video de División: " + " https://www.youtube.com/watch?v=mQ4wKV9_pZs");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 170, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }
    public void BotonHome(JPanel j, JFrame i){
    
        JButton boton1 = new JButton("Home");
        boton1.setBounds(50, 30, 100, 40);
        j.add(boton1);
        
        ActionListener clickHome = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                i.setVisible(false);
                String[] arguments = new String[] {};
                main.main(arguments);
                
            } 
        };
        boton1.addActionListener(clickHome);
    }

    
    }
