import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        if (Objects.isNull(name)) {
            return "One for you, one for me.";
        }

        return String.format("One for %s, one for me.", name);
    }
}
