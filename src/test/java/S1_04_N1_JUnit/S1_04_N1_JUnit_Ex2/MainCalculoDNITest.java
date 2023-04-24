package S1_04_N1_JUnit.S1_04_N1_JUnit_Ex2;

import S1_04_N1_JUnit.S1_04_N1_Ex2.MainCalculoDNI;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class MainCalculoDNITest {
    @Test
    @DisplayName("Check DNI - Option 1")
    public void checkDNI(){
        //Input DNI are right
        String[] dnis = {"26332560K", "54778314L", "47200187R","72598083D", "59239217A", "23307276L", "57726934Q", "22764557P", "66695082G", "45672117M"};
        for(int i=0; i< dnis.length; i++){
            assertTrue(MainCalculoDNI.checkDNI(dnis[i]));
        }
    }


    @DisplayName("Check DNI - Option 2")
    @ParameterizedTest
    @ValueSource(strings = {"46415331C", "54778314L", "47200187R","72598083D", "59239217A", "23307276L", "57726934Q", "22764557P", "66695082G", "45672117M"})
    public void checkDNIOption2(String inputDNI){
        assertTrue(MainCalculoDNI.checkDNI(inputDNI));
    }


    @DisplayName("Check DNI - Option 3")
    @ParameterizedTest
    @MethodSource("dnisMethodResourcer")
    void chechDNIOption3(String s1){
        assertTrue(MainCalculoDNI.checkDNI(s1));
    }
    static Stream<String> dnisMethodResourcer(){
        return Stream.of("46415331C", "54778314L", "47200187R","72598083D", "59239217A", "23307276L", "57726934Q", "22764557P", "66695082G", "45672117M");
    }



}