package j$.util;

import j..time.Instant;
import java.util.Date;

public final class DateRetargetClass {
    public static Instant toInstant(Date date0) {
        return Instant.ofEpochMilli(date0.getTime());
    }
}

