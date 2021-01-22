package future.assignment;

public class Capitalization {

    public Capitalization(){}

    public void capitalizeWithLib1(String sentence){

    }

    public void capitalizeWithLib2(String sentence){

    }

    public void capitalizeWithoutLib1(String sentence){
        String[] arr = sentence.split(" ");
//        String[] arr2 = [];
//        StringBuffer sb = new StringBuffer();
//        System.out.println(arr[2]);
        for (int i=0; i<arr.length; i++){
            arr[i]=arr[i].toUpperCase();
        }
//        for (String s : arr) {
            System.out.println(arr);
//        }
    }

    public void capitalizeWithoutLib2(String sentence){

    }
}
