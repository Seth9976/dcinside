package androidx.core.provider;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({Scope.c})
@Deprecated
public class SelfDestructiveThread {
    public interface ReplyCallback {
        void a(Object arg1);
    }

    private final Object a;
    @GuardedBy("mLock")
    private HandlerThread b;
    @GuardedBy("mLock")
    private Handler c;
    @GuardedBy("mLock")
    private int d;
    private Handler.Callback e;
    private final int f;
    private final int g;
    private final String h;
    private static final int i = 1;
    private static final int j;

    public SelfDestructiveThread(String s, int v, int v1) {
        this.a = new Object();
        this.e = new Handler.Callback() {
            final SelfDestructiveThread a;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                switch(message0.what) {
                    case 0: {
                        SelfDestructiveThread.this.c();
                        return true;
                    }
                    case 1: {
                        SelfDestructiveThread.this.d(((Runnable)message0.obj));
                        return true;
                    }
                    default: {
                        return true;
                    }
                }
            }
        };
        this.h = s;
        this.g = v;
        this.f = v1;
        this.d = 0;
    }

    @VisibleForTesting
    public int a() {
        synchronized(this.a) {
        }
        return this.d;
    }

    @VisibleForTesting
    public boolean b() {
        synchronized(this.a) {
        }
        return this.b != null;
    }

    void c() {
        synchronized(this.a) {
            if(this.c.hasMessages(1)) {
                return;
            }
            this.b.quit();
            this.b = null;
            this.c = null;
        }
    }

    void d(Runnable runnable0) {
        runnable0.run();
        synchronized(this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), ((long)this.f));
        }
    }

    private void e(Runnable runnable0) {
        synchronized(this.a) {
            if(this.b == null) {
                HandlerThread handlerThread0 = new HandlerThread(this.h, this.g);
                this.b = handlerThread0;
                handlerThread0.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                ++this.d;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable0));
        }
    }

    public void f(Callable callable0, ReplyCallback selfDestructiveThread$ReplyCallback0) {
        this.e(new Runnable() {
            final SelfDestructiveThread d;

            @Override
            public void run() {
                Object object0 = null;
                try {
                    object0 = callable0.call();
                }
                catch(Exception unused_ex) {
                }
                androidx.core.provider.SelfDestructiveThread.2.1 selfDestructiveThread$2$10 = new Runnable() {
                    final androidx.core.provider.SelfDestructiveThread.2 b;

                    @Override
                    public void run() {
                        androidx.core.provider.SelfDestructiveThread.2.this.c.a(object0);
                    }
                };
                CalleeHandler.a().post(selfDestructiveThread$2$10);
            }
        });
    }

    public Object g(Callable callable0, int v) throws InterruptedException {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        Condition condition0 = reentrantLock0.newCondition();
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
        this.e(new Runnable() {
            final SelfDestructiveThread f;

            @Override
            public void run() {
                try {
                    Object object0 = callable0.call();
                    atomicReference0.set(object0);
                }
                catch(Exception unused_ex) {
                }
                reentrantLock0.lock();
                try {
                    atomicBoolean0.set(false);
                    condition0.signal();
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
        });
        reentrantLock0.lock();
        try {
            if(!atomicBoolean0.get()) {
                return atomicReference0.get();
            }
            long v2 = TimeUnit.MILLISECONDS.toNanos(((long)v));
            do {
                try {
                    v2 = condition0.awaitNanos(v2);
                }
                catch(InterruptedException unused_ex) {
                }
                if(!atomicBoolean0.get()) {
                    return atomicReference0.get();
                }
            }
            while(v2 > 0L);
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new InterruptedException("timeout");
    }
}

