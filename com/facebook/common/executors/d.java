package com.facebook.common.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import k1.n.a;
import k1.n;

@n(a.a)
public class d extends b implements h {
    public d(Executor executor0) {
        super("SerialExecutor", 1, executor0, new LinkedBlockingQueue());
    }

    @Override  // com.facebook.common.executors.b
    public void execute(Runnable runnable0) {
        synchronized(this) {
            super.execute(runnable0);
        }
    }
}

