package kotlin.text;

import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    @l
    private final String a;
    @l
    private final kotlin.ranges.l b;

    public m(@l String s, @l kotlin.ranges.l l0) {
        L.p(s, "value");
        L.p(l0, "range");
        super();
        this.a = s;
        this.b = l0;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final kotlin.ranges.l b() {
        return this.b;
    }

    @l
    public final m c(@l String s, @l kotlin.ranges.l l0) {
        L.p(s, "value");
        L.p(l0, "range");
        return new m(s, l0);
    }

    public static m d(m m0, String s, kotlin.ranges.l l0, int v, Object object0) {
        if((v & 1) != 0) {
            s = m0.a;
        }
        if((v & 2) != 0) {
            l0 = m0.b;
        }
        return m0.c(s, l0);
    }

    @l
    public final kotlin.ranges.l e() {
        return this.b;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        return L.g(this.a, ((m)object0).a) ? L.g(this.b, ((m)object0).b) : false;
    }

    @l
    public final String f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}

