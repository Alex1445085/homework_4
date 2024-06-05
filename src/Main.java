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

    }
}