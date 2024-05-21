package task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static String findShortestV1(String str1, String str2, String str3) {

        if (str1.length() < str2.length() && str1.length() < str3.length())
            return str1;
        else if (str2.length() < str3.length())
            return str2;
        else return str3;
    }

    public static String findLongestV1(String str1, String str2, String str3) {

        if (str1.length() > str2.length() && str1.length() > str3.length())
            return str1;
        else if (str2.length() > str3.length())
            return str2;
        else return str3;
    }

    public static String findShortestV2(String str1, String str2, String str3) {

        return Stream.of(str1, str2, str3).min(Comparator.comparingInt(String::length)).get();
    }

    public static String findLongestV2(String str1, String str2, String str3) {

        return Stream.of(str1, str2, str3).max(Comparator.comparingInt(String::length)).get();
    }

    public static String[] findLowestThenAvgV1(String str1, String str2, String str3) {

        double avgLength = (str1.length() + str2.length() + str3.length()) / 3.0;
        ArrayList<String> result = new ArrayList<>();
        if(str1.length() < avgLength) result.add(str1);
        if(str2.length() < avgLength) result.add(str2);
        if(str3.length() < avgLength) result.add(str3);

        return result.toArray(String[]::new);
    }

    public static String[] findLowestThenAvgV2(String str1, String str2, String str3) {

        final double avgLength = (str1.length() + str2.length() + str3.length()) / 3.0;

        return Stream.of(str1, str2, str3).filter(it -> it.length() < avgLength).toArray(String[]::new);
    }

    public static String findStringWithUniqueSymbols(String str1, String str2, String str3) {
        var stringArray = new String[]{str1, str2, str3};
        mainloop:
        for (String str : stringArray) {
            var chars = str.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if(chars[i] == chars[j])
                        continue mainloop;
                }
            }
            return str;
        }
        return null;
    }

    public static String duplicateSymbols(String str) {
        var builder = new StringBuilder(str.length() * 2);
        for (char character : str.toCharArray()) {
            builder.append(character).append(character);
        }
        return builder.toString();
    }

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();

        // Task 1
        var shortest = findShortestV1(str1, str2, str3);
        var longest = findLongestV1(str1, str2, str3);

        System.out.printf("Shortest string is %s with length %d \n", shortest, shortest.length());
        System.out.printf("Longest string is %s with length %d \n", longest, longest.length());

        System.out.println(findShortestV2(str1, str2, str3));
        System.out.println(findLongestV2(str1, str2, str3));

        // Task 2
        System.out.println("Strings with length less than average: ");
        for (String str : findLowestThenAvgV1(str1, str2, str3)) {
            System.out.printf("%s, length: %d \n", str, str.length());
        }
        System.out.println(Arrays.toString(findLowestThenAvgV2(str1, str2, str3)));

        // Task 3
        var stringWithUniqueSymbols = findStringWithUniqueSymbols(str1, str2, str3);
        if(stringWithUniqueSymbols != null) {
            System.out.println("String with unique symbols is " + stringWithUniqueSymbols);
        } else {
            System.out.println("String with unique symbols not found.");
        }

        // Task 4
        System.out.println("New string with duplicates symbols: " + duplicateSymbols(str1));
    }
}
