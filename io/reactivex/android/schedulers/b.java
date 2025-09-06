package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.reactivex.J;
import java.util.concurrent.Callable;

public final class b {
    static final class a implements Callable {
        public J a() throws Exception {
            return io.reactivex.android.schedulers.b.b.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class io.reactivex.android.schedulers.b.b {
        static final J a;

        static {
            io.reactivex.android.schedulers.b.b.a = new c(new Handler(Looper.getMainLooper()), false);
        }
    }

    private static final J a;

    static {
        b.a = io.reactivex.android.plugins.a.f(new a());
    }

    private b() {
        throw new AssertionError("No instances.");
    }

    public static J a(Looper looper0) {
        return b.b(looper0, false);
    }

    @SuppressLint({"NewApi"})
    public static J b(Looper looper0, boolean z) {
        if(looper0 == null) {
            throw new NullPointerException("looper == null");
        }
        if(z && Build.VERSION.SDK_INT < 22) {
            Message message0 = Message.obtain();
            try {
                message0.setAsynchronous(true);
            }
            catch(NoSuchMethodError unused_ex) {
                z = false;
            }
            message0.recycle();
        }
        return new c(new Handler(looper0), z);
    }

    public static J c() {
        return io.reactivex.android.plugins.a.g(b.a);
    }
}

