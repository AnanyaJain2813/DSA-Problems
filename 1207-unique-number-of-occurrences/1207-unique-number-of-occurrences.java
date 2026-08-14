class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> st = new HashSet<>();
       
       for(int i : map.values()){
        st.add(i);
       }
       return st.size() == map.size();
    }
}