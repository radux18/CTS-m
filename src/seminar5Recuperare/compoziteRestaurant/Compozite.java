package seminar5Recuperare.compoziteRestaurant;

import java.util.ArrayList;

public class Compozite extends NodStructuraIerarhica{

    ArrayList<NodStructuraIerarhica> bauturi = new ArrayList<>();
    String nume;

    public Compozite(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adaugaNod(NodStructuraIerarhica elementStructura) {
        bauturi.add(elementStructura);
    }

    @Override
    public void stergeNod(NodStructuraIerarhica elementStructura) {
        bauturi.remove(elementStructura);
    }

    @Override
    public NodStructuraIerarhica getNod(int i) {
        return bauturi.get(i);
    }
}
