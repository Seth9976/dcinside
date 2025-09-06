package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class OrientationIndependentConstraints {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public OrientationIndependentConstraints(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    // 去混淆评级： 低(20)
    private OrientationIndependentConstraints(long v, LayoutOrientation layoutOrientation0) {
        this((layoutOrientation0 == LayoutOrientation.a ? Constraints.r(v) : Constraints.q(v)), (layoutOrientation0 == LayoutOrientation.a ? Constraints.p(v) : Constraints.o(v)), (layoutOrientation0 == LayoutOrientation.a ? Constraints.q(v) : Constraints.r(v)), (layoutOrientation0 == LayoutOrientation.a ? Constraints.o(v) : Constraints.p(v)));
    }

    public OrientationIndependentConstraints(long v, LayoutOrientation layoutOrientation0, w w0) {
        this(v, layoutOrientation0);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @l
    public final OrientationIndependentConstraints e(int v, int v1, int v2, int v3) {
        return new OrientationIndependentConstraints(v, v1, v2, v3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OrientationIndependentConstraints)) {
            return false;
        }
        if(this.a != ((OrientationIndependentConstraints)object0).a) {
            return false;
        }
        if(this.b != ((OrientationIndependentConstraints)object0).b) {
            return false;
        }
        return this.c == ((OrientationIndependentConstraints)object0).c ? this.d == ((OrientationIndependentConstraints)object0).d : false;
    }

    public static OrientationIndependentConstraints f(OrientationIndependentConstraints orientationIndependentConstraints0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = orientationIndependentConstraints0.a;
        }
        if((v4 & 2) != 0) {
            v1 = orientationIndependentConstraints0.b;
        }
        if((v4 & 4) != 0) {
            v2 = orientationIndependentConstraints0.c;
        }
        if((v4 & 8) != 0) {
            v3 = orientationIndependentConstraints0.d;
        }
        return orientationIndependentConstraints0.e(v, v1, v2, v3);
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    public final int i() {
        return this.b;
    }

    public final int j() {
        return this.a;
    }

    public final int k(@l LayoutOrientation layoutOrientation0) {
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? this.d : this.b;
    }

    public final int l(@l LayoutOrientation layoutOrientation0) {
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? this.b : this.d;
    }

    @l
    public final OrientationIndependentConstraints m() {
        return this.d == 0x7FFFFFFF ? new OrientationIndependentConstraints(this.a, this.b, this.c, 0x7FFFFFFF) : new OrientationIndependentConstraints(this.a, this.b, this.d, this.d);
    }

    public final long n(@l LayoutOrientation layoutOrientation0) {
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? ConstraintsKt.a(this.a, this.b, this.c, this.d) : ConstraintsKt.a(this.c, this.d, this.a, this.b);
    }

    @Override
    @l
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.a + ", mainAxisMax=" + this.b + ", crossAxisMin=" + this.c + ", crossAxisMax=" + this.d + ')';
    }
}

