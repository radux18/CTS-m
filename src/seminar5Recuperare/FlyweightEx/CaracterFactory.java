package seminar5Recuperare.FlyweightEx;

import java.util.HashMap;
import java.util.Map;


//Flyweight factory
public class CaracterFactory {
	//colectia de modele flyweight
	private Map<String, Caracter> caractere = new HashMap<>();
	
	public Caracter getCaracter(String valoareCaracter){
		Caracter caracter = caractere.get(valoareCaracter);
		if (caracter == null){
			caracter = new Caracter(valoareCaracter);
			caractere.put(valoareCaracter, caracter);
		}
		return caracter;		
	}


	public int getNrCaractere(){
		return caractere.size();
	}
}
