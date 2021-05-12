package seminar7.simpleFactoryEx;

public class DocumentFactory {

    InterfataDocument document = null;

    public InterfataDocument getDocument(TipDocument tip, String titlu){
        switch (tip){
            case HTML:
                document = new DocumentHtml(titlu);
                break;
            case TEXT:
                document = new DocumentText();
                document.setTitlu(titlu);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return document;
    }
}
