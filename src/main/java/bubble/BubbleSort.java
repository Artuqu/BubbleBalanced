package bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static String sort(List<String> toSort) {
        List<String> sorted = new ArrayList<>();
        String result = "";
        if (toSort.isEmpty()) {
            result+="[]";
        } else if (toSort.get(0).equals("null") && toSort.size() == 1) {
//            System.out.println("List has only null value!");
            throw new RuntimeException();
        } else
            for (int i = 0; i < toSort.size(); i++) {
                if (toSort.get(i).equals("null")) {
                } else
                    sorted.add(toSort.get(i));
            }
        if (sorted.size() > 0) {
            Collections.sort(sorted);
            result += "[";
            for (int i = 0; i < sorted.size(); i++) {
                if (i < sorted.size() - 1) {
                    result += sorted.get(i) + ",";
                } else if(i==sorted.size()-1){
                    result+= sorted.get(sorted.size()-1) + "]";

                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String[] empty = {"-9.3", "0.2", "4", "0.1", "5", "9"};
        String[] empty2 = {"null", "1"};
        String[] empty3 = {"1", "4", "5", "6", "8", "3", "8"};
        String[] empty4 = {"null"};
        List<String> input = Arrays.asList(empty4);


        sort(input);
    }

}
