import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // create ArrayList from a list of initial values; requires Arrays.asList
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11));

        for (int i = 1; i < numList.size() - 2; i++) {
            if (numList.get(i - 1) % 2 == 0) {
                numList.set(i, numList.get(i + 1) + numList.get(i + 2));
            }
        }
        System.out.println(numList);

        int num = 157;
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }


    }
}
