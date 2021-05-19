package seminar10.ChainRestaurantEx;

public class Masa {

    private int numarMasa;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServetele;

    public Masa(int numarMasa, boolean esteLibera, boolean esteDebarasata, boolean areServetele) {
        this.numarMasa = numarMasa;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServetele = areServetele;
    }

    public void devineLibera(){
        this.esteLibera = true;
    }

    public void seDebaraseaza(){
        this.esteDebarasata =true;
    }

    public void puneServetele(){
        this.areServetele = true;
    }

    public boolean esteLibera() {
        return esteLibera;
    }

    public boolean esteDebarasata() {
        return esteDebarasata;
    }

    public boolean areServetele() {
        return areServetele;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "numarMasa=" + numarMasa +
                ", esteLibera=" + esteLibera +
                ", esteDebarasata=" + esteDebarasata +
                ", areServetele=" + areServetele +
                '}';
    }
}
