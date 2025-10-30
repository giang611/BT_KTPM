package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DF_Test {

    private static Main.Result call(String rt, int qty, int n, String promo) {
        return Main.Result.calculate(rt, qty, n, promo);
    }

    private static void assertResult(Main.Result r, int expectedAmount, String expectedMsg) {
        assertEquals(expectedAmount, r.finalAmount, "Sai finalAmount!");
        assertEquals(expectedMsg, r.systemMessage, "Sai systemMessage!");
    }

    @Test void TC01(){ assertResult(call("Standard", 1, 1, "none"), 550000, "Success"); }
    @Test void TC02(){ assertResult(call("Standard", 1, 1, "invalid"), 0, "Invalid promo code"); }
    @Test void TC03(){ assertResult(call("Standard", 1, 1, "none"), 550000, "Success"); }
    @Test void TC04(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC05(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC06(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC07(){ assertResult(call("Standard", 1, 1, "none"), 550000, "Success"); }
    @Test void TC08(){ assertResult(call("Deluxe", 1, 1, "none"), 880000, "Success"); }
    @Test void TC09(){ assertResult(call("Suite", 1, 1, "none"), 1200000, "Success"); }
    @Test void TC10(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC11(){ assertResult(call("Standard", 1, 1, "none"), 550000, "Success"); }
    @Test void TC12(){ assertResult(call("Standard", 1, 1, "invalid"), 0, "Invalid promo code"); }
    @Test void TC13(){ assertResult(call("Standard", 1, 1, "none"), 550000, "Success"); }
    @Test void TC14(){ assertResult(call("Deluxe", 1, 3, "none"), 2376000, "Success"); }
    @Test void TC15(){ assertResult(call("Deluxe", 1, 1, "none"), 880000, "Success"); }
    @Test void TC16(){ assertResult(call("Standard", 1, 3, "valid"), 1336500, "Success"); }
    @Test void TC17(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC18(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC19(){ assertResult(call("Suite", 1, 1, "none"), 1200000, "Success"); }
    @Test void TC20(){ assertResult(call("Standard", 1, 3, "valid"), 1336500, "Success"); }
    @Test void TC21(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC22(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC23(){ assertResult(call("Suite", 1, 1, "none"), 1200000, "Success"); }
    @Test void TC24(){ assertResult(call("Standard", 1, 3, "valid"), 1336500, "Success"); }
    @Test void TC25(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC26(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
    @Test void TC27(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC28(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC29(){ assertResult(call("Standard", 1, 3, "valid"), 1336500, "Success"); }
    @Test void TC30(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC31(){ assertResult(call("Suite", 1, 3, "none"), 3240000, "Success"); }
    @Test void TC32(){ assertResult(call("Suite", 1, 1, "none"), 1200000, "Success"); }
    @Test void TC33(){ assertResult(call("Suite", 1, 1, "none"), 1200000, "Success"); }
    @Test void TC34(){ assertResult(call("Standard", 1, 3, "none"), 1485000, "Success"); }
}