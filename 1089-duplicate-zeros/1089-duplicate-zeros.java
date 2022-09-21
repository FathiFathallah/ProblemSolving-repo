class Solution {
    public void duplicateZeros(int[] arr) {
        int[] newArray = new int[arr.length];
        int j=0;
        for(int i=0; i< arr.length && j<arr.length ;i++){
            newArray[j]=arr[i];
            if(newArray[j] == 0 && j <= arr.length-2) {
                newArray[j+1] = 0; 
                j+=2;
            }
            else  {
                newArray[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++)
            arr[i] = newArray[i];
    }
}