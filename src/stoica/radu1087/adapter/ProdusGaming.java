package stoica.radu1087.adapter;

public class ProdusGaming implements ProprietatiProdus {

    String denumire;
    double pret;
    int cantitate;
    boolean adaugatInCos = false;

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public int getCantitate() {
        return this.cantitate;
    }

    @Override
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public void scadeCantitate(int cantitate) {
        this.cantitate -= cantitate;
        System.out.println(String.format("Cantitatea produsului %s a scazut si acum este: %d", denumire, this.cantitate));
    }

    @Override
    public void cresteCantitate(int cantitate) {
        this.cantitate += cantitate;
        System.out.println(String.format("Cantitatea produsului %s a crescut si acum este: %d ", denumire, this.cantitate));
    }

    @Override
    public boolean esteAdaugatInCos() {
        if (this.adaugatInCos){
            System.out.println(String.format("Produsul %s este in cosul de cumparaturi", this.denumire));
        } else {
            System.out.println(String.format("Produsul %s nu este in cosul de cumparaturi", this.denumire));
        }
        return this.adaugatInCos;
    }

    @Override
    public void adaugaInCos() {
        this.adaugatInCos = true;
        System.out.println(String.format("Produsul %s a fost adaugat in cos cu succes!", this.denumire));
    }



    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", adaugatInCos=" + adaugatInCos +
                '}';
    }
}
