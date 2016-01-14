import java.text.DecimalFormat;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Util {
    public static String priceFormat(float number){
        return String.format("%.1f",number);
    }
}
