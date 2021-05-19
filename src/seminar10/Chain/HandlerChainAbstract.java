package seminar10.Chain;

public abstract class HandlerChainAbstract {
    //ac referinta putem construi chain-ul
    //referinta la urmatorul nod/handler
    HandlerChainAbstract next = null;

    String numeModul;

    public HandlerChainAbstract(String numeModul) {
        super();
        this.numeModul = numeModul;
    }

    public void setNext(HandlerChainAbstract next) {
        this.next = next;
    }

    //trimitem ca parametru mesajul/evenimentul pe care trb sa-l procesam
    public abstract void procesareMesajChat(MesajChat mesaj);

}
