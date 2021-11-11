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


import javax.swing.*;

import javax.swing.event.MouseInputAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.URISyntaxException;


import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.net.*;


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
        hSuma(j);
        linkresta(j);
        hResta(j);
        linkmult(j);
        hMult(j);
        linkdiv(j);
        hDiv(j);
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
        JLabel titulo3 = new JLabel("Video de Suma: ");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 80, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    public void hSuma(JPanel j){
        JLabel titulo3 = new JLabel("https://www.youtube.com/watch?v=oF-rZLIShC8");
        titulo3.setForeground(Color.BLUE.darker());
        titulo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        titulo3.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try { 
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=oF-rZLIShC8"));
                } catch (URISyntaxException | IOException i) {
                    i.printStackTrace();
                }
            }
         
            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }
         
            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse left the label
            }
        });
        titulo3.setBounds(120, 80, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }
    

    /*link resta */
    public void linkresta(JPanel j){
        JLabel titulo3 = new JLabel("Video de Resta: ");
        titulo3.setBounds(5, 160, 500, 80);
        titulo3.setFont(new Font("White",3,13));
        j.add(titulo3);
    }

    public void hResta(JPanel j){
        JLabel titulo4 = new JLabel("https://www.youtube.com/watch?v=Lqf5WmulMYI");
        titulo4.setForeground(Color.BLUE.darker());
        titulo4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        titulo4.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try { 
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Lqf5WmulMYI"));
                } catch (URISyntaxException | IOException i) {
                    i.printStackTrace();
                }
            }
         
            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }
         
            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse left the label
            }
        });
        titulo4.setBounds(120, 160, 500, 80);
        titulo4.setFont(new Font("cooper black",3,13));
        j.add(titulo4);
    }

    /*link multiplicacion */
    public void linkmult(JPanel j){
        JLabel titulo3 = new JLabel("Video de Multiplicación: ");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 240, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    public void hMult(JPanel j){
        JLabel titulo3 = new JLabel("https://www.youtube.com/watch?v=YFtEaVw5k1A");
        titulo3.setForeground(Color.BLUE.darker());
        titulo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        titulo3.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try { 
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=YFtEaVw5k1A"));
                } catch (URISyntaxException | IOException i) {
                    i.printStackTrace();
                }
            }
         
            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }
         
            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse left the label
            }
        });
        titulo3.setBounds(140, 270, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    
    }

    /*link division */
    public void linkdiv(JPanel j){
        JLabel titulo3 = new JLabel("Video de División: ");
        titulo3.setForeground(Color.WHITE);
        titulo3.setBounds(5, 320, 500, 80);
        titulo3.setFont(new Font("cooper black",3,13));
        j.add(titulo3);
    }

    public void hDiv(JPanel j){
        JLabel titulo3 = new JLabel("https://www.youtube.com/watch?v=mQ4wKV9_pZs");
        titulo3.setForeground(Color.BLUE.darker());
        titulo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        titulo3.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try { 
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=mQ4wKV9_pZs"));
                } catch (URISyntaxException | IOException i) {
                    i.printStackTrace();
                }
            }
         
            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }
         
            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse left the label
            }
        });
        titulo3.setBounds(140, 320, 500, 80);
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
                try {
                    main.main(arguments);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            } 
        };
        boton1.addActionListener(clickHome);
    }

    public void jLabelSuma(java.awt.event.MouseEvent evt){
        

        /**
         * try {
            if (Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isDesktopSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("https://www.youtube.com/watch?v=oF-rZLIShC8"));
                }
            }
        }
        */
    }

    
}



