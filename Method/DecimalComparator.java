public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int intNum1 = (int) (num1 * 1000); // Truncate num1 to three decimal places
        int intNum2 = (int) (num2 * 1000); // Truncate num2 to three decimal places

        // Compare the truncated values
        if (intNum1 == intNum2) {
            return true;
        }

        return false; // Return false if the numbers are not equal
    }
}
