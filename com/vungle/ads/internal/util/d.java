package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import y4.l;

public final class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion;
    private static final long OPERATION_TIMEOUT;

    static {
        d.Companion = new a(null);
        d.OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4L);
    }

    // 去混淆评级： 低(20)
    public final long getTimeout() {
        return v.INSTANCE.isMainThread() ? d.OPERATION_TIMEOUT : 0x7FFFFFFFFFFFFFFFL;
    }
}

