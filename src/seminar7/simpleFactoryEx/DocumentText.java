package seminar7.simpleFactoryEx;

public class DocumentText extends InterfataDocument{

	@Override
	public String getTip() {
		return "Text";
	}

	@Override
	public void print(String text) {
		System.out.println("Text:"+text);
	}

}
