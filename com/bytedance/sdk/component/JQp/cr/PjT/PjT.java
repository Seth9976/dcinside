package com.bytedance.sdk.component.JQp.cr.PjT;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class PjT implements ThreadFactory {
    private final ThreadGroup PjT;
    private final AtomicInteger Zh;

    public PjT(String s) {
        this.Zh = new AtomicInteger(1);
        this.PjT = new ThreadGroup("tt_img_" + s);
    }

    @Override
    public Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(this.PjT, runnable0, "tt_img_" + this.Zh.getAndIncrement());
        if(thread0.isDaemon()) {
            thread0.setDaemon(false);
        }
        return thread0;
    }
}

