package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidLogHandler extends Handler {
    @l
    public static final AndroidLogHandler INSTANCE;

    static {
        AndroidLogHandler.INSTANCE = new AndroidLogHandler();
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(@l LogRecord logRecord0) {
        L.p(logRecord0, "record");
        String s = logRecord0.getLoggerName();
        L.o(s, "record.loggerName");
        int v = AndroidLogKt.getAndroidLevel(logRecord0);
        String s1 = logRecord0.getMessage();
        L.o(s1, "record.message");
        Throwable throwable0 = logRecord0.getThrown();
        AndroidLog.INSTANCE.androidLog$okhttp(s, v, s1, throwable0);
    }
}

