package seminar5Recuperare.compoziteRestaurant;

public abstract class NodStructuraIerarhica {

    //metode Specifice
    public abstract String getNume();
    public abstract int getPret();

    //metode specifice colectiei de noduri copii
    public abstract void adaugaNod(NodStructuraIerarhica elementStructura);
    public abstract void stergeNod(NodStructuraIerarhica elementStructura);
    public abstract NodStructuraIerarhica getNod(int i);
}
