package seminar7.factoryMethodSpital;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void ingrijestePacient() {
        System.out.println("Brancardierul ingrijeste pacientul");
    }

    @Override
    public String toString() {
        return "Brancardier{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
