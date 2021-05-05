package stoica.radu1087.adapter;

public abstract class ProdusDinCos {

    protected String denumire;
    protected double pret;
    protected int cantitate;
    protected boolean adaugatInCos;

    public ProdusDinCos(String denumire, double pret, int cantitate) {
        super();
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.adaugatInCos = true;
    }

    //metode abstracte
    public abstract String getDenumire();
    public abstract double getPret();
    public abstract void cresteCantitateStoc(int cantitate);
    public abstract void scadeCantitateStoc(int cantitate);
    public abstract void adaugaInCos();

    @Override
    public String toString() {
        return "ProdusDinCos{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", adaugatInCos=" + adaugatInCos +
                '}';
    }
}
