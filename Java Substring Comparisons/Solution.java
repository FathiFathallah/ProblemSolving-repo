import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] Array = new String[s.length() - k + 1];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = s.substring(i, k + i);
        }
        largest = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i].compareTo(largest) > 0) largest = Array[i];
        }
        smallest = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i].compareTo(smallest) < 0) smallest = Array[i];
        }


        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
