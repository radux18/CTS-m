package stoica.radu1087.decorator;

public class DecoratorBlocat extends DecoratorUser {

    private static final int NR_PLANGERI_MAX = 3;

    public DecoratorBlocat(User utilizator) {
        super(utilizator);
    }

    @Override
    public void navigheaza() {
        this.utilizator.navigheaza();
    }

    @Override
    public void primesteReport() {
        System.out.println(String.format("In urma unui conflict cu alt user, userul cu numele %s primeste un prim avertisment din partea adminilor.", this.utilizator.getNume()));
        this.utilizator.nrRapoartePrimite += 1;
    }

    @Override
    public void oferaRecenzie() {
        if (this.utilizator.getNrRapoartePrimite() >= NR_PLANGERI_MAX)
            System.out.println("Userul nu mai poate folosi acest cont blocat");
        else
       this.utilizator.oferaRecenzie();
    }

    @Override
    public void trimiteMesaj() {
        if (this.utilizator.getNrRapoartePrimite() >= NR_PLANGERI_MAX)
            System.out.println("Userul nu mai poate folosi acest cont blocat");
        else
        this.utilizator.trimiteMesaj();
    }
}
