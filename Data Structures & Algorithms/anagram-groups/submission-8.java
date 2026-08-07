class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedChar = new String(charArray);
            res.putIfAbsent(sortedChar, new ArrayList<>());
            res.get(sortedChar).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
