package seminar6.builderEx;

public class TestBuilderEx {
    public static void main(String[] args) {

    DispozitivMobil dMobil =
            new DispozitivMobil.DispozitivMobilBuilder("X", "IPH")
                    .adaugaWiFi()
                    .adaugaCardMemorie(new SDCard(64))
                    .build();

    }
}
