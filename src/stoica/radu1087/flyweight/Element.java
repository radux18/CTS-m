package stoica.radu1087.flyweight;

import java.util.ArrayList;

public class Element implements InterfataElement {

    String element;
    ArrayList<Integer> marimiElement = new ArrayList<>();

    public Element(String element) {
        this.element = element;
    }

    @Override
    public void incarcaElement() {
        System.out.println(String.format("Incarcare elementul %s din fisierul drawable.v24", element));
        for (int i = 0; i < 2; i++) {
            marimiElement.add(i);
        }
    }

    @Override
    public void afiseazaElement(Context context) {
        System.out.println(String.format("Afisare element cu denumirea %s, cu latimea %s si inaltimea %s, avand forma %s",
                element, context.getWidth(), context.getHeight(), context.getFormaElement()));
    }
}
