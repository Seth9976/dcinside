package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.a;
import s3.e;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public class SplitRule extends EmbeddingRule {
    @RequiresApi(30)
    public static final class Api30Impl {
        @l
        public static final Api30Impl a;

        static {
            Api30Impl.a = new Api30Impl();
        }

        @DoNotInline
        @l
        public final Rect a(@l WindowMetrics windowMetrics0) {
            L.p(windowMetrics0, "windowMetrics");
            Rect rect0 = windowMetrics0.getBounds();
            L.o(rect0, "windowMetrics.bounds");
            return rect0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface LayoutDir {
    }

    private final int a;
    private final int b;
    private final float c;
    private final int d;

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public SplitRule(int v, int v1, float f, int v2) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = v2;
    }

    public SplitRule(int v, int v1, float f, int v2, int v3, w w0) {
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            f = 0.5f;
        }
        if((v3 & 8) != 0) {
            v2 = 3;
        }
        this(v, v1, f, v2);
    }

    public final boolean a(@l WindowMetrics windowMetrics0) {
        L.p(windowMetrics0, "parentMetrics");
        if(Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rect0 = Api30Impl.a.a(windowMetrics0);
        return (this.a == 0 || rect0.width() >= this.a) && (this.b == 0 || Math.min(rect0.width(), rect0.height()) >= this.b);
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final float e() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitRule)) {
            return false;
        }
        if(this.a != ((SplitRule)object0).a) {
            return false;
        }
        return this.b == ((SplitRule)object0).b ? this.c == ((SplitRule)object0).c && this.d == ((SplitRule)object0).d : false;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + this.d;
    }
}

