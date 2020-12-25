package Arrays_and_Strings;

class solution2 {
    // solution 1
    // inefficient
    // sort the strings in order
    public String sort(String str) {
        // strings are immutable, convert to array, then sort
        char[] str_set = str.toCharArray();
        java.util.Arrays.sort(str_set);
        return new String(str_set);
    }

    public boolean permutation_1(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return sort(s1).equals(sort(s2));
    }

    // solution 2
    // time complexity O(n) because loop through each string once = 2n
    // space complexity is O(1) because it is a fixed array
    public boolean permutation_2(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        // array to store how # of times each character appears
        int[] letter_set = new int[128];

        // store the # of times each character appears in s1
        for (char c : s1.toCharArray()) {
            letter_set[c]++;
        }

        // iterate throught s2 to check for disparity
        for (int i = 0; i < s2.length(); i++) {
            int num = (int) s2.charAt(i);
            letter_set[num]--;
            if (letter_set[num] < 0)
                return false;
        }

        return true;
    }
}