package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class SolidColor extends Brush {
    private final long c;

    private SolidColor(long v) {
        super(null);
        this.c = v;
    }

    public SolidColor(long v, w w0) {
        this(v);
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public void a(long v, @l Paint paint0, float f) {
        L.p(paint0, "p");
        paint0.j(1.0f);
        paint0.g((f == 1.0f ? this.c : Color.w(this.c, Color.A(this.c) * f, 0.0f, 0.0f, 0.0f, 14, null)));
        if(paint0.m() != null) {
            paint0.y(null);
        }
    }

    public final long c() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SolidColor ? Color.y(this.c, ((SolidColor)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return Color.K(this.c);
    }

    @Override
    @l
    public String toString() {
        return "SolidColor(value=" + Color.L(this.c) + ')';
    }
}

