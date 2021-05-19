package seminar5Recuperare.flyweight;

//pentru a gestiona starea temporara
//reprezinta stare temporara
public class ContextEcran {
    //x y si culoare sunt niste stari temporare
    private final int x;
    private final int y;
    private String culoareTextura;

    public ContextEcran(int x, int y, String culoareTextura) {
        this.x = x;
        this.y = y;
        this.culoareTextura = culoareTextura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCuloareTextura() {
        return culoareTextura;
    }
}
