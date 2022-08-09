package words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalancedWordsCounter {

    //    this program just check if word is balanced or not
    static int counter = 0;

    public static int count(String input) {
        if (input.isEmpty()) {
            counter = 0;
        } else if (input.equals("null") || notBalanced(input) || wordHasDigit(input)) {
            throw new RuntimeException();
        }
        System.out.println(counter);
        return counter;
    }

    private static boolean wordHasDigit(String input) {
        boolean hasDigit = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                hasDigit = true;
            }
        }
        return hasDigit;
    }


    private static boolean notBalanced(String input) {
        boolean isTrue = true;
        List<Integer> resultList = new ArrayList<>();
        String firstLetter = String.valueOf(input.charAt(0));
        int countLetters = 0;
        for (int i = 0; i < input.length(); i++) {
            if (firstLetter.equals(String.valueOf(input.charAt(i)))) {
                countLetters++;
                if (i == input.length() - 1) {
                    resultList.add(countLetters);
                }
            } else {
                resultList.add(countLetters);
                countLetters = 0;
                firstLetter = String.valueOf(input.charAt(i));
                i--;
            }
        }

        Collections.sort(resultList);
        if (resultList.get(0) == resultList.get(resultList.size() - 1)) {
            isTrue = false;
        }
        counter = resultList.size();
        return isTrue;
    }


    public static void main(String[] args) {
//        count("");
//        count("aabb");
//        count("aaabbbccc");
        count("11");


    }


}
