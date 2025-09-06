package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class JoinedKey {
    @m
    private final Object a;
    @m
    private final Object b;

    public JoinedKey(@m Object object0, @m Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @m
    public final Object a() {
        return this.a;
    }

    @m
    public final Object b() {
        return this.b;
    }

    @l
    public final JoinedKey c(@m Object object0, @m Object object1) {
        return new JoinedKey(object0, object1);
    }

    public static JoinedKey d(JoinedKey joinedKey0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = joinedKey0.a;
        }
        if((v & 2) != 0) {
            object1 = joinedKey0.b;
        }
        return joinedKey0.c(object0, object1);
    }

    @m
    public final Object e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof JoinedKey)) {
            return false;
        }
        return L.g(this.a, ((JoinedKey)object0).a) ? L.g(this.b, ((JoinedKey)object0).b) : false;
    }

    @m
    public final Object f() {
        return this.b;
    }

    private final int g(Object object0) {
        if(object0 instanceof Enum) {
            return ((Enum)object0).ordinal();
        }
        return object0 == null ? 0 : object0.hashCode();
    }

    @Override
    public int hashCode() {
        return this.g(this.a) * 0x1F + this.g(this.b);
    }

    @Override
    @l
    public String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}

