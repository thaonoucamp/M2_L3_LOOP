import java.util.Scanner;

public class Find_UCLN {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the a : ");
            a = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the b : ");
            b = Integer.parseInt(sc.nextLine());

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0) {
                System.out.printf("NO GREATEST COMMON FACTOR !");
            }

            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("GREATEST COMMON FATOR = " + a);
            System.out.println();
        } while (true);
    }
}
