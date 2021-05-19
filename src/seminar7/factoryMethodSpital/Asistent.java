package seminar7.factoryMethodSpital;

public class Asistent extends PersonalSpital {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void ingrijestePacient() {
        System.out.println("Asistentul ingrijeste pacientul");
    }

    @Override
    public String toString() {
        return "Asistent{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
