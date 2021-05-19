package seminar10.CommandSpital;

import java.util.ArrayList;

//Invoker
public class Operator {
    public ArrayList<ComandaSpital> comenzi;

    public Operator() {
        comenzi = new ArrayList<>();
    }

    public void preiaComanda(ComandaSpital comanda){
        this.comenzi.add(comanda);
    }

    public void trimiteComenzi(){
        for (ComandaSpital comanda : comenzi){
            comanda.executa();
        }
        this.comenzi.clear();
    }
}
