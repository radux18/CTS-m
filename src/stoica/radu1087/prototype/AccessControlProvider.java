package stoica.radu1087.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

    private static Map<String, ControlDeAcces> userMap =
            new HashMap<String, ControlDeAcces>();

    static {
        System.out.println("Se incarca datele externe & se creeaza obiectele de access...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        userMap.put("ADMIN", new ControlDeAcces("ADMIN","ADAUGA/SCOATE PRODUSE"));
        userMap.put("MANAGER", new ControlDeAcces("MANAGER","CITESTE/GENEREAZA RAPOARTE"));
    }


    public static ControlDeAcces getControlDeAcces(String nivelControl) throws CloneNotSupportedException {
        ControlDeAcces controlDeAcces = null;

        controlDeAcces = userMap.get(nivelControl);

        if(controlDeAcces != null){
            return (ControlDeAcces) controlDeAcces.clone();
        }
        return null;
    }
}
