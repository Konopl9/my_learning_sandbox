package recursion;

import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3,3}, {2,5}};
        for (int[] interval : intervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        Arrays.sort(intervals, java.util.Comparator.comparingInt(x -> x[0]));
        for (int[] interval : intervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
