package seminar10.ChainRestaurantEx;

public class TestChain {
    public static void main(String[] args) {

        Handler handler1 = new HandlerMasaCuServetele();
        Handler handler2 = new HandlerMasaDebarasata();
        Handler handler3 = new HandlerMasaLibera();

        handler3.setNext(handler2);
        handler2.setNext(handler1);

        Handler ospatar = handler3;

        ospatar.pregatesteMasa(new Masa(2, true, true, false));
        ospatar.pregatesteMasa(new Masa(3, false, false, false));
        ospatar.pregatesteMasa(new Masa(5, true, false, false));

        ospatar.pregatesteMasa(new Masa(5, true, true, true));



    }
}
