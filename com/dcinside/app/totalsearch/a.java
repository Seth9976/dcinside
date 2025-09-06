package com.dcinside.app.totalsearch;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.n;

public final class a {
    @s0({"SMAP\nTotalSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalSearch.kt\ncom/dcinside/app/totalsearch/TotalSearch$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n774#2:177\n865#2,2:178\n*S KotlinDebug\n*F\n+ 1 TotalSearch.kt\ncom/dcinside/app/totalsearch/TotalSearch$Companion\n*L\n171#1:177\n171#1:178,2\n*E\n"})
    public static final class com.dcinside.app.totalsearch.a.a {
        private com.dcinside.app.totalsearch.a.a() {
        }

        public com.dcinside.app.totalsearch.a.a(w w0) {
        }

        @m
        @n
        public final List a(@m ArrayList arrayList0, @l com.dcinside.app.type.m m0) {
            L.p(m0, "galleryType");
            if(arrayList0 != null) {
                List list0 = new ArrayList();
                for(Object object0: arrayList0) {
                    if(L.g(((f)object0).e(), m0.h())) {
                        list0.add(object0);
                    }
                }
                return list0;
            }
            return null;
        }
    }

    public static enum b implements d {
        RANK("rankup"),
        RECENT("recency");

        @l
        private final String a;
        @l
        private final String b;
        private static final b[] e;
        private static final kotlin.enums.a f;

        static {
            b.e = arr_a$b;
            L.p(arr_a$b, "entries");
            b.f = new kotlin.enums.d(arr_a$b);
        }

        private b(String s1) {
            this.a = s1;
            this.b = "content_sort";
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.f;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getKey() {
            return this.b;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getValue() {
            return this.a;
        }
    }

    public static final class c {
        @com.google.gson.annotations.c("total_page")
        private final int a;
        @com.google.gson.annotations.c("type")
        @m
        private final String b;

        public c() {
            this(0, null, 3, null);
        }

        public c(int v, @m String s) {
            this.a = v;
            this.b = s;
        }

        public c(int v, String s, int v1, w w0) {
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
    }

    public interface d {
        @l
        String getKey();

        @l
        String getValue();
    }

    public static enum e implements d {
        MAIN("search_main"),
        GALLERY("gall_name"),
        WIKI("wiki"),
        CONTENT("gall_content"),
        VIDEO("movie"),
        @k(message = "")
        AUTO_COMPLETE("default");

        @l
        private final String a;
        @l
        private final String b;
        private static final e[] i;
        private static final kotlin.enums.a j;

        static {
            e.i = arr_a$e;
            L.p(arr_a$e, "entries");
            e.j = new kotlin.enums.d(arr_a$e);
        }

        private e(String s1) {
            this.a = s1;
            this.b = "search_type";
        }

        private static final e[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return e.j;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getKey() {
            return this.b;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getValue() {
            return this.a;
        }
    }

    public static final class f {
        @com.google.gson.annotations.c("title")
        @m
        private String a;
        @com.google.gson.annotations.c("content")
        @m
        private String b;
        @com.google.gson.annotations.c("id")
        @m
        private String c;
        @com.google.gson.annotations.c("no")
        private int d;
        @com.google.gson.annotations.c("regdate")
        @m
        private String e;
        @com.google.gson.annotations.c("url")
        @m
        private String f;
        @com.google.gson.annotations.c("gall_name")
        @m
        private String g;
        @com.google.gson.annotations.c("gall_state")
        @m
        private String h;
        @com.google.gson.annotations.c("thumbnail")
        @m
        private String i;
        @com.google.gson.annotations.c("is_adult")
        private int j;
        @com.google.gson.annotations.c("play_cnt")
        private int k;
        @com.google.gson.annotations.c("play_time")
        private int l;
        @com.google.gson.annotations.c("rank")
        private int m;
        @com.google.gson.annotations.c("gall_type")
        @m
        private String n;
        @com.google.gson.annotations.c("member_cnt")
        private int o;
        @com.google.gson.annotations.c("new_post")
        private int p;
        @com.google.gson.annotations.c("total_post")
        private int q;
        private boolean r;
        @com.google.gson.annotations.c("profile_img")
        @l
        private final String s;
        @com.google.gson.annotations.c("verify")
        @l
        private final String t;
        @com.google.gson.annotations.c("info")
        @l
        private final String u;

        public f() {
            this(null, null, null, 0, null, null, null, null, null, 0, 0, 0, 0, null, 0, 0, 0, false, null, null, null, 0x1FFFFF, null);
        }

        public f(@m String s, @m String s1, @m String s2, int v, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7, int v1, int v2, int v3, int v4, @m String s8, int v5, int v6, int v7, boolean z, @l String s9, @l String s10, @l String s11) {
            L.p(s9, "profileImg");
            L.p(s10, "verify");
            L.p(s11, "profileInfo");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = v;
            this.e = s3;
            this.f = s4;
            this.g = s5;
            this.h = s6;
            this.i = s7;
            this.j = v1;
            this.k = v2;
            this.l = v3;
            this.m = v4;
            this.n = s8;
            this.o = v5;
            this.p = v6;
            this.q = v7;
            this.r = z;
            this.s = s9;
            this.t = s10;
            this.u = s11;
        }

        public f(String s, String s1, String s2, int v, String s3, String s4, String s5, String s6, String s7, int v1, int v2, int v3, int v4, String s8, int v5, int v6, int v7, boolean z, String s9, String s10, String s11, int v8, w w0) {
            this(((v8 & 1) == 0 ? s : null), ((v8 & 2) == 0 ? s1 : null), ((v8 & 4) == 0 ? s2 : null), ((v8 & 8) == 0 ? v : 0), ((v8 & 16) == 0 ? s3 : null), ((v8 & 0x20) == 0 ? s4 : null), ((v8 & 0x40) == 0 ? s5 : null), ((v8 & 0x80) == 0 ? s6 : null), ((v8 & 0x100) == 0 ? s7 : null), ((v8 & 0x200) == 0 ? v1 : 0), ((v8 & 0x400) == 0 ? v2 : 0), ((v8 & 0x800) == 0 ? v3 : 0), ((v8 & 0x1000) == 0 ? v4 : 0), ((v8 & 0x2000) == 0 ? s8 : null), ((v8 & 0x4000) == 0 ? v5 : 0), ((v8 & 0x8000) == 0 ? v6 : 0), ((v8 & 0x10000) == 0 ? v7 : 0), ((v8 & 0x20000) == 0 ? z : false), ((v8 & 0x40000) == 0 ? s9 : ""), ((v8 & 0x80000) == 0 ? s10 : ""), ((v8 & 0x100000) == 0 ? s11 : ""));
        }

        public final void A(@m String s) {
            this.n = s;
        }

        public final void B(@m String s) {
            this.c = s;
        }

        public final void C(int v) {
            this.o = v;
        }

        public final void D(boolean z) {
            this.r = z;
        }

        public final void E(int v) {
            this.p = v;
        }

        public final void F(int v) {
            this.d = v;
        }

        public final void G(int v) {
            this.k = v;
        }

        public final void H(int v) {
            this.m = v;
        }

        public final void I(@m String s) {
            this.h = s;
        }

        public final void J(@m String s) {
            this.i = s;
        }

        public final void K(@m String s) {
            this.a = s;
        }

        public final void L(int v) {
            this.q = v;
        }

        public final void M(@m String s) {
            this.f = s;
        }

        @m
        public final String a() {
            return this.b;
        }

        @m
        public final String b() {
            return this.e;
        }

        public final int c() {
            return this.l;
        }

        @m
        public final String d() {
            return this.g;
        }

        @m
        public final String e() {
            return this.n;
        }

        @m
        public final String f() {
            return this.c;
        }

        public final int g() {
            return this.o;
        }

        public final int h() {
            return this.p;
        }

        public final int i() {
            return this.d;
        }

        public final int j() {
            return this.k;
        }

        @l
        public final String k() [...] // 潜在的解密器

        @l
        public final String l() [...] // 潜在的解密器

        public final int m() {
            return this.m;
        }

        @m
        public final String n() {
            return this.h;
        }

        @m
        public final String o() {
            return this.i;
        }

        @m
        public final String p() {
            return this.a;
        }

        public final int q() {
            return this.q;
        }

        @m
        public final String r() {
            return this.f;
        }

        @l
        public final String s() [...] // 潜在的解密器

        public final int t() {
            return this.j;
        }

        public final boolean u() {
            return this.r;
        }

        public final void v(int v) {
            this.j = v;
        }

        public final void w(@m String s) {
            this.b = s;
        }

        public final void x(@m String s) {
            this.e = s;
        }

        public final void y(int v) {
            this.l = v;
        }

        public final void z(@m String s) {
            this.g = s;
        }
    }

    public static enum g implements d {
        TITLE("title"),
        CONTENT("text");

        @l
        private final String a;
        @l
        private final String b;
        private static final g[] e;
        private static final kotlin.enums.a f;

        static {
            g.e = arr_a$g;
            L.p(arr_a$g, "entries");
            g.f = new kotlin.enums.d(arr_a$g);
        }

        private g(String s1) {
            this.a = s1;
            this.b = "wiki_type";
        }

        private static final g[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return g.f;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getKey() {
            return this.b;
        }

        @Override  // com.dcinside.app.totalsearch.a$d
        @l
        public String getValue() {
            return this.a;
        }
    }

    @com.google.gson.annotations.c("result")
    @m
    private final String a;
    @com.google.gson.annotations.c("cause")
    @m
    private final String b;
    @com.google.gson.annotations.c("info")
    @m
    private final ArrayList c;
    @com.google.gson.annotations.c("gall_list")
    @m
    private final ArrayList d;
    @com.google.gson.annotations.c("recomm_list")
    @m
    private final ArrayList e;
    @com.google.gson.annotations.c("list")
    @m
    private final ArrayList f;
    @com.google.gson.annotations.c("board")
    @m
    private final ArrayList g;
    @com.google.gson.annotations.c("wiki")
    @m
    private final ArrayList h;
    @com.google.gson.annotations.c("movie")
    @m
    private final ArrayList i;
    @com.google.gson.annotations.c("is_adult_keyword")
    private final boolean j;
    @com.google.gson.annotations.c("gall_cnt")
    private final int k;
    @com.google.gson.annotations.c("allowFlag")
    private boolean l;
    @l
    public static final com.dcinside.app.totalsearch.a.a m;

    static {
        a.m = new com.dcinside.app.totalsearch.a.a(null);
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, false, 0, false, 0xFFF, null);
    }

    public a(@m String s, @m String s1, @m ArrayList arrayList0, @m ArrayList arrayList1, @m ArrayList arrayList2, @m ArrayList arrayList3, @m ArrayList arrayList4, @m ArrayList arrayList5, @m ArrayList arrayList6, boolean z, int v, boolean z1) {
        this.a = s;
        this.b = s1;
        this.c = arrayList0;
        this.d = arrayList1;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
        this.h = arrayList5;
        this.i = arrayList6;
        this.j = z;
        this.k = v;
        this.l = z1;
    }

    public a(String s, String s1, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, boolean z, int v, boolean z1, int v1, w w0) {
        this(((v1 & 1) == 0 ? s : null), ((v1 & 2) == 0 ? s1 : null), ((v1 & 4) == 0 ? arrayList0 : null), ((v1 & 8) == 0 ? arrayList1 : null), ((v1 & 16) == 0 ? arrayList2 : null), ((v1 & 0x20) == 0 ? arrayList3 : null), ((v1 & 0x40) == 0 ? arrayList4 : null), ((v1 & 0x80) == 0 ? arrayList5 : null), ((v1 & 0x100) == 0 ? arrayList6 : null), ((v1 & 0x200) == 0 ? z : false), ((v1 & 0x400) == 0 ? v : 0), ((v1 & 0x800) == 0 ? z1 : false));
    }

    @m
    public final ArrayList a() {
        return this.g;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    @n
    public static final List c(@m ArrayList arrayList0, @l com.dcinside.app.type.m m0) {
        return a.m.a(arrayList0, m0);
    }

    public final int d() {
        return this.k;
    }

    @m
    public final ArrayList e() {
        return this.d;
    }

    public final boolean f() {
        return this.l;
    }

    @m
    public final ArrayList g() {
        return this.c;
    }

    @m
    public final ArrayList h() {
        return this.i;
    }

    @m
    public final ArrayList i() {
        return this.h;
    }

    @m
    public final ArrayList j() {
        return this.e;
    }

    @m
    public final String k() {
        return this.a;
    }

    @m
    public final ArrayList l() {
        return this.f;
    }

    public final boolean m() {
        return this.j;
    }

    public final void n(boolean z) {
        this.l = z;
    }
}

