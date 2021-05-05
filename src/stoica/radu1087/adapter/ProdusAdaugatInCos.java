package stoica.radu1087.adapter;

public class ProdusAdaugatInCos extends ProdusDinCos{

    public ProdusAdaugatInCos(String denumire, double pret, int cantitate) {
        super(denumire, pret, cantitate);
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void cresteCantitateStoc(int cantitate) {
         this.cantitate += cantitate;
        System.out.println(String.format("Cantitatea a crescut si acum este: %d", this.cantitate));
    }

    @Override
    public void scadeCantitateStoc(int cantitate) {
        if (this.cantitate > 0){
            this.cantitate -= cantitate;
            System.out.println(String.format("Cantitatea a scazut si acum este: %d", this.cantitate));
        }
    }

    @Override
    public void adaugaInCos() {
        return;
    }
}
