class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');

        for(char a: s.toCharArray()){
            if(map.containsKey(a)){
                if(!st.isEmpty() && st.peek() == map.get(a)){
                    st.pop();
                }else{
                    return false;
                }

            }else{
                st.push(a);
            }
        }
        return st.isEmpty();

    }
}
