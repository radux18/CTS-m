package Sub2016Ex.ex3;

public class ContBancar {

    String denumire;
    String adresa;
    int nrContCurent;

    private static ContBancar instanta = null;

    private ContBancar(){
    }

    private ContBancar(String denumire, String adresa, int nrContCurent) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.nrContCurent += nrContCurent;
    }

    public static ContBancar getInstance(){
        if (instanta == null){
            synchronized (ContBancar.class){
                if (instanta == null){
                    instanta = new ContBancar("ContBancar", "Calea Dudesti 188", 1);
                }
            }
        }
        return instanta;
    }
}
