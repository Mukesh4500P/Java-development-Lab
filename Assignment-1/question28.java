import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);
        int count;

        if (n < 10)
            count = 1;
        else if (n < 100)
            count = 2;
        else if (n < 1000)
            count = 3;
        else if (n < 10000)
            count = 4;
        else
            count = 5;

        System.out.println("Number of digits = " + count);
    }
}