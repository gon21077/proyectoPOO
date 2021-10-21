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

import java.util.Scanner;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class main  {

    public static Archivos Archivos = null;

    JPanel panel = new JPanel();
    

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
        
         JFrame marco = new JFrame();
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
        JTextField cajatextop = new JTextField("Aca va a ir la pregunta");
        cajatextop.setBounds(150, 250, 200, 40);
        panel.add(cajatextop);
        JTextField cajatextor = new JTextField("Aca va a ir la Respuesta");
        cajatextor.setBounds(150, 300, 200, 40);
        panel.add(cajatextor);
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
    }

    

    private void CajaPreguntas(){
        JTextField cajatexto1 = new JTextField();
        panel.add(cajatexto1);
    }

    private JComponent getContentPane() {
        return null;
    }



    public static preguntas pregunta = null;
    public static Puntaje puntaje = null;

    /**
     * @param args
     */
    public static void main(String[] args){
        new main(); ///

        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int vidas = 3;

        while (!exit){
            System.out.println("\nBienvenido al juego de matematicas! Que va a hacer?");
            System.out.println("1... Iniciar juego");
            System.out.println("2... Ir a tutoriales");
            System.out.println("3... Salir\n");

            String seleccion = scan.nextLine();

            if(seleccion.equals("1")) {
                puntaje = new Puntaje();
                while (vidas != 0) {
                    System.out.println("Puntaje actual:"+puntaje.getPuntaje());
                    pregunta = new preguntas();
                    if (pregunta.getTipo() == "Suma") {
                        boolean R = pregunta.Suma();
                        if (R) {
                            System.out.println("Bien hecho!");
                            puntaje.setPuntaje(1);
                        } else {
                            System.out.println("Incorrecto, sigue tratando!");
                            vidas = vidas - 1;
                            System.out.println("Te quedan " + vidas + " vidas");
                        }
                    }
                    if (pregunta.getTipo() == "Resta") {
                        boolean R = pregunta.Resta();
                        if (R) {
                            System.out.println("Bien hecho!");
                            puntaje.setPuntaje(1);
                        } else {
                            System.out.println("Incorrecto, sigue tratando!");
                            vidas = vidas - 1;
                            System.out.println("Te quedan " + vidas + " vidas");
                        }
                    }
                    if (pregunta.getTipo() == "Multiplicacion") {
                        boolean R = pregunta.Multiplicacion();
                        if (R) {
                            System.out.println("Bien hecho!");
                            puntaje.setPuntaje(1);
                        } else {
                            System.out.println("Incorrecto, sigue tratando!");
                            vidas = vidas - 1;
                            System.out.println("Te quedan " + vidas + " vidas");
                        }
                    }
                    if (pregunta.getTipo() == "Division") {
                        boolean R = pregunta.Division();
                        if (R) {
                            System.out.println("Bien hecho!");
                            puntaje.setPuntaje(1);
                        } else {
                            System.out.println("Incorrecto, sigue tratando!");
                            vidas = vidas - 1;
                            System.out.println("Te quedan " + vidas + " vidas");
                        }

                    }
                }
                System.out.println("\n\nYa no tienes vidas, inténtalo de nuevo! \n");

            } else if (seleccion.equals("2")) {
                Archivos archivos = new Archivos();
                System.out.println("Tutoriales");
                System.out.println("Copie y pegue el link en el navegador del tema que desea reforzar.");
                //System.out.println("Sumas: " + archivos.getLink_suma());
                //System.out.println("Restas: " + archivos.getLink_resta());
                //System.out.println("Multiplicacion: " + archivos.getLink_multiplicacion());
                //System.out.println("Division: " + archivos.getLink_division());

            } else if (seleccion.equals("3")) {
                System.out.println("Gracias por jugar!");
                exit = true;

            } else{
                System.out.println("Opcion invalida, intenta de nuevo");

            }

        }
        scan.close();
    }
}
