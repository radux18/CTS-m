package seminar11.Observer;

public class TestObserver {
    public static void main(String[] args) {

        ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet();

        ModulAutosalvare modulAutosalvare = new ModulAutosalvare();
        ModulNotificareJucator modulNotificari = new ModulNotificareJucator();

        //trb sa ne abonam la acest eveniment
        modulConexiune.abonareModul(modulNotificari);
        modulConexiune.abonareModul(modulAutosalvare);
        modulConexiune.notificarePierdereConexiune();


        System.out.println("------------------");
        //atunci cand ne dezabonam la autosave module
        modulConexiune.dezabonareModul(modulAutosalvare);
        modulConexiune.notificarePierdereConexiune();


    }
}
