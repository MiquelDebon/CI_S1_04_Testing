package S1_04_N1;

import java.util.Arrays;

public class MainMonth {
    static String[] months = new String[12];

    public static void main(String[] args) {
        months = AddMonths.method();
        Print();
    }


    public static void Print(){
        for(String m : months){
            System.out.println(m);
        }
    }

}
