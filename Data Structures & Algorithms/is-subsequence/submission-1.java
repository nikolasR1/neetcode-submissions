class Solution {
    public boolean isSubsequence(String s, String t) {
        return compare(s, t, 0, 0);
    }

    private boolean compare(String s, String t, int i, int j){
        if(s.length() == i) return true;
        if(t.length() == j) return false;

        if(s.charAt(i) == t.charAt(j)){
            return compare(s, t, i+1 , j+1);
        }
        return compare(s, t, i, j+1);
    }
}