package future.assignment;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class Capitalization {

    public Capitalization(){}

    public void capitalizeWithLib(String sentence){

    }

    public void capitalizeWithoutLib(String sentence){

    }

    public void capitalizeWithLib2(String sentence){
        String[] sentences = StringUtils.split(sentence);
        ArrayList<String> res = new ArrayList();
        for (String s : sentences) {
            res.add(StringUtils.capitalize(s));
        }
        System.out.println(res);
    }
}
