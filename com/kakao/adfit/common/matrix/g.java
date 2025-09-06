package com.kakao.adfit.common.matrix;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.kakao.adfit.common.matrix.exception.ExceptionMechanismException;
import com.kakao.adfit.h.b;
import com.kakao.adfit.i.i;
import com.kakao.adfit.m.f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class g implements Thread.UncaughtExceptionHandler {
    static final class a implements b {
        private final long a;
        private final CountDownLatch b;

        public a(long v) {
            this.a = v;
            this.b = new CountDownLatch(1);
        }

        @Override  // com.kakao.adfit.h.b
        public void a() {
            this.b.countDown();
        }

        public boolean b() {
            try {
                return this.b.await(this.a, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                f.b("Exception while awaiting for flush in UncaughtExceptionHint", interruptedException0);
                Thread.currentThread().interrupt();
                return false;
            }
        }
    }

    private final AtomicBoolean a;
    private Thread.UncaughtExceptionHandler b;
    private String c;

    public g() {
        this.a = new AtomicBoolean(false);
    }

    // 检测为 Lambda 实现
    private final void a() [...]

    private final boolean a(Throwable throwable0) {
        String s = this.c;
        while(throwable0 != null) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            if(arr_stackTraceElement != null) {
                int v = arr_stackTraceElement.length;
                for(int v1 = 0; v1 < v; ++v1) {
                    String s1 = arr_stackTraceElement[v1].getClassName();
                    if(s1 != null) {
                        L.o(s1, "element.className ?: return@forEach");
                        if(v.v2(s1, "com.kakao.adfit", false, 2, null)) {
                            return true;
                        }
                        if(s != null && v.v2(s1, s, false, 2, null)) {
                            return false;
                        }
                    }
                }
            }
            throwable0 = throwable0.getCause();
        }
        return false;
    }

    public final void a(Context context0) {
        L.p(context0, "context");
        if(this.a.get()) {
            return;
        }
        this.c = "com.dcinside.app.android";
        new Handler(Looper.getMainLooper()).post(() -> if(this.a.compareAndSet(false, true)) {
            this.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        });
    }

    @Override
    public void uncaughtException(Thread thread0, Throwable throwable0) {
        c c1;
        L.p(thread0, "thread");
        L.p(throwable0, "e");
        f.c(("Uncaught exception received. " + throwable0));
        c c0 = c.a;
        if(c0.c() && this.a(throwable0)) {
            try {
                ExceptionMechanismException exceptionMechanismException0 = new ExceptionMechanismException(new i("UncaughtExceptionHandler", Boolean.FALSE), throwable0, thread0);
                e e0 = com.kakao.adfit.common.matrix.e.a.a(e.t, null, exceptionMechanismException0, MatrixLevel.FATAL, 1, null);
                a g$a0 = new a(1000L);
                c0.a(e0, g$a0);
                if(!g$a0.b()) {
                    f.e(("Timed out waiting to flush event to disk before crashing. Event: " + e0.g()));
                }
            }
            catch(Exception unused_ex) {
                f.b("Error sending uncaught exception to Matrix.", throwable0);
            }
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.b;
        if(thread$UncaughtExceptionHandler0 != null) {
            try {
                c1 = c.a;
                thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            }
            catch(Throwable throwable1) {
                throw c1.b(throwable1);
            }
        }
    }
}

