package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements c {
    private final AtomicBoolean a;

    public a() {
        this.a = new AtomicBoolean();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get();
    }

    // 检测为 Lambda 实现
    protected abstract void b();

    public static void c() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was jeb-dexdec-sb-st-11840");
        }
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        class io.reactivex.android.a.a implements Runnable {
            final a a;

            @Override
            public void run() {
                a.this.b();
            }
        }

        if(this.a.compareAndSet(false, true)) {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.b();
                return;
            }
            b.c().f(() -> ;);
        }
    }
}

