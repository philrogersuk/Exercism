import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        if (square > 1) {
            return grainsOnSquare(square - 1).multiply(BigInteger.TWO);
        }

        return BigInteger.ONE;

        // I like the recusive method, but this is a simpler way of achieving the same thing;
        //
        //        return BigInteger.ONE.multiply(BigInteger.TWO.pow(2));
        //
    }

    BigInteger grainsOnBoard() {
        return grainsOnSquare(64).multiply(BigInteger.TWO).subtract(BigInteger.ONE);
    }

}
