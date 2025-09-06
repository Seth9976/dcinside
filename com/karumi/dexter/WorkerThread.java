package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

final class WorkerThread implements Thread {
    private final Handler handler;
    private boolean wasLooperNull;

    WorkerThread() {
        this.wasLooperNull = false;
        if(Looper.myLooper() == null) {
            this.wasLooperNull = true;
            Looper.prepare();
        }
        this.handler = new Handler();
    }

    @Override  // com.karumi.dexter.Thread
    public void execute(Runnable runnable0) {
        this.handler.post(runnable0);
    }

    @Override  // com.karumi.dexter.Thread
    public void loop() {
        if(this.wasLooperNull) {
            Looper.loop();
        }
    }
}

