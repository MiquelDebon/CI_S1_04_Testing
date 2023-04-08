package S1_04_N3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainOutofBoundTest {
    @Test
    public void checkOutOfBOund(){
        int[] numeros = {0,1,2,3};
        MainOutofBound.outofBound(numeros);

    }

}