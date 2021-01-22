package future.assignment;
import java.util.Arrays;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class Capitalization {

    public Capitalization(){}

    public void capitalizeWithLib1(String sentence){
        String[] sentences = StringUtils.split(sentence);
        ArrayList<String> res = new ArrayList();
        for (String s : sentences) {
            res.add(StringUtils.capitalize(s));
        }
        System.out.println(res);
    }

    public void capitalizeWithLib2(String sentence){
        System.out.println(WordUtils.capitalizeFully(sentence));
    }

    public void capitalizeWithoutLib1(String sentence){
        String[] arr = sentence.split(" ");

        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i].toUpperCase();
        }

        System.out.println(Arrays.toString(arr));
    }
    public void capitalizeWithoutLib2(String sentence){

        for (String s : arr) {
            sb.append(Character.toUpperCase(s.charAt(0)))
                    .append(s.substring(1)).append(" ");
        }
        System.out.println(sb);
    }
}
