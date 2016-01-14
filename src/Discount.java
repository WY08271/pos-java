/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Discount {
    private String barcode;
    private float rate;

    public Discount(String barcode) {
        this.barcode = barcode;
        this.rate = 1;
    }

    public Discount(String barcode, float count) {
        this(barcode);
        this.rate = count;
    }

    public String getBarcode() {
        return barcode;
    }

    public float getRate() {
        return rate;
    }
}
