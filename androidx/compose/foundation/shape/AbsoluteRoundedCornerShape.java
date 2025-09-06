package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int f;

    static {
    }

    public AbsoluteRoundedCornerShape(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topLeft");
        L.p(cornerSize1, "topRight");
        L.p(cornerSize2, "bottomRight");
        L.p(cornerSize3, "bottomLeft");
        super(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    public CornerBasedShape c(CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3) {
        return this.j(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override  // androidx.compose.foundation.shape.CornerBasedShape
    @l
    public Outline e(long v, float f, float f1, float f2, float f3, @l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        return f + f1 + f2 + f3 == 0.0f ? new Rectangle(SizeKt.m(v)) : new Rounded(RoundRectKt.c(SizeKt.m(v), CornerRadiusKt.b(f, 0.0f, 2, null), CornerRadiusKt.b(f1, 0.0f, 2, null), CornerRadiusKt.b(f2, 0.0f, 2, null), CornerRadiusKt.b(f3, 0.0f, 2, null)));
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        if(!L.g(this.i(), ((AbsoluteRoundedCornerShape)object0).i())) {
            return false;
        }
        if(!L.g(this.h(), ((AbsoluteRoundedCornerShape)object0).h())) {
            return false;
        }
        return L.g(this.f(), ((AbsoluteRoundedCornerShape)object0).f()) ? L.g(this.g(), ((AbsoluteRoundedCornerShape)object0).g()) : false;
    }

    @Override
    public int hashCode() {
        return ((this.i().hashCode() * 0x1F + this.h().hashCode()) * 0x1F + this.f().hashCode()) * 0x1F + this.g().hashCode();
    }

    @l
    public AbsoluteRoundedCornerShape j(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topStart");
        L.p(cornerSize1, "topEnd");
        L.p(cornerSize2, "bottomEnd");
        L.p(cornerSize3, "bottomStart");
        return new AbsoluteRoundedCornerShape(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    private final long k(float f) {
        return CornerRadiusKt.b(f, 0.0f, 2, null);
    }

    @Override
    @l
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.i() + ", topRight = " + this.h() + ", bottomRight = " + this.f() + ", bottomLeft = " + this.g() + ')';
    }
}

