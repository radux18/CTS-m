package seminar10.ChainRestaurantEx;

public class HandlerMasaLibera extends Handler {

    @Override
    public void pregatesteMasa(Masa masa) {
        if (masa.esteLibera()){
            System.out.println("Masa " + masa.getNumarMasa() + " este libera");
        }

        if (this.next != null){
            this.next.pregatesteMasa(masa);
        }
    }

}
