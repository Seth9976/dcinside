package kotlin.ranges;

import androidx.compose.animation.core.b;
import y4.l;
import y4.m;

final class p implements r {
    private final double a;
    private final double b;

    public p(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.r
    public boolean a(Comparable comparable0) {
        return this.c(((Number)comparable0).doubleValue());
    }

    @Override  // kotlin.ranges.r
    public Comparable b() {
        return this.d();
    }

    public boolean c(double f) {
        return f >= this.a && f < this.b;
    }

    @l
    public Double d() {
        return this.b;
    }

    @l
    public Double e() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof p && (this.isEmpty() && ((p)object0).isEmpty() || this.a == ((p)object0).a && this.b == ((p)object0).b);
    }

    private final boolean f(double f, double f1) {
        return f <= f1;
    }

    @Override  // kotlin.ranges.r
    public Comparable getStart() {
        return this.e();
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : b.a(this.a) * 0x1F + b.a(this.b);
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

