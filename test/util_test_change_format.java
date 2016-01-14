import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class util_test_change_format {

    @Test
    public void one_digit_when_input_two_digit() {
        Util util = new Util();

        assertThat("3.3", equalTo(util.priceFormat(3.33333F)));
    }
}