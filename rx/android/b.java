package rx.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;

public abstract class b implements o {
    private final AtomicBoolean a;

    public b() {
        this.a = new AtomicBoolean();
    }

    // 检测为 Lambda 实现
    protected abstract void a();

    public static void b() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was jeb-dexdec-sb-st-12412");
        }
    }

    @Override  // rx.o
    public final boolean j() {
        return this.a.get();
    }

    @Override  // rx.o
    public final void l() {
        class a implements rx.functions.a {
            final b a;

            @Override  // rx.functions.a
            public void call() {
                b.this.a();
            }
        }

        if(this.a.compareAndSet(false, true)) {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.a();
                return;
            }
            rx.android.schedulers.a.c().a().c(() -> ;);
        }
    }
}

