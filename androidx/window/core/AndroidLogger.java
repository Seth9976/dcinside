package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidLogger implements Logger {
    @l
    public static final AndroidLogger a;

    static {
        AndroidLogger.a = new AndroidLogger();
    }

    @Override  // androidx.window.core.Logger
    public void a(@l String s, @l String s1) {
        L.p(s, "tag");
        L.p(s1, "message");
        Log.d(s, s1);
    }
}

