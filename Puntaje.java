/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Puntaje
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21239
 */
public class Puntaje{
    private int puntos;

    public Puntaje(){
        puntos = 0;
    }

    /**
     * @param puntos
     */
    public void setPuntaje(int p){
        puntos += p;
    }

    /**
     * @return puntos
     */
    public int getPuntaje(){
        return puntos;
    }
}
