package com.unity3d.services.core.request;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CancelableThreadPoolExecutor extends ThreadPoolExecutor {
    private final List _activeRunnable;

    public CancelableThreadPoolExecutor(int v, int v1, long v2, TimeUnit timeUnit0, LinkedBlockingQueue linkedBlockingQueue0) {
        super(v, v1, v2, timeUnit0, linkedBlockingQueue0);
        this._activeRunnable = new LinkedList();
    }

    @Override
    protected void afterExecute(Runnable runnable0, Throwable throwable0) {
        synchronized(this) {
            super.afterExecute(runnable0, throwable0);
            this._activeRunnable.remove(runnable0);
        }
    }

    @Override
    protected void beforeExecute(Thread thread0, Runnable runnable0) {
        synchronized(this) {
            super.beforeExecute(thread0, runnable0);
            this._activeRunnable.add(runnable0);
        }
    }

    public void cancel() {
        synchronized(this) {
            for(Object object0: this._activeRunnable) {
                Runnable runnable0 = (Runnable)object0;
                if(runnable0 instanceof WebRequestRunnable) {
                    ((WebRequestRunnable)runnable0).setCancelStatus(true);
                }
            }
        }
    }
}

