package S1_04_N1_JUnit.S1_04_N1_JUnit_Ex3;

import S1_04_N1_JUnit.S1_04_N1_Ex3.MainOutofBound;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MainOutOfBoundTest {
    //Option 1
    @Test
    @DisplayName("Check out - out of bound OPTION 1")
    public void checkOutOfBOund(){
        assertThrows(IndexOutOfBoundsException.class,
                ()-> {
                    MainOutofBound.method();
                });
    }


    //Option 2
    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    @DisplayName("Check out - out of bound OPTION 2 (Junit test (no jupiter))")
    public void testIndexOutOfBoundsException() {
        MainOutofBound.method();
    }

}