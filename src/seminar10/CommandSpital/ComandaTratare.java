package seminar10.CommandSpital;

public class ComandaTratare implements ComandaSpital {

    private String tipComanda;

    private Medic medic;

    @Override
    public void executa() {
        this.medic.trateaza(this.tipComanda);
    }

    public ComandaTratare(String tipComanda, Medic medic) {
        this.tipComanda = tipComanda;
        this.medic = medic;
    }
}
