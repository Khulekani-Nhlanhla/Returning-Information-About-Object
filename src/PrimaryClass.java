public class PrimaryClass {
    public static void main(String[] args) {
        System.out.println("This program creates cars and stores the information about them");

        Car car1 = new Car("C-class","Mercedes",2021,241_305.16,"Blue",20);
        car1.delivery(2);
        car1.sell(5);
        System.out.println(car1.toString());
    }
}
