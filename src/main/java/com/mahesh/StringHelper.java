/**
 * Created by mummareddym on 25/03/2021
 */
public class StringHelper {
    public static void main(String[] args) {
        System.out.println("testing ....");
        System.out.println(findLength("my length"));
        System.out.println(findWords("my length"));
    }

    private static int findWords(String my_length) {
        return my_length.split(" ").length;
    }

    static int findLength(String my_length) {
        return my_length.length();
    }
}
