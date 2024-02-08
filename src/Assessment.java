import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assessment {
    public static int CountStringOccurence(String WordOne, String WordTwo) {

        int count =0;
        Pattern pattern = Pattern.compile(WordOne);
        Matcher matcher = pattern.matcher(WordTwo);
        while(matcher.find()){
            count++;

        }
        if (count == 0) {
            throw new IllegalArgumentException("Substring not found in the main string.");
        }

            System.out.println("The no of occurences are:"+count);
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String WordOne = sc.nextLine();
        String WordTwo = sc.nextLine();

        try {
            int occurrences = CountStringOccurence(WordOne, WordTwo);
            System.out.println("Number of occurrences of the substring: " + occurrences);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
