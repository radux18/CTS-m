package seminar7.simpleFactoryEx;

public class TestFactory {
    public static void main(String[] args) {
        //creare Factory documente
        DocumentFactory factory = new DocumentFactory();

        //creare document text
        InterfataDocument docTxt = factory.getDocument(TipDocument.TEXT, "factory.txt");

        //creare document html
        InterfataDocument docHTML = factory.getDocument(TipDocument.HTML, "factory.html");

        System.out.println(docTxt);
        System.out.println(docHTML);

    }
}
