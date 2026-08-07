class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedArr = new String(charArray);
            res.putIfAbsent(sortedArr, new ArrayList<>());
            res.get(sortedArr).add(s);
        }
        return new ArrayList<>(res.values());

        
    }
}
