/**
 * Created by Thoughtworks on 1/13/16.
 */
public class ReceiptItem {
    private CartItem cartItem;
    private float rate;

    public ReceiptItem(CartItem cartItem, float rate){
        this.cartItem = cartItem;
        this.rate = rate;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public float getRate() {
        return rate;
    }

}
