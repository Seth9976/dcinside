package j$.time.zone;

import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneOffset;
import j..time.chrono.s;
import j..time.d;
import j..time.j;
import j..time.temporal.o;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class e implements Serializable {
    private final j a;
    private final byte b;
    private final d c;
    private final LocalTime d;
    private final boolean e;
    private final j..time.zone.d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;
    private static final long serialVersionUID = 0x5F9ACF201199524BL;

    e(j j0, int v, d d0, LocalTime localTime0, boolean z, j..time.zone.d d1, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1, ZoneOffset zoneOffset2) {
        this.a = j0;
        this.b = (byte)v;
        this.c = d0;
        this.d = localTime0;
        this.e = z;
        this.f = d1;
        this.g = zoneOffset0;
        this.h = zoneOffset1;
        this.i = zoneOffset2;
    }

    public final b a(int v) {
        LocalDate localDate0;
        d d0 = this.c;
        j j0 = this.a;
        int v1 = this.b;
        if(v1 < 0) {
            localDate0 = LocalDate.d0(v, j0, j0.R(s.d.N(((long)v))) + 1 + v1);
            if(d0 != null) {
                localDate0 = localDate0.m0(new o(d0.getValue(), 1));
            }
        }
        else {
            localDate0 = LocalDate.d0(v, j0, v1);
            if(d0 != null) {
                localDate0 = localDate0.m0(new o(d0.getValue(), 0));
            }
        }
        if(this.e) {
            localDate0 = localDate0.g0(1L);
        }
        LocalDateTime localDateTime0 = LocalDateTime.Z(localDate0, this.d);
        this.f.getClass();
        ZoneOffset zoneOffset0 = this.h;
        switch(this.f) {
            case 1: {
                return new b(localDateTime0.d0(((long)(zoneOffset0.W() - ZoneOffset.UTC.W()))), zoneOffset0, this.i);
            }
            case 2: {
                return new b(localDateTime0.d0(((long)(zoneOffset0.W() - this.g.W()))), zoneOffset0, this.i);
            }
            default: {
                return new b(localDateTime0, zoneOffset0, this.i);
            }
        }
    }

    static e b(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        j j0 = j.T(v >>> 28);
        int v1 = ((0xFC00000 & v) >>> 22) - 0x20;
        int v2 = (0x380000 & v) >>> 19;
        d d0 = v2 == 0 ? null : d.Q(v2);
        int v3 = (0x7C000 & v) >>> 14;
        j..time.zone.d d1 = j..time.zone.d.values()[(v & 0x3000) >>> 12];
        int v4 = (v & 0xFF0) >>> 4;
        int v5 = (v & 12) >>> 2;
        LocalTime localTime0 = v3 == 0x1F ? LocalTime.a0(objectInput0.readInt()) : LocalTime.X(v3 % 24);
        ZoneOffset zoneOffset0 = ZoneOffset.Z((v4 == 0xFF ? objectInput0.readInt() : (v4 - 0x80) * 900));
        ZoneOffset zoneOffset1 = v5 == 3 ? ZoneOffset.Z(objectInput0.readInt()) : ZoneOffset.Z(v5 * 1800 + zoneOffset0.W());
        ZoneOffset zoneOffset2 = (v & 3) == 3 ? ZoneOffset.Z(objectInput0.readInt()) : ZoneOffset.Z((v & 3) * 1800 + zoneOffset0.W());
        Objects.requireNonNull(j0, "month");
        Objects.requireNonNull(localTime0, "time");
        Objects.requireNonNull(d1, "timeDefnition");
        Objects.requireNonNull(zoneOffset0, "standardOffset");
        Objects.requireNonNull(zoneOffset1, "offsetBefore");
        Objects.requireNonNull(zoneOffset2, "offsetAfter");
        if(v1 < -28 || v1 > 0x1F || v1 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if(v3 == 24 && !localTime0.equals(LocalTime.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if(localTime0.V() != 0) {
            throw new IllegalArgumentException("Time\'s nano-of-second must be zero");
        }
        return new e(j0, v1, d0, localTime0, v3 == 24, d1, zoneOffset0, zoneOffset1, zoneOffset2);
    }

    // 去混淆评级： 中等(60)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof e && (this.a == ((e)object0).a && this.b == ((e)object0).b && this.c == ((e)object0).c && this.f == ((e)object0).f && this.d.equals(((e)object0).d) && this.e == ((e)object0).e && this.g.equals(((e)object0).g) && this.h.equals(((e)object0).h) && this.i.equals(((e)object0).i));
    }

    @Override
    public final int hashCode() {
        int v = (this.d.i0() + this.e << 15) + (this.a.ordinal() << 11) + (this.b + 0x20 << 5);
        return this.c == null ? this.g.hashCode() ^ this.f.ordinal() + (v + 28) ^ this.h.hashCode() ^ this.i.hashCode() : this.g.hashCode() ^ this.f.ordinal() + (v + (this.c.ordinal() << 2)) ^ this.h.hashCode() ^ this.i.hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TransitionRule[");
        stringBuilder0.append((this.h.V(this.i) <= 0 ? "Overlap " : "Gap "));
        stringBuilder0.append(this.h);
        stringBuilder0.append(" to ");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", ");
        j j0 = this.a;
        int v = this.b;
        d d0 = this.c;
        if(d0 == null) {
            stringBuilder0.append(j0.name());
            stringBuilder0.append(' ');
            stringBuilder0.append(v);
        }
        else if(v == -1) {
            stringBuilder0.append(d0.name());
            stringBuilder0.append(" on or before last day of ");
            stringBuilder0.append(j0.name());
        }
        else if(v < 0) {
            stringBuilder0.append(d0.name());
            stringBuilder0.append(" on or before last day minus ");
            stringBuilder0.append(-v - 1);
            stringBuilder0.append(" of ");
            stringBuilder0.append(j0.name());
        }
        else {
            stringBuilder0.append(d0.name());
            stringBuilder0.append(" on or after ");
            stringBuilder0.append(j0.name());
            stringBuilder0.append(' ');
            stringBuilder0.append(v);
        }
        stringBuilder0.append(" at ");
        stringBuilder0.append((this.e ? "24:00" : this.d.toString()));
        stringBuilder0.append(" ");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", standard offset ");
        stringBuilder0.append(this.g);
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        int v4;
        LocalTime localTime0 = this.d;
        boolean z = this.e;
        int v = z ? 86400 : localTime0.i0();
        int v1 = this.g.W();
        ZoneOffset zoneOffset0 = this.h;
        int v2 = zoneOffset0.W() - v1;
        ZoneOffset zoneOffset1 = this.i;
        int v3 = zoneOffset1.W() - v1;
        if(v % 3600 != 0) {
            v4 = 0x1F;
        }
        else if(z) {
            v4 = 24;
        }
        else {
            v4 = localTime0.U();
        }
        int v5 = v1 % 900 == 0 ? v1 / 900 + 0x80 : 0xFF;
        int v6 = v2 == 0 || v2 == 1800 || v2 == 3600 ? v2 / 1800 : 3;
        int v7 = v3 == 0 || v3 == 1800 || v3 == 3600 ? v3 / 1800 : 3;
        objectOutput0.writeInt((this.a.getValue() << 28) + (this.b + 0x20 << 22) + ((this.c == null ? 0 : this.c.getValue()) << 19) + (v4 << 14) + (this.f.ordinal() << 12) + (v5 << 4) + (v6 << 2) + v7);
        if(v4 == 0x1F) {
            objectOutput0.writeInt(v);
        }
        if(v5 == 0xFF) {
            objectOutput0.writeInt(v1);
        }
        if(v6 == 3) {
            objectOutput0.writeInt(zoneOffset0.W());
        }
        if(v7 == 3) {
            objectOutput0.writeInt(zoneOffset1.W());
        }
    }

    private Object writeReplace() {
        return new a(3, this);
    }
}

