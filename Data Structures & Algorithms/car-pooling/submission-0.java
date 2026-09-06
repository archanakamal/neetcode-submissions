class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1000];
    
        for(int i=0;i<trips.length;i++){
            int from=trips[i][1];
            int to=trips[i][2];
            int pass=trips[i][0];

            arr[from]+=pass;
            arr[to]-=pass;
        }
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>capacity){
                return false;
            }
        }
        return true;
    }
}