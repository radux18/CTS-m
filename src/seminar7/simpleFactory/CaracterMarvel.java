package seminar7.simpleFactory;

public class CaracterMarvel extends SuperErouAbstract{
    //clasa derivata din superErou

    int putere;

    public CaracterMarvel(String nume, int puncteViata, int putere) {
        super(nume, puncteViata);
        this.putere = putere;
    }

    //metoda mostenita
    @Override
    public void seDeplaseaza() {

    }


}
