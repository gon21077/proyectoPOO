/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Main
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21239
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;



public class main  {

    public static Archivos Archivos = null;
    public int r = 0;
    public String p = "";
    public String r1 = "";
    public int preguntasNumero = 1;
    public int preguntasContestadas = 0;
    public int vidas = 3;
    public JTextField cajatextor = null;
    public static preguntas pregunta = null;
    public static Puntaje puntaje = null;


    JPanel panel = new JPanel();
    JFrame marco = new JFrame();

    /**
     * 
     */
    public main() { ///Constructor
        
        BotonHome();
        BotonOpciones();
        BotonArchivos();
        BotonNiveles();
        CajasTexto();
        BotonEnviar();
        System.out.println(r1);
        System.out.println(r);
        puntaje = new Puntaje();
        
        marco = new JFrame();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        marco.add(panel);
        marco.setTitle("Juego de las Matematicas");
        marco.setSize(500, 500);
        marco.setResizable(true);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }

    private void BotonHome(){
        JButton boton1 = new JButton("Home");
        boton1.setBounds(50, 30, 100, 40);
        panel.add(boton1);
        
    }
    

  
    private void CajasTexto(){
        
        pregunta = new preguntas();
        if (pregunta.getTipo() == 1) {
            p = pregunta.Suma();
            r = pregunta.Respuesta();
        } if (pregunta.getTipo()== 2) {
            p = pregunta.Resta();
            r = pregunta.Respuesta();
        } if (pregunta.getTipo() == 3) {
            p = pregunta.Multiplicacion();
            r = pregunta.Respuesta();
        } if (pregunta.getTipo()== 4){
            p = pregunta.Division();
            r1 = pregunta.RespuestaDiv();
        }

        JLabel preguntaAqui = new JLabel("Pregunta "+preguntasNumero);
        preguntaAqui.setBounds(200, 200, 200, 40);
        preguntaAqui.setForeground(Color.WHITE);
        preguntaAqui.setFont(new Font("Verdana",Font.PLAIN,20));
        panel.add(preguntaAqui);


        JLabel preguntaLabel = new JLabel ("");
        preguntaLabel.setText(p);
        preguntaLabel.setBounds(220, 250, 200, 40);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("Verdana",Font.PLAIN,20));
        panel.add(preguntaLabel);

        cajatextor = new JTextField("Ingrese su respuesta");
        cajatextor.setBounds(150, 300, 200, 40);
        panel.add(cajatextor);


        cajatextor.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cajatextor.setText("");;
            }
        });
        panel.repaint();
    }

    private void BotonOpciones(){
        JButton boton2 = new JButton("Opciones");
        boton2.setBounds(150, 30, 100, 40);
        panel.add(boton2);
    }

    private void BotonArchivos(){
        
        JButton boton3 = new JButton("Archivos");
        boton3.setBounds(250, 30, 100, 40);
        panel.add(boton3);

        ActionListener click = new ActionListener(){

            Archivos Archivos = new Archivos();
            @Override
            public void actionPerformed(ActionEvent e) {
                Archivos.Archivos();
                
            }
        };

        boton3.addActionListener(click);
    }        

    private void BotonNiveles(){
        JButton boton4 = new JButton("Niveles");
        JLabel titulo = new JLabel("Bienvenido al juego");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("cooper black",3,20));
        titulo.setBounds(155, 100, 300, 80);
        boton4.setBounds(350, 30, 100, 40);
        panel.add(boton4);
        panel.add(titulo);
    }

    private void BotonEnviar(){
        
        JButton boton5 = new JButton("Enviar");
        boton5.setBounds(50, 400, 100, 40);
        panel.add(boton5);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cajatextor.getText());
                String res = "";

                int respuestadada = 0;
                try{
                    respuestadada = Integer.parseInt(cajatextor.getText());
                } catch (Exception i){
                    res = cajatextor.getText();
                }
                if (pregunta.getTipo() == 4){
                    if (res.equals(r1)){
                        panel.removeAll();
                        puntaje.setPuntaje(1);
                        preguntasContestadas = preguntasContestadas+1;
                        preguntasNumero = preguntasNumero+1;
                        BotonHome();
                        BotonOpciones();
                        BotonArchivos();
                        BotonNiveles();
                        CajasTexto();
                        BotonEnviar();  
                    } else {
                        panel.removeAll();
                        vidas = vidas-1;
                        if (vidas < 1){
                            JLabel GameOver = new JLabel("Perdiste");
                            GameOver.setBounds(200, 200, 200, 40);
                            GameOver.setForeground(Color.WHITE);
                            GameOver.setFont(new Font("Verdana",Font.PLAIN,20));
                            panel.add(GameOver);
                        } else {
                            BotonHome();
                            BotonOpciones();
                            BotonArchivos();
                            BotonNiveles();
                            CajasTexto();
                            BotonEnviar();
                        }
                    }
                } else {
                    if (respuestadada == r){
                        panel.removeAll();
                        puntaje.setPuntaje(1);
                        preguntasContestadas = preguntasContestadas+1;
                        preguntasNumero = preguntasNumero+1;
                        BotonHome();
                        BotonOpciones();
                        BotonArchivos();
                        BotonNiveles();
                        CajasTexto();
                        BotonEnviar();
                    } else {
                        panel.removeAll();
                        vidas = vidas-1;
                        if (vidas < 1){
                            JLabel GameOver = new JLabel("Perdiste");
                            GameOver.setBounds(200, 200, 200, 40);
                            GameOver.setForeground(Color.WHITE);
                            GameOver.setFont(new Font("Verdana",Font.PLAIN,20));
                            panel.add(GameOver);
                        } else {
                            BotonHome();
                            BotonOpciones();
                            BotonArchivos();
                            BotonNiveles();
                            CajasTexto();
                            BotonEnviar();
                        }
                    }
                }
            }
        };
        boton5.addActionListener(actionListener);
               

    }

    

    private void CajaPreguntas(){
        JTextField cajatexto1 = new JTextField();
        panel.add(cajatexto1);
    }

    private JComponent getContentPane() {
        return null;
    }



public static void main(String[]args){
    new main();
}
}
