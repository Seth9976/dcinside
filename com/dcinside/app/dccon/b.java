package com.dcinside.app.dccon;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b {
    @m
    private String a;
    @m
    private String b;
    @m
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;

    public b() {
        this(null, null, null, false, false, false, 0x3F, null);
    }

    public b(@m String s, @m String s1, @m String s2, boolean z, boolean z1, boolean z2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = z1;
        this.f = z2;
    }

    public b(String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v, w w0) {
        if((v & 4) != 0) {
            s2 = null;
        }
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? s1 : ""), s2, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false), ((v & 0x20) == 0 ? z2 : false));
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final String c() {
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
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!L.g(this.a, ((b)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((b)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((b)object0).c)) {
            return false;
        }
        if(this.d != ((b)object0).d) {
            return false;
        }
        return this.e == ((b)object0).e ? this.f == ((b)object0).f : false;
    }

    public final boolean f() {
        return this.f;
    }

    @l
    public final b g(@m String s, @m String s1, @m String s2, boolean z, boolean z1, boolean z2) {
        return new b(s, s1, s2, z, z1, z2);
    }

    public static b h(b b0, String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            s = b0.a;
        }
        if((v & 2) != 0) {
            s1 = b0.b;
        }
        if((v & 4) != 0) {
            s2 = b0.c;
        }
        if((v & 8) != 0) {
            z = b0.d;
        }
        if((v & 16) != 0) {
            z1 = b0.e;
        }
        if((v & 0x20) != 0) {
            z2 = b0.f;
        }
        return b0.g(s, s1, s2, z, z1, z2);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f);
    }

    @m
    public final String i() {
        return this.c;
    }

    @m
    public final String j() [...] // 潜在的解密器

    @m
    public final String k() [...] // 潜在的解密器

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        return this.d;
    }

    public final boolean n() {
        return this.f;
    }

    public final void o(boolean z) {
        this.e = z;
    }

    public final void p(boolean z) {
        this.d = z;
    }

    public final void q(@m String s) {
        this.c = s;
    }

    public final void r(@m String s) {
        this.b = s;
    }

    public final void s(boolean z) {
        this.f = z;
    }

    public final void t(@m String s) {
        this.a = s;
    }

    @Override
    @l
    public String toString() {
        return "DcconPiece(memo=" + this.a + ", dcconUrl=" + this.b + ", dcconDetailIdx=" + this.c + ", isDcconBlocked=" + this.d + ", isDcconBlockHide=" + this.e + ", isIgnoreDcconBlock=" + this.f + ")";
    }
}

