package seminar10.ChainRestaurantEx;

public class HandlerMasaCuServetele extends Handler {

    @Override
    public void pregatesteMasa(Masa masa) {
        if (masa.esteDebarasata() && masa.esteLibera() && masa.areServetele()){
            System.out.println("Masa cu nr : " + masa.getNumarMasa() + " poate fi pregatita pentru clienti!");
        } else {
            System.out.println("Masa cu nr : " + masa.getNumarMasa() + "nu este pregatita!");
        }

        if (this.next != null){
            this.next.pregatesteMasa(masa);
        }
    }
}
