package task2;

public class StringUtils {

    public static String reverseString(String input) {

        input = new StringBuilder(input).reverse().toString();

        return input;

    }

}
