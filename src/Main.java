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
 // 3
        System.out.println("3.");
        int vehicleSpeed = 65;
        System.out.printf("Если скорость %d, то ", vehicleSpeed);
        if (vehicleSpeed <= 60) {
            System.out.println("можно ездить спокойно.");
        }
        else {
            System.out.println("придется заплатить штраф.");
        }
 // 4
        System.out.println("4.");
        age = 25;
        System.out.printf("Если возраст человека равен %d, то ", age);
        if (age < 2) {
            System.out.println("ему можно ничего не делать, за него все сделают другие.");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17 ) {
            System.out.println("ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("его место в университете.");
        }
        if (age > 24) {
            System.out.println("ему пора ходить на работу.");
        }
 //5
        System.out.println("5.");
        age = 6;
        System.out.printf("Если возраст ребенка равен %d, то ему ", age);
        if (age <= 5) {
            System.out.println("нельзя кататься на аттракционе.");
        }
        if (age > 5 && age <= 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println(" можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}