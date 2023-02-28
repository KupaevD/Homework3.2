public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double percent = 9.99;
        double years = 1;
        double monthlyPayment = service.calculate(amount, percent, years);
        int payment = (int) monthlyPayment;

        System.out.println("Ежемесячный платеж - " + payment);




    }

}