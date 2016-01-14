/**
 * Created by Thoughtworks on 1/13/16.
 */
public class Scanner {

    public Tag scan(String tagString){
        String temp[] = tagString.split("-");
        Tag tag;

        if(temp.length != 2){
            tag = new Tag(temp[0]);
        }else {
            tag = new Tag(temp[0], Float.parseFloat(temp[1]));
        }

        return tag;
    }
}
