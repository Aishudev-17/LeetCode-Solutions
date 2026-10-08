class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int count = 0;

        boolean[] counted = new boolean[26];

        for (int i = 0; i < n; i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z' && !counted[ch - 'a']) {

                for (int j = 0; j < n; j++) {

                    if (word.charAt(j) == (char)(ch - 'a' + 'A')) {
                        count++;
                        counted[ch - 'a'] = true;
                        break;
                    }
                }
            }
        }

        return count;
    }
}