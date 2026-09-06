class Solution {
    public int lastStoneWeight(int[] nums) {
        	    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i:nums){
	        pq.offer(i);
	    }
	    while(pq.size()>1){
	        int x=pq.poll();
	        int y=pq.poll();
	        if(y<x){
	            pq.offer(x-y);
	        }
	        else if(x==y){
	            continue;
	        }
	    }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}
