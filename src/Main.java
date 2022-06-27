import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) <= 0 || intList.get(i) % 2 != 0) {
                intList.remove(i);
                i--;
            }
        }

        Collections.sort(intList);

        for (int x : intList) {
            System.out.println(x);
        }

    }
}
