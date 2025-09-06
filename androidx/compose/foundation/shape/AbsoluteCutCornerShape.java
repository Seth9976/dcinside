package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int f;

    static {
    }

    public AbsoluteCutCornerShape(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
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
        if(f + f1 + f3 + f2 == 0.0f) {
            return new Rectangle(SizeKt.m(v));
        }
        Path path0 = AndroidPath_androidKt.a();
        path0.i(0.0f, f);
        path0.m(f, 0.0f);
        path0.m(Size.t(v) - f1, 0.0f);
        path0.m(Size.t(v), f1);
        path0.m(Size.t(v), Size.m(v) - f2);
        path0.m(Size.t(v) - f2, Size.m(v));
        path0.m(f3, Size.m(v));
        path0.m(0.0f, Size.m(v) - f3);
        path0.close();
        return new Generic(path0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        if(!L.g(this.i(), ((AbsoluteCutCornerShape)object0).i())) {
            return false;
        }
        if(!L.g(this.h(), ((AbsoluteCutCornerShape)object0).h())) {
            return false;
        }
        return L.g(this.f(), ((AbsoluteCutCornerShape)object0).f()) ? L.g(this.g(), ((AbsoluteCutCornerShape)object0).g()) : false;
    }

    @Override
    public int hashCode() {
        return ((this.i().hashCode() * 0x1F + this.h().hashCode()) * 0x1F + this.f().hashCode()) * 0x1F + this.g().hashCode();
    }

    @l
    public AbsoluteCutCornerShape j(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topStart");
        L.p(cornerSize1, "topEnd");
        L.p(cornerSize2, "bottomEnd");
        L.p(cornerSize3, "bottomStart");
        return new AbsoluteCutCornerShape(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override
    @l
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + this.i() + ", topRight = " + this.h() + ", bottomRight = " + this.f() + ", bottomLeft = " + this.g() + ')';
    }
}

