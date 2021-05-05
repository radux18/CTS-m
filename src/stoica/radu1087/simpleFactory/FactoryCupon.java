package stoica.radu1087.simpleFactory;

public class FactoryCupon {

    public static CuponAbstract getCupon(TipCupon tipCupon){
        CuponAbstract cuponAbstract = null;

        switch (tipCupon){
            case BRONZE:
                cuponAbstract = new CuponBronze("Cupon de reducere de tip bronze", 25);
                break;
            case SILVER:
                cuponAbstract = new CuponSilver("Cupon de reducere de tip silver", 50);
                break;
            case GOLD:
                cuponAbstract = new CuponGold("Cupon de reducere de tip gold", 80);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return cuponAbstract;
    }
}
