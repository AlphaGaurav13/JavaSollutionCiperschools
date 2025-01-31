package java319;
import java.util.Scanner;
import java.io.PrintWriter;

public class question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int Cammt = sc.nextInt();
        char rupeeSymbol = '\u20B9';

        if (Cammt > 5000) {
            float dis = (float)Cammt * 20 / 100;
            System.out.println("Discount: $"  + dis);
            System.out.println("Final Amount: $"  + (Cammt - dis));
        } else if (Cammt >= 3000 && Cammt <= 5000) {
            float dis = (float)Cammt * 10 / 100;
            System.out.println("Discount: $"  + dis);
            System.out.println("Final Amount: $"  + (Cammt - dis));
        } else {
            System.out.println("Discount: $" + "0.0");
            System.out.println("Final Amount: $"  + Cammt);
        }
    }
}
