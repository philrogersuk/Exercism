import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Optional;

class ResistorColorDuo {
    int value(String[] colors) {
        //let's pretend we've validated we have at least 2 colours;

        Colour first = Colour.findByName(colors[0])
                .orElseThrow(InvalidParameterException::new);
        Colour second = Colour.findByName(colors[1])
                .orElseThrow(InvalidParameterException::new);
        return (first.value * 10) + second.value;
    }


    private enum Colour {
        BLACK (0),
        BROWN (1),
        RED (2),
        ORANGE (3),
        YELLOW (4),
        GREEN (5),
        BLUE (6),
        VIOLET (7),
        GREY (8),
        WHITE (9);

        private int value;

        Colour(int value) {
            this.value = value;
        }

        private static Optional<Colour> findByName(String name) {
            return Arrays.stream(values())
                    .filter(c -> c.name().equalsIgnoreCase(name))
                    .findFirst();
        }
    }
}
