class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int lce = 0;
        for(Integer num : nums) mp.put(num, 1);
        for(Map.Entry<Integer, Integer> entry : mp.entrySet() ){
            int num = entry.getKey();
            if (mp.get(num) == 0) continue;
            int freq = 1;
            int key = num-1;
            while(mp.containsKey(key)){
                if (mp.get(key) == 0) break;
                freq += mp.get(key);
                mp.put(key, 0);
                key--;
            }
            mp.put(num, freq);
            lce = Math.max(lce, freq);
        }
        return lce;
    }
}