public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 9.99;
        int period = 12;
        int payment = service.calculate(credit, percent, period);
        System.out.println(payment);

        period = 24;
        payment = service.calculate(credit, percent, period);
        System.out.println(payment);

        period = 36;
        payment = service.calculate(credit, percent, period);
        System.out.println(payment);
    }
}