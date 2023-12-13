/**
 * Write a description of class PantallaHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaHoraYFecha
{
    private PantallaDosDigitos pantallaDia;

    private PantallaDosDigitos pantallaMes;

    private PantallaDosDigitos pantallaA�o;

    private PantallaDosDigitos pantallaHoras;
    
    private PantallaDosDigitos pantallaMinutos;
    /**
     * Constructor for objects of class PantallaHoraYFecha
     */
    public PantallaHoraYFecha()
    {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaA�o = new PantallaDosDigitos(1,999999);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFechaYHora()
    {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla()+" "+pantallaDia.getTextoDeLaPantalla()+"-"+pantallaMes.getTextoDeLaPantalla()+"-"+pantallaA�o.getTextoDeLaPantalla();
    }
}