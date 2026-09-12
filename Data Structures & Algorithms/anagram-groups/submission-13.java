class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] string = s.toCharArray();
            Arrays.sort(string);
            String sortString = new String(string);
            map.putIfAbsent(sortString, new ArrayList<>());
            map.get(sortString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
