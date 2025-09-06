package com.google.firebase.concurrent;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jeb.synthetic.FIN;
import o3.a;

final class O implements Executor {
    final class b implements Runnable {
        @a
        Runnable a;
        final O b;

        private b() {
        }

        b(com.google.firebase.concurrent.O.a o$a0) {
        }

        private void a() {
            int v;
            boolean z = false;
            boolean z1 = false;
            while(true) {
                try {
                label_2:
                    Deque deque0 = O.this.b;
                    __monitor_enter(deque0);
                    v = FIN.finallyOpen$NT();
                    if(!z) {
                        c o$c0 = c.d;
                        if(O.this.c != o$c0) {
                            O.d(O.this);
                            O.this.c = o$c0;
                            z = true;
                            goto label_18;
                        }
                        FIN.finallyCodeBegin$NT(v);
                        __monitor_exit(deque0);
                        FIN.finallyCodeEnd$NT(v);
                        if(z1) {
                            goto label_16;
                        }
                        return;
                    }
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_16:
                Thread.currentThread().interrupt();
                return;
                try {
                label_18:
                    Runnable runnable0 = (Runnable)O.this.b.poll();
                    this.a = runnable0;
                    if(runnable0 == null) {
                        O.this.c = c.a;
                        FIN.finallyExec$NT(v);
                        if(z1) {
                            goto label_24;
                        }
                        return;
                    }
                    goto label_26;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_24:
                Thread.currentThread().interrupt();
                return;
                try {
                label_26:
                    FIN.finallyExec$NT(v);
                    z1 |= Thread.interrupted();
                    try {
                        this.a.run();
                    }
                    catch(RuntimeException runtimeException0) {
                        O.f.log(Level.SEVERE, "Exception while executing runnable " + this.a, runtimeException0);
                    }
                    finally {
                        this.a = null;
                    }
                    goto label_2;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            if(z1) {
                Thread.currentThread().interrupt();
            }
            throw throwable0;
        }

        @Override
        public void run() {
            try {
                this.a();
            }
            catch(Error error0) {
                Deque deque0 = O.this.b;
                synchronized(deque0) {
                    O.this.c = c.a;
                }
                throw error0;
            }
        }

        @Override
        public String toString() {
            return this.a == null ? "SequentialExecutorWorker{state=" + O.this.c + "}" : "SequentialExecutorWorker{running=" + this.a + "}";
        }
    }

    static enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING;

        private static c[] a() [...] // Inlined contents
    }

    private final Executor a;
    @GuardedBy("queue")
    private final Deque b;
    @GuardedBy("queue")
    private c c;
    @GuardedBy("queue")
    private long d;
    private final b e;
    private static final Logger f;

    static {
        O.f = Logger.getLogger("com.google.firebase.concurrent.O");
    }

    O(Executor executor0) {
        this.b = new ArrayDeque();
        this.c = c.a;
        this.d = 0L;
        this.e = new b(this, null);
        this.a = (Executor)Preconditions.checkNotNull(executor0);
    }

    static long d(O o0) {
        long v = o0.d;
        o0.d = v + 1L;
        return v;
    }

    @Override
    public void execute(Runnable runnable0) {
        class com.google.firebase.concurrent.O.a implements Runnable {
            final Runnable a;
            final O b;

            com.google.firebase.concurrent.O.a(Runnable runnable0) {
                this.a = runnable0;
                super();
            }

            @Override
            public void run() {
                this.a.run();
            }

            @Override
            public String toString() {
                return this.a.toString();
            }
        }

        Preconditions.checkNotNull(runnable0);
        synchronized(this.b) {
            c o$c0 = this.c;
            if(o$c0 != c.d) {
                c o$c1 = c.c;
                if(o$c0 != o$c1) {
                    long v1 = this.d;
                    com.google.firebase.concurrent.O.a o$a0 = new com.google.firebase.concurrent.O.a(this, runnable0);
                    this.b.add(o$a0);
                    c o$c2 = c.b;
                    this.c = o$c2;
                    try {
                        this.a.execute(this.e);
                    }
                    catch(RuntimeException | Error runtimeException0) {
                        synchronized(this.b) {
                            if(runtimeException0 instanceof RejectedExecutionException && (this.c != c.a && this.c != c.b || !this.b.removeLastOccurrence(o$a0))) {
                                return;
                            }
                        }
                        throw runtimeException0;
                    }
                    if(this.c != o$c2) {
                        return;
                    }
                    synchronized(this.b) {
                        if(this.d == v1 && this.c == o$c2) {
                            this.c = o$c1;
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable0);
        }
    }

    @Override
    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}

