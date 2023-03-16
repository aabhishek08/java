import java.util.Scanner;

public class Questiona4i {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, n, fact = 1, sq = 1, sum = 0, cnt = 1;
        System.out.println("Enter the Number:");
        x = sc.nextInt();
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        for (int j = 1; j <= n; j = j + 2) {
            sq = sq * j;
            for (int i = 1; i <= n; i++)
                fact = fact * i;

            if (cnt % 2 == 1)
                sum = sum + (sq / fact);
            else
                sum = sum - (sq / fact);
            cnt++;

        }
        System.out.println("sum=" + sum);
    }
}