package seminar8.decoratorEx.decorator;

public class DecoratorButonCuAnimatie extends DecoratorAbstractControlVizual {

	public DecoratorButonCuAnimatie(AbstractControlVizual controlVizual) {
		super(controlVizual);
	}

	
	@Override
	public void click() {
		//metoda asta este cea mostenita de la butonul normal
		this.controlVizual.click();
		//animatia e cv in plus
		System.out.println("Animatie text buton");
	};
}
