package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.Comparator;
import o3.a;

@b(serializable = true)
@C1
final class y2 implements Serializable {
    private final Comparator a;
    private final boolean b;
    @a
    private final Object c;
    private final y d;
    private final boolean e;
    @a
    private final Object f;
    private final y g;
    @P1.b
    @a
    private transient y2 h;

    private y2(Comparator comparator0, boolean z, @a Object object0, y y0, boolean z1, @a Object object1, y y1) {
        this.a = (Comparator)H.E(comparator0);
        this.b = z;
        this.e = z1;
        this.c = object0;
        this.d = (y)H.E(y0);
        this.f = object1;
        this.g = (y)H.E(y1);
        if(z) {
            comparator0.compare(object0, object0);
        }
        if(z1) {
            comparator0.compare(object1, object1);
        }
        if(z && z1) {
            int v = comparator0.compare(object0, object1);
            boolean z2 = false;
            H.y(v <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", object0, object1);
            if(v == 0) {
                if(y0 != y.b || y1 != y.b) {
                    z2 = true;
                }
                H.d(z2);
            }
        }
    }

    static y2 a(Comparator comparator0) {
        return new y2(comparator0, false, null, y.b, false, null, y.b);
    }

    Comparator b() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    boolean c(@d4 Object object0) {
        return !this.q(object0) && !this.p(object0);
    }

    static y2 d(Comparator comparator0, @d4 Object object0, y y0) {
        return new y2(comparator0, true, object0, y0, false, null, y.b);
    }

    static y2 e(h4 h40) {
        Comparable comparable0 = null;
        Comparable comparable1 = h40.q() ? h40.A() : null;
        y y0 = h40.q() ? h40.z() : y.b;
        if(h40.r()) {
            comparable0 = h40.M();
        }
        return h40.r() ? new y2(c4.K(), h40.q(), comparable1, y0, h40.r(), comparable0, h40.L()) : new y2(c4.K(), h40.q(), comparable1, y0, h40.r(), comparable0, y.b);
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof y2 && this.a.equals(((y2)object0).a) && this.b == ((y2)object0).b && this.e == ((y2)object0).e && this.f().equals(((y2)object0).f()) && this.h().equals(((y2)object0).h()) && B.a(this.g(), ((y2)object0).g()) && B.a(this.i(), ((y2)object0).i());
    }

    y f() {
        return this.d;
    }

    @a
    Object g() {
        return this.c;
    }

    y h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.g(), this.f(), this.i(), this.h()});
    }

    @a
    Object i() {
        return this.f;
    }

    boolean j() {
        return this.b;
    }

    boolean k() {
        return this.e;
    }

    y2 l(y2 y20) {
        H.E(y20);
        H.d(this.a.equals(y20.a));
        boolean z = this.b;
        Object object0 = this.g();
        y y0 = this.f();
        if(!this.j()) {
            z = y20.b;
            object0 = y20.g();
            y0 = y20.f();
        }
        else if(y20.j()) {
            int v = this.a.compare(this.g(), y20.g());
            if(v < 0 || v == 0 && y20.f() == y.b) {
                object0 = y20.g();
                y0 = y20.f();
            }
        }
        boolean z1 = this.e;
        Object object1 = this.i();
        y y1 = this.h();
        if(!this.k()) {
            z1 = y20.e;
            object1 = y20.i();
            y1 = y20.h();
        }
        else if(y20.k()) {
            int v1 = this.a.compare(this.i(), y20.i());
            if(v1 > 0 || v1 == 0 && y20.h() == y.b) {
                object1 = y20.i();
                y1 = y20.h();
            }
        }
        if(z && z1) {
            int v2 = this.a.compare(object0, object1);
            return v2 <= 0 && (v2 != 0 || (y0 != y.b || y1 != y.b)) ? new y2(this.a, z, object0, y0, z1, object1, y1) : new y2(this.a, z, object1, y.b, z1, object1, y.c);
        }
        return new y2(this.a, z, object0, y0, z1, object1, y1);
    }

    // 去混淆评级： 低(40)
    boolean m() {
        return this.k() && this.q(this.i()) || this.j() && this.p(this.g());
    }

    static y2 n(Comparator comparator0, @d4 Object object0, y y0, @d4 Object object1, y y1) {
        return new y2(comparator0, true, object0, y0, true, object1, y1);
    }

    y2 o() {
        y2 y20 = this.h;
        if(y20 == null) {
            y20 = new y2(c4.q(this.a).P(), this.e, this.i(), this.h(), this.b, this.g(), this.f());
            y20.h = this;
            this.h = y20;
        }
        return y20;
    }

    boolean p(@d4 Object object0) {
        int v = 0;
        if(!this.k()) {
            return false;
        }
        int v1 = this.a.compare(object0, this.i());
        if(this.h() == y.b) {
            v = 1;
        }
        return (v1 == 0 ? 1 : 0) & v | (v1 <= 0 ? 0 : 1);
    }

    boolean q(@d4 Object object0) {
        int v = 0;
        if(!this.j()) {
            return false;
        }
        int v1 = this.a.compare(object0, this.g());
        if(this.f() == y.b) {
            v = 1;
        }
        return (v1 == 0 ? 1 : 0) & v | (v1 >= 0 ? 0 : 1);
    }

    static y2 r(Comparator comparator0, @d4 Object object0, y y0) {
        return new y2(comparator0, false, null, y.b, true, object0, y0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append(":");
        y y0 = y.c;
        stringBuilder0.append(((char)(this.d == y0 ? 91 : 40)));
        String s = this.b ? this.c : "-∞";
        stringBuilder0.append(s);
        stringBuilder0.append(',');
        String s1 = this.e ? this.f : "∞";
        stringBuilder0.append(s1);
        stringBuilder0.append(((char)(this.g == y0 ? 93 : 41)));
        return stringBuilder0.toString();
    }
}

