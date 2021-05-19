package seminar8.FacadeSpital;

public class Facade {

    Medic medic;
    Pacient pacient;
    Salon salon;

    public Facade(Medic medic, Pacient pacient, Salon salon) {
        this.medic = medic;
        this.pacient = pacient;
        this.salon = salon;
    }


    public void interneazaPacient(){
        if (this.pacient.getStare().equals("Proasta") && this.medic.deInternat().equals("Proasta") && this.salon.paturiLibere() >0){
            System.out.println("Pacientul a fost internat");
        } else {
            System.out.println("Pacientul nu a fost internat");
        }


    }
}
