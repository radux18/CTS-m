package seminar10.Command;

public class ModulUpdateClient implements InterfataModulJoc {
    //executant
    @Override
    public void executaActiune(String numeActiune) {
        System.out.println("Update client joc. Detalii: " + numeActiune);
    }
}
