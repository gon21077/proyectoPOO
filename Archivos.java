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


/*Esta es la clase de archivos, aqui están los links para tutoriales*/
public class Archivos {

   
    /*constructor */
    public void Archivos(JPanel j, JFrame i, SimpleAudioPlayer o){

        /**
         * Limpiar frame para evitar texto duplicado.
         */
        j.removeAll();
        j.repaint();
        
        Titulo(j);

        hSuma(j);

        hResta(j);

        hMult(j);

        hDiv(j);
        BotonHome(j, i, o);
        
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
        JLabel titulo2 = new JLabel("Recursos de aprendizaje:");
        titulo2.setForeground(Color.WHITE);
        titulo2.setBounds(120, 50, 300, 80);
        titulo2.setFont(new Font("Cooper Black",Font.PLAIN,20));
        j.add(titulo2);
    }

    /*para el link suma */
    public void hSuma(JPanel j){
        JLabel titulo3 = new JLabel("Clickea para ver un video de Suma");
        titulo3.setForeground(Color.WHITE);
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
        titulo3.setBounds(120, 100, 500, 80);
        titulo3.setFont(new Font("Verdana",Font.PLAIN,13));
        j.add(titulo3);
    }
    /*Para link resta */
    public void hResta(JPanel j){
        JLabel titulo4 = new JLabel("Clickea para ver un video de Resta");
        titulo4.setForeground(Color.WHITE);
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
        titulo4.setFont(new Font("Verdana",Font.PLAIN,13));
        j.add(titulo4);
    }
    /*Para link de Multiplicación */
    public void hMult(JPanel j){
        JLabel titulo3 = new JLabel("Clickea para ver un video de Multiplicación");
        titulo3.setForeground(Color.WHITE);
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
        titulo3.setBounds(120, 220, 500, 80);
        titulo3.setFont(new Font("Verdana",Font.PLAIN,13));
        j.add(titulo3);
    
    }
    /*Para link de División */
    public void hDiv(JPanel j){
        JLabel titulo3 = new JLabel("Clickea para ver un video de División");
        titulo3.setForeground(Color.WHITE);
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
        titulo3.setBounds(120, 280, 500, 80);
        titulo3.setFont(new Font("Verdana",Font.PLAIN,13));
        j.add(titulo3);
    
    }
    /*Regresa a home */
    public void BotonHome(JPanel j, JFrame i, SimpleAudioPlayer o){
    
        JButton boton1 = new JButton("Home");
        boton1.setBounds(50, 30, 100, 40);
        j.add(boton1);
        
        ActionListener clickHome = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                i.setVisible(false);
                o.stop();
                String[] arguments = new String[] {};
                try {
                    main.main(arguments);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                
            } 
        };
        boton1.addActionListener(clickHome);
    }
}



