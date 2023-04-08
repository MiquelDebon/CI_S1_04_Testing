package S1_04_N3;

public class MainOutofBound {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3};
        outofBound(numeros);
    }
    public static void outofBound(int[] numeros){
        for(int i=0; i<5; i++){
            System.out.println(numeros[i]);
        }
    }

}
