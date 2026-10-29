class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
         int [] ans= new int[nums.length];
          for( int i=0;i<nums.length;i++)
          {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                prod= prod*nums[i];
            }
          }

          if(count >1)
          {
            return new int[nums.length];      
          }
          
          for( int j=0;j<nums.length;j++)
          {
            if(count>0)
            {
                ans[j]= (nums[j]==0) ? prod : 0;
            }
            else
            {
                ans[j]=prod/nums[j];
            }
          }
        return ans;
        
    }
}