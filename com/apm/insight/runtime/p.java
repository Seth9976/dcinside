package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.b.f;
import com.apm.insight.e;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class p {
    final class a implements Runnable {
        private p a;

        @Override
        public final void run() {
            while(!p.this.c.isEmpty()) {
                if(p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtFrontOfQueue(((Message)p.this.c.poll()));
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
            while(!p.this.b.isEmpty()) {
                c p$c0 = (c)p.this.b.poll();
                if(p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtTime(p$c0.a, p$c0.b);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }
    }

    final class b extends HandlerThread {
        private volatile int a;
        private volatile boolean b;
        private p c;

        b(String s) {
            super(s);
            this.a = 0;
            this.b = false;
        }

        @Override  // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized(p.this.e) {
                p.this.d = new Handler();
            }
            p.this.d.post(new a(p.this));
            while(true) {
                try {
                    Looper.loop();
                }
                catch(Throwable throwable0) {
                    try {
                        f.a(e.g()).a().c();
                        if(this.a < 5) {
                            j.a(throwable0, "NPTH_CATCH");
                        }
                        else if(!this.b) {
                            this.b = true;
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        ++this.a;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }
    }

    static final class c {
        Message a;
        long b;

        c(Message message0, long v) {
            this.a = message0;
            this.b = v;
        }
    }

    private final HandlerThread a;
    private final Queue b;
    private final Queue c;
    private volatile Handler d;
    private final Object e;

    static {
    }

    public p(String s) {
        this.b = new ConcurrentLinkedQueue();
        this.c = new ConcurrentLinkedQueue();
        this.e = new Object();
        this.a = new b(this, s);
    }

    private boolean a(Message message0, long v) {
        if(v < 0L) {
            v = 0L;
        }
        return this.b(message0, SystemClock.uptimeMillis() + v);
    }

    @Nullable
    public final Handler a() {
        return this.d;
    }

    public final boolean a(Runnable runnable0) {
        return this.a(this.b(runnable0), 0L);
    }

    public final boolean a(Runnable runnable0, long v) {
        return this.a(this.b(runnable0), v);
    }

    private Message b(Runnable runnable0) {
        return Message.obtain(this.d, runnable0);
    }

    private boolean b(Message message0, long v) {
        if(this.d == null) {
            Object object0 = this.e;
            synchronized(object0) {
                if(this.d == null) {
                    c p$c0 = new c(message0, v);
                    this.b.add(p$c0);
                    return true;
                }
            }
        }
        try {
            return this.d.sendMessageAtTime(message0, v);
        }
        catch(Throwable unused_ex) {
            return true;
        }
    }

    public final void b() {
        this.a.start();
    }

    public final HandlerThread c() {
        return this.a;
    }

    final class com.apm.insight.runtime.p.1 {
    }


    final class com.apm.insight.runtime.p.2 {
    }

}

