package seminar7.factoryMethodSpital;

public class FactoryAsistent extends PersonalAbstractFactory {
    //FactoryConcretC
    @Override
    protected PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
