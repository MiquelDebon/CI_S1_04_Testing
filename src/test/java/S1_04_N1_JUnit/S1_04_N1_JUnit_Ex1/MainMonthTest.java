package S1_04_N1_JUnit.S1_04_N1_JUnit_Ex1;

import S1_04_N1_JUnit.S1_04_N1_Ex1.AddMonths;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Check Moth Exercise")
public class MainMonthTest {
    @Test
    @DisplayName("Check if the list has 12 items")
    public void check12SizeList(){      //Check that has 12months
        String[] list = AddMonths.method();
        assertEquals(12, list.length);

    }
    @Test
    @DisplayName("Check the list is not null")
    public void checkNotNullList(){     //Check not null
        String[] list = AddMonths.method();
        assertNotNull(list);
    }
    @Test
    @DisplayName("Check August is at 7th position")
    public void checkAugustPositionList() {
        String[] list = AddMonths.method();
        assertEquals("August", list[7]);     //Check 8th is august
    }
}