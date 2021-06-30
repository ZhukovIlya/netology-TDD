public class CreditCalculator {
    int rate;

    public CreditCalculator(int rate) {
        this.rate = rate;
    }

    public double monthlyPayment(double money, double time) {
        return (((((15 / 100) * time) * money) + money) / time) / 12;



    }

    public double refundAmount(double money, double time) {
        return (((((15 / 100) * time) * money) + money));

    }

    public double overpayment(double money, double time) {
        return ((15 / 100) * time) * money;

    }
}
