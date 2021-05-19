package seminar8.FacadeSpital;

public class Medic {

    private Pacient pacient;

    public Medic(Pacient pacient) {
        this.pacient = pacient;
    }

    public String deInternat() {
        return this.pacient.stare;
    }
}
