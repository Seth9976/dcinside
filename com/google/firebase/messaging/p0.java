package com.google.firebase.messaging;

import O1.t;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

final class p0 {
    private static final String a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long b;
    private static final Object c;
    @GuardedBy("WakeLockHolder.syncObject")
    private static WakeLock d;

    static {
        p0.b = TimeUnit.MINUTES.toMillis(1L);
        p0.c = new Object();
    }

    @t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void b(Intent intent0, long v) {
        synchronized(p0.c) {
            if(p0.d != null) {
                p0.j(intent0, true);
                p0.d.acquire(v);
            }
        }
    }

    @GuardedBy("WakeLockHolder.syncObject")
    private static void c(Context context0) {
        if(p0.d == null) {
            WakeLock wakeLock0 = new WakeLock(context0, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            p0.d = wakeLock0;
            wakeLock0.setReferenceCounted(true);
        }
    }

    static void d(@NonNull Intent intent0) {
        synchronized(p0.c) {
            if(p0.d != null && p0.f(intent0)) {
                p0.j(intent0, false);
                p0.d.release();
            }
        }
    }

    @t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void e(Context context0) {
        synchronized(p0.c) {
            p0.c(context0);
        }
    }

    @VisibleForTesting
    static boolean f(@NonNull Intent intent0) {
        return intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    // 检测为 Lambda 实现
    private static void g(Intent intent0, Task task0) [...]

    @t(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void h() {
        synchronized(p0.c) {
            p0.d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    static void i(Context context0, u0 u00, Intent intent0) {
        synchronized(p0.c) {
            p0.c(context0);
            boolean z = p0.f(intent0);
            p0.j(intent0, true);
            if(!z) {
                p0.d.acquire(p0.b);
            }
            u00.c(intent0).addOnCompleteListener((Task task0) -> p0.d(intent0));
        }
    }

    private static void j(@NonNull Intent intent0, boolean z) {
        intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static ComponentName k(@NonNull Context context0, @NonNull Intent intent0) {
        synchronized(p0.c) {
            p0.c(context0);
            boolean z = p0.f(intent0);
            p0.j(intent0, true);
            ComponentName componentName0 = context0.startService(intent0);
            if(componentName0 == null) {
                return null;
            }
            if(!z) {
                p0.d.acquire(p0.b);
            }
            return componentName0;
        }
    }
}

