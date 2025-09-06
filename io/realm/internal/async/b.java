package io.realm.internal.async;

import android.os.Process;

public class b implements Runnable {
    private final Runnable a;

    b(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override
    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}

