package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.L;
import okhttp3.internal.Util;
import y4.l;
import y4.m;

public final class DatesKt {
    @l
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = null;
    @l
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = null;
    public static final long MAX_DATE = 0xE677D21FDBFFL;
    @l
    private static final DatesKt.STANDARD_DATE_FORMAT.1 STANDARD_DATE_FORMAT;

    static {
        DatesKt.STANDARD_DATE_FORMAT = new DatesKt.STANDARD_DATE_FORMAT.1();
        DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[15];
    }

    @m
    public static final Date toHttpDateOrNull(@l String s) {
        Date date1;
        int v;
        L.p(s, "<this>");
        if(s.length() == 0) {
            return null;
        }
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = ((DateFormat)DatesKt.STANDARD_DATE_FORMAT.get()).parse(s, parsePosition0);
        if(parsePosition0.getIndex() == s.length()) {
            return date0;
        }
        String[] arr_s = DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        __monitor_enter(arr_s);
        try {
            v = 0;
            while(true) {
                if(v >= arr_s.length) {
                    goto label_28;
                }
                DateFormat[] arr_dateFormat = DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS;
                DateFormat dateFormat0 = arr_dateFormat[v];
                if(dateFormat0 == null) {
                    dateFormat0 = new SimpleDateFormat(DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[v], Locale.US);
                    dateFormat0.setTimeZone(Util.UTC);
                    arr_dateFormat[v] = dateFormat0;
                }
                parsePosition0.setIndex(0);
                date1 = dateFormat0.parse(s, parsePosition0);
                if(parsePosition0.getIndex() != 0) {
                    goto label_24;
                }
                ++v;
            }
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(arr_s);
        throw throwable0;
    label_24:
        __monitor_exit(arr_s);
        return date1;
    label_28:
        __monitor_exit(arr_s);
        return null;
    }

    @l
    public static final String toHttpDateString(@l Date date0) {
        L.p(date0, "<this>");
        String s = ((DateFormat)DatesKt.STANDARD_DATE_FORMAT.get()).format(date0);
        L.o(s, "STANDARD_DATE_FORMAT.get().format(this)");
        return s;
    }
}

