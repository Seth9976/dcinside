package com.bytedance.sdk.component.JQp.PjT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ReZ {
    private static final TimeUnit PjT;

    static {
        ReZ.PjT = TimeUnit.SECONDS;
    }

    public static ExecutorService PjT() {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        PjT pjT0 = new PjT("default");
        ExecutorService executorService0 = new ThreadPoolExecutor(1, 2, 30L, ReZ.PjT, linkedBlockingQueue0, pjT0);
        ((ThreadPoolExecutor)executorService0).allowCoreThreadTimeOut(true);
        return executorService0;
    }
}

