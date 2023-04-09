package S1_04_N1;

import java.text.DateFormatSymbols;
import java.util.Arrays;

public class AddMonths {

    public static String[] method() {
        String[] monthList = new DateFormatSymbols().getMonths();
        String[] correctList = correctList = Arrays.copyOf(monthList, 12);;
        /*for(int i=0; i<12; i++){
            correctList[i] = monthList[i];
        }*/
        return correctList ;
    }
}
