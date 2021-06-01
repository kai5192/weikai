package learncode.Chapter08.Debug;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        int[] ints = {0,-2,5,15};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }
}
