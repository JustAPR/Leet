class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int can[] = new int[n];
        Arrays.fill(can,1);
        for(int i = 1 ; i< n ;i++){
            if(ratings[i]>ratings[i-1]){
                can[i] = can[i-1] + 1;
            }
        }
        for(int i = n -2 ; i >= 0 ; i--){
            if(ratings[i]>ratings[i+1]){
                can[i] = Math.max(can[i],can[i+1] + 1);
            }
        }
        int s = 0;
        for(int c: can){
            s+= c;
        }
        return s;
    }
}