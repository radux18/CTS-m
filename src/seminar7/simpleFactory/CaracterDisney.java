package seminar7.simpleFactory;

public class CaracterDisney extends SuperErouAbstract {
    //clasa derivata din cea de baza

    boolean cuAcordParental;

    public CaracterDisney(String nume, int puncteViata, boolean acordParental) {
        super(nume, puncteViata);
        this.cuAcordParental = acordParental;
    }

    //metoda mostenita
    @Override
    public void seDeplaseaza() {

    }
}
