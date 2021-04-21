package seminar9.Strategy;

public class StrategiePaste implements InterfataBonus {
    @Override
    public int getPuncteBonus(ProfilPlayer player) {
        //daca a jucat mai mult de 50 ore
        if (player.playtime > 50)
            return 50;
        else
            return 0;
    }
}
