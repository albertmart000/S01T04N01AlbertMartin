package S01T04N01Ex01AlbertMartin;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

        @Before
        public void setUp(){
            MonthsList monthsOfYear = new MonthsList();
        }

        @Test
        //@DisplayName("La llista ha de tenir 12 posicions.")
        public void testSize() {
            MonthsList monthsList = new MonthsList();
            assertEquals(monthsList.getMonthsOfYear().size(), 12, "La llista ha de tenir 12 posicions. ");
        }

        @Test
       // @DisplayName("La llista no es nula")
        public void testNotNull(){

           // assertNotNull(monthsOfYear);
        }
        //@Test
        //     monthYear
        //}

}
