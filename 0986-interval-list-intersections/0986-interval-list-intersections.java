class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

       
        int i = 0, j = 0, k = 0;
        int [][]ans = new int[firstList.length+secondList.length][2];

        while(i < firstList.length && j < secondList.length){
        int st1 = firstList[i][0];
        int ed1 = firstList[i][1];

        int st2 = secondList[j][0];
        int ed2 = secondList[j][1];

        int max = Math.max(st1, st2);
        int min =  Math.min(ed1, ed2);

        if(max <= min){
           ans[k][0] = max;
           ans[k][1] = min;
           k++;
        }

        if(ed1 < ed2) i++;
        else j++;
             
        }
        return Arrays.copyOf(ans,k);
        
    }
}