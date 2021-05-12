package seminar11.Observer;

public class ModulAutosalvare implements InterfataStatusConexiune {
    @Override
    public void notificarePierdereConexiune() {
        System.out.println("Salvare automata joc");
    }
}
