class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] topKFrequentElements = new int[k];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int key:nums){
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        //Max-heap 
        PriorityQueue<Pair<Integer, Integer>> pq = 
                new PriorityQueue<>((a,b) -> b.getKey() - a.getKey() );
        //insert into PriorityQueue in {frequency, value} order
        for( Map.Entry<Integer, Integer> entry : freq.entrySet()){
            pq.add(new Pair<>(entry.getValue(), entry.getKey()));
        }
        for(int i = 0; i< k; i++){
            topKFrequentElements[i] = pq.peek().getValue();
            pq.poll();
        }
        return topKFrequentElements;

    }
}