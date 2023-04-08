package S1_04_N1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthTest {
    @Test
    public void checkMonthList(){
        Main.addMonths();
        assertEquals(12,Main.monthYear.size());         //Check that has 12months
        assertEquals("August",Main.monthYear.get(7));   //Check 8th is august
    }

}