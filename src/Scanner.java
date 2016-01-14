/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Scanner {

    public Tag scan(String tagString){
        String tagArray[] = tagString.split("-");

        float count = tagArray.length > 1 ? Float.parseFloat(tagArray[1]) : 1;

        return new Tag(tagArray[0], count);
    }
}
