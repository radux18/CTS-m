package stoica.radu1087.decorator;

public abstract class DecoratorUser extends User {

    User utilizator = null;

    public DecoratorUser(User utilizator){
        this.utilizator = utilizator;
    }

    @Override
    public void navigheaza() {
        this.utilizator.navigheaza();
    }

    @Override
    public void primesteReport() {
        this.utilizator.primesteReport();
    }

    @Override
    public void oferaRecenzie() {
        this.utilizator.oferaRecenzie();
    }

    @Override
    public void trimiteMesaj() {
        this.utilizator.trimiteMesaj();
    }
}
