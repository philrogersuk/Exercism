import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class PangramChecker {

    public boolean isPangram(String input) {

        return 26 == input.toLowerCase().chars().mapToObj(i->(char)i)
                .distinct()
                .filter(c -> Character.isAlphabetic(c))
                .count();
    }
}
