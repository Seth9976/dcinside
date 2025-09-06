package rx.android.plugins;

import androidx.compose.animation.core.d;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    private final AtomicReference a;
    private static final a b;

    static {
        a.b = new a();
    }

    a() {
        this.a = new AtomicReference();
    }

    public static a a() {
        return a.b;
    }

    public b b() {
        if(this.a.get() == null) {
            b b0 = b.a();
            d.a(this.a, null, b0);
        }
        return (b)this.a.get();
    }

    public void c(b b0) {
        if(!d.a(this.a, null, b0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.a.get());
        }
    }

    @D4.b
    public void d() {
        this.a.set(null);
    }
}

