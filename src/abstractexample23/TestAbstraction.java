package abstractexample23;
// in real scenario method is called bt programmer or user
public class TestAbstraction {
    public static void main (String[]args){
        Shape s= new Circle1(); // Ina a real scenario, object is provided through method, e.g. getShape() method
        s.draw();

    }
}
