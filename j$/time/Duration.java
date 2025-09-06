package j$.time;

import j..com.android.tools.r8.a;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAmount;
import j..time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

public final class Duration implements TemporalAmount, Serializable, Comparable {
    public static final Duration ZERO = null;
    private final long a;
    private final int b;
    private static final long serialVersionUID = 0x2ABA9D02D1C4F832L;

    static {
        Duration.ZERO = new Duration(0L, 0);
        BigInteger.valueOf(1000000000L);
    }

    private Duration(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public int compareTo(Duration duration0) {
        int v = Long.compare(this.a, duration0.a);
        return v == 0 ? this.b - duration0.b : v;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.compareTo(((Duration)object0));
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof Duration && (this.a == ((Duration)object0).a && this.b == ((Duration)object0).b);
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b * 51 + ((int)(this.a ^ this.a >>> 0x20));
    }

    public boolean isZero() {
        return (((long)this.b) | this.a) == 0L;
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final l l(l l0) {
        long v = this.a;
        if(v != 0L) {
            l0 = l0.d(v, ChronoUnit.SECONDS);
        }
        return this.b == 0 ? l0 : l0.d(((long)this.b), ChronoUnit.NANOS);
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final l n(Instant instant0) {
        long v = this.a;
        if(v != 0L) {
            instant0 = instant0.l(v, ChronoUnit.SECONDS);
        }
        int v1 = this.b;
        return v1 != 0 ? instant0.l(((long)v1), ChronoUnit.NANOS) : instant0;
    }

    public static Duration ofMillis(long v) {
        long v1 = v / 1000L;
        int v2 = (int)(v % 1000L);
        if(v2 < 0) {
            v2 += 1000;
            --v1;
        }
        return Duration.p(v1, v2 * 1000000);
    }

    public static Duration ofMinutes(long v) {
        return Duration.p(a.o(v, 60L), 0);
    }

    public static Duration ofSeconds(long v, long v1) {
        return Duration.p(a.i(v, a.n(v1, 1000000000L)), ((int)a.m(v1, 1000000000L)));
    }

    private static Duration p(long v, int v1) {
        return (((long)v1) | v) == 0L ? Duration.ZERO : new Duration(v, v1);
    }

    public static Duration q(long v) [...] // Inlined contents

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public long toMillis() {
        long v = (long)this.b;
        long v1 = this.a;
        if(v1 < 0L) {
            ++v1;
            v -= 1000000000L;
        }
        return a.i(a.o(v1, 1000L), v / 1000000L);
    }

    @Override
    public final String toString() {
        if(this == Duration.ZERO) {
            return "PT0S";
        }
        long v = this.a;
        int v1 = this.b;
        long v2 = v >= 0L || v1 <= 0 ? v : v + 1L;
        int v3 = (int)(v2 % 3600L / 60L);
        StringBuilder stringBuilder0 = new StringBuilder(24);
        stringBuilder0.append("PT");
        if(v2 / 3600L != 0L) {
            stringBuilder0.append(v2 / 3600L);
            stringBuilder0.append('H');
        }
        if(v3 != 0) {
            stringBuilder0.append(v3);
            stringBuilder0.append('M');
        }
        if(((int)(v2 % 60L)) == 0 && v1 == 0 && stringBuilder0.length() > 2) {
            return stringBuilder0.toString();
        }
        if(v >= 0L || v1 <= 0) {
            stringBuilder0.append(((int)(v2 % 60L)));
        }
        else if(((int)(v2 % 60L)) == 0) {
            stringBuilder0.append("-0");
        }
        else {
            stringBuilder0.append(((int)(v2 % 60L)));
        }
        if(v1 > 0) {
            int v4 = stringBuilder0.length();
            if(v < 0L) {
                stringBuilder0.append(2000000000L - ((long)v1));
            }
            else {
                stringBuilder0.append(((long)v1) + 1000000000L);
            }
            while(stringBuilder0.charAt(stringBuilder0.length() - 1) == 0x30) {
                stringBuilder0.setLength(stringBuilder0.length() - 1);
            }
            stringBuilder0.setCharAt(v4, '.');
        }
        stringBuilder0.append('S');
        return stringBuilder0.toString();
    }

    public static Duration u(long v) [...] // Inlined contents

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeLong(this.a);
        objectOutput0.writeInt(this.b);
    }

    private Object writeReplace() {
        return new p(1, this);
    }
}

