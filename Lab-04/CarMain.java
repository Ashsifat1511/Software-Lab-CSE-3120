public class CarMain {
    public static void main(String[] args) {
        CarType carType1 = new CarType("Player");
        CarType carType2 = new CarType("AI");
        CarType carType3 = new CarType("AI");
        CarType carType4 = new CarType("Player");
        CarBody carBody = new CarBody();
        Drive drive = new Drive();
        Steering steering = new Steering();
        carBody.setCarBody("Sedan");
        System.out.println("Car Type 1: " + carType1.getCarType());
        System.out.println("Car Type 2: " + carType2.getCarType());
        System.out.println("Car Type 3: " + carType3.getCarType());
        System.out.println("Car Type 4: " + carType4.getCarType());
        System.out.println("Car Body: " + carBody.getCarBody());
        drive.forward();
        drive.backward();
        steering.leftTurn();
        steering.rightTurn();
    }
}
