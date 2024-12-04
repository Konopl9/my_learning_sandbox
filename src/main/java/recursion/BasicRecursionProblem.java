package recursion;

import java.util.ArrayList;
import java.util.List;

public class BasicRecursionProblem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> subsequences = getAllSubsequences(arr);
        System.out.println(subsequences);
    }

    private static List<List<Integer>> getAllSubsequences(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        getAllSubsequences(0, arr, new ArrayList<>(), result);
        return result;
    }

    private static void getAllSubsequences(int i, int[] arr, List<Integer> current, List<List<Integer>> result) {
        if(i == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // try to add a value to a subsequence
        current.add(arr[i]);
        getAllSubsequences(i + 1, arr, current, result);

        // try to not take
        current.remove(current.size()-1);
        getAllSubsequences(i + 1, arr, current, result);
    }

}