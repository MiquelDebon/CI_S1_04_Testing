package S1_04_N2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MainCalculoDNITest {
    @Test
    public void checkDNI(){
        //Input DNI are right
        String[] dnis = {"26332560K", "54778314L", "47200187R","72598083D", "59239217A", "23307276L", "57726934Q", "22764557P", "66695082G", "45672117M"};
        for(int i=0; i< dnis.length; i++){
            assertTrue(MainCalculoDNI.checkDNI(dnis[i]));
        }
    }


}