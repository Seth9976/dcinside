package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.e;
import java.io.Serializable;

public class l implements Serializable {
    protected final long a;
    protected final long b;
    protected final int c;
    protected final int d;
    protected final e e;
    protected transient String f;
    private static final long g = 2L;
    @Deprecated
    public static final int h = 500;
    public static final l i;

    static {
        l.i = new l(e.y(), -1L, -1L, -1, -1);
    }

    public l(e e0, long v, int v1, int v2) {
        this(e0, -1L, v, v1, v2);
    }

    public l(e e0, long v, long v1, int v2, int v3) {
        if(e0 == null) {
            e0 = e.y();
        }
        this.e = e0;
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Deprecated
    public l(Object object0, long v, int v1, int v2) {
        this(l.a(object0), v, v1, v2);
    }

    @Deprecated
    public l(Object object0, long v, long v1, int v2, int v3) {
        this(l.a(object0), v, v1, v2, v3);
    }

    // 去混淆评级： 低(20)
    protected static e a(Object object0) {
        return object0 instanceof e ? ((e)object0) : e.l(false, object0, c.b());
    }

    public StringBuilder b(StringBuilder stringBuilder0) {
        if(this.e.p()) {
            stringBuilder0.append("line: ");
            int v = this.c;
            if(v >= 0) {
                stringBuilder0.append(v);
            }
            else {
                stringBuilder0.append("UNKNOWN");
            }
            stringBuilder0.append(", column: ");
            int v1 = this.d;
            if(v1 >= 0) {
                stringBuilder0.append(v1);
                return stringBuilder0;
            }
            stringBuilder0.append("UNKNOWN");
            return stringBuilder0;
        }
        if(this.c > 0) {
            stringBuilder0.append("line: ");
            stringBuilder0.append(this.c);
            if(this.d > 0) {
                stringBuilder0.append(", column: ");
                stringBuilder0.append(this.d);
                return stringBuilder0;
            }
        }
        else {
            stringBuilder0.append("byte offset: #");
            long v2 = this.a;
            if(v2 >= 0L) {
                stringBuilder0.append(v2);
                return stringBuilder0;
            }
            stringBuilder0.append("UNKNOWN");
        }
        return stringBuilder0;
    }

    public e c() {
        return this.e;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        e e0 = this.e;
        if(e0 == null) {
            return ((l)object0).e == null ? this.c == ((l)object0).c && this.d == ((l)object0).d && this.b == ((l)object0).b && this.a == ((l)object0).a : false;
        }
        return e0.equals(((l)object0).e) ? this.c == ((l)object0).c && this.d == ((l)object0).d && this.b == ((l)object0).b && this.a == ((l)object0).a : false;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.c;
    }

    @Deprecated
    public Object h() {
        return this.e.o();
    }

    @Override
    public int hashCode() {
        return this.e == null ? ((1 ^ this.c) + this.d ^ ((int)this.b)) + ((int)this.a) : ((2 ^ this.c) + this.d ^ ((int)this.b)) + ((int)this.a);
    }

    public String i() {
        return this.b(new StringBuilder(40)).toString();
    }

    public String j() {
        if(this.f == null) {
            this.f = this.e.h();
        }
        return this.f;
    }

    @Override
    public String toString() {
        String s = this.j();
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 40);
        stringBuilder0.append("[Source: ");
        stringBuilder0.append(s);
        stringBuilder0.append("; ");
        StringBuilder stringBuilder1 = this.b(stringBuilder0);
        stringBuilder1.append(']');
        return stringBuilder1.toString();
    }
}

