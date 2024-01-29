public class point implements Comparable<point>{
    private int x;
    private int y;
    public point(){
        this(0,0);
    }
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(point p){
        if(this.x == p.x && this.y == p.y){
            return 0;
        }
        else{
            return 1;
        }
    }

    /*public static void main(String[] args){
        point p1 = new point(1, 2);
        point p2 = new point(1, 2);
        point p3 = new point(0, 0);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p3.compareTo(p1));
    }*/
}