package androidx.compose.ui.platform;

import y4.l;
import y4.m;

final class OpenEndFloatRange implements OpenEndRange {
    private final float a;
    private final float b;

    public OpenEndFloatRange(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // androidx.compose.ui.platform.OpenEndRange
    public boolean a(Comparable comparable0) {
        return this.c(((Number)comparable0).floatValue());
    }

    @Override  // androidx.compose.ui.platform.OpenEndRange
    public Comparable b() {
        return this.d();
    }

    public boolean c(float f) {
        return f >= this.a && f < this.b;
    }

    @l
    public Float d() {
        return this.b;
    }

    @l
    public Float e() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof OpenEndFloatRange && (this.isEmpty() && ((OpenEndFloatRange)object0).isEmpty() || this.a == ((OpenEndFloatRange)object0).a && this.b == ((OpenEndFloatRange)object0).b);
    }

    private final boolean f(float f, float f1) {
        return f <= f1;
    }

    @Override  // androidx.compose.ui.platform.OpenEndRange
    public Comparable getStart() {
        return this.e();
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override  // androidx.compose.ui.platform.OpenEndRange
    public boolean isEmpty() {
        return this.a >= this.b;
    }

    @Override
    @l
    public String toString() {
        return this.a + "..<" + this.b;
    }
}

