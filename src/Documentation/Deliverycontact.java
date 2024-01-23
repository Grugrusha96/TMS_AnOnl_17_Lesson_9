package Documentation;

import java.util.Date;

public final class Deliverycontact extends Doc {
    private final int productQuantities;
    private final  String typeProduct;

    public Deliverycontact (String documentNumber, Date documentDate, int quantityProduct, String typeProduct){
        super(documentNumber, documentDate);
        this.productQuantities = quantityProduct;
        this.typeProduct = typeProduct;
    }
    public Deliverycontact(){
        this("5654", new Date(), 0, "Error");
    }

    @Override
    public String toString() {
        return
                "\nDeliverycontact\n +" +
                        "quantityProduct = " + productQuantities +
                        ",\ntypeProduct = '" + typeProduct + '\'' +
                        ",\ndocumentNumber = " + getDocumentNumber() +
                        ",\ndocumentDate = " + documentDate;


    }
}
