package seminar10.CommandEx;

//Command concret pentru Pizza
public class ComandaPizza implements ComandaBucatarie {
	//executantul
	private Bucatar bucatar;
	//starea
	private String tip;

	//executa()
	@Override
	public void gateste() {
		bucatar.preparaPizza(this.tip);
	}
	
	public ComandaPizza(Bucatar bucatar, String tip){
		this.bucatar = bucatar;
		this.tip = tip;
	}

}
