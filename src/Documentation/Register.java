package Documentation;

public final class Register {
    private int countDocument = 0;
    private final Doc[] allDocs = new Doc[10];

    public Register() {

    }

    public void addDoc(Doc doc) {
        allDocs[countDocument] = doc;
        countDocument++;
    }

    public void printInfoDocument(String documentNumber) {
        if (documentNumber.contains("abc")) {
            throw new ContainsException(ContainsException.CONSTAINS_WRONG);
        }else if (documentNumber.startsWith("555")) {
            throw new StartException(StartException.START_WRONG);
        }else if (documentNumber.endsWith("1a2b")){
            throw new EndException(EndException.END_WRONG);
        }

        for (Doc doc : allDocs) {
            if (doc != null){
                String doc1 = doc.getDocumentNumber();

                if (doc1.equals(documentNumber))
                    System.out.println(doc);
                break;
            }
        }
    }
}