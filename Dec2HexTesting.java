public class Dec2HexTest {

    public static void main(String[] args) {
        testConvertToHexWithZero();
        testConvertToHexWithPositiveNumber();
        testConvertToHexWithNegativeNumber();
    }

    public static void testConvertToHexWithZero() {
        assertEqual(Dec2Hex.convertToHex(0), "0");
    }

    public static void testConvertToHexWithPositiveNumber() {
        assertEqual(Dec2Hex.convertToHex(26), "1A");
    }

    public static void testConvertToHexWithNegativeNumber() {
        assertEqual(Dec2Hex.convertToHex(-1), "FFFFFFFF");
    }

    private static void assertEqual(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed. Expected: " + expected + ", Actual: " + actual);
        }
    }
}

