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

/*Esta es la clase de archivos, aqui están los ll¡inks para tutoriales*/
public class Archivos {
    private String link_suma;
    private String link_resta;
    private String link_multiplicacion;
    private String link_division;

    /*Este es el constructor*/
    public Archivos() {
        link_suma = "https://www.youtube.com/watch?v=oF-rZLIShC8";
        link_resta = "https://www.youtube.com/watch?v=Lqf5WmulMYI";
        link_multiplicacion = "https://www.youtube.com/watch?v=YFtEaVw5k1A";
        link_division = "https://www.youtube.com/watch?v=mQ4wKV9_pZs";
    }

    /*
    * es el get suma
    * @return link_suma
    */
    public String getLink_suma() {
        return link_suma;
    }

    /*
    * es el get del link para respueta
    * @return link_resta
    */
    public String getLink_resta() {
        return link_resta;
    }

    /*
    * es el get para el link de multiplicacion
    * @return link_multiplicacion
    */
    public String getLink_multiplicacion() {
        return link_multiplicacion;
    }

    /*
    *es el get para el link de la division
    * @return link_division
    */
    public String getLink_division() {
        return link_division;
    }

    /*
    * es el set para el link de suma
    * @param link_suma
    */
    public void setLink_suma(String link_suma) {
        this.link_suma = link_suma;
    }

    /*
    * es el set para el link de la resta
    *@param link_resta
    */
    public void setLink_resta(String link_resta) {
        this.link_resta = link_resta;
    }

    /*
    * es el set para el link de la multipicacion
    *@param link_multiplicacion
    */
    public void setLink_multiplicacion(String link_multiplicacion) {
        this.link_multiplicacion = link_multiplicacion;
    }

    /*
    *es el set para el link de la division
    *@param link_divison
    */
    public void setLink_division(String link_division) {
        this.link_division = link_division;
    }
}
