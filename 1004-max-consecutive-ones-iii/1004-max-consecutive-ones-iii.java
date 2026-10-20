class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxlen=0;
        int i=0;
        int zeros=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
        
    }
}