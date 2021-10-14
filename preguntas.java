/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Preguntas
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21239
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.text.DecimalFormat;

public class preguntas {
    int RespuestaC;
    int Respuesta;
    int primerN;
    int SegundoN;
    String tipo;
    ArrayList<String> tipos = new ArrayList<String>();
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor
     */
    public preguntas(){
        primerN = (int)(Math.random()*(100));
        SegundoN = (int)(Math.random()*(100));
        Collections.addAll(tipos, "Suma", "Resta", "Multiplicacion", "Division");
        tipo = tipos.get(random.nextInt(tipos.size()));
    }

    public boolean Suma(){
        RespuestaC = primerN + SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" + "+Integer.toString(SegundoN));
        System.out.println("Ingrese su respuesta:");
        while (primerN != 989){
            System.out.println("Ingrese su respuesta:");
            try {
                Respuesta = scan.nextInt();
                break;
            } catch(Exception e){
                System.out.println("Ingrese solo un valor númerico entero para este tipo de pregunta");
                scan.next();
                continue;
            }
        }

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return
     */
    public boolean Resta(){
        RespuestaC = primerN - SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" - "+Integer.toString(SegundoN));
        System.out.println("Ingrese su respuesta:");
        while (primerN != 989){
            System.out.println("Ingrese su respuesta:");
            try {
                Respuesta = scan.nextInt();
                break;
            } catch(Exception e){
                System.out.println("Ingrese solo un valor númerico entero para este tipo de pregunta");
                scan.next();
                continue;
            }
        }

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }

    }
    /**
     * @return
     */
    public boolean Multiplicacion(){
        RespuestaC = primerN * SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" * "+Integer.toString(SegundoN));
        while (primerN != 989){
            System.out.println("Ingrese su respuesta:");
            try {
                Respuesta = scan.nextInt();
                break;
            } catch(Exception e){
                System.out.println("Ingrese solo un valor númerico entero para este tipo de pregunta");
                scan.next();
                continue;
            }
        }

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }
    /**
     * @return true si es correcto, false si no
     */
    public boolean Division(){
        Double primerN1 = Double.valueOf(primerN);
        Double SegundoN2 = Double.valueOf(SegundoN);
        Double RespuestaC = (Double)primerN1/ (Double)SegundoN2;
        String RespuestaNueva = new DecimalFormat("#.##").format(RespuestaC);
        System.out.println("Pregunta:");
        System.out.println(Double.toString(primerN)+" / " + Double.toString(SegundoN));
        System.out.println("Ingrese su respuesta redondeado a dos decimales: ");
        String Respuesta = scan.nextLine();

        if (Respuesta.equals(RespuestaNueva)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * @return tipo
     */
    public String getTipo(){
        return tipo;
    }
    
    /**
     * @return
     */
}
