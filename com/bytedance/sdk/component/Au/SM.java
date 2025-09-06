package com.bytedance.sdk.component.Au;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class SM implements ThreadFactory {
    protected final ThreadGroup PjT;
    protected int ReZ;
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    protected final String Zh;
    private final AtomicInteger cr;
    public static volatile boolean sCrashHappened;

    public SM(int v, String s) {
        this.cr = new AtomicInteger(1);
        this.ReZ = v;
        this.PjT = new ThreadGroup("csj_g_" + s);
        this.Zh = "csj_" + s;
    }

    public SM(String s) {
        this(5, s);
    }

    protected Thread PjT(ThreadGroup threadGroup0, Runnable runnable0, String s) {
        return new Thread(threadGroup0, runnable0, s);
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        if(SM.sCrashHappened) {
            return null;
        }
        Thread thread0 = this.PjT(this.PjT, runnable0, this.Zh + this.cr.getAndIncrement());
        if(thread0.isDaemon()) {
            thread0.setDaemon(false);
        }
        if(this.ReZ > 10 || this.ReZ <= 0) {
            this.ReZ = 5;
        }
        thread0.setPriority(this.ReZ);
        return thread0;
    }
}

