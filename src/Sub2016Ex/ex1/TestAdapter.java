package Sub2016Ex.ex1;

public class TestAdapter {
    public static void main(String[] args) {

        ContBancarDebit cont = new ContBancarDebit(100, "RO12");

        AdapterCont2Account adapter = new AdapterCont2Account(cont);

        adapter.accountTransfer(new DebitAccount(), 50);

        System.out.println("Valore in cont: " + cont.balanta);
    }
}
