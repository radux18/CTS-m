package seminar8.FacadeSpital;

public class TestFacade {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Proasta", "Gica");
        Facade facade1 = new Facade(new Medic(pacient1),pacient1, new Salon(2));
        facade1.interneazaPacient();

        Pacient pacient2 = new Pacient("Buna", "Lica");
        Facade facade2 = new Facade(new Medic(pacient2),pacient2, new Salon(2));
        facade2.interneazaPacient();

    }
}
