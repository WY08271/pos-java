import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Receipt {
    private ArrayList<ReceiptItem> receiptItems = new ArrayList<>();

    public ArrayList<ReceiptItem> getReceiptItems() {
        return receiptItems;
    }

    public ReceiptItem addReceiptItems(CartItem cartItem, float rate) {

        ReceiptItem receiptItem = new ReceiptItem(cartItem, rate);
        receiptItems.add(receiptItem);

        return receiptItem;
    }

    public float calculateSubTotal(ReceiptItem receiptItem) {
        float rate = receiptItem.getRate();
        float count = receiptItem.getCartItem().getCount();
        float price = receiptItem.getCartItem().getItem().getPrice();
        float subTotal = rate * count * price;

        return subTotal;
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;

        for(ReceiptItem receiptItem : receiptItems) {
            totalPrice += calculateSubTotal(receiptItem);
        }

        return totalPrice;
    }

    public float calculateSavePrice() {
        float savePrice = 0;

        for(ReceiptItem receiptItem : receiptItems){
            float rate = receiptItem.getRate();
            float count = receiptItem.getCartItem().getCount();
            float price = receiptItem.getCartItem().getItem().getPrice();
            savePrice += (1.00F - rate) * count * price;
        }

        return savePrice;
    }

    public String printReceipt(){

        String ticket = "***<没钱赚商店>收据***" + "\n---------------------\n";
        for(int i = 0; i < receiptItems.size(); i++){
            ticket += "名称:" + receiptItems.get(i).getCartItem().getItem().getName() + ",数量:"
                    + receiptItems.get(i).getCartItem().getCount()
                    + receiptItems.get(i).getCartItem().getItem().getUnit()
                    + ",单价:"
                    + receiptItems.get(i).getCartItem().getItem().getPrice()
                    + "(元),小计:"
                    + Util.priceFormat(calculateSubTotal(receiptItems.get(i))) + "\n";
        }

        ticket += "--------------\n" + "总计:" + Util.priceFormat(calculateTotalPrice())
                + "\n节省:" + Util.priceFormat(calculateSavePrice())
                + "\n****************";

        return ticket;
    }
}
