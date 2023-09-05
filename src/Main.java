public class Main {
    public static void main(String[] args) {
        {
            System.out.println("task 1");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 2");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 3");
            for (int i = 0; i <= 17; i+=2) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 4");
            for (int i = 10; i >=-10; i--) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 5");
            for (int year = 1904; year <= 2096; year += 4) {
                System.out.println(year + "год является високосным.");
            }
        }

        System.out.println(" ");
        {
            System.out.println("task 6");
            for (int i = 7; i <= 98; i += 7) {
                System.out.print (i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 7");
            for (int i = 1; i <= 512; i*=2) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        {
            System.out.println("task 8");
            int stash = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + stash;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }

        System.out.println(" ");
        {
            System.out.println("task 9");
            int contribution = 29000;
            float total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + total / 100;
                total = total + contribution;
                System.out.println(String.format("Месяц %s, сумма накоплений равна %.2f рублей.", i, total));
            }
        }

        System.out.println(" ");
        {
            System.out.println("task 10");
            for (int i = 1; i <= 10; i++) {
                int result = 2 * i;
                System.out.println("2 * " + i + " = " + result);
            }
        }
    }
}