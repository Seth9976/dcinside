package j$.time.temporal;

import j..time.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class t implements Serializable {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private static final long serialVersionUID = 0x9A71A956F2CD5AB8L;

    private t(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final int a(long v, q q0) {
        if(!this.h() || !this.i(v)) {
            throw new b(this.c(v, q0));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return (int)v;
    }

    public final void b(long v, q q0) {
        if(!this.i(v)) {
            throw new b(this.c(v, q0));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
    }

    private String c(long v, q q0) {
        return q0 == null ? "Invalid value (valid values " + this + "): " + v : "Invalid value for " + q0 + " (valid values " + this + "): " + v;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof t && (this.a == ((t)object0).a && this.b == ((t)object0).b && this.c == ((t)object0).c && this.d == ((t)object0).d);
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.a == this.b && this.c == this.d;
    }

    public final boolean h() {
        return this.a >= 0xFFFFFFFF80000000L && this.d <= 0x7FFFFFFFL;
    }

    @Override
    public final int hashCode() {
        long v = this.a + (this.b << 16) + (this.b >> 0x30) + (this.c << 0x20) + (this.c >> 0x20) + (this.d << 0x30) + (this.d >> 16);
        return (int)(v >>> 0x20 ^ v);
    }

    public final boolean i(long v) {
        return v >= this.a && v <= this.d;
    }

    public static t j(long v, long v1) [...] // Inlined contents

    public static t k(long v, long v1, long v2) [...] // Inlined contents

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        long v = this.b;
        if(this.a > v) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long v1 = this.d;
        if(this.c > v1) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if(v > v1) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        long v = this.b;
        if(this.a != v) {
            stringBuilder0.append('/');
            stringBuilder0.append(v);
        }
        stringBuilder0.append(" - ");
        stringBuilder0.append(this.c);
        long v1 = this.d;
        if(this.c != v1) {
            stringBuilder0.append('/');
            stringBuilder0.append(v1);
        }
        return stringBuilder0.toString();
    }
}

