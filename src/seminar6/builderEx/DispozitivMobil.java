package seminar6.builderEx;

//AbstractBuilder
public class DispozitivMobil {

    //atribute
    String model;
    String producator;

    boolean areWiFi;

    //interfete pentru diferite module
    InterfataGPS modulGPS;
    InterfataDisplay display;
    InterfataExternalMemory cardMemorie;

    //constructor default privat
    private DispozitivMobil() {
    }

    //interfata publica pentru atribute

    public boolean hasWiFi() {
        return areWiFi;
    }

    public InterfataGPS getModulGPS() {
        return modulGPS;
    }

    public InterfataExternalMemory getCardMemorie() {
        return cardMemorie;
    }

    public String getModel() {
        return model;
    }

    public String getProducator() {
        return producator;
    }

    public InterfataDisplay getDisplay() {
        return display;
    }


    //builder pentru clasa
    public static class DispozitivMobilBuilder {

        private DispozitivMobil dispozitiv;

        public DispozitivMobilBuilder(String model, String producator) {
            this.dispozitiv = new DispozitivMobil();
            this.dispozitiv.model = model;
            this.dispozitiv.producator = producator;
        }

        //metoda pentru adaugare WiFi
        public DispozitivMobilBuilder adaugaWiFi() {
            this.dispozitiv.areWiFi = true;
            return this;
        }

        //metoda pentru adaugare display
        public DispozitivMobilBuilder adaugaDisplay(InterfataDisplay display) {
            this.dispozitiv.display = display;
            return this;
        }

        //metoda pentru adaugare memorie
        public DispozitivMobilBuilder adaugaCardMemorie(InterfataExternalMemory memorie) {
            this.dispozitiv.cardMemorie = memorie;
            return this;
        }

        //metoda pentru adaugare GPS
        public DispozitivMobilBuilder adaugaModulGPS(InterfataGPS gps) {
            this.dispozitiv.modulGPS = gps;
            return this;
        }

        //metoda prin care se obtine obiectul creat
        //getProdus()
        public DispozitivMobil build() {
            return this.dispozitiv;
        }
    }
}
