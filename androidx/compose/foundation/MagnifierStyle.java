package androidx.compose.foundation;

import android.os.Build.VERSION;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@Stable
public final class MagnifierStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final MagnifierStyle a() {
            return MagnifierStyle.i;
        }

        @ExperimentalFoundationApi
        public static void b() {
        }

        @l
        public final MagnifierStyle c() {
            return MagnifierStyle.j;
        }

        @ExperimentalFoundationApi
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final boolean e(@l MagnifierStyle magnifierStyle0, int v) {
            L.p(magnifierStyle0, "style");
            return MagnifierKt.b(v) && !magnifierStyle0.f() && (magnifierStyle0.h() || L.g(magnifierStyle0, this.a()) || v >= 29);
        }

        public static boolean f(Companion magnifierStyle$Companion0, MagnifierStyle magnifierStyle0, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = Build.VERSION.SDK_INT;
            }
            return magnifierStyle$Companion0.e(magnifierStyle0, v);
        }
    }

    private final boolean a;
    private final long b;
    private final float c;
    private final float d;
    private final boolean e;
    private final boolean f;
    @l
    public static final Companion g;
    public static final int h;
    @l
    private static final MagnifierStyle i;
    @l
    private static final MagnifierStyle j;

    static {
        MagnifierStyle.g = new Companion(null);
        MagnifierStyle magnifierStyle0 = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 0x1F, null);
        MagnifierStyle.i = magnifierStyle0;
        MagnifierStyle.j = new MagnifierStyle(true, magnifierStyle0.b, magnifierStyle0.c, magnifierStyle0.d, magnifierStyle0.e, magnifierStyle0.f, null);
    }

    private MagnifierStyle(long v, float f, float f1, boolean z, boolean z1) {
        this(false, v, f, f1, z, z1, null);
    }

    // 去混淆评级： 低(30)
    public MagnifierStyle(long v, float f, float f1, boolean z, boolean z1, int v1, w w0) {
        this(((v1 & 1) == 0 ? v : 0x7FC000007FC00000L), ((v1 & 2) == 0 ? f : NaNf), ((v1 & 4) == 0 ? f1 : NaNf), ((v1 & 8) == 0 ? z : true), ((v1 & 16) == 0 ? z1 : false), null);
    }

    @ExperimentalFoundationApi
    public MagnifierStyle(long v, float f, float f1, boolean z, boolean z1, w w0) {
        this(v, f, f1, z, z1);
    }

    private MagnifierStyle(boolean z, long v, float f, float f1, boolean z1, boolean z2) {
        this.a = z;
        this.b = v;
        this.c = f;
        this.d = f1;
        this.e = z1;
        this.f = z2;
    }

    public MagnifierStyle(boolean z, long v, float f, float f1, boolean z1, boolean z2, w w0) {
        this(z, v, f, f1, z1, z2);
    }

    public final boolean c() {
        return this.e;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MagnifierStyle)) {
            return false;
        }
        if(this.a != ((MagnifierStyle)object0).a) {
            return false;
        }
        if(!DpSize.l(this.b, ((MagnifierStyle)object0).b)) {
            return false;
        }
        if(!Dp.l(this.c, ((MagnifierStyle)object0).c)) {
            return false;
        }
        if(!Dp.l(this.d, ((MagnifierStyle)object0).d)) {
            return false;
        }
        return this.e == ((MagnifierStyle)object0).e ? this.f == ((MagnifierStyle)object0).f : false;
    }

    public final boolean f() {
        return this.f;
    }

    public final long g() {
        return this.b;
    }

    public final boolean h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ((((c.a(this.a) * 0x1F + DpSize.r(this.b)) * 0x1F + Dp.n(this.c)) * 0x1F + Dp.n(this.d)) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f);
    }

    public final boolean i() {
        return Companion.f(MagnifierStyle.g, this, 0, 2, null);
    }

    // 去混淆评级： 低(20)
    @Override
    @l
    public String toString() {
        return this.a ? "MagnifierStyle.TextDefault" : "MagnifierStyle(size=" + DpSize.w(this.b) + ", cornerRadius=" + Dp.u(this.c) + ", elevation=" + Dp.u(this.d) + ", clippingEnabled=" + this.e + ", fishEyeEnabled=" + this.f + ')';
    }
}

