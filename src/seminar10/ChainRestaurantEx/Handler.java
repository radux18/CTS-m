package seminar10.ChainRestaurantEx;

public abstract class Handler {
    Handler next = null;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void pregatesteMasa(Masa masa);

}
