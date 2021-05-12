package seminar11.Observer;

import java.util.ArrayList;

//observabil
public class ModulConexiuneInternet {

   ArrayList<InterfataStatusConexiune> module = new ArrayList<>();

   public void abonareModul(InterfataStatusConexiune modul){
       module.add(modul);
   }

   public void dezabonareModul(InterfataStatusConexiune modul){
       module.remove(modul);
   }

   public void notificarePierdereConexiune(){
       for (InterfataStatusConexiune modul : module){
           modul.notificarePierdereConexiune();
       }
   }
}
