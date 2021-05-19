package seminar7.factoryMethodSpital;

public class FactoryMedic extends PersonalAbstractFactory{
    //FactoryConcretA
    @Override
    protected PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
