package com.dcinside.app.response;

import com.dcinside.app.model.Mention;
import com.dcinside.app.read.L0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class j implements Comparable {
    public static final class a {
        private final int a;
        @l
        private final String b;
        @m
        private final String c;
        @m
        private final CharSequence d;
        @l
        private final L0 e;

        public a(int v, @l String s, @m String s1, @m CharSequence charSequence0, @l L0 l00) {
            L.p(s, "name");
            L.p(l00, "duplicateKey");
            super();
            this.a = v;
            this.b = s;
            this.c = s1;
            this.d = charSequence0;
            this.e = l00;
        }

        public final int a() {
            return this.a;
        }

        @l
        public final String b() {
            return this.b;
        }

        @m
        public final String c() {
            return this.c;
        }

        @m
        public final CharSequence d() {
            return this.d;
        }

        @l
        public final L0 e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(this.a != ((a)object0).a) {
                return false;
            }
            if(!L.g(this.b, ((a)object0).b)) {
                return false;
            }
            if(!L.g(this.c, ((a)object0).c)) {
                return false;
            }
            return L.g(this.d, ((a)object0).d) ? L.g(this.e, ((a)object0).e) : false;
        }

        @l
        public final a f(int v, @l String s, @m String s1, @m CharSequence charSequence0, @l L0 l00) {
            L.p(s, "name");
            L.p(l00, "duplicateKey");
            return new a(v, s, s1, charSequence0, l00);
        }

        public static a g(a j$a0, int v, String s, String s1, CharSequence charSequence0, L0 l00, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = j$a0.a;
            }
            if((v1 & 2) != 0) {
                s = j$a0.b;
            }
            if((v1 & 4) != 0) {
                s1 = j$a0.c;
            }
            if((v1 & 8) != 0) {
                charSequence0 = j$a0.d;
            }
            if((v1 & 16) != 0) {
                l00 = j$a0.e;
            }
            return j$a0.f(v, s, s1, charSequence0, l00);
        }

        @m
        public final String h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = (this.a * 0x1F + this.b.hashCode()) * 0x1F;
            int v1 = 0;
            int v2 = this.c == null ? 0 : this.c.hashCode();
            CharSequence charSequence0 = this.d;
            if(charSequence0 != null) {
                v1 = charSequence0.hashCode();
            }
            return ((v + v2) * 0x1F + v1) * 0x1F + this.e.hashCode();
        }

        @l
        public final L0 i() {
            return this.e;
        }

        @l
        public final String j() {
            return this.b;
        }

        @m
        public final CharSequence k() {
            return this.d;
        }

        public final int l() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return "ContentSample(type=" + this.a + ", name=" + this.b + ", data=" + this.c + ", text=" + this.d + ", duplicateKey=" + this.e + ")";
        }
    }

    @com.dcinside.app.util.Ik.a
    @l
    private com.dcinside.app.dccon.a A;
    @c("name")
    @m
    private String a;
    @c("user_id")
    @m
    private String b;
    @c("member_icon")
    private int c;
    @c("gallercon")
    @m
    private final String d;
    @c("comment_memo")
    @m
    private String e;
    @c("ipData")
    @m
    private String f;
    @c("voice")
    @m
    private String g;
    @c("dccon")
    @m
    private String h;
    @c("dccon_type")
    @m
    private String i;
    @c("dccon_detail_idx")
    @m
    private String j;
    @c("comment_no")
    private int k;
    @c("date_time")
    @m
    private String l;
    @c("level")
    @m
    private String m;
    @c("under_step")
    private boolean n;
    @c("is_delete_flag")
    @m
    private String o;
    @c("del_scope")
    private int p;
    @c("commentDel_scope")
    private boolean q;
    @c("modify_scope")
    private boolean r;
    @c("nonuser_num")
    @m
    private String s;
    @c("mention")
    @m
    private final Mention t;
    @com.dcinside.app.util.Ik.a
    @m
    private a u;
    @com.dcinside.app.util.Ik.a
    private boolean v;
    @com.dcinside.app.util.Ik.a
    private int w;
    @com.dcinside.app.util.Ik.a
    private boolean x;
    @com.dcinside.app.util.Ik.a
    private boolean y;
    @com.dcinside.app.util.Ik.a
    private int z;

    public j() {
        this(null, null, 0, null, null, null, null, null, null, null, 0, null, null, false, null, 0, false, false, null, null, null, false, 0, false, false, 0, null, 0x7FFFFFF, null);
    }

    public j(@m String s, @m String s1, int v, @m String s2, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7, @m String s8, int v1, @m String s9, @m String s10, boolean z, @m String s11, int v2, boolean z1, boolean z2, @m String s12, @m Mention mention0, @m a j$a0, boolean z3, int v3, boolean z4, boolean z5, int v4, @l com.dcinside.app.dccon.a a0) {
        L.p(a0, "dcconPack");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = s6;
        this.i = s7;
        this.j = s8;
        this.k = v1;
        this.l = s9;
        this.m = s10;
        this.n = z;
        this.o = s11;
        this.p = v2;
        this.q = z1;
        this.r = z2;
        this.s = s12;
        this.t = mention0;
        this.u = j$a0;
        this.v = z3;
        this.w = v3;
        this.x = z4;
        this.y = z5;
        this.z = v4;
        this.A = a0;
    }

    public j(String s, String s1, int v, String s2, String s3, String s4, String s5, String s6, String s7, String s8, int v1, String s9, String s10, boolean z, String s11, int v2, boolean z1, boolean z2, String s12, Mention mention0, a j$a0, boolean z3, int v3, boolean z4, boolean z5, int v4, com.dcinside.app.dccon.a a0, int v5, w w0) {
        this(((v5 & 1) == 0 ? s : null), ((v5 & 2) == 0 ? s1 : null), ((v5 & 4) == 0 ? v : 0), ((v5 & 8) == 0 ? s2 : null), ((v5 & 16) == 0 ? s3 : null), ((v5 & 0x20) == 0 ? s4 : null), ((v5 & 0x40) == 0 ? s5 : null), ((v5 & 0x80) == 0 ? s6 : null), ((v5 & 0x100) == 0 ? s7 : null), ((v5 & 0x200) == 0 ? s8 : null), ((v5 & 0x400) == 0 ? v1 : 0), ((v5 & 0x800) == 0 ? s9 : null), ((v5 & 0x1000) == 0 ? s10 : null), ((v5 & 0x2000) == 0 ? z : false), ((v5 & 0x4000) == 0 ? s11 : null), ((v5 & 0x8000) == 0 ? v2 : -1), ((v5 & 0x10000) == 0 ? z1 : false), ((v5 & 0x20000) == 0 ? z2 : false), ((v5 & 0x40000) == 0 ? s12 : null), ((v5 & 0x80000) == 0 ? mention0 : null), ((v5 & 0x100000) == 0 ? j$a0 : null), ((v5 & 0x200000) == 0 ? z3 : false), ((v5 & 0x400000) == 0 ? v3 : 0), ((v5 & 0x800000) == 0 ? z4 : false), ((v5 & 0x1000000) == 0 ? z5 : false), ((v5 & 0x2000000) == 0 ? v4 : 0), ((v5 & 0x4000000) == 0 ? a0 : new com.dcinside.app.dccon.a(null, null, false, 7, null)));
    }

    @m
    public final String A() {
        return this.e;
    }

    public final void A0(int v) {
        this.z = v;
    }

    @m
    public final String B() {
        return this.f;
    }

    public final void B0(int v) {
        this.k = v;
    }

    @m
    public final String C() {
        return this.g;
    }

    public final void C0(int v) {
        this.p = v;
    }

    @m
    public final String D() {
        return this.h;
    }

    public final void D0(boolean z) {
        this.q = z;
    }

    @m
    public final String E() {
        return this.i;
    }

    public final void E0(boolean z) {
        this.r = z;
    }

    @l
    public final j F(@m String s, @m String s1, int v, @m String s2, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7, @m String s8, int v1, @m String s9, @m String s10, boolean z, @m String s11, int v2, boolean z1, boolean z2, @m String s12, @m Mention mention0, @m a j$a0, boolean z3, int v3, boolean z4, boolean z5, int v4, @l com.dcinside.app.dccon.a a0) {
        L.p(a0, "dcconPack");
        return new j(s, s1, v, s2, s3, s4, s5, s6, s7, s8, v1, s9, s10, z, s11, v2, z1, z2, s12, mention0, j$a0, z3, v3, z4, z5, v4, a0);
    }

    public final void F0(boolean z) {
        this.n = z;
    }

    public static j G(j j0, String s, String s1, int v, String s2, String s3, String s4, String s5, String s6, String s7, String s8, int v1, String s9, String s10, boolean z, String s11, int v2, boolean z1, boolean z2, String s12, Mention mention0, a j$a0, boolean z3, int v3, boolean z4, boolean z5, int v4, com.dcinside.app.dccon.a a0, int v5, Object object0) {
        String s13 = (v5 & 1) == 0 ? s : j0.a;
        String s14 = (v5 & 2) == 0 ? s1 : j0.b;
        int v6 = (v5 & 4) == 0 ? v : j0.c;
        String s15 = (v5 & 8) == 0 ? s2 : j0.d;
        String s16 = (v5 & 16) == 0 ? s3 : j0.e;
        String s17 = (v5 & 0x20) == 0 ? s4 : j0.f;
        String s18 = (v5 & 0x40) == 0 ? s5 : j0.g;
        String s19 = (v5 & 0x80) == 0 ? s6 : j0.h;
        String s20 = (v5 & 0x100) == 0 ? s7 : j0.i;
        String s21 = (v5 & 0x200) == 0 ? s8 : j0.j;
        int v7 = (v5 & 0x400) == 0 ? v1 : j0.k;
        String s22 = (v5 & 0x800) == 0 ? s9 : j0.l;
        String s23 = (v5 & 0x1000) == 0 ? s10 : j0.m;
        boolean z6 = (v5 & 0x2000) == 0 ? z : j0.n;
        String s24 = (v5 & 0x4000) == 0 ? s11 : j0.o;
        int v8 = (v5 & 0x8000) == 0 ? v2 : j0.p;
        boolean z7 = (v5 & 0x10000) == 0 ? z1 : j0.q;
        boolean z8 = (v5 & 0x20000) == 0 ? z2 : j0.r;
        String s25 = (v5 & 0x40000) == 0 ? s12 : j0.s;
        Mention mention1 = (v5 & 0x80000) == 0 ? mention0 : j0.t;
        a j$a1 = (v5 & 0x100000) == 0 ? j$a0 : j0.u;
        boolean z9 = (v5 & 0x200000) == 0 ? z3 : j0.v;
        int v9 = (v5 & 0x400000) == 0 ? v3 : j0.w;
        boolean z10 = (v5 & 0x800000) == 0 ? z4 : j0.x;
        boolean z11 = (v5 & 0x1000000) == 0 ? z5 : j0.y;
        int v10 = (v5 & 0x2000000) == 0 ? v4 : j0.z;
        return (v5 & 0x4000000) == 0 ? j0.F(s13, s14, v6, s15, s16, s17, s18, s19, s20, s21, v7, s22, s23, z6, s24, v8, z7, z8, s25, mention1, j$a1, z9, v9, z10, z11, v10, a0) : j0.F(s13, s14, v6, s15, s16, s17, s18, s19, s20, s21, v7, s22, s23, z6, s24, v8, z7, z8, s25, mention1, j$a1, z9, v9, z10, z11, v10, j0.A);
    }

    public final void G0(int v) {
        this.w = v;
    }

    @m
    public final a H() {
        return this.u;
    }

    public final void H0(@m String s) {
        this.b = s;
    }

    @m
    public final String I() {
        return this.l;
    }

    public final void I0(@m String s) {
        this.g = s;
    }

    @m
    public final String J() {
        return this.j;
    }

    @m
    public final String K() {
        return this.i;
    }

    @m
    public final String L() {
        return this.h;
    }

    public final boolean M() {
        return this.y;
    }

    @l
    public final com.dcinside.app.dccon.a N() {
        return this.A;
    }

    @m
    public final String O() {
        return this.o;
    }

    @m
    public final String P() {
        return this.s;
    }

    public final boolean Q() {
        return this.x;
    }

    @m
    public final String R() {
        return this.f;
    }

    @m
    public final String S() {
        return this.m;
    }

    @m
    public final String T() {
        return this.d;
    }

    public final int U() {
        return this.c;
    }

    @m
    public final String V() {
        return this.e;
    }

    @m
    public final Mention W() {
        return this.t;
    }

    @m
    public final String X() {
        return this.a;
    }

    public final int Z() {
        return this.z;
    }

    public int a(@l j j0) {
        L.p(j0, "other");
        int v = this.k;
        int v1 = j0.k;
        if(v > v1) {
            return -1;
        }
        return v >= v1 ? 0 : 1;
    }

    public final int a0() {
        return this.k;
    }

    @m
    public final String b() {
        return this.a;
    }

    public final int b0() {
        return this.p;
    }

    @m
    public final String c() {
        return this.j;
    }

    public final boolean c0() {
        return this.q;
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((j)object0));
    }

    public final int d() {
        return this.k;
    }

    public final boolean d0() {
        return this.r;
    }

    @m
    public final String e() {
        return this.l;
    }

    public final int e0() {
        return this.w;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        j j0 = (j)object0;
        if(!L.g(this.a, j0.a)) {
            return false;
        }
        if(!L.g(this.b, j0.b)) {
            return false;
        }
        if(this.c != j0.c) {
            return false;
        }
        if(!L.g(this.d, j0.d)) {
            return false;
        }
        if(!L.g(this.e, j0.e)) {
            return false;
        }
        if(!L.g(this.f, j0.f)) {
            return false;
        }
        if(!L.g(this.g, j0.g)) {
            return false;
        }
        if(!L.g(this.h, j0.h)) {
            return false;
        }
        if(!L.g(this.i, j0.i)) {
            return false;
        }
        if(!L.g(this.j, j0.j)) {
            return false;
        }
        if(this.k != j0.k) {
            return false;
        }
        if(!L.g(this.l, j0.l)) {
            return false;
        }
        if(!L.g(this.m, j0.m)) {
            return false;
        }
        if(this.n != j0.n) {
            return false;
        }
        if(!L.g(this.o, j0.o)) {
            return false;
        }
        if(this.p != j0.p) {
            return false;
        }
        if(this.q != j0.q) {
            return false;
        }
        if(this.r != j0.r) {
            return false;
        }
        if(!L.g(this.s, j0.s)) {
            return false;
        }
        if(!L.g(this.t, j0.t)) {
            return false;
        }
        if(!L.g(this.u, j0.u)) {
            return false;
        }
        if(this.v != j0.v) {
            return false;
        }
        if(this.w != j0.w) {
            return false;
        }
        if(this.x != j0.x) {
            return false;
        }
        if(this.y != j0.y) {
            return false;
        }
        return this.z == j0.z ? L.g(this.A, j0.A) : false;
    }

    @m
    public final String f() {
        return this.m;
    }

    @m
    public final String f0() {
        return this.b;
    }

    public final boolean g() {
        return this.n;
    }

    @m
    public final String g0() {
        return this.g;
    }

    @m
    public final String h() {
        return this.o;
    }

    public final boolean h0() {
        return this.v;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((((((((((((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + this.k) * 0x1F + (this.l == null ? 0 : this.l.hashCode())) * 0x1F + (this.m == null ? 0 : this.m.hashCode())) * 0x1F + androidx.compose.foundation.c.a(this.n)) * 0x1F + (this.o == null ? 0 : this.o.hashCode())) * 0x1F + this.p) * 0x1F + androidx.compose.foundation.c.a(this.q)) * 0x1F + androidx.compose.foundation.c.a(this.r)) * 0x1F;
        int v2 = this.s == null ? 0 : this.s.hashCode();
        int v3 = this.t == null ? 0 : this.t.hashCode();
        a j$a0 = this.u;
        if(j$a0 != null) {
            v = j$a0.hashCode();
        }
        return ((((((((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + androidx.compose.foundation.c.a(this.v)) * 0x1F + this.w) * 0x1F + androidx.compose.foundation.c.a(this.x)) * 0x1F + androidx.compose.foundation.c.a(this.y)) * 0x1F + this.z) * 0x1F + this.A.hashCode();
    }

    public final int i() {
        return this.p;
    }

    public final boolean i0() {
        return this.n;
    }

    public final boolean j() {
        return this.q;
    }

    public final void j0(boolean z) {
        this.v = z;
    }

    public final boolean k() {
        return this.r;
    }

    public final void k0(@m a j$a0) {
        this.u = j$a0;
    }

    @m
    public final String l() {
        return this.s;
    }

    public final void l0(@m String s) {
        this.l = s;
    }

    @m
    public final String m() {
        return this.b;
    }

    public final void m0(@m String s) {
        this.j = s;
    }

    @m
    public final Mention n() {
        return this.t;
    }

    public final void n0(@m String s) {
        this.i = s;
    }

    public final void o0(@m String s) {
        this.h = s;
    }

    @m
    public final a p() {
        return this.u;
    }

    public final void p0(boolean z) {
        this.y = z;
    }

    public final void q0(@l com.dcinside.app.dccon.a a0) {
        L.p(a0, "<set-?>");
        this.A = a0;
    }

    public final boolean r() {
        return this.v;
    }

    public final void r0(@m String s) {
        this.o = s;
    }

    public final int s() {
        return this.w;
    }

    public final void s0(@m String s) {
        this.s = s;
    }

    public final boolean t() {
        return this.x;
    }

    public final void t0(boolean z) {
        this.x = z;
    }

    @Override
    @l
    public String toString() {
        return "ReplyItem(name=" + this.a + ", userId=" + this.b + ", memberType=" + this.c + ", memberIconUrl=" + this.d + ", memo=" + this.e + ", ip=" + this.f + ", voiceUrl=" + this.g + ", dcConUrl=" + this.h + ", dcConType=" + this.i + ", dcConDetailIdx=" + this.j + ", replyNumber=" + this.k + ", dateTime=" + this.l + ", level=" + this.m + ", isUnder=" + this.n + ", deleteFlag=" + this.o + ", scopeDelete=" + this.p + ", scopeDelete2=" + this.q + ", scopeModify=" + this.r + ", guestKey=" + this.s + ", mention=" + this.t + ", contentSample=" + this.u + ", isBlocked=" + this.v + ", underCount=" + this.w + ", hiddenEnable=" + this.x + ", dcconHiddenEnable=" + this.y + ", parentReplyNo=" + this.z + ", dcconPack=" + this.A + ")";
    }

    public final boolean u() {
        return this.y;
    }

    public final int v() {
        return this.z;
    }

    public final void v0(@m String s) {
        this.f = s;
    }

    @l
    public final com.dcinside.app.dccon.a w() {
        return this.A;
    }

    public final void w0(@m String s) {
        this.m = s;
    }

    public final void x0(int v) {
        this.c = v;
    }

    public final int y() {
        return this.c;
    }

    public final void y0(@m String s) {
        this.e = s;
    }

    @m
    public final String z() {
        return this.d;
    }

    public final void z0(@m String s) {
        this.a = s;
    }
}

