class Solution {
    public int minimumAverageDifference(int[] nums) {
        long[] sum=new long[nums.length];
        long total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
            sum[i]=total_sum;
        }
        
        long[] ans=new long[nums.length];
        for(int i=0;i<nums.length-1;i++){
            ans[i]=(long)Math.abs((sum[i]/(i+1))-(total_sum-sum[i])/(nums.length-i-1));
        }
        
        ans[ans.length-1]=(long)Math.abs((sum[sum.length-1]/(sum.length))-0);
        long min=ans[0];
        long index=0;
        for(int i=0;i<ans.length;i++){
             if(ans[i]<min){
                 min=ans[i];
                 index=i;
             }
        }
        return (int)index;
    }
}
