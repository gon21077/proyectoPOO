import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class preguntas {
    int RespuestaC;
    int Respuesta;
    int primerN;
    int SegundoN;
    String tipo;
    ArrayList<String> tipos = new ArrayList<String>();
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

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
        Respuesta = scan.nextInt();

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }
    public boolean Resta(){
        RespuestaC = primerN - SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" - "+Integer.toString(SegundoN));
        System.out.println("Ingrese su respuesta:");
        Respuesta = scan.nextInt();

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }
    public boolean Multiplicacion(){
        RespuestaC = primerN * SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" * "+Integer.toString(SegundoN));
        System.out.println("Ingrese su respuesta:");
        Respuesta = scan.nextInt();

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }
    public boolean Division(){
        double RespuestaC = primerN/SegundoN;
        System.out.println("Pregunta:");
        System.out.println(Integer.toString(primerN)+" - "+Integer.toString(SegundoN));
        System.out.println("Ingrese su respuesta:");
        double Respuesta = scan.nextDouble();

        if (Respuesta == RespuestaC){
            return true;
        } else {
            return false;
        }
    }
    public String getTipo(){
        return tipo;
    }
}
