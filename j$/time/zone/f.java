package j$.time.zone;

import j..com.android.tools.r8.a;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.ZoneOffset;
import j..time.chrono.h;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

public final class f implements Serializable {
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h;
    private static final long[] i = null;
    private static final e[] j = null;
    private static final LocalDateTime[] k = null;
    private static final b[] l = null;
    private static final long serialVersionUID = 0x2A3F985312278703L;

    static {
        f.i = new long[0];
        f.j = new e[0];
        f.k = new LocalDateTime[0];
        f.l = new b[0];
    }

    private f(ZoneOffset zoneOffset0) {
        this.h = new ConcurrentHashMap();
        ZoneOffset[] arr_zoneOffset = new ZoneOffset[1];
        this.b = arr_zoneOffset;
        arr_zoneOffset[0] = zoneOffset0;
        this.a = f.i;
        this.c = f.i;
        this.d = f.k;
        this.e = arr_zoneOffset;
        this.f = f.j;
        this.g = null;
    }

    f(TimeZone timeZone0) {
        this.h = new ConcurrentHashMap();
        ZoneOffset[] arr_zoneOffset = new ZoneOffset[1];
        this.b = arr_zoneOffset;
        arr_zoneOffset[0] = f.j(timeZone0.getRawOffset());
        this.a = f.i;
        this.c = f.i;
        this.d = f.k;
        this.e = arr_zoneOffset;
        this.f = f.j;
        this.g = timeZone0;
    }

    private f(long[] arr_v, ZoneOffset[] arr_zoneOffset, long[] arr_v1, ZoneOffset[] arr_zoneOffset1, e[] arr_e) {
        this.h = new ConcurrentHashMap();
        this.a = arr_v;
        this.b = arr_zoneOffset;
        this.c = arr_v1;
        this.e = arr_zoneOffset1;
        this.f = arr_e;
        if(arr_v1.length == 0) {
            this.d = f.k;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_v1.length; ++v) {
                b b0 = new b(arr_v1[v], arr_zoneOffset1[v], arr_zoneOffset1[v + 1]);
                if(b0.z()) {
                    arrayList0.add(b0.n());
                    arrayList0.add(b0.l());
                }
                else {
                    arrayList0.add(b0.l());
                    arrayList0.add(b0.n());
                }
            }
            this.d = (LocalDateTime[])arrayList0.toArray(new LocalDateTime[arrayList0.size()]);
        }
        this.g = null;
    }

    private static Object a(LocalDateTime localDateTime0, b b0) {
        LocalDateTime localDateTime1 = b0.n();
        if(b0.z()) {
            if(localDateTime0.W(localDateTime1)) {
                return b0.u();
            }
            return localDateTime0.W(b0.l()) ? b0 : b0.q();
        }
        if(!localDateTime0.W(localDateTime1)) {
            return b0.q();
        }
        return localDateTime0.W(b0.l()) ? b0.u() : b0;
    }

    private b[] b(int v) {
        long v7;
        Integer integer0 = v;
        ConcurrentHashMap concurrentHashMap0 = this.h;
        b[] arr_b = (b[])concurrentHashMap0.get(integer0);
        if(arr_b != null) {
            return arr_b;
        }
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            b[] arr_b1 = f.l;
            if(v < 1800) {
                return arr_b1;
            }
            long v2 = h.n(LocalDateTime.X(v - 1), this.b[0]);
            int v3 = timeZone0.getOffset(v2 * 1000L);
            for(long v4 = v2 + 31968000L; v2 < v4; v4 = v7) {
                long v5 = v2 + 7776000L;
                if(v3 == timeZone0.getOffset(v5 * 1000L)) {
                    v7 = v4;
                    v2 = v5;
                }
                else {
                    while(v5 - v2 > 1L) {
                        long v6 = a.n(v5 + v2, 2L);
                        if(timeZone0.getOffset(v6 * 1000L) == v3) {
                            v2 = v6;
                        }
                        else {
                            v5 = v6;
                        }
                    }
                    v7 = v4;
                    if(timeZone0.getOffset(v2 * 1000L) == v3) {
                        v2 = v5;
                    }
                    ZoneOffset zoneOffset0 = f.j(v3);
                    v3 = timeZone0.getOffset(v2 * 1000L);
                    ZoneOffset zoneOffset1 = f.j(v3);
                    if(f.c(v2, zoneOffset1) == v) {
                        arr_b1 = (b[])Arrays.copyOf(arr_b1, arr_b1.length + 1);
                        arr_b1[arr_b1.length - 1] = new b(v2, zoneOffset0, zoneOffset1);
                    }
                }
            }
            if(0x77C <= v && v < 2100) {
                concurrentHashMap0.putIfAbsent(integer0, arr_b1);
            }
            return arr_b1;
        }
        e[] arr_e = this.f;
        b[] arr_b2 = new b[arr_e.length];
        for(int v1 = 0; v1 < arr_e.length; ++v1) {
            arr_b2[v1] = arr_e[v1].a(v);
        }
        if(v < 2100) {
            concurrentHashMap0.putIfAbsent(integer0, arr_b2);
        }
        return arr_b2;
    }

    private static int c(long v, ZoneOffset zoneOffset0) {
        return LocalDate.ofEpochDay(a.n(v + ((long)zoneOffset0.W()), 86400L)).X();
    }

    public final ZoneOffset d(Instant instant0) {
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            return f.j(timeZone0.getOffset(instant0.toEpochMilli()));
        }
        long[] arr_v = this.c;
        if(arr_v.length == 0) {
            return this.b[0];
        }
        long v1 = instant0.getEpochSecond();
        ZoneOffset[] arr_zoneOffset = this.e;
        if(this.f.length > 0 && v1 > arr_v[arr_v.length - 1]) {
            b[] arr_b = this.b(f.c(v1, arr_zoneOffset[arr_zoneOffset.length - 1]));
            b b0 = null;
            for(int v = 0; v < arr_b.length; ++v) {
                b0 = arr_b[v];
                if(v1 < b0.P()) {
                    return b0.u();
                }
            }
            return b0.q();
        }
        int v2 = Arrays.binarySearch(arr_v, v1);
        if(v2 < 0) {
            v2 = -v2 - 2;
        }
        return arr_zoneOffset[v2 + 1];
    }

    private Object e(LocalDateTime localDateTime0) {
        Object object0 = null;
        ZoneOffset[] arr_zoneOffset = this.b;
        int v = 0;
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            b[] arr_b = this.b(localDateTime0.U());
            if(arr_b.length == 0) {
                return f.j(timeZone0.getOffset(h.n(localDateTime0, arr_zoneOffset[0]) * 1000L));
            }
            while(v < arr_b.length) {
                b b0 = arr_b[v];
                Object object1 = f.a(localDateTime0, b0);
                if(!(object1 instanceof b) && !object1.equals(b0.u())) {
                    ++v;
                    object0 = object1;
                    continue;
                }
                return object1;
            }
            return object0;
        }
        if(this.c.length == 0) {
            return arr_zoneOffset[0];
        }
        LocalDateTime[] arr_localDateTime = this.d;
        if(this.f.length > 0 && localDateTime0.V(arr_localDateTime[arr_localDateTime.length - 1])) {
            b[] arr_b1 = this.b(localDateTime0.U());
            while(v < arr_b1.length) {
                b b1 = arr_b1[v];
                Object object2 = f.a(localDateTime0, b1);
                if(!(object2 instanceof b) && !object2.equals(b1.u())) {
                    ++v;
                    object0 = object2;
                    continue;
                }
                return object2;
            }
            return object0;
        }
        int v1 = Arrays.binarySearch(arr_localDateTime, localDateTime0);
        ZoneOffset[] arr_zoneOffset1 = this.e;
        if(v1 == -1) {
            return arr_zoneOffset1[0];
        }
        if(v1 < 0) {
            v1 = -v1 - 2;
        }
        else if(v1 < arr_localDateTime.length - 1 && arr_localDateTime[v1].equals(arr_localDateTime[v1 + 1])) {
            ++v1;
        }
        if((v1 & 1) == 0) {
            LocalDateTime localDateTime1 = arr_localDateTime[v1];
            LocalDateTime localDateTime2 = arr_localDateTime[v1 + 1];
            ZoneOffset zoneOffset0 = arr_zoneOffset1[v1 / 2];
            ZoneOffset zoneOffset1 = arr_zoneOffset1[v1 / 2 + 1];
            return zoneOffset1.W() <= zoneOffset0.W() ? new b(localDateTime2, zoneOffset0, zoneOffset1) : new b(localDateTime1, zoneOffset0, zoneOffset1);
        }
        return arr_zoneOffset1[v1 / 2 + 1];
    }

    // 去混淆评级： 中等(80)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof f && (Objects.equals(this.g, ((f)object0).g) && Arrays.equals(this.a, ((f)object0).a) && Arrays.equals(this.b, ((f)object0).b) && Arrays.equals(this.c, ((f)object0).c) && Arrays.equals(this.e, ((f)object0).e) && Arrays.equals(this.f, ((f)object0).f));
    }

    public final b f(LocalDateTime localDateTime0) {
        Object object0 = this.e(localDateTime0);
        return object0 instanceof b ? ((b)object0) : null;
    }

    public final List g(LocalDateTime localDateTime0) {
        Object object0 = this.e(localDateTime0);
        return object0 instanceof b ? ((b)object0).y() : Collections.singletonList(((ZoneOffset)object0));
    }

    public final boolean h(Instant instant0) {
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            return !f.j(timeZone0.getRawOffset()).equals(this.d(instant0));
        }
        ZoneOffset[] arr_zoneOffset = this.b;
        if(this.c.length == 0) {
            return !arr_zoneOffset[0].equals(this.d(instant0));
        }
        int v = Arrays.binarySearch(this.a, instant0.getEpochSecond());
        if(v < 0) {
            v = -v - 2;
        }
        return !arr_zoneOffset[v + 1].equals(this.d(instant0));
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a);
        int v1 = Arrays.hashCode(this.b);
        int v2 = Arrays.hashCode(this.c);
        int v3 = Arrays.hashCode(this.e);
        int v4 = Arrays.hashCode(this.f);
        return Objects.hashCode(this.g) ^ v ^ v1 ^ v2 ^ v3 ^ v4;
    }

    public static f i(ZoneOffset zoneOffset0) {
        Objects.requireNonNull(zoneOffset0, "offset");
        return new f(zoneOffset0);
    }

    private static ZoneOffset j(int v) {
        return ZoneOffset.Z(v / 1000);
    }

    static f k(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        long[] arr_v = f.i;
        long[] arr_v1 = v == 0 ? arr_v : new long[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_v1[v2] = j..time.zone.a.a(objectInput0);
        }
        ZoneOffset[] arr_zoneOffset = new ZoneOffset[v + 1];
        for(int v3 = 0; v3 < v + 1; ++v3) {
            arr_zoneOffset[v3] = j..time.zone.a.b(objectInput0);
        }
        int v4 = objectInput0.readInt();
        if(v4 != 0) {
            arr_v = new long[v4];
        }
        for(int v5 = 0; v5 < v4; ++v5) {
            arr_v[v5] = j..time.zone.a.a(objectInput0);
        }
        ZoneOffset[] arr_zoneOffset1 = new ZoneOffset[v4 + 1];
        for(int v6 = 0; v6 < v4 + 1; ++v6) {
            arr_zoneOffset1[v6] = j..time.zone.a.b(objectInput0);
        }
        int v7 = objectInput0.readByte();
        e[] arr_e = v7 == 0 ? f.j : new e[v7];
        for(int v1 = 0; v1 < v7; ++v1) {
            arr_e[v1] = e.b(objectInput0);
        }
        return new f(arr_v1, arr_zoneOffset, arr_v, arr_zoneOffset1, arr_e);
    }

    final void l(ObjectOutput objectOutput0) {
        objectOutput0.writeUTF(this.g.getID());
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return this.g == null ? "ZoneRules[currentStandardOffset=" + this.b[this.b.length - 1] + "]" : "ZoneRules[timeZone=" + this.g.getID() + "]";
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        long[] arr_v = this.a;
        objectOutput0.writeInt(arr_v.length);
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            j..time.zone.a.c(arr_v[v1], objectOutput0);
        }
        ZoneOffset[] arr_zoneOffset = this.b;
        for(int v2 = 0; v2 < arr_zoneOffset.length; ++v2) {
            j..time.zone.a.d(arr_zoneOffset[v2], objectOutput0);
        }
        long[] arr_v1 = this.c;
        objectOutput0.writeInt(arr_v1.length);
        for(int v3 = 0; v3 < arr_v1.length; ++v3) {
            j..time.zone.a.c(arr_v1[v3], objectOutput0);
        }
        ZoneOffset[] arr_zoneOffset1 = this.e;
        for(int v4 = 0; v4 < arr_zoneOffset1.length; ++v4) {
            j..time.zone.a.d(arr_zoneOffset1[v4], objectOutput0);
        }
        e[] arr_e = this.f;
        objectOutput0.writeByte(arr_e.length);
        for(int v = 0; v < arr_e.length; ++v) {
            arr_e[v].writeExternal(objectOutput0);
        }
    }

    private Object writeReplace() {
        return this.g == null ? new j..time.zone.a(1, this) : new j..time.zone.a(100, this);
    }
}

