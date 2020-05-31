import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Darts {

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        if (dartIsInCircleWithRadius(1)) {
            return 10;
        }
        if (dartIsInCircleWithRadius(5)) {
            return 5;
        }
        if (dartIsInCircleWithRadius(10)) {
            return 1;
        }
        return 0;
    }

    private boolean dartIsInCircleWithRadius(int i) {
        // Using pythagoras
        return sqrt(pow(x, 2) + pow(y, 2)) <= i;
    }

}
