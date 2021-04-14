package seminar8.adapter;

public class AdaptorDisneyLaACME extends ACMECaracterJoc{
    //extindem clasa de baza la care vrem sa ajungem
    //referinta clasei pe care vrem sa o adaptam
    ActiuniDisney caracterDisney = null;

    public AdaptorDisneyLaACME(ActiuniDisney caracterDisney) {
        super(caracterDisney.getNume(), caracterDisney.getPower());
        this.caracterDisney = caracterDisney;
    }

    @Override
    public void seDeplaseaza() {
        caracterDisney.move(0, 0);
    }

    @Override
    public void esteLovit(int puncte) {
        caracterDisney.primesteLovitura(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        caracterDisney.reincarca(puncte);
    }
}
