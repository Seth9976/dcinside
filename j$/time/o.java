package j$.time;

import j..com.android.tools.r8.a;
import j..time.chrono.s;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAmount;
import j..time.temporal.l;
import j..time.temporal.m;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class o implements TemporalAmount, Serializable {
    private final int a;
    private final int b;
    private final int c;
    public static final o d = null;
    private static final long serialVersionUID = 0xFFF3416852FC6044L;

    static {
        o.d = new o(0, 0, 0);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        a.k(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private o(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final int a() {
        return this.c;
    }

    public static o b(int v) {
        return v == 0 ? o.d : new o(0, 0, v);
    }

    static o c(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        int v1 = objectInput0.readInt();
        int v2 = objectInput0.readInt();
        return (v | v1 | v2) == 0 ? o.d : new o(v, v1, v2);
    }

    public final long d() {
        return ((long)this.a) * 12L + ((long)this.b);
    }

    private static void e(l l0) {
        Objects.requireNonNull(l0, "temporal");
        j..time.chrono.l l1 = (j..time.chrono.l)l0.y(m.e());
        if(l1 != null && !s.d.equals(l1)) {
            throw new b("Chronology mismatch, expected: ISO, actual: " + l1.k());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof o && (this.a == ((o)object0).a && this.b == ((o)object0).b && this.c == ((o)object0).c);
    }

    @Override
    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + (Integer.rotateLeft(this.b, 8) + this.a);
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final l l(l l0) {
        o.e(l0);
        if(this.b == 0) {
            int v = this.a;
            if(v != 0) {
                l0 = l0.d(((long)v), ChronoUnit.YEARS);
                return this.c == 0 ? l0 : l0.d(((long)this.c), ChronoUnit.DAYS);
            }
        }
        else {
            long v1 = this.d();
            if(v1 != 0L) {
                l0 = l0.d(v1, ChronoUnit.MONTHS);
            }
        }
        return this.c == 0 ? l0 : l0.d(((long)this.c), ChronoUnit.DAYS);
    }

    @Override  // j$.time.temporal.TemporalAmount
    public final l n(Instant instant0) {
        o.e(instant0);
        if(this.b == 0) {
            int v = this.a;
            if(v != 0) {
                instant0 = instant0.l(((long)v), ChronoUnit.YEARS);
            }
        }
        else {
            long v1 = this.d();
            if(v1 != 0L) {
                instant0 = instant0.l(v1, ChronoUnit.MONTHS);
            }
        }
        int v2 = this.c;
        return v2 != 0 ? instant0.l(((long)v2), ChronoUnit.DAYS) : instant0;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        if(this == o.d) {
            return "P0D";
        }
        StringBuilder stringBuilder0 = new StringBuilder("P");
        int v = this.a;
        if(v != 0) {
            stringBuilder0.append(v);
            stringBuilder0.append('Y');
        }
        int v1 = this.b;
        if(v1 != 0) {
            stringBuilder0.append(v1);
            stringBuilder0.append('M');
        }
        int v2 = this.c;
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append('D');
        }
        return stringBuilder0.toString();
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeInt(this.a);
        objectOutput0.writeInt(this.b);
        objectOutput0.writeInt(this.c);
    }

    private Object writeReplace() {
        return new p(14, this);
    }
}

