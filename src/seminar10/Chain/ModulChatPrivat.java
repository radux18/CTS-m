package seminar10.Chain;

public class ModulChatPrivat extends HandlerChainAbstract{
    //handler

    public static final String NUME_MODUL = "Modul Chat Privat";

    public ModulChatPrivat() {
        super(NUME_MODUL);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        //Verficam destinatia
        if (mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")){
            //atunci e mesaj de broadcast
            if (this.next != null)
                this.next.procesareMesajChat(mesaj);
        } else {
            //procesare mesaj privat
            System.out.println(String.format( "Mesaj privat pentru %s = %s", mesaj.getDestinatie(), mesaj.getContinut()));
        }


    }
}
