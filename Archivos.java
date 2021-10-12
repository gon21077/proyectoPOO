/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Archivos
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21239
 */

public class Archivos {
    private String link_suma;
    private String link_resta;
    private String link_multiplicacion;
    private String link_division;

    public Archivos() {
        link_suma = "https://www.youtube.com/watch?v=oF-rZLIShC8";
        link_resta = "https://www.youtube.com/watch?v=Lqf5WmulMYI";
        link_multiplicacion = "https://www.youtube.com/watch?v=YFtEaVw5k1A";
        link_division = "https://www.youtube.com/watch?v=mQ4wKV9_pZs";
    }

    public String getLink_suma() {
        return link_suma;
    }

    public String getLink_resta() {
        return link_resta;
    }

    public String getLink_multiplicacion() {
        return link_multiplicacion;
    }

    public String getLink_division() {
        return link_division;
    }

    public void setLink_suma(String link_suma) {
        this.link_suma = link_suma;
    }

    public void setLink_resta(String link_resta) {
        this.link_resta = link_resta;
    }

    public void setLink_multiplicacion(String link_multiplicacion) {
        this.link_multiplicacion = link_multiplicacion;
    }

    public void setLink_division(String link_division) {
        this.link_division = link_division;
    }
}
