package seminar8.adapter;

public abstract class ACMECaracterJoc {
    //clasa de baza
    protected String nume;
    protected int puncteViata;

    public ACMECaracterJoc(String nume, int puncteViata) {
        super();
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    //abstracte pentru ca urmeaza sa le utilizam in clasele derivate
    public abstract void seDeplaseaza();
    public abstract void esteLovit(int puncte);
    public abstract void seVindeca(int puncte);
}
