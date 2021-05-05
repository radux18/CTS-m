package seminar10.Chain;

public class ModulFiltru extends HandlerChainAbstract{
    //handler

    public ModulFiltru(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        String[] dictionar = new String[] {"rau", "obraznic", "violent"};
        boolean esteValid = true;

        for (String cuvant : dictionar){
            if (mesaj.getContinut().contains(cuvant)){
                esteValid = false;
                break;
            }
        }

        //sa existe si un next
        if (esteValid && this.next != null){
            //dupa ce verifica daca e valid si ca mai exista si alt modul in chain, il trimitem mai departe
            this.next.procesareMesajChat(mesaj);
        }
    }


}
