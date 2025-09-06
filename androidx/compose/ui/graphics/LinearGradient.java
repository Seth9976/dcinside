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
public final class LinearGradient extends ShaderBrush {
    @l
    private final List e;
    @m
    private final List f;
    private final long g;
    private final long h;
    private final int i;

    private LinearGradient(List list0, List list1, long v, long v1, int v2) {
        this.e = list0;
        this.f = list1;
        this.g = v;
        this.h = v1;
        this.i = v2;
    }

    public LinearGradient(List list0, List list1, long v, long v1, int v2, int v3, w w0) {
        this(list0, ((v3 & 2) == 0 ? list1 : null), v, v1, ((v3 & 16) == 0 ? v2 : 0), null);
    }

    public LinearGradient(List list0, List list1, long v, long v1, int v2, w w0) {
        this(list0, list1, v, v1, v2);
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public long b() {
        float f3;
        float f = Offset.p(this.g);
        float f1 = NaNf;
        if(Float.isInfinite(f) || Float.isNaN(f)) {
            f3 = NaNf;
        }
        else {
            float f2 = Offset.p(this.h);
            f3 = Float.isInfinite(f2) || Float.isNaN(f2) ? NaNf : Math.abs(Offset.p(this.g) - Offset.p(this.h));
        }
        float f4 = Offset.r(this.g);
        if(!Float.isInfinite(f4) && !Float.isNaN(f4)) {
            float f5 = Offset.r(this.h);
            if(!Float.isInfinite(f5) && !Float.isNaN(f5)) {
                f1 = Math.abs(Offset.r(this.g) - Offset.r(this.h));
            }
        }
        return SizeKt.a(f3, f1);
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @l
    public Shader c(long v) {
        float f = Offset.p(this.g) == Infinityf ? Size.t(v) : Offset.p(this.g);
        float f1 = Offset.r(this.g) == Infinityf ? Size.m(v) : Offset.r(this.g);
        float f2 = Offset.p(this.h) == Infinityf ? Size.t(v) : Offset.p(this.h);
        return Offset.r(this.h) == Infinityf ? ShaderKt.c(OffsetKt.a(f, f1), OffsetKt.a(f2, Size.m(v)), this.e, this.f, this.i) : ShaderKt.c(OffsetKt.a(f, f1), OffsetKt.a(f2, Offset.r(this.h)), this.e, this.f, this.i);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinearGradient)) {
            return false;
        }
        if(!L.g(this.e, ((LinearGradient)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((LinearGradient)object0).f)) {
            return false;
        }
        if(!Offset.l(this.g, ((LinearGradient)object0).g)) {
            return false;
        }
        return Offset.l(this.h, ((LinearGradient)object0).h) ? TileMode.h(this.i, ((LinearGradient)object0).i) : false;
    }

    @Override
    public int hashCode() {
        int v = this.e.hashCode();
        return this.f == null ? ((v * 961 + Offset.s(this.g)) * 0x1F + Offset.s(this.h)) * 0x1F + this.i : (((v * 0x1F + this.f.hashCode()) * 0x1F + Offset.s(this.g)) * 0x1F + Offset.s(this.h)) * 0x1F + this.i;
    }

    @Override
    @l
    public String toString() {
        String s = "";
        String s1 = OffsetKt.b(this.g) ? "start=" + Offset.y(this.g) + ", " : "";
        if(OffsetKt.b(this.h)) {
            s = "end=" + Offset.y(this.h) + ", ";
        }
        return "LinearGradient(colors=" + this.e + ", stops=" + this.f + ", " + s1 + s + "tileMode=" + TileMode.j(this.i) + ')';
    }
}

