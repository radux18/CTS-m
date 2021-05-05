package stoica.radu1087.proxy;

public class Developer implements InterfataStaff{

    int nivel;

   public Developer(){
   }

    @Override
    public boolean genereazaRaport(String username, int nivel) {
        if (username.equals("mirceax23") && nivel == 1)
            return true;
         else if (username.equals("radux18") && nivel == 2)
            return false;
         else throw new UnsupportedOperationException();
    }

    @Override
    public void accesActivitate(int nivelAcces) {
        this.nivel = nivelAcces;
    }
}
