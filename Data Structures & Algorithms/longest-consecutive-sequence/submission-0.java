class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int [] sortedNums= nums.clone();
        Arrays.sort(sortedNums);
        int count=1;
        int maxCount=1;
        for( int i=0;i<nums.length-1;i++)
        {
            if(sortedNums[i] == sortedNums[i+1]) {
                continue;
            }
            if(sortedNums[i]+1==sortedNums[i+1])
            {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
        
    }
}