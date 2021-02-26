import java.util.Scanner;

public class Check_Money_Loan {
    public static void main(String[] args) {
        double money = 1.0d;
        int month = 1;
        double rate = 1.0d;
        double total = 0.0d;

        Scanner sc = new Scanner(System.in);

        System.out.printf("ENTER YOU FOR LOAN :");
        money = Double.parseDouble(sc.nextLine());

        System.out.printf("ENTER AMOUNT MONTH :");
        month = Integer.parseInt(sc.nextLine());

        System.out.printf("ENTER THE RATE :");
        rate = Double.parseDouble(sc.nextLine());

        for (int i = 0; i < month; i++) {
            total += money * (rate / 100) / 12 * month;
        }

        System.out.printf("Totol = " + total);
    }
}
