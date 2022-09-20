class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] data = new int[2][n];
        for(int i = 0;i<trust.length;i++){
            data[0][trust[i][0]-1]++;
            data[1][trust[i][1]-1]++;
        }
        for(int i = 0;i<n;i++){
            if(data[0][i] == 0 && data[1][i] ==  n-1) return i + 1;
        }
        return -1;
    }
}