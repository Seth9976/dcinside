package j$.time;

public abstract class Clock {
    public abstract ZoneId a();

    public static Clock b() {
        return new a(ZoneId.systemDefault());
    }

    public abstract Instant instant();

    public static Clock systemUTC() {
        return a.b;
    }
}

