import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    private static final long GIGASECOND = 1_000_000_000;

    private LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this(LocalDateTime.of(moment, LocalTime.MIDNIGHT));
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
