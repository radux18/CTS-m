package seminar8.adapter;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {

        CaracterFantastic dragon = new CaracterFantastic("Dragonul Albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(200);
        dragon.seVindeca(100);

        DonaldDuck donaldDuck = new DonaldDuck();
        donaldDuck.setPower(500);

        donaldDuck.move(100, 100);
        donaldDuck.primesteLovitura(50);
        donaldDuck.reincarca(50);

        //vrem sa adaptam clasa donaldDuck la  ACMECaracterJoc

        ArrayList<ACMECaracterJoc> caractere = new ArrayList<>();
        caractere.add(dragon);


    }
}
