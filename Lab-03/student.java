public class student extends kuetian{
    protected String smail;
    public student(){
        this(0, "No Name", "No Email");
    }
    public student(int id, String name, String smail){
        super(id, name);
        this.smail = smail;
    }
    @Override
    public void identity(){
        System.out.println(super.name + " is a student");
    }

    public static void main(String[] args) {
        student s1 = new student(1, "Sifat", "sifatashrarul@gmail.com");
        s1.identity();
    }
    
}
