package future.assignment;

public class Capitalization {

    public Capitalization(){}

    public void capitalizeWithLib1(String sentence){

    }

    public void capitalizeWithLib2(String sentence){

    }

    public void capitalizeWithoutLib1(String sentence){

    }

    public void capitalizeWithoutLib2(String sentence){
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(Character.toUpperCase(s.charAt(0)))
                    .append(s.substring(1)).append(" ");
        }
        System.out.println(sb);

    }
}
