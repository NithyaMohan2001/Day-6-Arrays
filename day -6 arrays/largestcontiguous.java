class Solution{
public int dynamicProgramForMaxSubArray(int[] arr) {
int[] result = new int[arr.length];
result[0]=arr[0];
for (int i = 1; i < arr.length; i++) {
result[i]=Math.max(result[i-1]+arr[i], arr[i]);
}
int maxSumArray = result[0];
for (int j = 1; j <result.length ; j++) {
if(maxSumArray<result[j])
maxSumArray = result[j];
}
 
return maxSumArray;
}
}
