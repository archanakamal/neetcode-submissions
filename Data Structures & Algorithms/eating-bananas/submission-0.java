class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=0;
        for(int i: piles){
            max=Math.max(i,max);
        }
        int high=max;

        while(low<high){
            int mid=low+(high-low)/2;
            int hour=0;
            for(int i=0;i<piles.length;i++){
                hour += (piles[i] + mid - 1) / mid;
            }
            if(hour>h){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}
