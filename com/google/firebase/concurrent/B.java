package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import o3.h;

class b implements ThreadFactory {
    private final AtomicLong a;
    private final String b;
    private final int c;
    private final StrictMode.ThreadPolicy d;
    private static final ThreadFactory e;

    static {
        b.e = Executors.defaultThreadFactory();
    }

    b(String s, int v, @h StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        this.a = new AtomicLong();
        this.b = s;
        this.c = v;
        this.d = strictMode$ThreadPolicy0;
    }

    // 检测为 Lambda 实现
    private void b(Runnable runnable0) [...]

    @Override
    public Thread newThread(Runnable runnable0) {
        a a0 = () -> {
            Process.setThreadPriority(this.c);
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = this.d;
            if(strictMode$ThreadPolicy0 != null) {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            runnable0.run();
        };
        Thread thread0 = b.e.newThread(a0);
        Locale locale0 = Locale.ROOT;
        Long long0 = this.a.getAndIncrement();
        thread0.setName(String.format(locale0, "%s Thread #%d", this.b, long0));
        return thread0;
    }
}

