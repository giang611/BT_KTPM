package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Decision_Table_Test {

    @Test
    void testCase1() {
        Main.Result r = Main.Result.calculate("Standard", 1, 5, "invalid");
        assertEquals(0, r.finalAmount);
        assertEquals("Invalid promo code", r.systemMessage);
    }

    @Test
    void testCase2() {
        Main.Result r = Main.Result.calculate("Standard", 1, 0, "valid");
        assertEquals(0, r.finalAmount);
        assertEquals("Invalid nights", r.systemMessage);
    }

    @Test
    void testCase3() {
        Main.Result r = Main.Result.calculate("Standard", 1, 5, "valid");
        assertEquals(2227500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase4() {
        Main.Result r = Main.Result.calculate("Deluxe", 2, 4, "valid");
        assertEquals(5702400, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase5() {
        Main.Result r = Main.Result.calculate("Suite", 1, 3, "valid");
        assertEquals(2916000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase6() {
        Main.Result r = Main.Result.calculate("Standard", 1, 10, "none");
        assertEquals(4950000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase7() {
        Main.Result r = Main.Result.calculate("Deluxe", 3, 3, "none");
        assertEquals(7128000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase8() {
        Main.Result r = Main.Result.calculate("Suite", 1, 4, "none");
        assertEquals(4320000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase9() {
        Main.Result r = Main.Result.calculate("Standard", 1, 2, "valid");
        assertEquals(990000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase10() {
        Main.Result r = Main.Result.calculate("Deluxe", 1, 1, "valid");
        assertEquals(792000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase11() {
        Main.Result r = Main.Result.calculate("Suite", 1, 2, "valid");
        assertEquals(2160000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase12() {
        Main.Result r = Main.Result.calculate("Standard", 1, 1, "none");
        assertEquals(550000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase13() {
        Main.Result r = Main.Result.calculate("Deluxe", 1, 2, "none");
        assertEquals(1760000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase14() {
        Main.Result r = Main.Result.calculate("Suite", 1, 1, "none");
        assertEquals(1200000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }
}
