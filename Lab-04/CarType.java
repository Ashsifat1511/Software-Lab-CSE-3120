public class CarType {
    private String type;
    private static int playerCarCount = 0;
    public CarType(){
        type = null;
    }
    public CarType(String type) {
        if (type.equalsIgnoreCase("Player") && playerCarCount > 0 ) {
            System.out.println("Player Can't Be More Than 1");
            this.type = null;
        }

        else{this.type = type;}

        if (type.equalsIgnoreCase("Player")) {
            playerCarCount++;
        }
    }

    public String getCarType() {
        return type;
    }
}
