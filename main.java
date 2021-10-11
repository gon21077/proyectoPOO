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

import java.awt.BorderLayout;
import java.awt.GridLayout;



public class main {

    /**
     * 
     */
    public void GUI() {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); ///Ejemplo
        panel.setLayout(new GridLayout()); /// de Awt

        frame.add(comp, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static preguntas pregunta = null;

    /**
     * @param args
     */
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int seleccion = 0;
        int vidas = 3;

        while (seleccion != 3){
            System.out.println("\nBienvenido al juego de matematicas! Que va a hacer?");
            System.out.println("1... Iniciar juego");
            System.out.println("2... Ir a tutoriales");
            System.out.println("3... Salir\n");

            seleccion = scan.nextInt();

            if(seleccion == 1) {
                while (vidas != 0) {
                    pregunta = new preguntas();
                    if (pregunta.getTipo() == "Suma") {
                        boolean R = pregunta.Suma();
                        if (R) {
                            System.out.println("Bien hecho!");
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
                        } else {
                            System.out.println("Incorrecto, sigue tratando!");
                            vidas = vidas - 1;
                            System.out.println("Te quedan " + vidas + " vidas");
                        }

                    }
                    if (vidas == 0) {
                        System.out.println("Ya no tienes vidas, inténtalo de nuevo. \n");
                    }
                }
            } else if (seleccion == 2){
                Archivos archivos = new Archivos();
                System.out.println("Tutoriales");
                System.out.println("Copie y pegue el link en el navegador del tema que desea reforzar.");
                System.out.println("Sumas: " + archivos.getLink_suma());
                System.out.println("Restas: " + archivos.getLink_resta());
                System.out.println("Multiplicacion: " + archivos.getLink_multiplicacion());
                System.out.println("Division: " + archivos.getLink_division());

            } else if (seleccion == 3){
                System.out.println("Gracias por jugar!");
                break;

            } else{
                System.out.println("Opcion invalida, intenta de nuevo");

            }

        }
    }
}
