class Solution {
    public int countDays(int days, int[][] meetings) {
        Set<Integer> v = new HashSet<Integer>();
        for(int[] meeting: meetings){
            for(int i = meeting[0];i<=meeting[1];i++){
                v.add(i);
            }
        }
        return days - v.size();

    }
}