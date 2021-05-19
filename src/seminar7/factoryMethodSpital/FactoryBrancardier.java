package seminar7.factoryMethodSpital;

public class FactoryBrancardier extends PersonalAbstractFactory {
    //FactoryConcretB
    @Override
    protected PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
