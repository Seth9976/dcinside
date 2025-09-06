package androidx.compose.foundation.shape;

import A3.p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class GenericShape implements Shape {
    @l
    private final p a;
    public static final int b;

    static {
    }

    public GenericShape(@l p p0) {
        L.p(p0, "builder");
        super();
        this.a = p0;
    }

    @Override  // androidx.compose.ui.graphics.Shape
    @l
    public Outline a(long v, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        Path path0 = AndroidPath_androidKt.a();
        Size size0 = Size.c(v);
        this.a.invoke(path0, size0, layoutDirection0);
        path0.close();
        return new Generic(path0);
    }

    @Override
    public boolean equals(@m Object object0) {
        p p0 = null;
        if(this == object0) {
            return true;
        }
        GenericShape genericShape0 = object0 instanceof GenericShape ? ((GenericShape)object0) : null;
        if(genericShape0 != null) {
            p0 = genericShape0.a;
        }
        return L.g(p0, this.a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

