package seminar10.CommandEx;

//Receiver - cel care stie sa gateasca
public class Bucatar {
	
	private String nume;
	
	public Bucatar(String nume){
		this.nume = nume;
	}

	//actiune()
	public void preparaPizza(String tipPizza){
		System.out.println("A fost preparata o pizza de tip "+tipPizza);
	}

	//actiune()
	public void gatesteSupa(String tipSupa){
		System.out.println("A fost facuta o supa de tip "+tipSupa);
	}
}
