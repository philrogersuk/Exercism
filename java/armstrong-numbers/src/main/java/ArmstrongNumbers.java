import java.util.Arrays;

import static java.lang.Math.pow;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int[] digits = String.valueOf(numberToCheck)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        int num = Arrays.stream(digits)
                .map(digit -> power(digit, digits.length))
                .sum();
        return num == numberToCheck;
    }

    int power(int num, int exponent) {
        return (int) pow((double)num, (double)exponent);
    }

}
