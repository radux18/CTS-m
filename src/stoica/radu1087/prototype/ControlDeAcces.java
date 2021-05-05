package stoica.radu1087.prototype;

public class ControlDeAcces implements Cloneable {

    private String access;
    private  String nivelControl;

    public ControlDeAcces(String access, String nivelControl){
        this.nivelControl = nivelControl;
        this.access = access;
    }

    private ControlDeAcces(){
    }

    public Object clone() throws CloneNotSupportedException{
        ControlDeAcces copie = new ControlDeAcces();

        copie.access = this.access;
        copie.nivelControl = this.nivelControl;

        return copie;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setNivelControl(String nivelControl) {
        this.nivelControl = nivelControl;
    }

    @Override
    public String toString() {
        return "ControlDeAcces{" +
                "access='" + access + '\'' +
                ", nivelControl='" + nivelControl + '\'' +
                '}';
    }
}
