package kotlin.ranges;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

class h implements r {
    @l
    private final Comparable a;
    @l
    private final Comparable b;

    public h(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "start");
        L.p(comparable1, "endExclusive");
        super();
        this.a = comparable0;
        this.b = comparable1;
    }

    @Override  // kotlin.ranges.r
    public boolean a(@l Comparable comparable0) {
        return a.a(this, comparable0);
    }

    @Override  // kotlin.ranges.r
    @l
    public Comparable b() {
        return this.b;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof h && (this.isEmpty() && ((h)object0).isEmpty() || L.g(this.getStart(), ((h)object0).getStart()) && L.g(this.b(), ((h)object0).b()));
    }

    @Override  // kotlin.ranges.r
    @l
    public Comparable getStart() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : this.getStart().hashCode() * 0x1F + this.b().hashCode();
    }

    @Override  // kotlin.ranges.r
    public boolean isEmpty() {
        return a.b(this);
    }

    @Override
    @l
    public String toString() {
        return this.getStart() + "..<" + this.b();
    }
}

