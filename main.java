import java.util.Scanner;


public class main {
    public static preguntas pregunta = null;
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
            }
        }
    }
}
