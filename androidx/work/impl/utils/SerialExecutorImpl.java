package androidx.work.impl.utils;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class SerialExecutorImpl implements SerialExecutor {
    static class Task implements Runnable {
        final SerialExecutorImpl a;
        final Runnable b;

        Task(@NonNull SerialExecutorImpl serialExecutorImpl0, @NonNull Runnable runnable0) {
            this.a = serialExecutorImpl0;
            this.b = runnable0;
        }

        @Override
        public void run() {
            try {
                this.b.run();
            }
            finally {
                synchronized(this.a.d) {
                    this.a.b();
                }
            }
        }
    }

    private final ArrayDeque a;
    private final Executor b;
    @GuardedBy("mLock")
    private Runnable c;
    final Object d;

    public SerialExecutorImpl(@NonNull Executor executor0) {
        this.b = executor0;
        this.a = new ArrayDeque();
        this.d = new Object();
    }

    @NonNull
    @VisibleForTesting
    public Executor a() {
        return this.b;
    }

    @GuardedBy("mLock")
    void b() {
        Runnable runnable0 = (Runnable)this.a.poll();
        this.c = runnable0;
        if(runnable0 != null) {
            this.b.execute(runnable0);
        }
    }

    @Override
    public void execute(@NonNull Runnable runnable0) {
        synchronized(this.d) {
            Task serialExecutorImpl$Task0 = new Task(this, runnable0);
            this.a.add(serialExecutorImpl$Task0);
            if(this.c == null) {
                this.b();
            }
        }
    }

    @Override  // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean l1() {
        synchronized(this.d) {
        }
        return !this.a.isEmpty();
    }
}

