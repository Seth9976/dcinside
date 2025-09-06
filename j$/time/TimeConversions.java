package j$.time;

public class TimeConversions {
    public static Duration convert(java.time.Duration duration0) {
        return duration0 == null ? null : Duration.ofSeconds(duration0.getSeconds(), duration0.getNano());
    }

    public static Instant convert(java.time.Instant instant0) {
        return instant0 == null ? null : Instant.ofEpochSecond(instant0.getEpochSecond(), instant0.getNano());
    }

    public static java.time.Duration convert(Duration duration0) {
        return duration0 == null ? null : java.time.Duration.ofSeconds(duration0.getSeconds(), duration0.getNano());
    }

    public static java.time.Instant convert(Instant instant0) {
        return instant0 == null ? null : java.time.Instant.ofEpochSecond(instant0.getEpochSecond(), instant0.getNano());
    }
}

