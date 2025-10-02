package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Boundary_Test {

    @Test
    void testCase1() {
        Main.Result r = Main.Result.calculate("Standard", 5, 15, "valid");
        assertEquals(33412500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase2() {
        Main.Result r = Main.Result.calculate("Deluxe", 5, 15, "valid");
        assertEquals(53460000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase3() {
        Main.Result r = Main.Result.calculate("Suite", 5, 15, "valid");
        assertEquals(72900000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase4() {
        Main.Result r = Main.Result.calculate("Standard", 1, 15, "valid");
        assertEquals(6682500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase5() {
        Main.Result r = Main.Result.calculate("Standard", 2, 15, "valid");
        assertEquals(13365000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase6() {
        Main.Result r = Main.Result.calculate("Standard", 9, 15, "valid");
        assertEquals(60142500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase7() {
        Main.Result r = Main.Result.calculate("Standard", 10, 15, "valid");
        assertEquals(66825000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase8() {
        Main.Result r = Main.Result.calculate("Standard", 5, 1, "valid");
        assertEquals(2475000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase9() {
        Main.Result r = Main.Result.calculate("Standard", 5, 2, "valid");
        assertEquals(4950000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase10() {
        Main.Result r = Main.Result.calculate("Standard", 5, 29, "valid");
        assertEquals(64597500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase11() {
        Main.Result r = Main.Result.calculate("Standard", 5, 30, "valid");
        assertEquals(66825000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase12() {
        Main.Result r = Main.Result.calculate("Standard", 5, 15, "invalid");
        assertEquals("Invalid promo code", r.systemMessage);
    }

    @Test
    void testCase13() {
        Main.Result r = Main.Result.calculate("Standard", 5, 15, "none");
        assertEquals(37125000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase14() {
        Main.Result r = Main.Result.calculate("Standard", 5, 2, "valid");
        assertEquals(4950000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase15() {
        Main.Result r = Main.Result.calculate("Standard", 5, 3, "valid");
        assertEquals(6682500, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }

    @Test
    void testCase16() {
        Main.Result r = Main.Result.calculate("Standard", 5, 4, "valid");
        assertEquals(8910000, r.finalAmount);
        assertEquals("Success", r.systemMessage);
    }
}
