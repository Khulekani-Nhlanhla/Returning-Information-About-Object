public class PrimaryClass {
    public static void main(String[] args) {
        System.out.println("This program creates cars and stores the information about them");

        Car car1 = new Car("C-class","Mercedes",2021,241_305.16,"Blue",20);
        System.out.println(car1.toString()+"\n");
        car1.sell(5);
        System.out.println(car1.getModel()+" "+car1.getBrand()+" "+car1.getYear()+" "+car1.getPrice()+" "+car1.getColor()+" "+car1.getQuantity());
        car1.setColor("Purple");
        car1.setYear(2023);
        System.out.println(car1.toString());

    }
}
