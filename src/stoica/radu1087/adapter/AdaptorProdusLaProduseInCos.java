package stoica.radu1087.adapter;

public class AdaptorProdusLaProduseInCos extends ProdusDinCos{

    ProprietatiProdus produsGaming = null;

    public AdaptorProdusLaProduseInCos(ProprietatiProdus produsGaming) {
        super(produsGaming.getDenumire(), produsGaming.getPret(), produsGaming.getCantitate());
        this.produsGaming = produsGaming;
    }

    @Override
    public String getDenumire() {
        return produsGaming.getDenumire();
    }

    @Override
    public double getPret() {
        return produsGaming.getPret();
    }

    @Override
    public void cresteCantitateStoc(int cantitate) {
         this.produsGaming.cresteCantitate(cantitate);
    }

    @Override
    public void scadeCantitateStoc(int cantitate) {
         this.produsGaming.scadeCantitate(cantitate);
    }

    @Override
    public void adaugaInCos() {
        this.produsGaming.adaugaInCos();
    }

}
