class Solution {
    public int longestConsecutive(int[] nums) {

        int max = 0;
        Set<Integer> ls = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            ls.add(nums[i]);
        }
        int cnt = 0;
        
        for(int i : ls){
            if(!ls.contains(i-1)){
                cnt = 1;
                int a = i + 1;
                while(ls.contains(a)){
                    cnt++;
                    a++;
                }
            }
            max = Math.max(max,cnt);
        }

        return max;
        
    }
}