package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

final class MainThread implements Thread {
    @Override  // com.karumi.dexter.Thread
    public void execute(Runnable runnable0) {
        if(MainThread.runningMainThread()) {
            runnable0.run();
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable0);
    }

    @Override  // com.karumi.dexter.Thread
    public void loop() {
    }

    private static boolean runningMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}

