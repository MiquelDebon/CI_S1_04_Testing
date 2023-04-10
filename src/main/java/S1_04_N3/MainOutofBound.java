package S1_04_N3;

public class MainOutofBound {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        throw new ArrayIndexOutOfBoundsException();
    }

}
