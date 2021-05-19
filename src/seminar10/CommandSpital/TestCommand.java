package seminar10.CommandSpital;

public class TestCommand  {
    public static void main(String[] args) {

        //Receiver
        Medic medic1 = new Medic("Gigel");
        Medic medic2 = new Medic("Ionel");

        Operator operator = new Operator();

        operator.preiaComanda(new ComandaTratare("Tratare", medic1));
        operator.preiaComanda(new ComandaInternare(medic2, "Internare"));

        operator.trimiteComenzi();
    }
}
