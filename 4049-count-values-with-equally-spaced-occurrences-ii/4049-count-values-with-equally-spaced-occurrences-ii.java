class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.get(nums[i]).add(i);
            }
            else{
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                mp.put(nums[i], ls);
            }
        }
        int ans = 0;
        for(int i : mp.keySet()){
            List<Integer> ls = mp.get(i);
            
            if(ls.size() >= 3){
                 int a = ls.get(1) - ls.get(0);
                int j;
                for( j = 2; j < ls.size(); j++){
                    if(a != ls.get(j) - ls.get(j-1)) break;
                }
                if(j == ls.size()) ans++;
            }
        }
        return ans;
    }
}