package appearn;
class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:a){
            for(int j:b){
                int sum=i+j;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int k:c){
            for(int l:d){
                int sum=k+l;
                count+=map.getOrDefault(sum,0);
            }
        }
        return count;
    }
}
