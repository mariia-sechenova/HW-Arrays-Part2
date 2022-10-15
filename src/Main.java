
public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        int max = -10_000;
        int min = 500_000;
        double average = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        average = (double) sum / 30;

        System.out.println("Task1");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей\n");
        System.out.println("Task2");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей\n");
        System.out.println("Task3");
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей\n");
        System.out.println("\nTask4");

        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}



