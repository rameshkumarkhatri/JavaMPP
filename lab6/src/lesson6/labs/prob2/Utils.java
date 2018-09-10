package lesson6.labs.prob2;

public class Utils {

    public int wordCount(String str) {
        if (str == null || str.isEmpty()) return 0;
        return str.length();
    }

    public String reverseLetters(String str) {

        if (str == null || str.length() == 1)
            return str;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }

    public String removeDuplicates(String str) {
        if (str == null || str.length() == 1)
            return str;
        String newString = "";
        for (int i = 0; i < str.length(); i++)
            if (!newString.contains("" + str.charAt(i)))
                newString = newString + "" + str.charAt(i);
        return newString;
    }
}
