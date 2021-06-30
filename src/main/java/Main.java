import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 10;
        CreditCalculator creditCalculator = new CreditCalculator(rate);
        Scanner scanner = new Scanner(System.in);
        double sum;
        double time;
        int choice;
        String line;
        while (true) {
            System.out.println("Выберите пункт меню"
                    + "\n" + "1 Рассчет месячного платежа"
                    + "\n" + "2 Рассчет общей суммы к возврату в банк"
                    + "\n" + "3 Рассчет переплаты за весь период");
            line = scanner.nextLine();
            choice = Integer.parseInt(line);
            System.out.println("Введите сумму");
            line = scanner.nextLine();
            sum = Double.parseDouble(line);
            System.out.println("На сколько лет");
            line = scanner.nextLine();
            time =  Double.parseDouble(line);
            switch (choice) {
                case 1:

                    System.out.println("Месячный платёж " + (creditCalculator.monthlyPayment(sum, time)));
                    break;
                case 2:
                    System.out.println("Общая сумма возврата в банк " + (creditCalculator.refundAmount(sum, time)));
                    break;
                case 3:
                    System.out.println("Переплата " + creditCalculator.overpayment(sum, time));
                    break;
            }
        }
    }
}
