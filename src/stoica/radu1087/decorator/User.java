package stoica.radu1087.decorator;

public abstract class User {
      protected String nume;
      protected String email;
      protected String parola;
      protected int nrRapoartePrimite;

    public User() {
    }

    public User(String nume, String email, String parola) {
        super();
        this.nume = nume;
        this.email = email;
        this.parola = parola;
        this.nrRapoartePrimite = 0;
    }

    public int getNrRapoartePrimite() {
        return nrRapoartePrimite;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    public void setNrRapoartePrimite(int nrRapoartePrimite) {
        this.nrRapoartePrimite = nrRapoartePrimite;
    }

    public abstract void navigheaza();
    public abstract void oferaRecenzie();
    public abstract void trimiteMesaj();
    public abstract void primesteReport();

}
