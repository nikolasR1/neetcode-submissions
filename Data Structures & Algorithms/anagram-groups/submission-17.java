class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] stringArray = s.toCharArray();
            Arrays.sort(stringArray);
            String stringSort = new String(stringArray);

            map.putIfAbsent(stringSort, new ArrayList<>());
            map.get(stringSort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
