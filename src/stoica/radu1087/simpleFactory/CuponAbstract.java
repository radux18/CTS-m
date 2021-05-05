package stoica.radu1087.simpleFactory;

public abstract class CuponAbstract {

    String denumire;
    double suma;

    public CuponAbstract(String denumire, double suma) {
        super();
        this.denumire = denumire;
        this.suma = suma;
    }

    public abstract void setSuma(double suma);

    @Override
    public String toString() {
        return "CuponAbstract{" +
                "denumire='" + denumire + '\'' +
                ", suma=" + suma + "lei" +
                '}';
    }
}
