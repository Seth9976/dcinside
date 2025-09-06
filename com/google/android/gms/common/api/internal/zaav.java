package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

abstract class zaav implements Runnable {
    final zaaw zab;

    zaav(zaaw zaaw0, zaau zaau0) {
        this.zab = zaaw0;
        super();
    }

    @Override
    @WorkerThread
    public final void run() {
        this.zab.zab.lock();
        try {
            if(!Thread.interrupted()) {
                this.zaa();
            }
        }
        catch(RuntimeException runtimeException0) {
            this.zab.zaa.zam(runtimeException0);
        }
        finally {
            this.zab.zab.unlock();
        }
    }

    @WorkerThread
    protected abstract void zaa();
}

