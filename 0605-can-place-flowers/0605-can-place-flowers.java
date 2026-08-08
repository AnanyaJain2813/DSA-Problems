class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int max = 0;
        int m = flowerbed.length - 1;
        if(m+1 == 1){
            if(flowerbed[0] == 0) cnt++;
            return cnt >= n;
        }
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                continue;
            }
            else if(flowerbed[i] == 0){
                if(i == 0 &&  flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    cnt++;
                }
                else if(i > 0 && flowerbed[i-1] == 0 && i < m && flowerbed[i+1] == 0){
                    cnt++;
                    flowerbed[i] = 1;
                }

                else if(i == m && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    cnt++;
                }
            }
        }
        return cnt >= n;
    }
}