package seminar9.ProxyEx.proxy;

public class ProxyImagine implements InterfataImagine {

	private InterfataImagine imagineReala = null;
	private String fisier = null;

	public ProxyImagine(final String imagine) {
		this.fisier = imagine;
	}

	@Override
	public void afisareImagine() {
		// check if we have enough memory
		if (DoWeHaveMemory()){
			if (imagineReala == null){
				imagineReala = new Imagine(fisier);
				imagineReala.afisareImagine();
			}
		}
	}

	boolean DoWeHaveMemory() {
		System.out.println("Memory check...");
		return true;
	}

}
