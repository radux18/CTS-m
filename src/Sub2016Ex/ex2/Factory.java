package Sub2016Ex.ex2;

public class Factory  {

    public static InterfataContBancar getCont(String tip){

        InterfataContBancar cont = null;
        switch (tip){
            case "Debit":
                cont = new ContBancarDebit(200, "RO12");
                break;
            case "Credit":
                cont = new ContBancarCredit(300, "RO34");
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return cont;
    }
}
