import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class service_test_get_some_information {

    @Test
    public void get_item_when_input_barcode() {
        Service service = new Service();
        Item item = service.findItem("ITEM000002");

        assertThat("ITEM000002", equalTo(item.getBarcode()));
        assertThat("雪碧", equalTo(item.getName()));
    }

    @Test
    public void get_rate_when_input_cartItem() {
        CartItem cartItem = new CartItem(new Item("ITEM000003", "鸡腿", 3.0F, "个"), 2.0F);
        Service service = new Service();

        assertThat(0.3F, equalTo(service.findRate(cartItem)));
    }
}