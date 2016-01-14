/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Service {
    public Item findItem(String barcode) {
        Item items[] = new Item[]{new Item("ITEM000001", "可口可乐", 1.0F, "瓶"),
                new Item("ITEM000002", "雪碧", 2.0F, "瓶"),
                new Item("ITEM000003", "鸡腿", 3.0F, "个"),
                new Item("ITEM000004", "汉堡", 4.0F, "个"),
                new Item("ITEM000005", "豆腐", 5.0F, "个"),
                new Item("ITEM000006", "辣条", 6.0F, "袋"),
                new Item("ITEM000007", "土豆", 7.0F, "块")};

        for(Item item : items){
            if(item.getBarcode().equals(barcode)){
                return item;
            }
        }
        return null;
    }

    public float findRate(CartItem cartItem) {
        Discount discounts[] = new Discount[]{new Discount("ITEM000001", 0.6F),
                new Discount("ITEM000002", 0.5F),
                new Discount("ITEM000003", 0.3F),
                new Discount("ITEM000004", 0.7F),
                new Discount("ITEM000005", 0.8F)};

        for(int i = 0; i < discounts.length; i++){

            if(discounts[i].getBarcode().equals(cartItem.getItem().getBarcode())){
                return discounts[i].getRate();
            }
        }
        return 1.0F;
    }
}
