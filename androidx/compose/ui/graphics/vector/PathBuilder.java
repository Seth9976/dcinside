package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import y4.l;

public final class PathBuilder {
    @l
    private final List a;

    public PathBuilder() {
        this.a = new ArrayList();
    }

    private final PathBuilder a(PathNode pathNode0) {
        this.a.add(pathNode0);
        return this;
    }

    @l
    public final PathBuilder b(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        return this.a(new ArcTo(f, f1, f2, z, z1, f3, f4));
    }

    @l
    public final PathBuilder c(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        return this.a(new RelativeArcTo(f, f1, f2, z, z1, f3, f4));
    }

    @l
    public final PathBuilder d() {
        return this.a(Close.c);
    }

    @l
    public final PathBuilder e(float f, float f1, float f2, float f3, float f4, float f5) {
        return this.a(new CurveTo(f, f1, f2, f3, f4, f5));
    }

    @l
    public final PathBuilder f(float f, float f1, float f2, float f3, float f4, float f5) {
        return this.a(new RelativeCurveTo(f, f1, f2, f3, f4, f5));
    }

    @l
    public final List g() {
        return this.a;
    }

    @l
    public final PathBuilder h(float f) {
        return this.a(new HorizontalTo(f));
    }

    @l
    public final PathBuilder i(float f) {
        return this.a(new RelativeHorizontalTo(f));
    }

    @l
    public final PathBuilder j(float f, float f1) {
        return this.a(new LineTo(f, f1));
    }

    @l
    public final PathBuilder k(float f, float f1) {
        return this.a(new RelativeLineTo(f, f1));
    }

    @l
    public final PathBuilder l(float f, float f1) {
        return this.a(new MoveTo(f, f1));
    }

    @l
    public final PathBuilder m(float f, float f1) {
        return this.a(new RelativeMoveTo(f, f1));
    }

    @l
    public final PathBuilder n(float f, float f1, float f2, float f3) {
        return this.a(new QuadTo(f, f1, f2, f3));
    }

    @l
    public final PathBuilder o(float f, float f1, float f2, float f3) {
        return this.a(new RelativeQuadTo(f, f1, f2, f3));
    }

    @l
    public final PathBuilder p(float f, float f1, float f2, float f3) {
        return this.a(new ReflectiveCurveTo(f, f1, f2, f3));
    }

    @l
    public final PathBuilder q(float f, float f1, float f2, float f3) {
        return this.a(new RelativeReflectiveCurveTo(f, f1, f2, f3));
    }

    @l
    public final PathBuilder r(float f, float f1) {
        return this.a(new ReflectiveQuadTo(f, f1));
    }

    @l
    public final PathBuilder s(float f, float f1) {
        return this.a(new RelativeReflectiveQuadTo(f, f1));
    }

    @l
    public final PathBuilder t(float f) {
        return this.a(new VerticalTo(f));
    }

    @l
    public final PathBuilder u(float f) {
        return this.a(new RelativeVerticalTo(f));
    }
}

