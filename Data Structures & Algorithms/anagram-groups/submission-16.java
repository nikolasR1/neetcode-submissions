class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] stringToChar = s.toCharArray();
            Arrays.sort(stringToChar);
            String stringSorted = new String(stringToChar);
            map.putIfAbsent(stringSorted, new ArrayList<>());
            map.get(stringSorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
