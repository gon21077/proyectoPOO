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

/*Esta es la clase opciones, se cambia el color del fondo */
public class Opciones {

    /*Instanciar un nuevo panel  */
    JPanel panel = new JPanel();

    /*constructor */
    public void Opciones() {
        /**Se llaman los métodos */
        titulo();
        BotonRojo();
        BotonVerde();
        BotonRosado();
        /*se instancia un nuevo marco */
        JFrame marco = new JFrame();
        /*se da formato a la pagina */
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        marco.add(panel);
        marco.setTitle("Opciones de juego");
        marco.setSize(500, 500);
        marco.setResizable(true);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    /*Metodo para cambiar fondo a rojo */
    public void BotonRojo(){
        JButton boton1 = new JButton("Rojo");
        boton1.setBounds(100, 70, 100, 40);
        panel.add(boton1);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
                
            }
            
        };
        /*al dar click se ejecuta */
        boton1.addActionListener(click);
    }

    /*metodo para cambiar fondo a verde */
    public void BotonVerde() {
        JButton boton2 = new JButton("Verde");
        boton2.setBounds(200, 70, 100, 40);
        panel.add(boton2);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
                
            }
            
        };
        /*al dar click se ejecuta */
        boton2.addActionListener(click);
    
    }

    /*metodo para fondo rosado */
    public void BotonRosado() {
        JButton boton3 = new JButton("Rosado");
        boton3.setBounds(300, 70, 100, 40);
        panel.add(boton3);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.PINK);
                
            }
            
        };
        /*al dar click se ejecuta */
        boton3.addActionListener(click);
    }
    
    public void titulo() {
        JLabel titulo1 = new JLabel("Opciones de juego");
        titulo1.setForeground(Color.WHITE);
        titulo1.setBounds(5, 0, 300, 80);
        titulo1.setFont(new Font("cooper black",3,20));
        panel.add(titulo1);
    }
}