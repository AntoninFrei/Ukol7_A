import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ukol7ATests {

    @Test
    public void testMultiPly() {

        Ukol7AMain ukol7AMain = new Ukol7AMain();
        assertEquals(30, ukol7AMain.multiply(3,10));

    }

}
