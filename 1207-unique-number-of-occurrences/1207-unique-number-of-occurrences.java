class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> st = new HashSet<>();
        for(Map.Entry<Integer, Integer> mpp : map.entrySet()){
            if(st.contains(mpp.getValue())) return false;
            st.add(mpp.getValue());
        }
        return true;
    }
}