package future.assignment;
import java.util.Arrays;

public class Capitalization {

    public Capitalization(){}

    public void capitalizeWithLib1(String sentence){

    }

    public void capitalizeWithLib2(String sentence){

    }

    public void capitalizeWithoutLib1(String sentence){
        String[] arr = sentence.split(" ");

        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i].toUpperCase();
        }

        System.out.println(Arrays.toString(arr));
    }

    public void capitalizeWithoutLib2(String sentence){

    }
}
