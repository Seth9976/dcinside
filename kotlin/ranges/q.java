package kotlin.ranges;

import y4.l;
import y4.m;

final class q implements r {
    private final float a;
    private final float b;

    public q(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.c(((Number)comparable0).floatValue());
    }

    @Override  // kotlin.ranges.r
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
        return object0 instanceof q && (this.isEmpty() && ((q)object0).isEmpty() || this.a == ((q)object0).a && this.b == ((q)object0).b);
    }

    private final boolean f(float f, float f1) {
        return f <= f1;
    }

    @Override  // kotlin.ranges.r
    public Comparable getStart() {
        return this.e();
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override  // kotlin.ranges.r
    public boolean isEmpty() {
        return this.a >= this.b;
    }

    @Override
    @l
    public String toString() {
        return this.a + "..<" + this.b;
    }
}

