package seminar10.ChainEx;

public abstract class Handler {

	protected Handler succesor = null;
	
	public void setSuccessor(Handler succesorr){
		succesor = succesorr;
	}

	public abstract void gestioneazaCerere(Mesaj mesaj);
}
