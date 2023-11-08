public class App {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        App calculator = new App(); // Skapa ett objekt av App-klassen

        int sum1 = calculator.add(5, 10);
        System.out.println("Summan av 5 och 10 är: " + sum1);

        double sum2 = calculator.add(3.14, 2.71);
        System.out.println("Summan av 3.14 och 2.71 är: " + sum2);

        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum3 = calculator.add(numbers);
        System.out.println("Summan av talen i arrayen är: " + sum3);
    }
}