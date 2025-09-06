package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class HttpUtil {
    private static final String a = "HttpUtil";
    private static final Pattern b;
    private static final Pattern c;

    static {
        HttpUtil.b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        HttpUtil.c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }

    @Nullable
    public static String a(long v, long v1) {
        if(v == 0L && v1 == -1L) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("bytes=");
        stringBuilder0.append(v);
        stringBuilder0.append("-");
        if(v1 != -1L) {
            stringBuilder0.append(v + v1 - 1L);
        }
        return stringBuilder0.toString();
    }

    public static long b(@Nullable String s, @Nullable String s1) {
        long v;
        if(TextUtils.isEmpty(s)) {
            v = -1L;
        }
        else {
            try {
                v = Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                Log.d("HttpUtil", "Unexpected Content-Length [" + s + "]");
                v = -1L;
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            Matcher matcher0 = HttpUtil.b.matcher(s1);
            if(matcher0.matches()) {
                try {
                    long v1 = Long.parseLong(((String)Assertions.g(matcher0.group(2)))) - Long.parseLong(((String)Assertions.g(matcher0.group(1)))) + 1L;
                    if(v < 0L) {
                        return v1;
                    }
                    if(v != v1) {
                        Log.n("HttpUtil", "Inconsistent headers [" + s + "] [" + s1 + "]");
                        return Math.max(v, v1);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    Log.d("HttpUtil", "Unexpected Content-Range [" + s1 + "]");
                }
            }
        }
        return v;
    }

    public static long c(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        Matcher matcher0 = HttpUtil.c.matcher(s);
        return matcher0.matches() ? Long.parseLong(((String)Assertions.g(matcher0.group(1)))) : -1L;
    }
}

