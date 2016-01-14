/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Tag {
    private String barcode;
    private float count;

    public Tag(String barcode) {
        this.barcode = barcode;
        this.count = 1;
    }

    public Tag(String barcode, float count) {
        this(barcode);
        this.count = count;
    }

    public String getBarcode() {
        return barcode;
    }

    public float getCount() {
        return count;
    }
}
