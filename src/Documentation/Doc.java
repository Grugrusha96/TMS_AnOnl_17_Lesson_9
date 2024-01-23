package Documentation;

import java.util.Date;

public abstract class Doc {

    private final String documentNumber;
    protected Date documentDate;

    public String getDocumentNumber() {

        return documentNumber;
    }

    protected Doc(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;

    }
}