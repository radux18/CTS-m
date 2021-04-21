package seminar9.State;

public class SuperErou {

    public static final int NIVEL_CRITIC = 10;

    String nume;
    int puncteViata;

    InterfataMiscare modMiscare = null;

    public SuperErou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.modMiscare = new MiscareNormala();
    }

    void seDeplaseaza(){
     this.modMiscare.seDeplaseaza();
    }

    void esteAtacat(int puncte){
        this.puncteViata -= puncte;
        //o sa si modifice singur modul de deplasare dupa ce este atacat/ in stare critica
        if (this.puncteViata < NIVEL_CRITIC)
            this.modMiscare = new MiscareModRanit();
    }

    void seVindeca(int puncte){
        this.puncteViata += puncte;
        //o sa si modifice singur modul de deplasare dupa ce este este vindecat /in stare normala
        if (this.puncteViata >= NIVEL_CRITIC){
            this.modMiscare = new MiscareNormala();
        }
    }


}
