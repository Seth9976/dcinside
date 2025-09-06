package com.dcinside.app.response;

import com.dcinside.app.model.f0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g extends f0 {
    public static final class a {
        @c("no")
        private final int a;
        @c("subject")
        @m
        private final String b;

        public a() {
            this(0, null, 3, null);
        }

        public a(int v, @m String s) {
            this.a = v;
            this.b = s;
        }

        public a(int v, String s, int v1, w w0) {
            if((v1 & 1) != 0) {
                v = 0;
            }
            if((v1 & 2) != 0) {
                s = null;
            }
            this(v, s);
        }

        public final int a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @l
        public final a c(int v, @m String s) {
            return new a(v, s);
        }

        public static a d(a g$a0, int v, String s, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = g$a0.a;
            }
            if((v1 & 2) != 0) {
                s = g$a0.b;
            }
            return g$a0.c(v, s);
        }

        public final int e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return this.a == ((a)object0).a ? L.g(this.b, ((a)object0).b) : false;
        }

        @m
        public final String f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            return this.b == null ? v : v + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "EntrustMember(postNumber=" + this.a + ", subject=" + this.b + ")";
        }
    }

    @c("master_id")
    @m
    private final String e;
    @c("master_name")
    @m
    private final String f;
    @c("situation")
    @m
    private final String g;
    @c("dday")
    private final int h;
    @c("resign_reason")
    @m
    private final String i;
    @c("create_dt")
    @m
    private final String j;
    @c("up_dt")
    @m
    private final String k;
    @c("submanager")
    @m
    private final List l;
    @c("entrust_member")
    @m
    private final List m;
    @c("request")
    private final boolean n;

    public g() {
        this(null, null, null, 0, null, null, null, null, null, false, 0x3FF, null);
    }

    public g(@m String s, @m String s1, @m String s2, int v, @m String s3, @m String s4, @m String s5, @m List list0, @m List list1, boolean z) {
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.h = v;
        this.i = s3;
        this.j = s4;
        this.k = s5;
        this.l = list0;
        this.m = list1;
        this.n = z;
    }

    public g(String s, String s1, String s2, int v, String s3, String s4, String s5, List list0, List list1, boolean z, int v1, w w0) {
        List list2 = null;
        boolean z1 = false;
        if((v1 & 0x100) == 0) {
            list2 = list1;
        }
        if((v1 & 0x200) == 0) {
            z1 = z;
        }
        this(((v1 & 1) == 0 ? s : null), ((v1 & 2) == 0 ? s1 : null), ((v1 & 4) == 0 ? s2 : null), ((v1 & 8) == 0 ? v : 0), ((v1 & 16) == 0 ? s3 : null), ((v1 & 0x20) == 0 ? s4 : null), ((v1 & 0x40) == 0 ? s5 : null), ((v1 & 0x80) == 0 ? list0 : null), list2, z1);
    }

    @m
    public final String A() {
        return this.e;
    }

    @m
    public final String B() {
        return this.f;
    }

    public final boolean C() {
        return this.n;
    }

    @m
    public final String D() {
        return this.i;
    }

    @m
    public final String E() {
        return this.g;
    }

    @m
    public final List F() {
        return this.l;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(g.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.response.ManagerInfo");
        if(!L.g(this.e, ((g)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((g)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((g)object0).g)) {
            return false;
        }
        if(this.h != ((g)object0).h) {
            return false;
        }
        if(!L.g(this.i, ((g)object0).i)) {
            return false;
        }
        if(!L.g(this.j, ((g)object0).j)) {
            return false;
        }
        if(!L.g(this.k, ((g)object0).k)) {
            return false;
        }
        if(!L.g(this.l, ((g)object0).l)) {
            return false;
        }
        return L.g(this.m, ((g)object0).m) ? this.n == ((g)object0).n : false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return m0.a.a.i(this.d()) && m0.a.a.i(this.a());
    }

    @m
    public final String g() {
        return this.e;
    }

    public final boolean h() {
        return this.n;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((this.e == null ? 0 : this.e.hashCode()) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + this.h) * 0x1F;
        int v2 = this.i == null ? 0 : this.i.hashCode();
        int v3 = this.j == null ? 0 : this.j.hashCode();
        int v4 = this.k == null ? 0 : this.k.hashCode();
        int v5 = this.l == null ? 0 : this.l.hashCode();
        List list0 = this.m;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + androidx.compose.foundation.c.a(this.n);
    }

    @m
    public final String i() {
        return this.f;
    }

    @m
    public final String l() {
        return this.g;
    }

    public final int m() {
        return this.h;
    }

    @m
    public final String o() {
        return this.i;
    }

    @m
    public final String q() {
        return this.j;
    }

    @m
    public final String r() {
        return this.k;
    }

    @m
    public final List s() {
        return this.l;
    }

    @m
    public final List t() {
        return this.m;
    }

    @Override
    @l
    public String toString() {
        return "ManagerInfo(masterId=" + this.e + ", masterName=" + this.f + ", situation=" + this.g + ", days=" + this.h + ", resignReason=" + this.i + ", dateCreate=" + this.j + ", dateUp=" + this.k + ", subManagerList=" + this.l + ", entrustMemberList=" + this.m + ", request=" + this.n + ")";
    }

    @l
    public final g u(@m String s, @m String s1, @m String s2, int v, @m String s3, @m String s4, @m String s5, @m List list0, @m List list1, boolean z) {
        return new g(s, s1, s2, v, s3, s4, s5, list0, list1, z);
    }

    public static g v(g g0, String s, String s1, String s2, int v, String s3, String s4, String s5, List list0, List list1, boolean z, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : g0.e;
        String s7 = (v1 & 2) == 0 ? s1 : g0.f;
        String s8 = (v1 & 4) == 0 ? s2 : g0.g;
        int v2 = (v1 & 8) == 0 ? v : g0.h;
        String s9 = (v1 & 16) == 0 ? s3 : g0.i;
        String s10 = (v1 & 0x20) == 0 ? s4 : g0.j;
        String s11 = (v1 & 0x40) == 0 ? s5 : g0.k;
        List list2 = (v1 & 0x80) == 0 ? list0 : g0.l;
        List list3 = (v1 & 0x100) == 0 ? list1 : g0.m;
        return (v1 & 0x200) == 0 ? g0.u(s6, s7, s8, v2, s9, s10, s11, list2, list3, z) : g0.u(s6, s7, s8, v2, s9, s10, s11, list2, list3, g0.n);
    }

    @m
    public final String w() {
        return this.j;
    }

    @m
    public final String x() {
        return this.k;
    }

    public final int y() {
        return this.h;
    }

    @m
    public final List z() {
        return this.m;
    }
}

