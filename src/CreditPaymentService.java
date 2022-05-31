public class CreditPaymentService {

    public double calculate(int credit1, double persent1, int years) {
        double a = persent1 / 12 * 0.01; //  процентная ставка за месяц, результат деления годовой ставки на 12
        int month = years * 12; // количестов месяцев в году
        double K =  (a + a / (Math.pow(1 + a, month) - 1)); // коэфициент аннуитетного платежа
        double IncreditPaymant = credit1 * K; // Ежемесячный платеж
        return (float) IncreditPaymant;
    }
}