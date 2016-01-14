/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Pos {
    public static String main(String tagStrings[]){
        Scanner scanner = new Scanner();
        Service service = new Service();
        Cart cart = new Cart();
        Receipt receipt = new Receipt();

        for(String tagString : tagStrings){
            Tag tag = scanner.scan(tagString);

            Item item = service.findItem(tag.getBarcode());

            cart.addCartItem(item, tag.getCount());
        }

        for(CartItem cartItem : cart.getCartItems()){
            float rate = service.findRate(cartItem);
            receipt.addReceiptItems(cartItem, rate);
        }

        System.out.print(receipt.printReceipt());

        return receipt.printReceipt();
    }
}
