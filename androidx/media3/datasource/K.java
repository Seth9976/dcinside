package androidx.media3.datasource;

import android.text.TextUtils;
import com.google.common.base.c;

public final class k {
    static {
    }

    public static boolean a(String s) {
        if(s == null) {
            return false;
        }
        String s1 = c.g(s);
        return !TextUtils.isEmpty(s1) && (!s1.contains("text") || s1.contains("text/vtt")) && !s1.contains("html") && !s1.contains("xml");
    }
}

