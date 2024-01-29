public class kuetian {
    protected int id;
    protected String name;
    public kuetian(){
        this(0, "No Name");
    }
    public kuetian(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void identity(){
        System.out.println(name + " is a kuetian");
    }
}
