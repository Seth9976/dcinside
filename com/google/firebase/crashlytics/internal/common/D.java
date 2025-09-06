package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

public abstract class d implements Runnable {
    protected abstract void a();

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.a();
    }
}

