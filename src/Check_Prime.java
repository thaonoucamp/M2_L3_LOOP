import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        do {

            Scanner sc = new Scanner(System.in);

            System.out.printf("Enter a number you want check: ");
            int numCheck = Integer.parseInt(sc.nextLine());

            if (numCheck < 2) {
                System.out.printf(numCheck + " is not a prime !");
            } else {
                int i = 2;
                boolean check = true;

                while (i <= Math.sqrt(numCheck)) {
                    if (numCheck % i == 0) {
                        check = false;
                    }
                    i++;
                }
                if (check) {
                    System.out.printf(numCheck + " is a prime !");
                } else {
                    System.out.printf(numCheck + " is not prime !");
                }
            }
            System.out.println();
        } while (true);
    }
}
