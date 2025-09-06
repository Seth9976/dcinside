package j$.time.chrono;

import j..com.android.tools.r8.a;
import j..time.Instant;
import j..time.b;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAmount;
import j..time.temporal.m;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

final class g implements TemporalAmount, Serializable {
    private final l a;
    final int b;
    final int c;
    final int d;
    public static final int e = 0;
    private static final long serialVersionUID = 0xD5C8C11B1L;

    static {
        a.k(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    g(l l0, int v, int v1, int v2) {
        Objects.requireNonNull(l0, "chrono");
        this.a = l0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    private long a() {
        t t0 = this.a.H(j..time.temporal.a.MONTH_OF_YEAR);
        return !t0.g() || !t0.h() ? -1L : t0.d() - t0.e() + 1L;
    }

    private void b(j..time.temporal.l l0) {
        Objects.requireNonNull(l0, "temporal");
        l l1 = (l)l0.y(m.e());
        if(l1 != null) {
            l l2 = this.a;
            if(!l2.equals(l1)) {
                throw new b("Chronology mismatch, expected: " + l2.k() + ", actual: " + l1.k());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof g && (this.b == ((g)object0).b && this.c == ((g)object0).c && this.d == ((g)object0).d && this.a.equals(((g)object0).a));
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b);
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final j..time.temporal.l l(j..time.temporal.l l0) {
        this.b(l0);
        int v = this.b;
        int v1 = this.c;
        if(v1 != 0) {
            long v2 = this.a();
            if(v2 > 0L) {
                l0 = l0.d(((long)v) * v2 + ((long)v1), ChronoUnit.MONTHS);
                return this.d == 0 ? l0 : l0.d(((long)this.d), ChronoUnit.DAYS);
            }
            if(v != 0) {
                l0 = l0.d(((long)v), ChronoUnit.YEARS);
            }
            l0 = l0.d(((long)v1), ChronoUnit.MONTHS);
        }
        else if(v != 0) {
            l0 = l0.d(((long)v), ChronoUnit.YEARS);
            return this.d == 0 ? l0 : l0.d(((long)this.d), ChronoUnit.DAYS);
        }
        return this.d == 0 ? l0 : l0.d(((long)this.d), ChronoUnit.DAYS);
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final j..time.temporal.l n(Instant instant0) {
        this.b(instant0);
        int v = this.b;
        int v1 = this.c;
        if(v1 != 0) {
            long v2 = this.a();
            if(v2 > 0L) {
                instant0 = instant0.l(((long)v) * v2 + ((long)v1), ChronoUnit.MONTHS);
            }
            else {
                if(v != 0) {
                    instant0 = instant0.l(((long)v), ChronoUnit.YEARS);
                }
                instant0 = instant0.l(((long)v1), ChronoUnit.MONTHS);
            }
        }
        else if(v != 0) {
            instant0 = instant0.l(((long)v), ChronoUnit.YEARS);
        }
        int v3 = this.d;
        return v3 != 0 ? instant0.l(((long)v3), ChronoUnit.DAYS) : instant0;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        l l0 = this.a;
        int v = this.d;
        int v1 = this.c;
        int v2 = this.b;
        if(v2 == 0 && v1 == 0 && v == 0) {
            return l0.toString() + " P0D";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(l0.toString());
        stringBuilder0.append(" P");
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append('Y');
        }
        if(v1 != 0) {
            stringBuilder0.append(v1);
            stringBuilder0.append('M');
        }
        if(v != 0) {
            stringBuilder0.append(v);
            stringBuilder0.append('D');
        }
        return stringBuilder0.toString();
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeUTF(this.a.k());
        objectOutput0.writeInt(this.b);
        objectOutput0.writeInt(this.c);
        objectOutput0.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new E(9, this);
    }
}

