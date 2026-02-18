class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashmap<String, List<String>> mp = new Hashmap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> ll = mp.get(key);
            if (ll == null){
                ll = new ArrayList<>();
                mp.put(key, ll);
            }
            ll.add(str);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}