class Solution {
    public int countSpecialIntegers(int[] nums) {
        
        HashMap<Integer, List<Integer>> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                mp.put(nums[i], ls);
            }
            else{
                mp.get(nums[i]).add(i);
            }
        }
        int ans = 0;
        for(int i : mp.keySet()){
            List<Integer> ls = mp.get(i);
            if(ls.size() == 3){
                if(ls.get(1) - ls.get(0) == ls.get(2) - ls.get(1)) ans++;
            }
        }

        return ans;
    }
}