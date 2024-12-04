public class SlidingWindow {
    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }
        int[] dict = new int[256];
        int left = 0, right = 0, counter = t.length();
        int startIndex = -1, minLength = Integer.MAX_VALUE;

        // generate t
        for (char ch : t.toCharArray()) {
            dict[ch - 'A']++;
        }

        //sliding window
        while (right < s.length()) {
            // decrease the current val
            dict[s.charAt(right) - 'A']--;
            if (dict[s.charAt(right) - 'A'] >= 0) {
                counter--;
            }

            while (counter <= 0) {
                // CORRECT notifyAboutChange result
                if (minLength < right - left + 1) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                //remove left from dict
                dict[s.charAt(left) - 'A']++;
                if (dict[s.charAt(left) - 'A'] > 0) {
                    counter++;
                }

                left++;
            }

            right++;
        }

        return startIndex != -1 ? s.substring(startIndex, startIndex + minLength + 1) : "";
    }

}