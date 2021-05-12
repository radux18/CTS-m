package seminar5Recuperare.compoziteEx;

public class Angajat extends NodStructuraIerarhica{

    String nume;
    String post;
    double salariu;

    public Angajat(String nume, String post) {
        this.nume = nume;
        this.post = post;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String getPost() {
        return this.post;
    }

    @Override
    public double getSalariu() {
        return this.salariu;
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
