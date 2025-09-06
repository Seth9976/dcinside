package kotlin.ranges;

import y4.l;
import y4.m;

final class e implements f {
    private final float a;
    private final float b;

    public e(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // kotlin.ranges.f
    public boolean a(Comparable comparable0) {
        return this.b(((Number)comparable0).floatValue());
    }

    public boolean b(float f) {
        return f >= this.a && f <= this.b;
    }

    @Override  // kotlin.ranges.f
    public boolean c(Comparable comparable0, Comparable comparable1) {
        return this.g(((Number)comparable0).floatValue(), ((Number)comparable1).floatValue());
    }

    @Override  // kotlin.ranges.g
    public Comparable d() {
        return this.e();
    }

    @l
    public Float e() {
        return this.b;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof e && (this.isEmpty() && ((e)object0).isEmpty() || this.a == ((e)object0).a && this.b == ((e)object0).b);
    }

    @l
    public Float f() {
        return this.a;
    }

    public boolean g(float f, float f1) {
        return f <= f1;
    }

    @Override  // kotlin.ranges.g
    public Comparable getStart() {
        return this.f();
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
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

