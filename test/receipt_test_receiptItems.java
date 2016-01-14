import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class receipt_test_receiptItems {

    @Test

    public void get_receiptItems_when_we_need_receiptItems() {
        Receipt receipt = new Receipt();
        ReceiptItem result = receipt.addReceiptItems(new CartItem(new Item("ITEM00003", "鸡腿", 3.0F, "个"), 2.0F), 0.3F);

        assertThat(1, equalTo(receipt.getReceiptItems().size()));
    }

    @Test

    public void add_receiptItem_to_receiptItems_when_get_a_new_receiptItem() {
        Receipt receipt = new Receipt();
        ReceiptItem result = receipt.addReceiptItems(new CartItem(new Item("ITEM00003", "鸡腿", 3.0F, "个"), 2.0F), 0.3F);

        assertThat(0.3F, equalTo(result.getRate()));
    }

    @Test

    public void calculate_receiptItem_singlePrice_when_print_receipt() {
        ReceiptItem receiptItem = new ReceiptItem(new CartItem(new Item("ITEM00003", "鸡腿", 3.0F, "个"), 2.0F), 0.3F);
        Receipt receipt = new Receipt();
        float result = receipt.calculateSubTotal(receiptItem);

        assertThat(1.8000001F, equalTo(result));
    }

    @Test

    public void calculate_all_receiptItems_totalPrice_when_print_receipt() {
        Receipt receipt = new Receipt();
        receipt.addReceiptItems(new CartItem(new Item("ITEM00003", "鸡腿", 3.0F, "个"), 2.0F), 0.3F);
        receipt.addReceiptItems(new CartItem(new Item("ITEM00004", "汉堡", 4.0F, "个"), 2.0F), 0.3F);
        receipt.addReceiptItems(new CartItem(new Item("ITEM00005", "雪碧", 5.0F, "个"), 2.0F), 0.3F);

        float result = receipt.calculateTotalPrice();
        assertThat(7.2000003F, equalTo(result));
    }

    @Test

    public void calculate_all_receiptItems_savePrice_when_print_receipt() {
        Receipt receipt = new Receipt();
        receipt.addReceiptItems(new CartItem(new Item("ITEM00003", "鸡腿", 3.0F, "个"), 2.0F), 0.3F);
        receipt.addReceiptItems(new CartItem(new Item("ITEM00004", "汉堡", 4.0F, "个"), 2.0F), 0.3F);
        receipt.addReceiptItems(new CartItem(new Item("ITEM00005", "雪碧", 5.0F, "个"), 2.0F), 0.3F);

        float result = receipt.calculateSavePrice();
        assertThat(16.8F, equalTo(result));
    }
}