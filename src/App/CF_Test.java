package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CF_Test {

    @Test
    void testCase1() {
        String roomType = "Standard";
        int roomQuantity = 1;
        int nights = 0;
        String promoCode = "none";

        int expectedAmount = 0;
        String expectedMessage = "Invalid nights";

        Main.Result result = Main.Result.calculate(roomType, roomQuantity, nights, promoCode);

        assertEquals(expectedAmount, result.finalAmount);
        assertEquals(expectedMessage, result.systemMessage);
    }

    @Test
    void testCase2() {
        String roomType = "Standard";
        int roomQuantity = 1;
        int nights = 1;
        String promoCode = "invalid";

        int expectedAmount = 0;
        String expectedMessage = "Invalid promo code";

        Main.Result result = Main.Result.calculate(roomType, roomQuantity, nights, promoCode);

        assertEquals(expectedAmount, result.finalAmount);
        assertEquals(expectedMessage, result.systemMessage);
    }

    @Test
    void testCase3() {
        String roomType = "Standard";
        int roomQuantity = 1;
        int nights = 3;
        String promoCode = "valid";

        int expectedAmount = 1336500;
        String expectedMessage = "Success";

        Main.Result result = Main.Result.calculate(roomType, roomQuantity, nights, promoCode);

        assertEquals(expectedAmount, result.finalAmount);
        assertEquals(expectedMessage, result.systemMessage);
    }

    @Test
    void testCase4() {
        String roomType = "Deluxe";
        int roomQuantity = 1;
        int nights = 1;
        String promoCode = "none";

        int expectedAmount = 880000;
        String expectedMessage = "Success";

        Main.Result result = Main.Result.calculate(roomType, roomQuantity, nights, promoCode);

        assertEquals(expectedAmount, result.finalAmount);
        assertEquals(expectedMessage, result.systemMessage);
    }

    @Test
    void testCase5() {

        String roomType = "Suite";
        int roomQuantity = 1;
        int nights = 1;
        String promoCode = "none";

        int expectedAmount = 1200000;
        String expectedMessage = "Success";

        Main.Result result = Main.Result.calculate(roomType, roomQuantity, nights, promoCode);

        assertEquals(expectedAmount, result.finalAmount);
        assertEquals(expectedMessage, result.systemMessage);
    }
}