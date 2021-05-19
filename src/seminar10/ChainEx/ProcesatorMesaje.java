package seminar10.ChainEx;

public class ProcesatorMesaje extends Handler{

	@Override
	public void gestioneazaCerere(Mesaj mesaj) {
		if (mesaj.getPrioritate() <= 50){
			System.out.println("\n Mesaj: "+mesaj.getText());
		}
	}
}
