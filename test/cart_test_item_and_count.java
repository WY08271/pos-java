import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class cart_test_item_and_count {

    @Test
    public void get_cartItems_when_we_need_cartitems() {
        Cart cart = new Cart();
        Item item = new Item("ITEM00003", "鸡腿", 3.0F, "个");

        CartItem cartItem = cart.addCartItem(item, 1);

        assertThat(1, equalTo(cart.getCartItems().size()));
    }

    @Test

    public void new_cartItem_when_input_item_and_count() {
        Cart cart = new Cart();
        Item item = new Item("ITEM00003", "鸡腿", 3.0F, "个");

        CartItem cartItem = cart.addCartItem(item, 1);

        assertThat(1.0F, equalTo(cartItem.getCount()));
    }
}