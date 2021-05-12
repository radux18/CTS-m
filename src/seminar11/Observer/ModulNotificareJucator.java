package seminar11.Observer;

public class ModulNotificareJucator implements InterfataStatusConexiune{

    @Override
    public void notificarePierdereConexiune() {
        System.out.println("Pop UP! Conexiune Internet pierduta !");
    }
}
