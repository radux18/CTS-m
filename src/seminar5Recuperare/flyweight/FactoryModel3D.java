package seminar5Recuperare.flyweight;

import java.util.HashMap;

//FactoryFlyweight
public class FactoryModel3D {
    //colectieFlyweight
    static HashMap<String, InterfataModel3D> modele = new HashMap<>();

    //eager instantiation
    static {
        //generam toate modelele 3D - modelele Flyweight
        String[] listaModele = new String[]{"Soldat", "Copac", "Cladire"};
        for (String model : listaModele) {
            Model3D model3D = new Model3D(model);
            model3D.incarcaModel3D(model + ".3d");
            modele.put(model, model3D);
        }
    }

    //getObiectFlyweight(cheie)
    public static InterfataModel3D getModel3D(String tip) {
        return modele.get(tip);
    }

}
