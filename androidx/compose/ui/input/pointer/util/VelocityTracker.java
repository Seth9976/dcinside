package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.VelocityKt;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VelocityTracker {
    @l
    private final VelocityTracker1D a;
    @l
    private final VelocityTracker1D b;
    private long c;
    public static final int d = 8;

    static {
    }

    public VelocityTracker() {
        this.a = new VelocityTracker1D(false, null, 3, null);
        this.b = new VelocityTracker1D(false, null, 3, null);
        this.c = 0L;
    }

    public final void a(long v, long v1) {
        float f = Offset.p(v1);
        this.a.a(v, f);
        float f1 = Offset.r(v1);
        this.b.a(v, f1);
    }

    public final long b() {
        return VelocityKt.a(this.a.c(), this.b.c());
    }

    public final long c() {
        return this.c;
    }

    public final void d() {
        this.a.e();
        this.b.e();
    }

    public final void e(long v) {
        this.c = v;
    }
}

