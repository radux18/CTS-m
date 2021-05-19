package seminar5Recuperare.FlyweightFarmacie;

public class TestFlyweight {
    public static void main(String[] args) {

        RetetaContext contextReteta1 = new RetetaContext("11.02.2023");
        RetetaContext contextReteta2 = new RetetaContext("12.02.2023");
        RetetaContext contextReteta3 = new RetetaContext("13.02.2023");

        InterfataReteta reteta1 = FlyweightFactory.getReteta("Febra");
        reteta1.afiseazaReteta(contextReteta1);
        reteta1.afiseazaReteta(contextReteta2);
        reteta1.afiseazaReteta(contextReteta3);
    }
}
