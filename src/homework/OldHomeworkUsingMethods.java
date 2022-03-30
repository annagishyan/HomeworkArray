package homework;

import java.util.Arrays;

public class OldHomeworkUsingMethods {
    public static void max(int x[]) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];

        }


    }


    public static void main(String[] args) {
        // array's max and min
        int[] arr = {3, 4, 5};
        max(arr);
        System.out.println(Arrays.stream(arr).max());


    }

}