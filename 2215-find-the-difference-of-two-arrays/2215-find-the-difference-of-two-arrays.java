class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

       List<List<Integer>> ls = new ArrayList<>();
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
         
         for(int i = 0; i < nums1.length; i++){
           st1.add(nums1[i]);
         }
          for(int i = 0; i < nums2.length; i++){
            st2.add(nums2[i]);
         }

          List<Integer> ans1 = new ArrayList<>();
          List<Integer> ans2 = new ArrayList<>();

         for(int i : st1){
            if(!st2.contains(i)){
                ans1.add(i);
            }
         }
          for(int i : st2){
            if(!st1.contains(i)){
                ans2.add(i);
            }
         }

         ls.add(ans1);
         ls.add(ans2);

         
        return ls;
    }
}