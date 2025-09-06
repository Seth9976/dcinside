package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class NetworkQualityThroughputListener {
    private final Executor mExecutor;

    public NetworkQualityThroughputListener(Executor executor0) {
        if(executor0 == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor0;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onThroughputObservation(int arg1, long arg2, int arg3);
}

