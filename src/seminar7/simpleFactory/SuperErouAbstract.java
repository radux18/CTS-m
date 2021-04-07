package seminar7.simpleFactory;

public abstract class SuperErouAbstract {
    //clasa de baza ca dupa atributele sa se mosteneasca in celelalte clase.

    String nume;
    int puncteViata;

    public SuperErouAbstract(String nume, int puncteViata) {
        super();
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public abstract void seDeplaseaza();

}
