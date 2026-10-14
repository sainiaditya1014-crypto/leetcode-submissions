class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num || sum < 1) 
        return "";
        StringBuilder sb = new StringBuilder();
        int rem = sum;
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, rem);
            sb.append(digit);
            rem -= digit;
        }
        return sb.toString();
    }
}