public class CreditPaymentService {

    public double calculate( double amount, double percent, double years) {
        double monthlyPayment;
        double a = 1 + percent;
        double b = years * 12;
        double expression = ;



        monthlyPayment = amount * (percent * expression) / (expression - 1);

        return monthlyPayment;

    }
}

