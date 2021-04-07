package seminar7.simpleFactory;

public class CaracterDCComics extends SuperErouAbstract {
    //clasa derivata
    //mosteneste atributele si metodele din clasa de baza


    public CaracterDCComics(String nume, int puncteViata, int valoare) {
        super(nume, puncteViata);
    }

    @Override
    public void seDeplaseaza() {
    }
}
