package stoica.radu1087.flyweight;

import java.util.HashMap;

public class FactoryImagine {
    static HashMap<String, InterfataElement> modeleElement = new HashMap<>();

    static {
        String[] listaModeleProduse = new String[]{"EditText","ListView", "RadioButton"};
        for (String model : listaModeleProduse) {
            Element element = new Element(model);
            element.incarcaElement();
            modeleElement.put(model, element);
        }
    }

    public static InterfataElement getElement(String tip) {
        return modeleElement.get(tip);
    }
}
