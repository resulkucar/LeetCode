class Solution { 
        public int[] runningSum(int[] nums) { 
        int a [] = new int [nums.length]; 
        for(int i=0;i<nums.length;i++) {
            int sum = 0; for(int k=0; k<=i;k++){ 
                    sum += nums[k];
            }
            a[i] = sum;
        }
        return a;
    }
}
