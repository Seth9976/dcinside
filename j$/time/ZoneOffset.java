package j$.time;

import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.s;
import j..time.temporal.t;
import j..time.zone.f;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class ZoneOffset extends ZoneId implements TemporalAccessor, n, Serializable, Comparable {
    public static final ZoneOffset UTC = null;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = null;
    private static final ConcurrentHashMap e = null;
    public static final ZoneOffset f = null;
    public static final ZoneOffset g = null;
    private static final long serialVersionUID = 0x20B8141D7A029C21L;

    static {
        ZoneOffset.d = new ConcurrentHashMap(16, 0.75f, 4);
        ZoneOffset.e = new ConcurrentHashMap(16, 0.75f, 4);
        ZoneOffset.UTC = ZoneOffset.Z(0);
        ZoneOffset.f = ZoneOffset.Z(0xFFFF02E0);
        ZoneOffset.g = ZoneOffset.Z(0xFD20);
    }

    private ZoneOffset(int v) {
        String s;
        this.b = v;
        if(v == 0) {
            s = "Z";
        }
        else {
            int v1 = Math.abs(v);
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = v1 / 60 % 60;
            stringBuilder0.append((v >= 0 ? "+" : "-"));
            stringBuilder0.append((v1 / 3600 >= 10 ? "" : "0"));
            stringBuilder0.append(v1 / 3600);
            String s1 = ":";
            stringBuilder0.append((v2 >= 10 ? ":" : ":0"));
            stringBuilder0.append(v2);
            if(v1 % 60 != 0) {
                if(v1 % 60 < 10) {
                    s1 = ":0";
                }
                stringBuilder0.append(s1);
                stringBuilder0.append(v1 % 60);
            }
            s = stringBuilder0.toString();
        }
        this.c = s;
    }

    @Override  // j$.time.ZoneId
    public final f Q() {
        return f.i(this);
    }

    @Override  // j$.time.ZoneId
    final void U(ObjectOutput objectOutput0) {
        objectOutput0.writeByte(8);
        this.c0(objectOutput0);
    }

    public final int V(ZoneOffset zoneOffset0) {
        return zoneOffset0.b - this.b;
    }

    public final int W() {
        return this.b;
    }

    public static ZoneOffset X(String s) {
        int v2;
        int v1;
        int v;
        Objects.requireNonNull(s, "offsetId");
        ZoneOffset zoneOffset0 = (ZoneOffset)ZoneOffset.e.get(s);
        if(zoneOffset0 != null) {
            return zoneOffset0;
        }
        switch(s.length()) {
            case 2: {
                s = s.charAt(0) + "0" + s.charAt(1);
                v = ZoneOffset.a0(s, 1, false);
                v1 = 0;
                v2 = 0;
                break;
            }
            case 3: {
                v = ZoneOffset.a0(s, 1, false);
                v1 = 0;
                v2 = 0;
                break;
            }
            case 5: {
                v = ZoneOffset.a0(s, 1, false);
                v1 = ZoneOffset.a0(s, 3, false);
                v2 = 0;
                break;
            }
            case 6: {
                v = ZoneOffset.a0(s, 1, false);
                v1 = ZoneOffset.a0(s, 4, true);
                v2 = 0;
                break;
            }
            case 7: {
                v = ZoneOffset.a0(s, 1, false);
                v1 = ZoneOffset.a0(s, 3, false);
                v2 = ZoneOffset.a0(s, 5, false);
                break;
            }
            case 9: {
                v = ZoneOffset.a0(s, 1, false);
                v1 = ZoneOffset.a0(s, 4, true);
                v2 = ZoneOffset.a0(s, 7, true);
                break;
            }
            default: {
                throw new b("Invalid ID for ZoneOffset, invalid format: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        int v3 = s.charAt(0);
        if(v3 != 43 && v3 != 45) {
            throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return v3 == 45 ? ZoneOffset.Y(-v, -v1, -v2) : ZoneOffset.Y(v, v1, v2);
    }

    public static ZoneOffset Y(int v, int v1, int v2) {
        if(v < -18 || v > 18) {
            throw new b("Zone offset hours not in valid range: value " + v + " is not in the range -18 to 18");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(v > 0) {
            if(v1 < 0 || v2 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        else if(v < 0) {
            if(v1 > 0 || v2 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        else if(v1 > 0 && v2 < 0 || v1 < 0 && v2 > 0) {
            throw new b("Zone offset minutes and seconds must have the same sign");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(v1 < -59 || v1 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + v1 + " is not in the range -59 to 59");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(v2 < -59 || v2 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + v2 + " is not in the range -59 to 59");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(Math.abs(v) == 18 && (v1 | v2) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return ZoneOffset.Z(v1 * 60 + v * 3600 + v2);
    }

    public static ZoneOffset Z(int v) {
        if(v < 0xFFFF02E0 || v > 0xFD20) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(v % 900 == 0) {
            Integer integer0 = v;
            ConcurrentHashMap concurrentHashMap0 = ZoneOffset.d;
            ZoneOffset zoneOffset0 = (ZoneOffset)concurrentHashMap0.get(integer0);
            if(zoneOffset0 == null) {
                concurrentHashMap0.putIfAbsent(integer0, new ZoneOffset(v));
                zoneOffset0 = (ZoneOffset)concurrentHashMap0.get(integer0);
                ZoneOffset.e.putIfAbsent(zoneOffset0.c, zoneOffset0);
            }
            return zoneOffset0;
        }
        return new ZoneOffset(v);
    }

    private static int a0(String s, int v, boolean z) {
        if(z && s.charAt(v - 1) != 58) {
            throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        int v1 = s.charAt(v);
        int v2 = s.charAt(v + 1);
        if(v1 < 0x30 || v1 > 57 || v2 < 0x30 || v2 > 57) {
            throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return v1 * 10 + v2 - 0x210;
    }

    static ZoneOffset b0(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        return v == 0x7F ? ZoneOffset.Z(objectInput0.readInt()) : ZoneOffset.Z(v * 900);
    }

    final void c0(DataOutput dataOutput0) {
        int v = this.b;
        int v1 = v % 900 == 0 ? v / 900 : 0x7F;
        dataOutput0.writeByte(v1);
        if(v1 == 0x7F) {
            dataOutput0.writeInt(v);
        }
    }

    @Override
    public final int compareTo(Object object0) {
        return this.V(((ZoneOffset)object0));
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.OFFSET_SECONDS : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.ZoneId
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof ZoneOffset && this.b == ((ZoneOffset)object0).b;
    }

    @Override  // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override  // j$.time.ZoneId
    public final String k() {
        return this.c;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 == a.OFFSET_SECONDS) {
            return this.b;
        }
        if(q0 instanceof a) {
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return m.d(this, q0).a(this.u(q0), q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 == a.OFFSET_SECONDS) {
            return (long)this.b;
        }
        if(q0 instanceof a) {
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(8, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 != m.i() && temporalQuery0 != m.k() ? m.c(this, temporalQuery0) : this;
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(((long)this.b), a.OFFSET_SECONDS);
    }
}

