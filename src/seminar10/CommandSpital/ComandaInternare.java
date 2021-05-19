package seminar10.CommandSpital;

public class ComandaInternare implements ComandaSpital {

    private Medic medic;
    private String tipComanda;

    @Override
    public void executa() {
        this.medic.interneaza(this.tipComanda);
    }

    public ComandaInternare(Medic medic, String tipComanda) {
        this.medic = medic;
        this.tipComanda = tipComanda;
    }
}
