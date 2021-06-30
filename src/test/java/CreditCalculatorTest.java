import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {

    @Test
    void monthlyPaymentTest() {
        double sum = 100000;
        double time = 2;
        CreditCalculator creditCalculator = new CreditCalculator(15);
        double expected = (((((15 / 100) * time) * sum) + sum) / time) / 12;
        double actual = creditCalculator.monthlyPayment(sum, time);
        assertEquals(expected, actual);

    }

    @Test
    void refundAmountTest() {
        double sum = 100000;
        double time = 2;
        CreditCalculator creditCalculator = new CreditCalculator(15);
        double expected = (((((15 / 100) * time) * sum) + sum));
        double actual = creditCalculator.refundAmount(sum, time);
        assertEquals(expected, actual);

    }

    @Test
    void overpaymentTest() {
        double sum = 100000;
        double time = 2;
        CreditCalculator creditCalculator = new CreditCalculator(15);
        double expected = ((15 / 100) * time) * sum;
        double actual = creditCalculator.overpayment(sum, time);
        assertEquals(expected, actual);
    }
}