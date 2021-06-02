package seminar9.Proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin {
    //atribut care retine referinta la interfata
    InterfataModulLogin modulLogin = null;

    public static final int NR_MAX_INCERCARI = 3;
    public Map<String, Integer> nrIncercari = new HashMap<>();

    public ProxyLogin(InterfataModulLogin modulLogin) {
        this.modulLogin = modulLogin;
    }

    @Override
    public boolean login(String username, String password) {
        //sa verif daca cnv incearca sa ghiceasca parola
        //verficam a cata incercare este
        //trb sa prevenim mai multe incercari prin blocare cont
        Integer nrIncercariNereusite = nrIncercari.get(username);
        if (nrIncercariNereusite == null) {   //e prima data cand incearca sa se logheze
            nrIncercari.put(username, 0);
            nrIncercariNereusite = 0;
        }

        if (modulLogin != null){
            if (nrIncercariNereusite < NR_MAX_INCERCARI){
                if (modulLogin.login(username,password) == true){
                    //daca ai reusit de logat, resetezi nrdeincercari
                    nrIncercariNereusite = 0;
                    return true;
                } else {
                    nrIncercariNereusite += 1;
                    nrIncercari.put(username, nrIncercariNereusite);

                    return false;
                }
            } else {
                //ai depasit nr maxim de incercari
                return false;
            }
        } else
            throw new UnsupportedOperationException();
    }

    @Override
    public boolean verificaStatusServer() {
        if (modulLogin != null)
            return modulLogin.verificaStatusServer();
        else
            throw new UnsupportedOperationException();
    }
}
