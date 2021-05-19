package seminar6.builder;

public class SuperErou {

    private String nume;
    private int puncteViata;
    private boolean esteNegativ;
    private  boolean esteRanitGrav;


    private  InterfataArma armaDreapta;
    private  InterfataArma armaStanga;
    private  InterfataSuperPutere superPutere;
    private  InterfataSuperPutere superSuperPutere;

     private SuperErou(){
     }

    private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaDreapta, InterfataArma armaStanga, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaDreapta = armaDreapta;
        this.armaStanga = armaStanga;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
    }

    //clasa builder care adauga componente
    public static class SuperErouBuilder {
       SuperErou superErou;

       //constructorul
       public SuperErouBuilder(String nume, int puncteViata){
           this.superErou = new SuperErou();
           this.superErou.nume = nume;
           this.superErou.puncteViata = puncteViata;
       }


       public SuperErouBuilder esteNegativ(){
           this.superErou.esteNegativ = true;
           return this;
       }

       public SuperErouBuilder esteRanit(){
           this.superErou.esteRanitGrav = true;
           return this;
       }

       public SuperErouBuilder setArmaStanga(InterfataArma arma){
           this.superErou.armaStanga = arma;
           return this;
       }

       public SuperErouBuilder setArmaDreapta(InterfataArma arma){
           this.superErou.armaDreapta = arma;
           return this;
       }

       public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere){
           this.superErou.superPutere = superPutere;
           return this;
       }

       //toate metodele fac referinta la builder.
       public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere){
           this.superErou.superSuperPutere = superSuperPutere;
           return this;
       }


       //builderul creaza obiectul dorit
       public SuperErou build(){
           return this.superErou;
       }


    }




}
