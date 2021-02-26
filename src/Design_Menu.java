import java.util.Scanner;

public class Design_Menu {
    public static void main(String[] args) {
        do {

            int choice = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("MENU : ");
            System.out.println("1 - DRAW THE RECTANGLE.");
            System.out.println("2 - DRAW THE SQUARE.");
            System.out.println("3 - DRAW THE TRIANGLE.");
            System.out.println("0 - EXIT.");

            System.out.println("ENTER YOUR CHOICE :");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("you drow a rec");
                    break;
                case 2:
                    System.out.println("you drow a squar");
                    break;
                case 3:
                    System.out.println("you drow a triang");
                    break;
                case 0:
                    System.out.println("good bye !");
                    System.exit(0);
                default:
                    System.out.println("you choice not false !");
                    break;
            }
            System.out.println();
        } while (true);
    }
}

