package seminar5Recuperare.FlyweightFarmacie;

import seminar5Recuperare.flyweight.Model3D;

import java.util.HashMap;

public class FlyweightFactory {

    static HashMap<String,Reteta> retete = new HashMap<>();

    //eager instantiation
    static {
        String[] listTipuri = new String[]{"Tuse", "Febra", "Migrena"};
        for (String tip : listTipuri) {
            Reteta reteta = new Reteta("Gigel", 3, 10, 350, 10);
            retete.put(tip, reteta);
        }
    }

    public static InterfataReteta getReteta(String tip){
       return retete.get(tip);
    }

}
