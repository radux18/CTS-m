package stoica.radu1087.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyGenerareRaport implements InterfataStaff {

    InterfataStaff interfataStaff = null;


    public ProxyGenerareRaport(InterfataStaff interfataStaff){
        this.interfataStaff = interfataStaff;
    }

    @Override
    public boolean genereazaRaport(String username, int nivel) {
        if (!interfataStaff.genereazaRaport(username, nivel)){
            System.out.println(String.format("Developerul %s de nivel %d are access doar la adaugare/stergere de produse"
                   , username, nivel));
            return true;
        } else if (interfataStaff.genereazaRaport(username, nivel)){
            System.out.println(String.format("Developerul %s de nivel %d are access la generare de rapoarte"
                  , username, nivel));
            return false;
        }

        return false;
    }


    @Override
    public void accesActivitate(int nivelAcces) {
        System.out.println(nivelAcces);
    }

}
