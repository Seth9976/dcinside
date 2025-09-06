package com.dcinside.app.write;

import androidx.compose.foundation.c;
import com.dcinside.app.util.ol;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class e {
    @l
    private final ol a;
    @l
    private final ol b;
    private final boolean c;
    private final boolean d;

    public e(@l ol ol0, @l ol ol1, boolean z, boolean z1) {
        L.p(ol0, "originSize");
        L.p(ol1, "overrideSize");
        super();
        this.a = ol0;
        this.b = ol1;
        this.c = z;
        this.d = z1;
    }

    @l
    public final ol a() {
        return this.a;
    }

    @l
    public final ol b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final e e(@l ol ol0, @l ol ol1, boolean z, boolean z1) {
        L.p(ol0, "originSize");
        L.p(ol1, "overrideSize");
        return new e(ol0, ol1, z, z1);
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
        return this.c == ((e)object0).c ? this.d == ((e)object0).d : false;
    }

    public static e f(e e0, ol ol0, ol ol1, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            ol0 = e0.a;
        }
        if((v & 2) != 0) {
            ol1 = e0.b;
        }
        if((v & 4) != 0) {
            z = e0.c;
        }
        if((v & 8) != 0) {
            z1 = e0.d;
        }
        return e0.e(ol0, ol1, z, z1);
    }

    @l
    public final ol g() {
        return this.a;
    }

    @l
    public final ol h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d);
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "ImageSizeTypeInfo(originSize=" + this.a + ", overrideSize=" + this.b + ", isGif=" + this.c + ", isWebp=" + this.d + ")";
    }
}

