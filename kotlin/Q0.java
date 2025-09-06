package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class q0 implements Serializable {
    private final Object a;
    private final Object b;
    private final Object c;

    public q0(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    @l
    public final q0 d(Object object0, Object object1, Object object2) {
        return new q0(object0, object1, object2);
    }

    public static q0 e(q0 q00, Object object0, Object object1, Object object2, int v, Object object3) {
        if((v & 1) != 0) {
            object0 = q00.a;
        }
        if((v & 2) != 0) {
            object1 = q00.b;
        }
        if((v & 4) != 0) {
            object2 = q00.c;
        }
        return q00.d(object0, object1, object2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q0)) {
            return false;
        }
        if(!L.g(this.a, ((q0)object0).a)) {
            return false;
        }
        return L.g(this.b, ((q0)object0).b) ? L.g(this.c, ((q0)object0).c) : false;
    }

    public final Object f() {
        return this.a;
    }

    public final Object g() {
        return this.b;
    }

    public final Object h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Object object0 = this.c;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return '(' + this.a + ", " + this.b + ", " + this.c + ')';
    }
}

