class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> ls = new ArrayList<>();

        int st1 = intervals[0][0];
        int ed1 = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            int st2 = intervals[i][0];
            int ed2 = intervals[i][1];

            if(ed1 >= st2){
                ed1 = Math.max(ed1, ed2);
                continue;
            }
            ls.add(new int[]{st1, ed1});
            st1 = st2;
            ed1 = ed2;
        }
        ls.add(new int[]{st1,ed1});
        return ls.toArray(new int[ls.size()][]);
    }
}