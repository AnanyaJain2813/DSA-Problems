class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int cnt = 0;
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        while(i <= j){
            int sum = people[i] + people[j];
            if(sum <= limit){
                cnt++;
                i++;
                j--;
            }
            else{
                cnt++;
                j--;
            }
        }
        return cnt;
    }
}