package seminar10.Chain;

public class TestChain {
    public static void main(String[] args) {
        //prima data initializam nodurile/handlere
        //fiecare mesaj trece prin fiecare nod
        HandlerChainAbstract chatGlobal = new ModulChatGlobal();
        HandlerChainAbstract chatPrivat = new ModulChatPrivat();
        HandlerChainAbstract filtruChat = new ModulFiltru("Reguli limba Romna");

        //o luam de la cel mai permisiv la cel mai restrictiv.
        filtruChat.setNext(chatPrivat);
        chatPrivat.setNext(chatGlobal);

        HandlerChainAbstract serverChat = filtruChat;

        serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti rau", 1));
        serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti ok. Multumesc", 1));
        serverChat.procesareMesajChat(new MesajChat("@Gigel", "Hai sa incercam nivelul 5", 1));


    }
}
