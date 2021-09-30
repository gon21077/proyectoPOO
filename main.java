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

public class main {
    public static preguntas pregunta = null;
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int vidas = 3;

        while (vidas != 0){
            pregunta = new preguntas();
            if (pregunta.getTipo() == "Suma"){
                boolean R = pregunta.Suma();
                if (R == true){
                    System.out.println("Bien hecho!");
                } else {
                    System.out.println("Incorrecto, sigue tratando!");
                    vidas = vidas-1;
                }
            } if (pregunta.getTipo()== "Resta"){
                boolean R = pregunta.Resta();
                if (R == true){
                    System.out.println("Bien hecho!");
                } else {
                    System.out.println("Incorrecto, sigue tratando!");
                    vidas = vidas-1;
                }
            } if (pregunta.getTipo()== "Multiplicacion"){
                boolean R = pregunta.Multiplicacion();
                if (R == true){
                    System.out.println("Bien hecho!");
                } else {
                    System.out.println("Incorrecto, sigue tratando!");
                    vidas = vidas-1;
                }
            } if (pregunta.getTipo()== "Division"){
                boolean R = pregunta.Division();
                if (R == true){
                    System.out.println("Bien hecho!");
                } else {
                    System.out.println("Incorrecto, sigue tratando!");
                    vidas = vidas-1;
                }
                
            } if (vidas == 0){
                System.out.println("Ya no tienes vidas, inténtalo luego.");
            }
        }
    }
}
