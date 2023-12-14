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
    
    private PantallaDosDigitos pantallaAno;
    
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    /**
     * Constructor for objects of class PantallaHoraYFecha
     */
    public PantallaHoraYFecha()
    {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAno = new PantallaDosDigitos(1,99);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }

    public String getFechaYHora()
    {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla()+" "+pantallaDia.getTextoDeLaPantalla()+"-"+pantallaMes.getTextoDeLaPantalla()+"-"+pantallaAno.getTextoDeLaPantalla();
    }
    
    public void avanzarMinuto (){
        if (pantallaMinutos.getValorAlmacenado() <= 60) {
            pantallaMinutos.incrementaValorAlmacenado();
            if (pantallaMinutos.getValorAlmacenado() == 0) {
                pantallaHoras.incrementaValorAlmacenado();
                if (pantallaHoras.getValorAlmacenado() == 0) {
                    pantallaDia.incrementaValorAlmacenado();
                    if (pantallaDia.getValorAlmacenado() == 1) {
                        pantallaMes.incrementaValorAlmacenado();
                        if (pantallaMes.getValorAlmacenado() == 1) {
                           pantallaAno.incrementaValorAlmacenado(); 
                        }
                    }        
                }
            }
        }
    }
    
    public void fijarFechaYHora (int horas, int minutos, int dia, int mes, int ano){
        pantallaMinutos.setValorAlmacenado(minutos);
        pantallaHoras.setValorAlmacenado(horas);
        pantallaDia.setValorAlmacenado(dia);
        pantallaMes.setValorAlmacenado(mes);
        pantallaAno.setValorAlmacenado(ano);
    }
}