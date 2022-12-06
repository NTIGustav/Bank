import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem bank = new BankSystem();
        boolean exitRequested = false;
        while(!exitRequested) {
            Menu.printMenu();// Gör man för att genomföra det vi vill att ska hända i menyn genom att använda oss av switch så kommer de att ändrars från meny 1 -> meny 2 och choice gör det som det låter.
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1 -> bank.registerAccount(); //De olika cases gör det som det låter också genom att intragera med de olika cases så gör de olika saker genom hur man intregerar med de, exempel genom att trycka 1 eller 2.
                case 2 -> bank.loginAccount();
                case 3 -> exitRequested = true;
                default -> System.out.println("Wrong input"); // Detta är bra att ha om man råkar trycka fel så att den inte kan intregera med case så kommer denna text poppa upp.
            }
        }
    }
}