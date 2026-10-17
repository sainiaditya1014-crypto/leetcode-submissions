class Solution {
    public int minLength(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if (top > 0 && ((c == 'B' && stack[top - 1] == 'A') ||
                            (c == 'D' && stack[top - 1] == 'C'))) {
                top--; 
            } else {
                stack[top++] = c;
            }
        }
        return top;
    }
}