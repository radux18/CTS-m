package seminar8.facade;

public class APIJocFacade {
    //static pentru ca nu facem modificari aici.

    public ProfilJucator getProfil(String ipServer, int port, String numeUtilizator, String parola){
        ServerJoc server = new ServerJoc(ipServer, port);

        if (server.conectare()){
            Utilizator utilizator = new Utilizator();
            utilizator.login(numeUtilizator, parola);
            ProfilJucator profil = utilizator.getProfil();
            return profil;
        } else
            return null;
    }
}
