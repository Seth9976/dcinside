package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.internal.Util;
import y4.l;

public final class DatesKt.STANDARD_DATE_FORMAT.1 extends ThreadLocal {
    @Override
    public Object initialValue() {
        return this.initialValue();
    }

    @l
    protected DateFormat initialValue() {
        DateFormat dateFormat0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
        dateFormat0.setLenient(false);
        dateFormat0.setTimeZone(Util.UTC);
        return dateFormat0;
    }
}

