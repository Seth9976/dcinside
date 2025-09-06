package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import kotlin.reflect.e;
import y4.l;
import y4.m;

public final class u {
    private final boolean a;
    private final boolean b;
    @m
    private final e0 c;
    @m
    private final Long d;
    @m
    private final Long e;
    @m
    private final Long f;
    @m
    private final Long g;
    @l
    private final Map h;

    public u() {
        this(false, false, null, null, null, null, null, null, 0xFF, null);
    }

    public u(boolean z, boolean z1, @m e0 e00, @m Long long0, @m Long long1, @m Long long2, @m Long long3, @l Map map0) {
        L.p(map0, "extras");
        super();
        this.a = z;
        this.b = z1;
        this.c = e00;
        this.d = long0;
        this.e = long1;
        this.f = long2;
        this.g = long3;
        this.h = Y.D0(map0);
    }

    public u(boolean z, boolean z1, e0 e00, Long long0, Long long1, Long long2, Long long3, Map map0, int v, w w0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? e00 : null), ((v & 8) == 0 ? long0 : null), ((v & 16) == 0 ? long1 : null), ((v & 0x20) == 0 ? long2 : null), ((v & 0x40) == 0 ? long3 : null), ((v & 0x80) == 0 ? map0 : Y.z()));
    }

    @l
    public final u a(boolean z, boolean z1, @m e0 e00, @m Long long0, @m Long long1, @m Long long2, @m Long long3, @l Map map0) {
        L.p(map0, "extras");
        return new u(z, z1, e00, long0, long1, long2, long3, map0);
    }

    public static u b(u u0, boolean z, boolean z1, e0 e00, Long long0, Long long1, Long long2, Long long3, Map map0, int v, Object object0) {
        boolean z2 = (v & 1) == 0 ? z : u0.a;
        boolean z3 = (v & 2) == 0 ? z1 : u0.b;
        e0 e01 = (v & 4) == 0 ? e00 : u0.c;
        Long long4 = (v & 8) == 0 ? long0 : u0.d;
        Long long5 = (v & 16) == 0 ? long1 : u0.e;
        Long long6 = (v & 0x20) == 0 ? long2 : u0.f;
        Long long7 = (v & 0x40) == 0 ? long3 : u0.g;
        return (v & 0x80) == 0 ? u0.a(z2, z3, e01, long4, long5, long6, long7, map0) : u0.a(z2, z3, e01, long4, long5, long6, long7, u0.h);
    }

    @m
    public final Object c(@l d d0) {
        L.p(d0, "type");
        Object object0 = this.h.get(d0);
        return object0 == null ? null : e.a(d0, object0);
    }

    @m
    public final Long d() {
        return this.e;
    }

    @l
    public final Map e() {
        return this.h;
    }

    @m
    public final Long f() {
        return this.g;
    }

    @m
    public final Long g() {
        return this.f;
    }

    @m
    public final Long h() {
        return this.d;
    }

    @m
    public final e0 i() {
        return this.c;
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        if(this.a) {
            arrayList0.add("isRegularFile");
        }
        if(this.b) {
            arrayList0.add("isDirectory");
        }
        if(this.d != null) {
            arrayList0.add("byteCount=" + this.d);
        }
        if(this.e != null) {
            arrayList0.add("createdAt=" + this.e);
        }
        if(this.f != null) {
            arrayList0.add("lastModifiedAt=" + this.f);
        }
        if(this.g != null) {
            arrayList0.add("lastAccessedAt=" + this.g);
        }
        if(!this.h.isEmpty()) {
            arrayList0.add("extras=" + this.h);
        }
        return kotlin.collections.u.m3(arrayList0, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}

