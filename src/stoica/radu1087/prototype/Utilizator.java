package stoica.radu1087.prototype;

public class Utilizator {
    private String nume;
    private String nivel;
    private ControlDeAcces controlDeAcces;

    public Utilizator(String nume, String nivel, ControlDeAcces controlDeAcces) {
        this.nume = nume;
        this.nivel = nivel;
        this.controlDeAcces = controlDeAcces;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public ControlDeAcces getControlDeAcces() {
        return controlDeAcces;
    }

    public void setControlDeAcces(ControlDeAcces controlDeAcces) {
        this.controlDeAcces = controlDeAcces;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "nume='" + nume + '\'' +
                ", nivel='" + nivel + '\'' +
                ", controlDeAcces=" + controlDeAcces +
                '}';
    }
}
