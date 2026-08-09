class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ls = new ArrayList<>();

        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            ans = Math.max(ans, candies[i]);
        }

        for(int i = 0; i < candies.length; i++){
            int sum = candies[i]+extraCandies;
            if(sum >= ans){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}