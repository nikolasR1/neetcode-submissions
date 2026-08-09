class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = true;;
        char[] stringOne = s.toCharArray();
        char[] stringTwo = t.toCharArray();
        if(stringOne.length != stringTwo.length){
            return false;
        }
        Arrays.sort(stringOne);
        Arrays.sort(stringTwo);
        return Arrays.equals(stringOne, stringTwo);
    }
}
