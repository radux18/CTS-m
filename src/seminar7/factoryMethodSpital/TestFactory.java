package seminar7.factoryMethodSpital;

public class TestFactory {
    public static void main(String[] args) {

        PersonalSpital medic = new FactoryMedic().getPersonal("Ionel");
        System.out.println(medic.toString());

        FactoryAsistent fAsistent = new FactoryAsistent();
        Asistent a1 = (Asistent) fAsistent.getPersonal("Gigel");
        System.out.println(a1);
    }
}
