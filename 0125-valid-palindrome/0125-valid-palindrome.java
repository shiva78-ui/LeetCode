class Solution {

    public boolean isPalindrome(String s) {

        // Convert the string to lowercase
        s = s.toLowerCase();

        // Store only letters and digits
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        // Convert StringBuilder into String
        String str = sb.toString();

        // Two pointers
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}