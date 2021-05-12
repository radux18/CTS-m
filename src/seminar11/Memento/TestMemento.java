package seminar11.Memento;

public class TestMemento {
    public static void main(String[] args) {

        CaracterJoc superman = new CaracterJoc("Superman", 100, "Zboara");

        MementoCaracterJoc salvareInceputJoc = superman.salvare();

        superman.ataca();
        superman.seVindeca(100);
        System.out.println("Puncte viata: " + superman.puncteViata);

        //am restaurat caracterul cand avea 100
        superman.incarcaSalvare(salvareInceputJoc);
        System.out.println("Puncte viata: " + superman.puncteViata);
    }
}
