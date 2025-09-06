package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class AndroidLogKt {
    private static final int getAndroidLevel(LogRecord logRecord0) {
        int v = logRecord0.getLevel().intValue();
        Level level0 = Level.INFO;
        if(v > level0.intValue()) {
            return 5;
        }
        return logRecord0.getLevel().intValue() == level0.intValue() ? 4 : 3;
    }
}

