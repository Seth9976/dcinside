package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DefaultIntrinsicMeasurable implements Measurable {
    @l
    private final IntrinsicMeasurable a;
    @l
    private final IntrinsicMinMax b;
    @l
    private final IntrinsicWidthHeight c;

    public DefaultIntrinsicMeasurable(@l IntrinsicMeasurable intrinsicMeasurable0, @l IntrinsicMinMax intrinsicMinMax0, @l IntrinsicWidthHeight intrinsicWidthHeight0) {
        L.p(intrinsicMeasurable0, "measurable");
        L.p(intrinsicMinMax0, "minMax");
        L.p(intrinsicWidthHeight0, "widthHeight");
        super();
        this.a = intrinsicMeasurable0;
        this.b = intrinsicMinMax0;
        this.c = intrinsicWidthHeight0;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int D0(int v) {
        return this.a.D0(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int S0(int v) {
        return this.a.S0(v);
    }

    @l
    public final IntrinsicMeasurable a() {
        return this.a;
    }

    @l
    public final IntrinsicMinMax b() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    @m
    public Object c() {
        return this.a.c();
    }

    @l
    public final IntrinsicWidthHeight d() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int v) {
        return this.a.g(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int h1(int v) {
        return this.a.h1(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @l
    public Placeable r1(long v) {
        if(this.c == IntrinsicWidthHeight.a) {
            if(this.b == IntrinsicMinMax.b) {
                int v1 = Constraints.o(v);
                return new FixedSizeIntrinsicsPlaceable(this.a.h1(v1), Constraints.o(v));
            }
            int v2 = Constraints.o(v);
            return new FixedSizeIntrinsicsPlaceable(this.a.S0(v2), Constraints.o(v));
        }
        if(this.b == IntrinsicMinMax.b) {
            int v3 = Constraints.p(v);
            return new FixedSizeIntrinsicsPlaceable(Constraints.p(v), this.a.g(v3));
        }
        int v4 = Constraints.p(v);
        return new FixedSizeIntrinsicsPlaceable(Constraints.p(v), this.a.D0(v4));
    }
}

