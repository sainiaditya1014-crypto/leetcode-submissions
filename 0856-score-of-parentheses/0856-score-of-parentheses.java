class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
       st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }
            else{
                int inner=st.pop();
                int val=Math.max(2*inner,1);
                st.push(st.pop()+val);
            }
        }
        return st.pop();
    }
}