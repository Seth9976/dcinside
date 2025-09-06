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
public final class CutCornerShape extends CornerBasedShape {
    public static final int f;

    static {
    }

    public CutCornerShape(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topStart");
        L.p(cornerSize1, "topEnd");
        L.p(cornerSize2, "bottomEnd");
        L.p(cornerSize3, "bottomStart");
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
        LayoutDirection layoutDirection1 = LayoutDirection.a;
        float f4 = layoutDirection0 == layoutDirection1 ? f : f1;
        path0.i(0.0f, f4);
        path0.m(f4, 0.0f);
        if(layoutDirection0 == layoutDirection1) {
            f = f1;
        }
        path0.m(Size.t(v) - f, 0.0f);
        path0.m(Size.t(v), f);
        float f5 = layoutDirection0 == layoutDirection1 ? f2 : f3;
        path0.m(Size.t(v), Size.m(v) - f5);
        path0.m(Size.t(v) - f5, Size.m(v));
        if(layoutDirection0 == layoutDirection1) {
            f2 = f3;
        }
        path0.m(f2, Size.m(v));
        path0.m(0.0f, Size.m(v) - f2);
        path0.close();
        return new Generic(path0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CutCornerShape)) {
            return false;
        }
        if(!L.g(this.i(), ((CutCornerShape)object0).i())) {
            return false;
        }
        if(!L.g(this.h(), ((CutCornerShape)object0).h())) {
            return false;
        }
        return L.g(this.f(), ((CutCornerShape)object0).f()) ? L.g(this.g(), ((CutCornerShape)object0).g()) : false;
    }

    @Override
    public int hashCode() {
        return ((this.i().hashCode() * 0x1F + this.h().hashCode()) * 0x1F + this.f().hashCode()) * 0x1F + this.g().hashCode();
    }

    @l
    public CutCornerShape j(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topStart");
        L.p(cornerSize1, "topEnd");
        L.p(cornerSize2, "bottomEnd");
        L.p(cornerSize3, "bottomStart");
        return new CutCornerShape(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @Override
    @l
    public String toString() {
        return "CutCornerShape(topStart = " + this.i() + ", topEnd = " + this.h() + ", bottomEnd = " + this.f() + ", bottomStart = " + this.g() + ')';
    }
}

