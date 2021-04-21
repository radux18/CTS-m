package seminar9.Strategy;

public class ProfilPlayer{
    String username;
    double playtime;
    int nrNiveluri;

    InterfataBonus strategieBonus = null;

    public ProfilPlayer(String username, double playtime, int nrNiveluri) {
        this.username = username;
        this.playtime = playtime;
        this.nrNiveluri = nrNiveluri;
    }

    //strategia se va schimba in timp, deci ne trb un setter
    public void setStrategieBonus(InterfataBonus strategie){
        this.strategieBonus = strategie;
    }

    public void getBonus(){
        if (this.strategieBonus != null){
            int puncteBonus = this.strategieBonus.getPuncteBonus(this);
            System.out.println("Ai primit puncte bonus = " + puncteBonus);
        } else {
          throw new UnsupportedOperationException();
        }
    }


}
