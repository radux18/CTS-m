package seminar5Recuperare.FlyweightFarmacie;

//Flyweight concret
public class Reteta implements InterfataReteta {
    //stare permanenta
    private  String numeClient;
    private  int nrAsigurare;
    private  int nrReteta;
    private  double sumaReteta;
    private  int nrMedicamente;

    public Reteta(String numeClient, int nrAsigurare, int nrReteta, double sumaReteta, int nrMedicamente) {
        this.numeClient = numeClient;
        this.nrAsigurare = nrAsigurare;
        this.nrReteta = nrReteta;
        this.sumaReteta = sumaReteta;
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public void afiseazaReteta(RetetaContext retetaContext) {
        System.out.println("Clientul " + this.numeClient + ", nr Asigurare " + this.nrAsigurare + " , nrReteta: " + this.nrReteta +
                " , data reteta: " + retetaContext.getData()  + " sumaReteta: " + this.sumaReteta
                + "nrMedicamente: " + this.nrMedicamente);
    }
}
