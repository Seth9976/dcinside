package com.bytedance.sdk.component.Au.ReZ;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class cr implements ThreadFactory {
    protected final ThreadGroup PjT;
    public static volatile boolean ReZ;
    protected final String Zh;
    private final AtomicInteger cr;

    public cr(String s) {
        this.cr = new AtomicInteger(1);
        this.PjT = new ThreadGroup("pag_g_" + s);
        this.Zh = "pag_" + s;
    }

    public static String PjT(String s) [...] // Inlined contents

    protected Thread PjT(ThreadGroup threadGroup0, Runnable runnable0, String s) {
        return new Thread(threadGroup0, runnable0, s);
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        if(cr.ReZ) {
            return null;
        }
        Thread thread0 = this.PjT(this.PjT, runnable0, this.Zh + "_" + this.cr.getAndIncrement());
        if(thread0.isDaemon()) {
            thread0.setDaemon(false);
        }
        return thread0;
    }
}

