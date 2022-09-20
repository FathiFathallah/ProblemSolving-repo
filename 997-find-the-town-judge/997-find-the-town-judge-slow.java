class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        int[] arr = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            h1.add(trust[i][0]);
            arr[trust[i][1]]++;
        }
        for(int i = 1;i<=n;i++){
            if(!h1.contains(i) && arr[i] == n-1 ) return i;
        }
        return -1;
    }
}
