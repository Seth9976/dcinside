package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
public final class DpRect {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    @l
    public static final Companion e;
    public static final int f;

    static {
        DpRect.e = new Companion(null);
    }

    private DpRect(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public DpRect(float f, float f1, float f2, float f3, w w0) {
        this(f, f1, f2, f3);
    }

    private DpRect(long v, long v1) {
        this(DpOffset.j(v), DpOffset.l(v), Dp.g(DpOffset.j(v) + DpSize.p(v1)), Dp.g(DpOffset.l(v) + DpSize.m(v1)), null);
    }

    public DpRect(long v, long v1, w w0) {
        this(v, v1);
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    @l
    public final DpRect e(float f, float f1, float f2, float f3) {
        return new DpRect(f, f1, f2, f3, null);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DpRect)) {
            return false;
        }
        if(!Dp.l(this.a, ((DpRect)object0).a)) {
            return false;
        }
        if(!Dp.l(this.b, ((DpRect)object0).b)) {
            return false;
        }
        return Dp.l(this.c, ((DpRect)object0).c) ? Dp.l(this.d, ((DpRect)object0).d) : false;
    }

    public static DpRect f(DpRect dpRect0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = dpRect0.a;
        }
        if((v & 2) != 0) {
            f1 = dpRect0.b;
        }
        if((v & 4) != 0) {
            f2 = dpRect0.c;
        }
        if((v & 8) != 0) {
            f3 = dpRect0.d;
        }
        return dpRect0.e(f, f1, f2, f3);
    }

    public final float g() {
        return this.d;
    }

    @Stable
    public static void h() {
    }

    @Override
    public int hashCode() {
        return ((Dp.n(this.a) * 0x1F + Dp.n(this.b)) * 0x1F + Dp.n(this.c)) * 0x1F + Dp.n(this.d);
    }

    public final float i() {
        return this.a;
    }

    @Stable
    public static void j() {
    }

    public final float k() {
        return this.c;
    }

    @Stable
    public static void l() {
    }

    public final float m() {
        return this.b;
    }

    @Stable
    public static void n() {
    }

    @Override
    @l
    public String toString() {
        return "DpRect(left=" + Dp.u(this.a) + ", top=" + Dp.u(this.b) + ", right=" + Dp.u(this.c) + ", bottom=" + Dp.u(this.d) + ')';
    }
}

