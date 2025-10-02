package App;

public class Main {

    public static class Result {
        public int finalAmount;
        public String systemMessage;

        public Result(int finalAmount, String systemMessage) {
            this.finalAmount = finalAmount;
            this.systemMessage = systemMessage;
        }

        @Override
        public String toString() {

                return "Final Amount: " + finalAmount + " | Message: " + systemMessage;

        }

        public static Result calculate(String roomType, int roomQuantity, int nights, String promoCode) {
            // Validate nights
            boolean nightInvalid = (nights < 1 || nights > 30);
            boolean promoInvalid = promoCode.equalsIgnoreCase("invalid");

            if (nightInvalid) {
                return new Result(0, "Invalid nights");
            }
            if (promoInvalid) {
                return new Result(0, "Invalid promo code");
            }

            // 1. Giá cơ bản theo loại phòng
            int basePrice = 0;
            switch (roomType) {
                case "Standard":
                    basePrice = 500_000;
                    break;
                case "Deluxe":
                    basePrice = 800_000;
                    break;
                case "Suite":
                    basePrice = 1_200_000;
                    break;

            }

            // 2. Tính tiền cơ bản
            double total = basePrice * roomQuantity * nights;

            // 3. Giảm giá theo số đêm
            if (nights >= 3) {
                total *= 0.9; // giảm 10%
            }


            // 4. Promo code
            if (promoCode.equalsIgnoreCase("valid")) {
                total *= 0.9; // giảm thêm 10%
            }

            // 5. VAT
            if (roomType.equals("Standard") || roomType.equals("Deluxe")) {
                total *= 1.1; // cộng 10% VAT
            }

            return new Result((int) Math.round(total), "Success");
        }


    }

    public static void main(String[] args) {
        System.out.println(Result.calculate("Standard", 5, 1, "valid"));
    }
}


