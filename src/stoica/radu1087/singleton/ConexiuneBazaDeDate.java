package stoica.radu1087.singleton;


public class ConexiuneBazaDeDate {
    private String email;
    private String parola;
    private String url;

    private static ConexiuneBazaDeDate instantaBD = null;

    private ConexiuneBazaDeDate()  {
    }

    private ConexiuneBazaDeDate(String email, String parola, String url){
        this.email = email;
        this.parola = parola;
        this.url = url;
    }

    public static ConexiuneBazaDeDate getConexiuneBD(){
        if (instantaBD == null){
            synchronized (ConexiuneBazaDeDate.class){
                if (instantaBD == null){
                    instantaBD = new ConexiuneBazaDeDate("radux18", "admin123","https://console.firebase.google.com/");
                    System.out.println("Conexiunea la baza de date s-a realizat cu succes");
                } else {
                    System.out.println("Conexiunea la baza de date a esuat");
                }
            }
        }

        return instantaBD;
    }
}
