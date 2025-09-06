package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class BorderStroke {
    private final float a;
    @l
    private final Brush b;
    public static final int c;

    static {
    }

    private BorderStroke(float f, Brush brush0) {
        this.a = f;
        this.b = brush0;
    }

    public BorderStroke(float f, Brush brush0, w w0) {
        this(f, brush0);
    }

    @l
    public final BorderStroke a(float f, @l Brush brush0) {
        L.p(brush0, "brush");
        return new BorderStroke(f, brush0, null);
    }

    public static BorderStroke b(BorderStroke borderStroke0, float f, Brush brush0, int v, Object object0) {
        if((v & 1) != 0) {
            f = borderStroke0.a;
        }
        if((v & 2) != 0) {
            brush0 = borderStroke0.b;
        }
        return borderStroke0.a(f, brush0);
    }

    @l
    public final Brush c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BorderStroke)) {
            return false;
        }
        return Dp.l(this.a, ((BorderStroke)object0).a) ? L.g(this.b, ((BorderStroke)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return Dp.n(this.a) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "BorderStroke(width=" + Dp.u(this.a) + ", brush=" + this.b + ')';
    }
}

