package seminar5Recuperare.compoziteEx;

import java.util.ArrayList;

public class StructuraOrganizatorica extends NodStructuraIerarhica{
    //compozite -> grup de noduri
    ArrayList<NodStructuraIerarhica> elementeStructura = new ArrayList<>();
    String numeStructura;
    String descriere;

    public StructuraOrganizatorica(String numeStructura, String descriere) {
        this.numeStructura = numeStructura;
        this.descriere = descriere;
    }

    @Override
    public String getNume() {
        return this.numeStructura;
    }

    @Override
    public String getPost() {
       throw new UnsupportedOperationException();
    }

    @Override
    public double getSalariu() {
        float fondSalarii = 0;
        for (NodStructuraIerarhica nod: this.elementeStructura){
            fondSalarii += nod.getSalariu();
        }
        return fondSalarii;
    }

    @Override
    public void adaugaNod(NodStructuraIerarhica elementStructura) {
        elementeStructura.add(elementStructura);
    }

    @Override
    public void stergeNod(NodStructuraIerarhica elementStructura) {
        elementeStructura.remove(elementStructura);
    }

    @Override
    public NodStructuraIerarhica getNod(int i) {
        return elementeStructura.get(i);
    }
}
