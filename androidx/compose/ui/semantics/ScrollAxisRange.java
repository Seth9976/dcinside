package androidx.compose.ui.semantics;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class ScrollAxisRange {
    @l
    private final a a;
    @l
    private final a b;
    private final boolean c;
    public static final int d;

    static {
    }

    public ScrollAxisRange(@l a a0, @l a a1, boolean z) {
        L.p(a0, "value");
        L.p(a1, "maxValue");
        super();
        this.a = a0;
        this.b = a1;
        this.c = z;
    }

    public ScrollAxisRange(a a0, a a1, boolean z, int v, w w0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(a0, a1, z);
    }

    @l
    public final a a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    @l
    public final a c() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "ScrollAxisRange(value=" + ((Number)this.a.invoke()).floatValue() + ", maxValue=" + ((Number)this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}

