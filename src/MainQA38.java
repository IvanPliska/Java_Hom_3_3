public class MainQA38 {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // сумма кредита
        float percent = 9.99F; // процент кредита
        int years1 = 1; // срок кредитования
        int years2 = 2; // срок кредитования
        int years3 = 3; // срок кредитования
        int creditPaymant1 = (int) service.calculate(credit, percent, years1);
        int creditPaymant2 = (int) service.calculate(credit, percent, years2);
        int creditPaymant3 = (int) service.calculate(credit, percent, years3);
        System.out.println("Платеж на год кредита: " + creditPaymant1);
        System.out.println("Платеж на 2 года кредита: " + creditPaymant2);
        System.out.println("Платеж на 3 года кредита: " + creditPaymant3);
    }
}