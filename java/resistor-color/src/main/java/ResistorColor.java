import java.util.Optional;

class ResistorColor {
    int colorCode(String color) {
        return Colour.findByName(color).get().value;
    }

    // returning a list<String> would be my preference here.
    String[] colors() {
        String[] colours = new String[Colour.values().length];
        for (Colour c: Colour.values()) {
            colours[c.value] = c.name().toLowerCase();
        }
        return colours;
    }

    // Perhaps overkill for this exercise
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
            for (Colour c : values()) {
                if (c.name().equalsIgnoreCase(name)) {
                    return Optional.of(c);
                }
            }
            return Optional.empty();
        }
    }
}
