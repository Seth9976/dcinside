package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import y4.l;
import y4.m;

@SuppressSignatureCheck
public final class AndroidLog {
    @l
    public static final AndroidLog INSTANCE = null;
    private static final int MAX_LOG_LENGTH = 4000;
    @l
    private static final CopyOnWriteArraySet configuredLoggers;
    @l
    private static final Map knownLoggers;

    static {
        AndroidLog.INSTANCE = new AndroidLog();
        AndroidLog.configuredLoggers = new CopyOnWriteArraySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Class class0 = OkHttpClient.class;
        Package package0 = class0.getPackage();
        String s = package0 == null ? null : package0.getName();
        if(s != null) {
            linkedHashMap0.put(s, "OkHttp");
        }
        String s1 = class0.getName();
        L.o(s1, "OkHttpClient::class.java.name");
        linkedHashMap0.put(s1, "okhttp.OkHttpClient");
        L.o("okhttp3.internal.http2.Http2", "Http2::class.java.name");
        linkedHashMap0.put("okhttp3.internal.http2.Http2", "okhttp.Http2");
        L.o("okhttp3.internal.concurrent.TaskRunner", "TaskRunner::class.java.name");
        linkedHashMap0.put("okhttp3.internal.concurrent.TaskRunner", "okhttp.TaskRunner");
        linkedHashMap0.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        AndroidLog.knownLoggers = Y.D0(linkedHashMap0);
    }

    public final void androidLog$okhttp(@l String s, int v, @l String s1, @m Throwable throwable0) {
        L.p(s, "loggerName");
        L.p(s1, "message");
        String s2 = this.loggerTag(s);
        if(Log.isLoggable(s2, v)) {
            if(throwable0 != null) {
                s1 = s1 + '\n' + Log.getStackTraceString(throwable0);
            }
            int v1 = s1.length();
            for(int v2 = 0; v2 < v1; v2 = v4 + 1) {
                int v3 = v.r3(s1, '\n', v2, false, 4, null);
                if(v3 == -1) {
                    v3 = v1;
                }
                while(true) {
                    int v4 = Math.min(v3, v2 + 4000);
                    String s3 = s1.substring(v2, v4);
                    L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(v, s2, s3);
                    if(v4 >= v3) {
                        break;
                    }
                    v2 = v4;
                }
            }
        }
    }

    public final void enable() {
        for(Object object0: AndroidLog.knownLoggers.entrySet()) {
            this.enableLogging(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
    }

    private final void enableLogging(String s, String s1) {
        Level level0;
        Logger logger0 = Logger.getLogger(s);
        if(AndroidLog.configuredLoggers.add(logger0)) {
            logger0.setUseParentHandlers(false);
            if(Log.isLoggable(s1, 3)) {
                level0 = Level.FINE;
            }
            else {
                level0 = Log.isLoggable(s1, 4) ? Level.INFO : Level.WARNING;
            }
            logger0.setLevel(level0);
            logger0.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String s) {
        String s1 = (String)AndroidLog.knownLoggers.get(s);
        return s1 == null ? v.Z8(s, 23) : s1;
    }
}

