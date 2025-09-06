package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class RadialGradient extends ShaderBrush {
    @l
    private final List e;
    @m
    private final List f;
    private final long g;
    private final float h;
    private final int i;

    private RadialGradient(List list0, List list1, long v, float f, int v1) {
        this.e = list0;
        this.f = list1;
        this.g = v;
        this.h = f;
        this.i = v1;
    }

    public RadialGradient(List list0, List list1, long v, float f, int v1, int v2, w w0) {
        this(list0, ((v2 & 2) == 0 ? list1 : null), v, f, ((v2 & 16) == 0 ? v1 : 0), null);
    }

    public RadialGradient(List list0, List list1, long v, float f, int v1, w w0) {
        this(list0, list1, v, f, v1);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.ui.graphics.Brush
    public long b() {
        return Float.isInfinite(this.h) || Float.isNaN(this.h) ? 0x7FC000007FC00000L : SizeKt.a(this.h * 2.0f, this.h * 2.0f);
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @l
    public Shader c(long v) {
        float f1;
        float f;
        if(OffsetKt.f(this.g)) {
            long v1 = SizeKt.b(v);
            f = Offset.p(v1);
            f1 = Offset.r(v1);
        }
        else {
            f = Offset.p(this.g) == Infinityf ? Size.t(v) : Offset.p(this.g);
            f1 = Offset.r(this.g) == Infinityf ? Size.m(v) : Offset.r(this.g);
        }
        long v2 = OffsetKt.a(f, f1);
        return this.h == Infinityf ? ShaderKt.e(v2, Size.q(v) / 2.0f, this.e, this.f, this.i) : ShaderKt.e(v2, this.h, this.e, this.f, this.i);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RadialGradient)) {
            return false;
        }
        if(!L.g(this.e, ((RadialGradient)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((RadialGradient)object0).f)) {
            return false;
        }
        return Offset.l(this.g, ((RadialGradient)object0).g) ? this.h == ((RadialGradient)object0).h && TileMode.h(this.i, ((RadialGradient)object0).i) : false;
    }

    @Override
    public int hashCode() {
        int v = this.e.hashCode();
        return this.f == null ? ((v * 961 + Offset.s(this.g)) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + this.i : (((v * 0x1F + this.f.hashCode()) * 0x1F + Offset.s(this.g)) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + this.i;
    }

    @Override
    @l
    public String toString() {
        String s = "";
        String s1 = OffsetKt.d(this.g) ? "center=" + Offset.y(this.g) + ", " : "";
        if(!Float.isInfinite(this.h) && !Float.isNaN(this.h)) {
            s = "radius=" + this.h + ", ";
        }
        return "RadialGradient(colors=" + this.e + ", stops=" + this.f + ", " + s1 + s + "tileMode=" + TileMode.j(this.i) + ')';
    }
}

