package seminar5Recuperare.FlyweightEx;

//Concrete Flyweight
public class Caracter implements CaracterPrintabil{
	//atribute specifice starii permanente
	private final String caracter;
	private int fontSize;

	public Caracter(String valoare){
		this.caracter = valoare;
	}
	
	public String getCaracter(){
		return this.caracter;
	}


	@Override
	public void printeazaCaracter(CaracterContext context) {
		System.out.println(this.caracter+ " este pe pozitia "+context.getPozitie());
		
	}
}
