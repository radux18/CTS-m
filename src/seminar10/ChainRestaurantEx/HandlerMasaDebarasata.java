package seminar10.ChainRestaurantEx;

public class HandlerMasaDebarasata extends Handler {
    @Override
    public void pregatesteMasa(Masa masa) {
        if (masa.esteLibera() && masa.esteDebarasata()){
            System.out.println("Masa cu nr" + masa.getNumarMasa() + "este debarasata si libera");
        }

        if (this.next != null){
            this.next.pregatesteMasa(masa);
        }
    }
}
