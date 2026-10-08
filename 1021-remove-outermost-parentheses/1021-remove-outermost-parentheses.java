class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int ans=0;
        for( char c : s.toCharArray()){
            if(c=='('){
                if(ans>0) st.append(c);
                ans++;
            }
            else{
                ans--;
                if(ans>0) st.append(c);
            }
        }
        return st.toString();
        
    }
}