package seminar5Recuperare.compoziteRestaurant;

public class Bautura extends NodStructuraIerarhica {
//NodFrunza
    String denumire;
    int pret;

    public Bautura(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public void adaugaNod(NodStructuraIerarhica elementStructura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodStructuraIerarhica elementStructura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NodStructuraIerarhica getNod(int i) {
        throw new UnsupportedOperationException();
    }
}
