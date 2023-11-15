import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    private Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testValidIntegerConversion() {
        assertEquals("Conversion of valid integer should be correct", "F", dec2Hex.convertToHex(15));
        assertEquals("Conversion of valid integer should be correct", "1A", dec2Hex.convertToHex(26));
    }

    @Ignore
    @Test
    public void testZeroConversion() {
        assertEquals("Conversion of zero should be correct", "0", dec2Hex.convertToHex(0));
    }
}

