package seminar10.CommandSpital;

public class Medic {

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void interneaza(String tipComanda){
        System.out.println("Medicul " + this.nume + " a primit o comanda de " + tipComanda);
    }

    public void trateaza(String tipComanda){
        System.out.println("Medicul " + this.nume + " a primit o comanda de " + tipComanda);
    }
}
