import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class scanner_test_split_tagStrings{

    @Test
    public void get_tag_when_input_tagString(){
        Scanner scanner = new Scanner();

        Tag tag1 = scanner.scan("ITEM000001-2");
        Tag tag2 = scanner.scan("ITEM000002");

        assertThat("ITEM000001", equalTo(tag1.getBarcode()));
        assertThat(2.0F, equalTo(tag1.getCount()));

        assertThat("ITEM000002", equalTo(tag2.getBarcode()));
        assertThat(1.0F, equalTo(tag2.getCount()));
    }
}
