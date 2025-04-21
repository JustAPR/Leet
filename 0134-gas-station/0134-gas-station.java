class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i<gas.length;i++){
            int d = gas[i] - cost[i];
            total+=d;
            tank+=d;
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        return (total>=0)?start:-1;

    }
}