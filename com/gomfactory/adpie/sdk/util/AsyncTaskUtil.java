package com.gomfactory.adpie.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncTaskUtil {
    private ExecutorService executor;
    private Handler handler;

    public AsyncTaskUtil() {
        this.executor = Executors.newSingleThreadExecutor();
        this.handler = new Handler(Looper.getMainLooper());
    }

    public void doInBackground() {
    }

    public void doInUiThread() {
    }

    public void execute() {
        this.executor.execute(new Runnable() {
            @Override
            public void run() {
                AsyncTaskUtil.this.doInBackground();
                AsyncTaskUtil.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        AsyncTaskUtil.this.doInUiThread();
                    }
                });
            }
        });
    }
}

