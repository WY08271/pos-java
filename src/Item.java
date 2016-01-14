/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Item {
    private String barcode;
    private String name;
    private float price;
    private String unit;

    public Item(String barcode, String name, float price,String unit){
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

}
