package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,101:1\n40#1,5:102\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:102,5\n*E\n"})
public final class MutableRect {
    private float a;
    private float b;
    private float c;
    private float d;
    public static final int e = 8;

    static {
    }

    public MutableRect(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public final boolean a(long v) {
        return Offset.p(v) >= this.a && Offset.p(v) < this.c && Offset.r(v) >= this.b && Offset.r(v) < this.d;
    }

    public final float b() {
        return this.d;
    }

    public final float c() {
        return this.b() - this.g();
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.c;
    }

    public final long f() {
        return SizeKt.a(this.e() - this.d(), this.b() - this.g());
    }

    public final float g() {
        return this.b;
    }

    public final float h() {
        return this.e() - this.d();
    }

    @Stable
    public final void i(float f, float f1, float f2, float f3) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f1, this.b);
        this.c = Math.min(f2, this.c);
        this.d = Math.min(f3, this.d);
    }

    public final boolean j() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final void k(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public final void l(float f) {
        this.d = f;
    }

    public final void m(float f) {
        this.a = f;
    }

    public final void n(float f) {
        this.c = f;
    }

    public final void o(float f) {
        this.b = f;
    }

    @Override
    @l
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.a(this.a, 1) + ", " + GeometryUtilsKt.a(this.b, 1) + ", " + GeometryUtilsKt.a(this.c, 1) + ", " + GeometryUtilsKt.a(this.d, 1) + ')';
    }
}

