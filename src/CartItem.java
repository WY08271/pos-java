/**
 * Created by Thoughtworks on 1/13/16.
 */
public class CartItem {
    private Item item;
    private float count;

    public CartItem(Item item, float count){
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count += count;
    }

    public String getBarcode() {
        return this.item.getBarcode();
    }

    public float getPrice() {
        return this.item.getPrice();
    }

    public String getName() {
        return this.item.getName();
    }

    public String getUnit() {
        return this.item.getUnit();
    }
}
