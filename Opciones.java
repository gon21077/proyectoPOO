import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opciones {
    JPanel panel = new JPanel();

    public void Opciones() {
        BotonRojo();
        BotonVerde();
        BotonRosado();
        JFrame marco = new JFrame();
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
    public void BotonRojo(){
        JButton boton1 = new JButton("Rojo");
        boton1.setBounds(100, 40, 100, 40);
        panel.add(boton1);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
                
            }
            
        };
        boton1.addActionListener(click);
    }

    public void BotonVerde() {
        JButton boton2 = new JButton("Verde");
        boton2.setBounds(200, 40, 100, 40);
        panel.add(boton2);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
                
            }
            
        };
        boton2.addActionListener(click);
    
    }

    public void BotonRosado() {
        JButton boton3 = new JButton("Rosado");
        boton3.setBounds(300, 40, 100, 40);
        panel.add(boton3);
        JFrame marco = new JFrame();
        
        ActionListener click = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.PINK);
                
            }
            
        };
        boton3.addActionListener(click);
    }
    
}