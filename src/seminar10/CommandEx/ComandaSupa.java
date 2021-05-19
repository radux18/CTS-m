package seminar10.CommandEx;

//Command concret pentru Pizza
public class ComandaSupa implements ComandaBucatarie{
	//executantul
	private Bucatar bucatar;
	//starea
	private String tip;

	//executa()
	@Override
	public void gateste() {
		this.bucatar.gatesteSupa(this.tip);
	}
	
	public ComandaSupa(Bucatar bucatar, String tip){
		this.bucatar = bucatar;
		this.tip = tip;
	}
	
}
