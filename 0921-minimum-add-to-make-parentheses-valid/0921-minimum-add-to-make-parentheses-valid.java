class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(char c : s.toCharArray()){
            if(c==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.size();

    }
}