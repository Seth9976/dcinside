package com.dcinside.app.model;

import com.dcinside.app.util.Dl;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public final class b {
    @s0({"SMAP\nAdScriptItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdScriptItem.kt\ncom/dcinside/app/model/AdScriptItem$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1557#2:110\n1628#2,3:111\n1755#2,3:114\n1755#2,3:117\n*S KotlinDebug\n*F\n+ 1 AdScriptItem.kt\ncom/dcinside/app/model/AdScriptItem$Companion\n*L\n81#1:110\n81#1:111,3\n81#1:114,3\n92#1:117,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final String b(b b0, int v) {
            if(v != -1) {
                List list0 = b0.p();
                if(list0 != null) {
                    ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                    for(Object object0: list0) {
                        arrayList0.add(Integer.parseInt(((String)object0)));
                    }
                    if(!arrayList0.isEmpty()) {
                        for(Object object1: arrayList0) {
                            if(((Number)object1).intValue() == v) {
                                String s = Dl.M(b0.r());
                                L.m(s);
                                return s;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
            }
            return "";
        }

        private final String c(b b0) {
            String s = Dl.M(b0.r());
            L.m(s);
            return v.W2(s, "아이디", false, 2, null) ? "" : s;
        }

        private final String d(b b0, String s) {
            List list0 = b0.p();
            if(list0 != null && (!(list0 instanceof Collection) || !list0.isEmpty())) {
                for(Object object0: list0) {
                    if(L.g(((String)object0), s)) {
                        String s1 = Dl.M(b0.r());
                        L.m(s1);
                        return v.j2(s1, "아이디", s, false);
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return "";
        }

        @n
        private final String e(b b0, String s, int v) {
            if(b0 == null) {
                return "";
            }
            if(L.g("true", b0.q()) && b0.r() != null && b0.u() != 0L && b0.o() != 0L) {
                long v1 = System.currentTimeMillis();
                if(v1 <= b0.o() + TimeUnit.DAYS.toMillis(1L) - 1L && b0.u() + 1L <= v1) {
                    String s1 = b0.v();
                    if(L.g(s1, "category")) {
                        return v == -1 ? "" : this.b(b0, v);
                    }
                    if(L.g(s1, "gallery")) {
                        return s == null ? "" : this.d(b0, s);
                    }
                    return this.c(b0);
                }
            }
            return "";
        }

        @l
        @n
        public final String f(@m List list0, @m String s, int v) {
            if(list0 != null && !list0.isEmpty() == 1) {
                for(Object object0: list0) {
                    String s1 = this.e(((b)object0), s, v);
                    if(!v.x3(s1)) {
                        return s1;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return "";
        }

        public static String g(a b$a0, List list0, String s, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                s = null;
            }
            if((v1 & 4) != 0) {
                v = 0;
            }
            return b$a0.f(list0, s, v);
        }
    }

    @c("result")
    @m
    private final String a;
    @c("gall_list")
    @m
    private String b;
    @c("ad_script")
    @m
    private final String c;
    @c("setting_style")
    @m
    private final String d;
    @c("start_time")
    @m
    private String e;
    @c("end_time")
    @m
    private String f;
    @com.dcinside.app.util.Ik.a
    @m
    private List g;
    @com.dcinside.app.util.Ik.a
    private long h;
    @com.dcinside.app.util.Ik.a
    private long i;
    @l
    public static final a j;

    static {
        b.j = new a(null);
    }

    public b() {
        this(null, null, null, null, null, null, null, 0L, 0L, 0x1FF, null);
    }

    public b(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m List list0, long v, long v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = list0;
        this.h = v;
        this.i = v1;
    }

    public b(String s, String s1, String s2, String s3, String s4, String s5, List list0, long v, long v1, int v2, w w0) {
        this(((v2 & 1) == 0 ? s : null), ((v2 & 2) == 0 ? s1 : null), ((v2 & 4) == 0 ? s2 : null), ((v2 & 8) == 0 ? s3 : null), ((v2 & 16) == 0 ? s4 : null), ((v2 & 0x20) == 0 ? s5 : null), ((v2 & 0x40) == 0 ? list0 : null), ((v2 & 0x80) == 0 ? v : 0L), ((v2 & 0x100) == 0 ? v1 : 0L));
    }

    public final void A(@m List list0) {
        this.g = list0;
    }

    public final void B(long v) {
        this.h = v;
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

    @m
    public final String d() {
        return this.d;
    }

    @m
    public final String e() {
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
        if(!L.g(this.d, ((b)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((b)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((b)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((b)object0).g)) {
            return false;
        }
        return this.h == ((b)object0).h ? this.i == ((b)object0).i : false;
    }

    @m
    public final String f() {
        return this.f;
    }

    @m
    public final List g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        List list0 = this.g;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + ((int)(this.i ^ this.i >>> 0x20));
    }

    public final long i() {
        return this.i;
    }

    @l
    public final b j(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m List list0, long v, long v1) {
        return new b(s, s1, s2, s3, s4, s5, list0, v, v1);
    }

    public static b k(b b0, String s, String s1, String s2, String s3, String s4, String s5, List list0, long v, long v1, int v2, Object object0) {
        String s6 = (v2 & 1) == 0 ? s : b0.a;
        String s7 = (v2 & 2) == 0 ? s1 : b0.b;
        String s8 = (v2 & 4) == 0 ? s2 : b0.c;
        String s9 = (v2 & 8) == 0 ? s3 : b0.d;
        String s10 = (v2 & 16) == 0 ? s4 : b0.e;
        String s11 = (v2 & 0x20) == 0 ? s5 : b0.f;
        List list1 = (v2 & 0x40) == 0 ? list0 : b0.g;
        long v3 = (v2 & 0x80) == 0 ? v : b0.h;
        return (v2 & 0x100) == 0 ? b0.j(s6, s7, s8, s9, s10, s11, list1, v3, v1) : b0.j(s6, s7, s8, s9, s10, s11, list1, v3, b0.i);
    }

    @m
    public final String l() {
        return this.f;
    }

    @m
    public final String m() {
        return this.b;
    }

    @m
    public final String n() {
        return this.e;
    }

    public final long o() {
        return this.i;
    }

    @m
    public final List p() {
        return this.g;
    }

    @m
    public final String q() {
        return this.a;
    }

    @m
    public final String r() {
        return this.c;
    }

    @n
    private static final String s(b b0, String s, int v) {
        return b.j.e(b0, s, v);
    }

    @l
    @n
    public static final String t(@m List list0, @m String s, int v) {
        return b.j.f(list0, s, v);
    }

    @Override
    @l
    public String toString() {
        return "AdScriptItem(result=" + this.a + ", defList=" + this.b + ", script=" + this.c + ", style=" + this.d + ", defStart=" + this.e + ", defEnd=" + this.f + ", list=" + this.g + ", start=" + this.h + ", end=" + this.i + ")";
    }

    public final long u() {
        return this.h;
    }

    @m
    public final String v() {
        return this.d;
    }

    public final void w(@m String s) {
        this.f = s;
    }

    public final void x(@m String s) {
        this.b = s;
    }

    public final void y(@m String s) {
        this.e = s;
    }

    public final void z(long v) {
        this.i = v;
    }
}

