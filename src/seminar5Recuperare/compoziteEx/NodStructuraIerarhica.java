package seminar5Recuperare.compoziteEx;

public abstract class NodStructuraIerarhica {
    //comp abstracta

    //metodele specifice nodului
    public abstract String getNume();
    public abstract String getPost();
    public abstract double getSalariu();

    public String getInfo(){
        return this.getNume() + " " + this.getPost();
    }

    //metode specifice colectiei de noduri copii
    public abstract void adaugaNod(NodStructuraIerarhica elementStructura);
    public abstract void stergeNod(NodStructuraIerarhica elementStructura);
    public abstract NodStructuraIerarhica getNod(int i);
}
