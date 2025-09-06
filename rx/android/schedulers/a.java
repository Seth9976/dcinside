package rx.android.schedulers;

import D4.b;
import android.os.Looper;
import androidx.compose.animation.core.d;
import java.util.concurrent.atomic.AtomicReference;
import rx.j;

public final class a {
    private final j a;
    private static final AtomicReference b;

    static {
        a.b = new AtomicReference();
    }

    private a() {
        j j0 = rx.android.plugins.a.a().b().b();
        if(j0 != null) {
            this.a = j0;
            return;
        }
        this.a = new c(Looper.getMainLooper());
    }

    public static j a(Looper looper0) {
        if(looper0 == null) {
            throw new NullPointerException("looper == null");
        }
        return new c(looper0);
    }

    private static a b() {
        a a1;
        do {
            AtomicReference atomicReference0 = a.b;
            a a0 = (a)atomicReference0.get();
            if(a0 != null) {
                return a0;
            }
            a1 = new a();
        }
        while(!d.a(atomicReference0, null, a1));
        return a1;
    }

    public static j c() {
        return a.b().a;
    }

    @b
    public static void d() {
        a.b.set(null);
    }
}

