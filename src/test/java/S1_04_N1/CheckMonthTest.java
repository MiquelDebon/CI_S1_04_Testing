package S1_04_N1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckMonthTest {
    @Test
    public void check12SizeList(){      //Check that has 12months
        String[] list = AddMonths.method();
        assertEquals(12, list.length);
    }
    @Test
    public void checkNotNullList(){     //Check not null
        String[] list = AddMonths.method();
        assertNotNull(list);
    }
    @Test
    public void checkAugustPositionList() {
        String[] list = AddMonths.method();
        assertEquals("August", list[7]);     //Check 8th is august
    }
}