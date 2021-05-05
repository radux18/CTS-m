package stoica.radu1087.decorator;

public class Cumparator extends User {

    public Cumparator(String nume,String email, String parola){
        super(nume, email, parola);
    }

    @Override
    public void navigheaza() {
        System.out.println("Utilizatorul navigheaza prin aplicatie");
    }

    @Override
    public void oferaRecenzie() {
        System.out.println("Utilizatorul a trimis o recenzie");
    }

    @Override
    public void trimiteMesaj() {
        System.out.println("Utilizatorul a trimis un mesaj");
    }

    @Override
    public void primesteReport() {
        System.out.println("Utilizatorul a primit un avertisment");
    }

}
