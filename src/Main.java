public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;       // Стартовое количество рублей на балансе
        int depositAmount = 2000;         // Сумма пополнения счета

        int minDepositAmount = 1000;     // Минимальное количество рублей, при котором начисляются бонусы
        int bonusWithMinDepositAmount = startingBalance + depositAmount + (depositAmount / 100); // Количество начисленных бонусов при выполнении условий акции

        int bonusWithoutMinDepositAmount = startingBalance + depositAmount; // Количество начисленных бонусов при невыполнении условий акции


        if (depositAmount < minDepositAmount) {
            System.out.println("Баланс:" + " " + bonusWithoutMinDepositAmount);
        } else System.out.println("Баланс:" + " " + bonusWithMinDepositAmount);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}