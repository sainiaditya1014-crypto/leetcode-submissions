class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int[] set={-1,-1,-1};
        for(int i=0;i<n;i++){
            set[s.charAt(i)-'a']=i;
            if(set[0]!=-1&&set[1]!=-1&&set[2]!=-1){
                count+= 1+Math.min(set[0],Math.min(set[1],set[2]));
            }
        }
        return count;
    }
}