class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(Integer num: nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int freq = nums.length/3;
        List<Integer> majorityElements = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if (entry.getValue() > freq)
                majorityElements.add(entry.getKey());
        }
        return majorityElements;
    }
}