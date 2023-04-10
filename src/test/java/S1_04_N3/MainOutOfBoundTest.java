package S1_04_N3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainOutOfBoundTest {
    //Option 1
    @Test
    public void checkOutOfBOund(){
        assertThrows(IndexOutOfBoundsException.class,
                ()-> {
                    MainOutofBound.method();
                });
    }
    //Option 2
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        MainOutofBound.method();
    }

}