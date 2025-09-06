package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager.MemoryInfo;

public final class i {
    static class a {
        private a() {
        }

        a(byte b) {
        }

        public long a(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
            return 0L;
        }
    }

    @TargetApi(16)
    static final class b extends a {
        private b() {
            super(0);
        }

        b(byte b) {
        }

        @Override  // com.apm.insight.l.i$a
        public final long a(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
            return activityManager$MemoryInfo0.totalMem;
        }
    }

    private static a a;

    static {
        i.a = new b(0);
    }

    public static long a(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
        return i.a.a(activityManager$MemoryInfo0);
    }
}

