public class Main {
    public static void main(String[] args) {
        int price = 15111; // стоимость билета
        int mile = 20; // количество рублей за одну милю

        int quantity = price / mile;
        System.out.println("Количество начисленных миль за купленный билет: " + quantity);
    }
}