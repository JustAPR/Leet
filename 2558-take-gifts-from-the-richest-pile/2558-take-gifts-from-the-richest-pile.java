class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> m = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: gifts){
            m.add(i);
        }
        for(int i = 0;i<k;i++){
            if (m.isEmpty()){
                break;
            }
            int l = m.poll();
            int n = (int) Math.sqrt(l);
            m.add(n);
        }
        int t = 0;
        while(!m.isEmpty()){
            t+=m.poll();
        }
        return t;
    }
}