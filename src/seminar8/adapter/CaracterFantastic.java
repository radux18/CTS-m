package seminar8.adapter;

public class CaracterFantastic extends ACMECaracterJoc {
    //clasa derivata care mosteneste aceste metode

    public CaracterFantastic(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void seDeplaseaza() {
        System.out.println(String.format("%s se deplaseaza pe ecran", nume));
    }

    @Override
    public void esteLovit(int puncte) {
        System.out.println(String.format("%s este lovit si pierde %d puncte", nume, puncte));
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(String.format("%s se vindeca si recupereaza %d puncte", nume, puncte));
    }
}