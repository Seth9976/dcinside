package org.mp4parser.tools;

import java.util.Date;

public class DateHelper {
    public static long convert(Date date0) {
        return date0.getTime() / 1000L + 2082844800L;
    }

    public static Date convert(long v) {
        return new Date((v - 2082844800L) * 1000L);
    }
}

