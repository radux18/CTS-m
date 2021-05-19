package seminar8.decoratorEx.decorator;

public class DecoratorButonCuSunetSpecial extends DecoratorAbstractControlVizual{

	String fisierSunet;
	
	public DecoratorButonCuSunetSpecial(AbstractControlVizual controlVizual, String fisier) {
		super(controlVizual);
		this.fisierSunet = fisier;
	}

		@Override
	public void click() {
		this.controlVizual.click();
			//sunatul e cv in plus
		System.out.println("Click cu sunet din " + fisierSunet);
	};

}
