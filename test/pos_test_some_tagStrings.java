import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 1/13/16.
 */
public class pos_test_some_tagStrings {

    @Test
    public void output_when_input_some_tagStrings() {

        String[] tagStrings = {"ITEM000001",
                "ITEM000001",
                "ITEM000003-2",
                "ITEM000005"};

        Pos pos = new Pos();

        String result = "***<没钱赚商店>收据***\n" +
                "---------------------\n" +
                "名称:可口可乐,数量:2.0瓶,单价:1.0(元),小计:1.2\n" +
                "名称:鸡腿,数量:2.0个,单价:3.0(元),小计:1.8\n" +
                "名称:豆腐,数量:1.0个,单价:5.0(元),小计:4.0\n" +
                "--------------\n" +
                "总计:7.0\n" +
                "节省:6.0" +
                "\n****************";
        assertThat(result, equalTo(pos.main(tagStrings)));
    }
}