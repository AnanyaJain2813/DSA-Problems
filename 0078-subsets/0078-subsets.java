class Solution {
    public static void call(int []nums, int i, int n, List<List<Integer>> ans, List<Integer>ls){
        if(i == n){
            ans.add(new ArrayList<>(ls));
            return;
        }

        call(nums, i+1, n, ans, ls);
        ls.add(nums[i]);
        call(nums, i+1, n, ans, ls);
        ls.remove(ls.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        call(nums, 0, n, ls, ans);
        return ls;
    }
}