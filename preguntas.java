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

 /**imports */
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/*esta es la clase de preguntas */
public class preguntas {
    int RespuestaC;
    int Respuesta;
    int primerN;
    int SegundoN;
    int tipo;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor
     */
    public preguntas(){
        primerN = (int)(Math.random()*(100));
        SegundoN = (int)(Math.random()*(100));
        tipo = random.nextInt(4)+1;
    }

    /**
     * convertir a string la suma
     * @return p1
     */
    public String Suma(){
        String p1 = Integer.toString(primerN) +" + "+ Integer.toString(SegundoN);
        return p1;
    }

    /**
     * COnvertir a string la resta
     * @return p1
     */
    public String Resta(){
        String p1 = Integer.toString(primerN) +" - "+ Integer.toString(SegundoN);
        return p1;
    }
    /**
     * convertir a string la multiplicacion
     * @return p1
     */
    public String Multiplicacion(){
        String p1 = Integer.toString(primerN) +" * "+ Integer.toString(SegundoN);
        return p1;
    }
    /**
     * @return true si es correcto, false si no
     */
    public String Division(){
        String p1 = Integer.toString(primerN) +" / "+ Integer.toString(SegundoN);
        return p1;

    }
    /**
     * @return tipo
     */
    public int getTipo(){
        return tipo;
    }
    
    /**
     * verificar respuestas
     * @return respuestaC
     */
    public int Respuesta(){
        if (tipo==1){
            RespuestaC = primerN + SegundoN;
        } if (tipo==2){
            RespuestaC = primerN-SegundoN;
        } if (tipo == 3){
            RespuestaC = primerN*SegundoN;
        } 
        return RespuestaC;
    }
    /*preguntas para division 
     * @return respuestanueva
     */
    public String RespuestaDiv(){  
            Double primerN1 = Double.valueOf(primerN);
            Double SegundoN2 = Double.valueOf(SegundoN);
            Double RespuestaC = (Double)primerN1/ (Double)SegundoN2;
            String RespuestaNueva = new DecimalFormat("#.##").format(RespuestaC);
            
            return RespuestaNueva;
        
    }

}
