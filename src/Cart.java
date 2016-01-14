import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Cart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public CartItem addCartItem(Item item, float count){

        if(isRepeat(item)){
            for(CartItem cartitem : cartItems){
                if(cartitem.getItem().getBarcode().equals( item.getBarcode() )){
                    cartitem.setCount(count);
                    return cartitem;
                }
            }
        }else {
            CartItem cartItem = new CartItem(item, count);
            cartItems.add(cartItem);
            return cartItem;
        }
        return null;
    }

    public boolean isRepeat(Item item){
        boolean result = false;

        for(CartItem cartitem : cartItems){
            if(cartitem.getItem().getBarcode().equals(item.getBarcode())){
                result = true;
            }
        }
        return result;
    }
}
