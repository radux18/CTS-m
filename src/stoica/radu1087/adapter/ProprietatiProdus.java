package stoica.radu1087.adapter;

public interface ProprietatiProdus {

    public String getDenumire();
    public void setDenumire(String denumire);
    public double getPret();
    public void setPret(double pret);
    public int getCantitate();
    public boolean esteAdaugatInCos();
    public void adaugaInCos();
    public void setCantitate(int cantitate);
    public void scadeCantitate(int cantitate);
    public void cresteCantitate(int cantitate);
}
