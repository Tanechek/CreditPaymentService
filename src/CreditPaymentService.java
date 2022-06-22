public class CreditPaymentService {

    public int calculate(double credit, double percent, int period) {

        double percentPeriod = percent / (100 * 12);
        int payment = (int) (credit * percentPeriod / (1 - Math.pow(1 + percentPeriod, period * -1)));
        return payment;
    }
}
