package seminar10.Command;

public class ModulAutoSave implements InterfataModulJoc {
    //executant
    @Override
    public void executaActiune(String numeActiune) {
        System.out.println("Se realizeaza auto-save pentru " + numeActiune);
    }
}
