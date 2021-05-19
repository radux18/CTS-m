package seminar9.ProxyEx.proxy;


public class Imagine implements InterfataImagine{

	private String fisier = null;

	public Imagine(final String Imagine){
		fisier = Imagine;
		incarcaImagine();
	}

	@Override
	public void afisareImagine() {
		System.out.println("Se afiseaza:" + fisier);
	}
	
	public void incarcaImagine(){
		System.out.println(this.fisier + " Imaginea se incarca ...");
	}
}
