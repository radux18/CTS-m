package seminar6.prototypeEx;

import java.util.HashMap;

public class FactoryPrototype {

    private static HashMap<String, Model3D> prototipuri = new HashMap<>();

    //Var 1
    //eager instantiation
    static {
        //incarca prototipuri in map

        System.out.println("Initializare prototipuri modele...");

        NavaSpatiala modelNava = new NavaSpatiala("Nava tip 1");
        modelNava.setId("nava");
        prototipuri.put("nava", modelNava);


        Asteroid modelAsteroid = new Asteroid();
        modelAsteroid.setId("asteroid");
        prototipuri.put("asteroid", modelAsteroid);
    }


    //Var 2
    //metoda factory prototype
    public static Model3D getPrototip(String id) {
        Model3D copiePrototip = null;

        Model3D prototip = prototipuri.get(id);

        if (prototip != null) {
            copiePrototip = (Model3D) prototip.clone();
        }

        return copiePrototip;
    }
}
