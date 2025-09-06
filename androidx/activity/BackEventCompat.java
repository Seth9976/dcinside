package androidx.activity;

import android.os.Build.VERSION;
import android.window.BackEvent;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;

public final class BackEventCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    @e(a.a)
    @f(allowedTargets = {b.l})
    public @interface SwipeEdge {
    }

    private final float a;
    private final float b;
    private final float c;
    private final int d;
    @l
    public static final Companion e = null;
    public static final int f = 0;
    public static final int g = 1;

    static {
        BackEventCompat.e = new Companion(null);
    }

    @VisibleForTesting
    public BackEventCompat(float f, float f1, @FloatRange(from = 0.0, to = 1.0) float f2, int v) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = v;
    }

    @RequiresApi(34)
    public BackEventCompat(@l BackEvent backEvent0) {
        L.p(backEvent0, "backEvent");
        this(Api34Impl.a.d(backEvent0), Api34Impl.a.e(backEvent0), Api34Impl.a.b(backEvent0), Api34Impl.a.c(backEvent0));
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    @RequiresApi(34)
    @l
    public final BackEvent e() {
        if(Build.VERSION.SDK_INT < 34) {
            throw new UnsupportedOperationException("This method is only supported on API level 34+");
        }
        return Api34Impl.a.a(this.a, this.b, this.c, this.d);
    }

    @Override
    @l
    public String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}

