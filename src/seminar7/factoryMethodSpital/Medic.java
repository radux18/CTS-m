package seminar7.factoryMethodSpital;

public class Medic extends PersonalSpital {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void ingrijestePacient() {
        System.out.println("Medicul ingrijeste pacientul");
    }

    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
