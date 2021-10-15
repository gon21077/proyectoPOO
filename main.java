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



public class main  {

    /**
     * 
     */
    public main() { ///Constructor
        JFrame frame = new JFrame();

        JButton button = new JButton();
        JLabel label = new JLabel();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); ///Ejemplo, cambiar luego.
        panel.setLayout(new GridLayout()); /// de Awt
        panel.add(button); ///Insertar Button
        panel.add(label); ///Insertar el label

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(""); ///Insertar el titulo.
        frame.pack();
        frame.setVisible(true);


    }

    public static preguntas pregunta = null;
    public static Puntaje puntaje = null;

    /**
     * @param args
     */
    public static void main(String[] args){
        new main(); ///

        Scanner scan = new Scanner(System.in);
        int seleccion = 0;
        int vidas = 3;

        while (seleccion != 3){
            System.out.println("\nBienvenido al juego de matematicas! Que va a hacer?");
            System.out.println("1... Iniciar juego");
            System.out.println("2... Ir a tutoriales");
            System.out.println("3... Salir\n");

            seleccion = scan.nextLine();

            if(seleccion.equals("1") {
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

            } else if (seleccion.equals("2"){
                Archivos archivos = new Archivos();
                System.out.println("Tutoriales");
                System.out.println("Copie y pegue el link en el navegador del tema que desea reforzar.");
                System.out.println("Sumas: " + archivos.getLink_suma());
                System.out.println("Restas: " + archivos.getLink_resta());
                System.out.println("Multiplicacion: " + archivos.getLink_multiplicacion());
                System.out.println("Division: " + archivos.getLink_division());

            } else if (seleccion.equals("3"){
                System.out.println("Gracias por jugar!");
                break;

            } else{
                System.out.println("Opcion invalida, intenta de nuevo");

            }

        }
    }
}
