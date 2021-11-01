public class Main {
    public static void main(String[] args) {
        int balance = 2_000_000_000;                   // текущий баланс счёта клиента
        int remittance = 500_000_000;                  // сумма перевода
        int total = balance + remittance;              // баланс счёта клиента после совершения перевода
        System.out.println(total);
    }
}
