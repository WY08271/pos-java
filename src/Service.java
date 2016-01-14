import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Service {

    private List<Item> items;
    private List<Discount> discounts;

    public Service() {
        this.items = Arrays.asList(new Item("ITEM000001", "可口可乐", 1.0F, "瓶"),
                new Item("ITEM000002", "雪碧", 2.0F, "瓶"),
                new Item("ITEM000003", "鸡腿", 3.0F, "个"),
                new Item("ITEM000004", "汉堡", 4.0F, "个"),
                new Item("ITEM000005", "豆腐", 5.0F, "个"),
                new Item("ITEM000006", "辣条", 6.0F, "袋"),
                new Item("ITEM000007", "土豆", 7.0F, "块"));
        this.discounts = Arrays.asList(new Discount("ITEM000001", 0.6F),
                new Discount("ITEM000002", 0.5F),
                new Discount("ITEM000003", 0.3F),
                new Discount("ITEM000004", 0.7F),
                new Discount("ITEM000005", 0.8F));
    }

    public Item findItem(String barcode) {

        Optional<Item> item = this.items.stream()
                .filter(i -> i.getBarcode().equals(barcode))
                .findFirst();

        return item.isPresent() ? item.get() : null;
    }

    public float findRate(CartItem cartItem) {

        Optional<Discount> discount = this.discounts.stream()
                .filter(d -> d.getBarcode().equals(cartItem.getItem().getBarcode()))
                .findFirst();

        return discount.isPresent() ? discount.get().getRate() : 1.0F;
    }
}
