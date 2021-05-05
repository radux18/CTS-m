package seminar8.decorator;

import seminar8.adapter.ACMECaracterJoc;
import seminar8.adapter.CaracterFantastic;

public class TestDecorator {
    public static void main(String[] args) {

        ACMECaracterJoc dragon = new CaracterFantastic("Dragonul Albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(200);
        dragon.seVindeca(100);

        dragon = new DecoratorScut(dragon, 200);
        dragon.esteLovit(300);

        dragon = new DecoratorRanit(dragon);
        dragon.esteLovit(950);
        dragon.seDeplaseaza();

    }
}
