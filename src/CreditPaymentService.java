public class CreditPaymentService {

    public float calculate(int credit1, float persent1, int years) {
        float a = persent1 / 12 * 0.01F; //  процентная ставка за месяц, результат деления годовой ставки на 12
        int month = years * 12; // количестов месяцев в году
        float K = (float) (a + a / (Math.pow(1 + a, month) - 1)); // коэфициент аннуитетного платежа
        float IncreditPaymant = credit1 * K; // Ежемесячный платеж
        return IncreditPaymant;
    }
}