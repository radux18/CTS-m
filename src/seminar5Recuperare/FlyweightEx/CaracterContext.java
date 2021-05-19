package seminar5Recuperare.FlyweightEx;

//Client context
//clasa care incapsuleaza starea temporara
public class CaracterContext {
	private final int pozitieText;
	
	public CaracterContext(int pozitie){
		this.pozitieText = pozitie;
	}
	
	public int getPozitie(){
		return this.pozitieText;
	}

}
