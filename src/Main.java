public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
 //1
        System.out.println("1.");
        int age = 17;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("он не достиг совешеннолетия, надо немного подождать");
        }
 // 2
        System.out.println("2.");
        int temperature = 20;
        System.out.print("На улице " + temperature + " градус");
        if (temperature < 5) {
            if (temperature > 1) {
                System.out.print("а");
            }
            System.out.println(", нужно надеть шапку");
        }
        else {
            System.out.println("ов, можно идти без шапки");
        }

    }
}