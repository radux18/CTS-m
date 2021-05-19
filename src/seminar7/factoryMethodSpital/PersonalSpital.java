package seminar7.factoryMethodSpital;

public abstract class PersonalSpital {
//interfata
    String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void ingrijestePacient();

}
