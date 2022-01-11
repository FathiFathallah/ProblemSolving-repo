import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
        System.out.println("US: " + format.format(payment));
        java.text.NumberFormat format2 = java.text.NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + format2.format(payment));
        java.text.NumberFormat format3 = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.CHINA);
        System.out.println("China: " + format3.format(payment));
        java.text.NumberFormat format4 = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
        System.out.println("France: " + format4.format(payment));
    }
}
