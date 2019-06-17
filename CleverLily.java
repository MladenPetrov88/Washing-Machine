import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double moneyFromBirthdays = 0;
        double sumMoney = 0;
        double toys = 0;
        double moneyFromToys = 0;
        for (int i = 1; i <= age; i++) {
            if (i %2 == 0) {
                moneyFromBirthdays += 10;
                sumMoney += moneyFromBirthdays - 1;
            } else {
                toys++;
                moneyFromToys = toys * toyPrice;
            }
        }
        double totalMoneyEarned = sumMoney + moneyFromToys;
        double moneyLeft = totalMoneyEarned - priceWashingMachine;
        double moneyNeed = priceWashingMachine - totalMoneyEarned;
        if (totalMoneyEarned >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", moneyLeft);
        } else {
            System.out.printf("No! %.2f", moneyNeed);
        }
    }
}
