package kotlin.ranges;

import androidx.compose.animation.core.b;
import y4.l;
import y4.m;

final class d implements f {
    private final double a;
    private final double b;

    public d(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.f
    public boolean a(Comparable comparable0) {
        return this.b(((Number)comparable0).doubleValue());
    }

    public boolean b(double f) {
        return f >= this.a && f <= this.b;
    }

    @Override  // kotlin.ranges.f
    public boolean c(Comparable comparable0, Comparable comparable1) {
        return this.g(((Number)comparable0).doubleValue(), ((Number)comparable1).doubleValue());
    }

    @Override  // kotlin.ranges.g
    public Comparable d() {
        return this.e();
    }

    @l
    public Double e() {
        return this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof d && (this.isEmpty() && ((d)object0).isEmpty() || this.a == ((d)object0).a && this.b == ((d)object0).b);
    }

    @l
    public Double f() {
        return this.a;
    }

    public boolean g(double f, double f1) {
        return f <= f1;
    }

    @Override  // kotlin.ranges.g
    public Comparable getStart() {
        return this.f();
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : b.a(this.a) * 0x1F + b.a(this.b);
    }

    @Override  // kotlin.ranges.f
    public boolean isEmpty() {
        return this.a > this.b;
    }

    @Override
    @l
    public String toString() {
        return this.a + ".." + this.b;
    }
}

