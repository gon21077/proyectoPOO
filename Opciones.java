/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: opciones
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21139
 */

 /*Imports */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/*Esta es la clase opciones, se cambia el color del fondo */
public class Opciones {
    private static Color color = Color.BLUE;


    /*constructor */
    public void Opciones(JPanel j, JFrame i) {
        j.removeAll();
        j.repaint();
        /**Se llaman los métodos */
        titulo(j);
        BotonHome(j, i);
        BotonRojo(j, i);
        BotonVerde(j);
        BotonRosado(j);
        BotonAzul(j);
        /*se instancia un nuevo marco */
        /*se da formato a la pagina */
        j.setLayout(null);
        i.add(j);
        i.setTitle("Opciones de juego");
        i.setSize(500, 500);
        i.setResizable(true);
        i.setLocationRelativeTo(null);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i.setVisible(true);
    }
    /*Metodo para cambiar fondo a rojo */
    public void BotonRojo(JPanel j, JFrame i){
        JButton boton1 = new JButton("Rojo");
        boton1.setBounds(50, 110, 100, 40);
        j.add(boton1);
        
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                j.setBackground(Color.RED);
                color = Color.RED;
            }
            
        };
        /*al dar click se ejecuta */
        boton1.addActionListener(click);
    }

    /*metodo para cambiar fondo a verde */
    public void BotonVerde(JPanel j) {
        JButton boton2 = new JButton("Verde");
        boton2.setBounds(150, 110, 100, 40);
        j.add(boton2);
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                j.setBackground(Color.GREEN);
                color = Color.GREEN;
            }
            
        };
        /*al dar click se ejecuta */
        boton2.addActionListener(click);
    
    }

    /*metodo para fondo rosado */
    public void BotonRosado(JPanel j) {
        JButton boton3 = new JButton("Rosado");
        boton3.setBounds(250, 110, 100, 40);
        j.add(boton3);
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                j.setBackground(Color.PINK);
                color = Color.PINK;
                
            }
            
        };
        /*al dar click se ejecuta */
        boton3.addActionListener(click);
    }
    /**
     * para cambiar a azul el fondo
     * @param j
     */
    public void BotonAzul(JPanel j) {
        JButton boton3 = new JButton("Azul");
        boton3.setBounds(350, 110, 100, 40);
        j.add(boton3);
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                j.setBackground(Color.BLUE);
                color = Color.BLUE;
                
            }
            
        };
        /*al dar click se ejecuta */
        boton3.addActionListener(click);
    }
    
    /**
     * el titulo de la pantalla
     * @param j
     */
    public void titulo(JPanel j) {
        JLabel titulo1 = new JLabel("Opciones de juego");
        titulo1.setForeground(Color.WHITE);
        titulo1.setBounds(5, 50, 300, 80);
        titulo1.setFont(new Font("cooper black",3,20));
        j.add(titulo1);
    }

    /**
     * agregar boton para regresar a home
     * @param j
     * @param i
     */
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
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } 
        };
        boton1.addActionListener(clickHome);
    }
    /**
     * para el color
     * @return color
     */
    public static Color getColor() {
        return color;
    }
}