package Sub2016Ex.ex2;

public class TestFactory {
    public static void main(String[] args) {

       // Factory factory = new Factory();
        InterfataContBancar contCredit = Factory.getCont("Credit");
        InterfataContBancar contDebit = Factory.getCont("Debit");

        contCredit.depune(200);

        contDebit.transfer(contCredit, 300);

        System.out.println(contCredit.toString());
        System.out.println(contDebit.toString());


    }
}
