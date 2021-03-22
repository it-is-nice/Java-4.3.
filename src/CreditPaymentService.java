public class CreditPaymentService {
    public double calculate(int creditAmount, int years, double interest) {
        int month = years * 12;
        double monthInterest = interest / 100 / 12;
        double monthPayment = creditAmount * (monthInterest + (monthInterest / (Math.pow(1 + monthInterest, month) - 1)));

        return monthPayment;
    }
}

