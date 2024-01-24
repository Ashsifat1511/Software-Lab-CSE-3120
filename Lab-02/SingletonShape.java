//package Lab-02;

public class SingletonShape {

    private static SingletonShape instance;

    private SingletonShape() {
    
    }

    public static SingletonShape getInstance() {
        if (instance == null) {
            instance = new SingletonShape();
        }
        return instance;
    }

    public void draw() {
        throw new UnsupportedOperationException("draw method must be implemented in subclasses");
    }
}
