package seminar10.Chain;

public class ModulChatGlobal extends HandlerChainAbstract {
    //handler

    public ModulChatGlobal() {
        super("Modul Chat Global");
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if (mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")){
            System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut());
        }

        if (this.next != null){
            this.next.procesareMesajChat(mesaj);
        }

    }
}
