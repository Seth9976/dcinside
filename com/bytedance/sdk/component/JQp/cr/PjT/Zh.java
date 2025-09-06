package com.bytedance.sdk.component.JQp.cr.PjT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Zh {
    private static final TimeUnit PjT;

    static {
        Zh.PjT = TimeUnit.SECONDS;
    }

    public static ExecutorService PjT() {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        PjT pjT0 = new PjT("default");
        ExecutorService executorService0 = new ThreadPoolExecutor(1, 2, 30L, Zh.PjT, linkedBlockingQueue0, pjT0);
        ((ThreadPoolExecutor)executorService0).allowCoreThreadTimeOut(true);
        return executorService0;
    }
}

