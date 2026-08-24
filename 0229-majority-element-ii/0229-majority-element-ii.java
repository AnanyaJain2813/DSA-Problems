class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Integer majority1 = 0;
        // Integer majority2 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for (int num : nums) {
        //     if (num == majority1) {
        //         count1++;
        //     } else if (num == majority2) {
        //         count2++;
        //     } else if (count1 == 0) {
        //         majority1 = num;
        //         count1++;
        //     } else if (count2 == 0) {
        //         majority2 = num;
        //         count2++;
        //     } else {
        //         count1--;
        //         count2--;
        //     }
        // }

        // count1 = 0;
        // count2 = 0;

        // for (int num : nums) {
        //     if (num == majority1) {
        //         count1++;
        //     } else if (num == majority2) {
        //         count2++;
        //     }
        // }

        // List<Integer> res = new ArrayList<>();
        // int n = nums.length;

        // if (count1 > n / 3) {
        //     res.add(majority1);
        // }
        // if (count2 > n / 3) {
        //     res.add(majority2);
        // }

        // return res;  

    int m1 = 0, m2 = 0;
    int c1 = 0, c2 = 0;
    for(int num : nums){
        if(num == m1) c1++;
        else if(num == m2) c2++;
        else if(c1 == 0){
            m1 = num;
            c1 = 1;
        }
        else if(c2 == 0){
            m2 = num;
            c2 = 1;
        }
        else{
            c1--;
            c2--;
        }
    }

    c1 = 0;
    c2 = 0;
    for(int i : nums){
        if(m1 == i) c1++;
        else if(m2 == i)c2++;
    }

    ArrayList<Integer> n = new ArrayList<>();
    if(c1 > (nums.length/3)) n.add(m1);
    if(c2 > (nums.length/3)) n.add(m2);

    return n;
    }
}