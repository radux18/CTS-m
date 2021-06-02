package seminar9.Proxy;

public class TestProxy {
    public static void main(String[] args) {

        InterfataModulLogin login = new ModulLogin("10.0.0.1", 127);

        login = new ProxyLogin(login);
        //acum totul trece prin Proxy

        if (login.login("admin", "admin12"))
            System.out.println("Hello admin");

        String[] parole = new String[]{"1234", "admin12", "root", "root", "admin12"};
        //ar trb dupa primele 3 incercari sa primim false
        for (String parola : parole){
            if (login.login("admin", parola))
                System.out.println("Parola gasita: " + parola);
        }

        System.out.println("Log out");


    }
}
