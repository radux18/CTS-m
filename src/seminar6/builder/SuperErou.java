package seminar6.builder;

public class SuperErou {
     String nume;
     int puncteViata;
     boolean esteNegativ;
     boolean esteRanitGrav;

     InterfataArma armaDreapta;
     InterfataArma armaStanga;
     InterfataSuperPutere superPutere;
     InterfataSuperPutere superSuperPutere;

     public SuperErou(){

     }

    public SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaDreapta, InterfataArma armaStanga, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaDreapta = armaDreapta;
        this.armaStanga = armaStanga;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
    }





}
