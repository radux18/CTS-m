package seminar8.adapter;

public class DonaldDuck implements ActiuniDisney {

    public static final String denumire = "Donald Duck";
    int power;

    public static String getDenumire() {
        return denumire;
    }

    @Override
    public String getNume() {
        return denumire;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Repozitionare caracter la noile coordonate");
    }

    @Override
    public void primesteLovitura(int power) {
        this.power -= power;
        System.out.println("Nivel putere scade la " + this.power);
    }

    @Override
    public void reincarca(int power) {
        this.power += power;
        System.out.println("Nivel putere reincarcate la " + this.power);
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }
}
