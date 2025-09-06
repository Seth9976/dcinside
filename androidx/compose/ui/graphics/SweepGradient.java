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
public final class SweepGradient extends ShaderBrush {
    private final long e;
    @l
    private final List f;
    @m
    private final List g;

    private SweepGradient(long v, List list0, List list1) {
        this.e = v;
        this.f = list0;
        this.g = list1;
    }

    public SweepGradient(long v, List list0, List list1, int v1, w w0) {
        if((v1 & 4) != 0) {
            list1 = null;
        }
        this(v, list0, list1, null);
    }

    public SweepGradient(long v, List list0, List list1, w w0) {
        this(v, list0, list1);
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    @l
    public Shader c(long v) {
        if(OffsetKt.f(this.e)) {
            return ShaderKt.g(SizeKt.b(v), this.f, this.g);
        }
        float f = Offset.p(this.e) == Infinityf ? Size.t(v) : Offset.p(this.e);
        return Offset.r(this.e) == Infinityf ? ShaderKt.g(OffsetKt.a(f, Size.m(v)), this.f, this.g) : ShaderKt.g(OffsetKt.a(f, Offset.r(this.e)), this.f, this.g);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SweepGradient)) {
            return false;
        }
        if(!Offset.l(this.e, ((SweepGradient)object0).e)) {
            return false;
        }
        return L.g(this.f, ((SweepGradient)object0).f) ? L.g(this.g, ((SweepGradient)object0).g) : false;
    }

    @Override
    public int hashCode() {
        int v = Offset.s(this.e);
        int v1 = this.f.hashCode();
        return this.g == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.g.hashCode();
    }

    // 去混淆评级： 中等(60)
    @Override
    @l
    public String toString() {
        return OffsetKt.d(this.e) ? "SweepGradient(" + ("center=" + Offset.y(this.e) + ", ") + "colors=" + this.f + ", stops=" + this.g + ')' : "SweepGradient(colors=" + this.f + ", stops=" + this.g + ')';
    }
}

