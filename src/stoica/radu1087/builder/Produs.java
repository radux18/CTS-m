package stoica.radu1087.builder;

public class Produs {

    private String denumire;
    private double pret;
    private int cantitate;
    private int vechime;

    private boolean esteNou;
    private boolean esteUzat;

    private InterfataImagine imagine;

    private Produs() {
    }

    private Produs(String denumire, double pret, int cantitate, int vechime, boolean esteNou, boolean esteUzat, InterfataImagine interfataImagine) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.vechime = vechime;
        this.esteNou = esteNou;
        this.esteUzat = esteUzat;
        this.imagine = interfataImagine;
    }

    public static class ProdusBuilder {
        Produs produs = null;

        public ProdusBuilder(String denumire, double pret, int cantitate) {
            this.produs = new Produs();

           this.produs.denumire = denumire;
           this.produs.pret = pret;
           this.produs.cantitate = cantitate;
        }

        //metode
        public ProdusBuilder esteNou(){
            this.produs.esteNou = true;
            this.produs.vechime = 0;
            return this;
        }

        public ProdusBuilder esteUzat(){
            this.produs.esteUzat = true;
            return this;
        }

        public ProdusBuilder seteazaVechime(int vechime){
            this.produs.vechime = vechime;
            return this;
        }

        public ProdusBuilder seteazaImagine(InterfataImagine imagine){
            this.produs.imagine = imagine;
            return this;
        }

        public Produs build(){
            return this.produs;
        }
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", vechime=" + vechime +
                ", esteNou=" + esteNou +
                ", esteUzat=" + esteUzat +
                ", imagine=" + imagine +
                '}';
    }
}
