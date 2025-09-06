package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class V implements Serializable {
    private final Object a;
    private final Object b;

    public V(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    @l
    public final V c(Object object0, Object object1) {
        return new V(object0, object1);
    }

    public static V d(V v0, Object object0, Object object1, int v1, Object object2) {
        if((v1 & 1) != 0) {
            object0 = v0.a;
        }
        if((v1 & 2) != 0) {
            object1 = v0.b;
        }
        return v0.c(object0, object1);
    }

    public final Object e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof V)) {
            return false;
        }
        return L.g(this.a, ((V)object0).a) ? L.g(this.b, ((V)object0).b) : false;
    }

    public final Object f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}

