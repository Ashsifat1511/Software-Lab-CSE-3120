public class CarBody {
    private String category;
    CarBody(){
        category = null;
    }
    public CarBody(String category) {
        this.category = category;
    }

    public void setCarBody(String body){
        category = body;
    }
    public String getCarBody() {
        return category;
    }
}
