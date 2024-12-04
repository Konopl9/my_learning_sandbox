import java.util.*;

public class ComparatorPlay {

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));

    }



    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        // pre populate with first window
        for(int i = 0; i < k; i++) {
            deque.addLast(nums[i]);
        }
        int right = k;
        // calculate how many slides needed
        int slidesNeeded = nums.length - k;
        int[] result = new int[slidesNeeded + 1];
        // slide the findow
        for(int i = 0; i < result.length; i++) {
            // write current max to the window
            result[i] = getHigestFromOccurence(deque);

            // remove left
            deque.removeFirst();
            // add right
            if(right < nums.length) {
                deque.addLast(right++);
            }
        }

        return result;
    }

    private static int getHigestFromOccurence(Deque<Integer> deque) {
        return deque.stream().max(Integer::compareTo).get();
    }

    private static void addOccurenceToMap(HashMap<Integer, Integer> occurence, Integer key) {
        occurence.put(key, occurence.getOrDefault(key, 0) + 1);
    }

    private static void removeOccurenceToMap(HashMap<Integer, Integer> occurence, Integer key) {
        if(occurence.get(key) == null) {
            return;
        }

        int currentOccurence = occurence.get(key);
        if(currentOccurence == 1) {
            occurence.remove(key);
        } else {
            occurence.put(key, currentOccurence - 1);
        }
    }
}
