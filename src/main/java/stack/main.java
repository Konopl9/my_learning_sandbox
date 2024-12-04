package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(nextGreaterElements(ints)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> numToGreaterOnRight = new HashMap<>();

        // build greater on right for each
        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[i] >= stack.peek()) {
                stack.pop();
            }
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            numToGreaterOnRight.put(nums[i], nextGreater);
            stack.push(nums[i]);
        }

        // build greater
        int greaterSoFar = -1;
        HashMap<Integer, Integer> numToGreaterOnLeft = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(greaterSoFar <= nums[i]) {
                greaterSoFar = -1;
            }
            numToGreaterOnLeft.put(nums[i], greaterSoFar);
            greaterSoFar = Math.max(greaterSoFar, nums[i]);
        }

        // peek from to sides
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = Math.max(numToGreaterOnRight.get(nums[i]), numToGreaterOnLeft.get(nums[i]));
        }

        return result;
    }
}
