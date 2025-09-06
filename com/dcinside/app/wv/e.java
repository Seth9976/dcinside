package com.dcinside.app.wv;

import androidx.compose.foundation.c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import org.jsoup.nodes.f;
import y4.l;
import y4.m;

public final class e {
    @l
    private final f a;
    @l
    private final List b;
    @l
    private final Map c;
    private boolean d;
    private boolean e;

    public e(@l f f0, @l List list0, @l Map map0, boolean z, boolean z1) {
        L.p(f0, "document");
        L.p(list0, "imageList");
        L.p(map0, "gifMap");
        super();
        this.a = f0;
        this.b = list0;
        this.c = map0;
        this.d = z;
        this.e = z1;
    }

    @l
    public final f a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final Map c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((e)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((e)object0).c)) {
            return false;
        }
        return this.d == ((e)object0).d ? this.e == ((e)object0).e : false;
    }

    @l
    public final e f(@l f f0, @l List list0, @l Map map0, boolean z, boolean z1) {
        L.p(f0, "document");
        L.p(list0, "imageList");
        L.p(map0, "gifMap");
        return new e(f0, list0, map0, z, z1);
    }

    public static e g(e e0, f f0, List list0, Map map0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            f0 = e0.a;
        }
        if((v & 2) != 0) {
            list0 = e0.b;
        }
        if((v & 4) != 0) {
            map0 = e0.c;
        }
        if((v & 8) != 0) {
            z = e0.d;
        }
        if((v & 16) != 0) {
            z1 = e0.e;
        }
        return e0.f(f0, list0, map0, z, z1);
    }

    public final boolean h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e);
    }

    @l
    public final f i() {
        return this.a;
    }

    @l
    public final Map j() {
        return this.c;
    }

    public final boolean k() {
        return this.d;
    }

    @l
    public final List l() {
        return this.b;
    }

    public final void m(boolean z) {
        this.e = z;
    }

    public final void n(boolean z) {
        this.d = z;
    }

    @Override
    @l
    public String toString() {
        return "ContentWeb(document=" + this.a + ", imageList=" + this.b + ", gifMap=" + this.c + ", hasHateWord=" + this.d + ", alertHateWord=" + this.e + ")";
    }
}

