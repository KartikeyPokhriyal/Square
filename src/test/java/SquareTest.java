import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {


    @Test
    public void returnAreaOfTheSquare() {
        Square square = new Square(-2.0);

        assertEquals(4,square.calculateArea(), 0);
    }
}
