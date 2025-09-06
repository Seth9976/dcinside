package com.dcinside.app.util;

import A3.o;
import android.content.Context;
import android.text.Spanned;
import com.dcinside.app.http.f;
import com.dcinside.app.http.q;
import com.dcinside.app.model.PostModify;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.w;
import com.dcinside.app.model.x;
import com.dcinside.app.read.M0;
import com.dcinside.app.read.N0;
import com.dcinside.app.read.O0;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.y0;
import com.dcinside.app.response.k;
import com.dcinside.app.type.G;
import com.dcinside.app.wv.y;
import io.realm.F0;
import io.realm.X0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.text.r;
import kotlin.text.v;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n599#1:642\n600#1:644\n598#1,2:654\n600#1:657\n594#1:658\n599#1:659\n600#1:661\n598#1,2:671\n600#1:674\n594#1:675\n599#1:676\n600#1:678\n598#1,2:688\n600#1:691\n594#1:692\n599#1:693\n600#1:695\n598#1,2:721\n600#1:724\n594#1:725\n599#1:726\n600#1:728\n177#2,9:604\n177#2,9:645\n177#2,9:662\n177#2,9:679\n177#2,9:712\n865#3,2:613\n1557#3:615\n1628#3,3:616\n1863#3:696\n1611#3,9:697\n1863#3:706\n1864#3:709\n1620#3:710\n1864#3:711\n108#4:619\n80#4,22:620\n1#5:643\n1#5:656\n1#5:660\n1#5:673\n1#5:677\n1#5:690\n1#5:694\n1#5:707\n1#5:708\n1#5:723\n1#5:727\n1#5:729\n*S KotlinDebug\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api\n*L\n519#1:642\n519#1:644\n531#1:654,2\n531#1:657\n534#1:658\n536#1:659\n536#1:661\n543#1:671,2\n543#1:674\n545#1:675\n547#1:676\n547#1:678\n554#1:688,2\n554#1:691\n556#1:692\n558#1:693\n558#1:695\n578#1:721,2\n578#1:724\n586#1:725\n588#1:726\n588#1:728\n222#1:604,9\n530#1:645,9\n542#1:662,9\n553#1:679,9\n577#1:712,9\n366#1:613,2\n371#1:615\n371#1:616,3\n564#1:696\n568#1:697,9\n568#1:706\n568#1:709\n568#1:710\n564#1:711\n504#1:619\n504#1:620,22\n519#1:643\n531#1:656\n536#1:660\n543#1:673\n547#1:677\n554#1:690\n558#1:694\n568#1:708\n578#1:723\n588#1:727\n*E\n"})
public final class n {
    @l
    public static final n a = null;
    @l
    public static final String b = "gall.dcinside.com";
    @l
    public static final String c = "m.dcinside.com";
    @l
    public static final String d = "app.dcinside.com";
    @l
    public static final String e = "msign.dcinside.com";
    @m
    private static g f;
    @m
    private static String g;

    static {
        n.a = new n();
    }

    @z3.n
    private static final g A(String s) {
        g g0 = g.X1((s == null ? new f(0x7F150310) : new f(s)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g0, "error(...)");
        return g0;
    }

    static g B(String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        g g0 = g.X1((s == null ? new f(0x7F150310) : new f(s)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g0, "error(...)");
        return g0;
    }

    private final g C(String s, String s1) {
        static final class a extends N implements Function1 {
            final String e;

            a(String s) {
                this.e = s;
                super(1);
            }

            public final g b(String s) {
                static final class com.dcinside.app.util.n.a.a extends N implements A3.a {
                    public static final com.dcinside.app.util.n.a.a e;

                    static {
                        com.dcinside.app.util.n.a.a.e = new com.dcinside.app.util.n.a.a();
                    }

                    com.dcinside.app.util.n.a.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return "https://app.dcinside.com/";
                    }
                }


                static final class b extends N implements Function1 {
                    public static final b e;

                    static {
                        b.e = new b();
                    }

                    b() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "s");
                        function10.invoke("api");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class c extends N implements Function1 {
                    public static final c e;

                    static {
                        c.e = new c();
                    }

                    c() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "s");
                        function10.invoke("mygall.php");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class d extends N implements Function1 {
                    final String e;

                    d(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "s");
                        o0.invoke("user_id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class e extends N implements Function1 {
                    final String e;

                    e(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "s");
                        o0.invoke("app_id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.a.f extends N implements Function1 {
                    public static final com.dcinside.app.util.n.a.f e;

                    static {
                        com.dcinside.app.util.n.a.f.e = new com.dcinside.app.util.n.a.f();
                    }

                    com.dcinside.app.util.n.a.f() {
                        super(1);
                    }

                    @l
                    public final g b(@l String s) {
                        L.p(s, "it");
                        g g0 = uk.Yj(s, x.class);
                        L.o(g0, "convert(...)");
                        return g0;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.b(((String)object0));
                    }
                }

                return uk.fG().W(com.dcinside.app.util.n.a.a.e).Q(b.e).Q(c.e).R(new d(this.e)).R(new e(s)).w(com.dcinside.app.util.n.a.f.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class com.dcinside.app.util.n.b extends N implements Function1 {
            public static final com.dcinside.app.util.n.b e;

            static {
                com.dcinside.app.util.n.b.e = new com.dcinside.app.util.n.b();
            }

            com.dcinside.app.util.n.b() {
                super(1);
            }

            public final g a(x x0) {
                List list0 = x0.g();
                if(list0 != null && !list0.isEmpty()) {
                    return xk.o(((w)u.B2(list0)).b()) ? g.y2(u.H()) : g.y2(list0);
                }
                return list0 == null || x0.h() == null ? g.X1(new f(0x7F150310)) : g.y2(u.H());  // string:failed_cant_read "데이터를 읽을 수 없습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((x)object0));
            }
        }


        @s0({"SMAP\nApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$favoriteCache$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,603:1\n1567#2:604\n1598#2,4:605\n*S KotlinDebug\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$favoriteCache$3\n*L\n451#1:604\n451#1:605,4\n*E\n"})
        static final class com.dcinside.app.util.n.c extends N implements Function1 {
            public static final com.dcinside.app.util.n.c e;

            static {
                com.dcinside.app.util.n.c.e = new com.dcinside.app.util.n.c();
            }

            com.dcinside.app.util.n.c() {
                super(1);
            }

            public final List a(List list0) {
                L.m(list0);
                List list1 = new ArrayList(u.b0(list0, 10));
                int v = 0;
                for(Object object0: list0) {
                    if(v < 0) {
                        u.Z();
                    }
                    com.dcinside.app.realm.m m0 = new com.dcinside.app.realm.m();
                    m0.X5(v);
                    m0.V5(((w)object0).a());
                    m0.W5(((w)object0).b());
                    if(L.g(((w)object0).c(), Boolean.TRUE)) {
                        m0.U5(com.dcinside.app.type.m.i.c());
                    }
                    else if(L.g(((w)object0).d(), Boolean.TRUE)) {
                        m0.U5(com.dcinside.app.type.m.j.c());
                    }
                    list1.add(m0);
                    ++v;
                }
                return list1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class com.dcinside.app.util.n.d extends N implements Function1 {
            final String e;

            com.dcinside.app.util.n.d(String s) {
                this.e = s;
                super(1);
            }

            public final g a(List list0) {
                L.m(list0);
                return n.a.Q(list0, this.e).z0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class com.dcinside.app.util.n.e extends N implements Function1 {
            public static final com.dcinside.app.util.n.e e;

            static {
                com.dcinside.app.util.n.e.e = new com.dcinside.app.util.n.e();
            }

            com.dcinside.app.util.n.e() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(Throwable throwable0) {
                n.f = null;
            }
        }

        return uk.Lj().f2((Object object0) -> {
            L.p(new a(s), "$tmp0");
            return (g)new a(s).invoke(object0);
        }).M3(rx.schedulers.c.e()).f2((Object object0) -> {
            L.p(com.dcinside.app.util.n.b.e, "$tmp0");
            return (g)com.dcinside.app.util.n.b.e.invoke(object0);
        }).z6().g3((Object object0) -> {
            L.p(com.dcinside.app.util.n.c.e, "$tmp0");
            return (List)com.dcinside.app.util.n.c.e.invoke(object0);
        }).M3(rx.android.schedulers.a.c()).f2((Object object0) -> {
            L.p(new com.dcinside.app.util.n.d(s1), "$tmp0");
            return (g)new com.dcinside.app.util.n.d(s1).invoke(object0);
        }).O1((Object object0) -> {
            L.p(com.dcinside.app.util.n.e.e, "$tmp0");
            com.dcinside.app.util.n.e.e.invoke(object0);
        }).g0();
    }

    // 检测为 Lambda 实现
    private static final List D(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g E(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g G(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g H(Function1 function10, Object object0) [...]

    private final void I(Set set0) {
        dl dl0 = dl.a;
        if(dl0.Z()) {
            if(dl0.Z2()) {
                set0.addAll(jl.a.I0().f());
            }
            else {
                set0.addAll(jl.a.I0().e());
            }
        }
        if(dl0.a0()) {
            String s = dl0.E2();
            if(s != null) {
                List list0 = v.V4(s, new String[]{","}, false, 0, 6, null);
                if(list0 != null) {
                    for(Object object0: list0) {
                        if(((String)object0).length() > 0) {
                            set0.add(object0);
                        }
                    }
                }
            }
        }
    }

    @l
    public final g J(@l String s, int v, int v1, @m String s1, int v2, @m String s2) {
        static final class com.dcinside.app.util.n.f extends N implements Function1 {
            final String e;
            final int f;
            final int g;
            final String h;
            final int i;
            final String j;
            final String k;

            com.dcinside.app.util.n.f(String s, int v, int v1, String s1, int v2, String s2, String s3) {
                this.e = s;
                this.f = v;
                this.g = v1;
                this.h = s1;
                this.i = v2;
                this.j = s2;
                this.k = s3;
                super(1);
            }

            public final g b(String s) {
                static final class com.dcinside.app.util.n.f.a extends N implements Function1 {
                    final int e;

                    com.dcinside.app.util.n.f.a(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        int v = this.e;
                        if(v > 0) {
                            o0.invoke("comment_no", String.valueOf(v));
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.b extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.f.b(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("fileno", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.c extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.f.c(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("csort", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.d extends N implements Function1 {
                    public static final com.dcinside.app.util.n.f.d e;

                    static {
                        com.dcinside.app.util.n.f.d.e = new com.dcinside.app.util.n.f.d();
                    }

                    com.dcinside.app.util.n.f.d() {
                        super(1);
                    }

                    @l
                    public final g b(@m String s) {
                        g g2;
                        try {
                            L.o(uk.a, "GSON");
                            List list0 = c0.a.a.b(uk.a, s, k.class);
                            k k0 = list0 == null || list0.isEmpty() ? null : ((k)list0.get(0));
                            if(k0 != null) {
                                if(m0.a.a.h(k0.e()) && m0.a.a.h(k0.a())) {
                                    g g0 = g.Q2(k0);
                                    L.o(g0, "just(...)");
                                    return g0;
                                }
                                g g1 = g.X1(new f(k0.a()));
                                L.o(g1, "error(...)");
                                return g1;
                            }
                            g2 = xk.r(s, new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                        }
                        catch(Exception exception0) {
                            g2 = xk.r(s, exception0);
                        }
                        L.m(g2);
                        return g2;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.b(((String)object0));
                    }
                }


                static final class com.dcinside.app.util.n.f.e extends N implements A3.a {
                    public static final com.dcinside.app.util.n.f.e e;

                    static {
                        com.dcinside.app.util.n.f.e.e = new com.dcinside.app.util.n.f.e();
                    }

                    com.dcinside.app.util.n.f.e() {
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return "https://app.dcinside.com/";
                    }
                }


                static final class com.dcinside.app.util.n.f.f extends N implements Function1 {
                    public static final com.dcinside.app.util.n.f.f e;

                    static {
                        com.dcinside.app.util.n.f.f.e = new com.dcinside.app.util.n.f.f();
                    }

                    com.dcinside.app.util.n.f.f() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "it");
                        function10.invoke("api");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.g extends N implements Function1 {
                    public static final com.dcinside.app.util.n.f.g e;

                    static {
                        com.dcinside.app.util.n.f.g.e = new com.dcinside.app.util.n.f.g();
                    }

                    com.dcinside.app.util.n.f.g() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "it");
                        function10.invoke("img_comment_list");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class h extends N implements Function1 {
                    final String e;

                    h(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class i extends N implements Function1 {
                    final int e;

                    i(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("no", String.valueOf(this.e));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class j extends N implements Function1 {
                    final int e;

                    j(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        int v = this.e;
                        if(v > 0) {
                            o0.invoke("re_page", String.valueOf(Math.max(v, 1)));
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.k extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.f.k(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("app_id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.l extends N implements Function1 {
                    public static final com.dcinside.app.util.n.f.l e;

                    static {
                        com.dcinside.app.util.n.f.l.e = new com.dcinside.app.util.n.f.l();
                    }

                    com.dcinside.app.util.n.f.l() {
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("user_id", B.E.k0());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.f.m extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.f.m(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        if(m0.a.a.k(this.e)) {
                            o0.invoke("permission_pw", this.e);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }

                return uk.vk().J("api_replyList").K(com.dcinside.app.util.n.f.e.e).G(com.dcinside.app.util.n.f.f.e).G(com.dcinside.app.util.n.f.g.e).H(new h(this.e)).H(new i(this.f)).H(new j(this.g)).H(new com.dcinside.app.util.n.f.k(s)).H(com.dcinside.app.util.n.f.l.e).H(new com.dcinside.app.util.n.f.m(this.h)).H(new com.dcinside.app.util.n.f.a(this.i)).H(new com.dcinside.app.util.n.f.b(this.j)).H(new com.dcinside.app.util.n.f.c(this.k)).w(com.dcinside.app.util.n.f.d.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        @s0({"SMAP\nApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$imageNoteList$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,603:1\n1#2:604\n177#3,6:605\n183#3,3:612\n1062#4:611\n1557#4:615\n1628#4,3:616\n8443#5,2:619\n9125#5,4:621\n*S KotlinDebug\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$imageNoteList$2\n*L\n263#1:605,6\n263#1:612,3\n263#1:611\n265#1:615\n265#1:616,3\n304#1:619,2\n304#1:621,4\n*E\n"})
        static final class com.dcinside.app.util.n.g extends N implements Function1 {
            public static final com.dcinside.app.util.n.g e;

            static {
                com.dcinside.app.util.n.g.e = new com.dcinside.app.util.n.g();
            }

            com.dcinside.app.util.n.g() {
                super(1);
            }

            public final g d(k k0) {
                static final class com.dcinside.app.util.n.g.a extends N implements Function1 {
                    final Set e;
                    final r f;
                    final String g;

                    com.dcinside.app.util.n.g.a(Set set0, r r0, String s) {
                        this.e = set0;
                        this.f = r0;
                        this.g = s;
                        super(1);
                    }

                    public final V a(com.dcinside.app.response.j j0) {
                        Spanned spanned0;
                        int v;
                        String s4;
                        String s = Dl.t(Dl.C(Dl.M(j0.X())));
                        L.o(s, "nbsp(...)");
                        String s1 = j0.f0();
                        String s2 = j0.R();
                        String s3 = "";
                        if(m0.a.a.k(j0.O())) {
                            s4 = j0.O();
                            v = 10000018;
                        }
                        else {
                            String s5 = j0.V();
                            if(this.e.isEmpty() || this.f == null || s1 != null && s1.length() != 0 && L.g(s1, this.g)) {
                                spanned0 = Dl.c(s5);
                            }
                            else {
                                if(s5 == null) {
                                    s5 = "";
                                }
                                spanned0 = Dl.c(this.f.m(s5, "**"));
                            }
                            s4 = spanned0;
                            v = 10000007;
                        }
                        if(s1 != null && s1.length() != 0) {
                            return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, null, s4, new N0(s1)));
                        }
                        if(s2 != null && s2.length() != 0) {
                            return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, null, s4, new O0(s2)));
                        }
                        String s6 = j0.X();
                        if(s6 != null) {
                            s3 = s6;
                        }
                        return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, null, s4, new M0(s3)));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.response.j)object0));
                    }
                }


                static final class com.dcinside.app.util.n.g.b extends N implements Function1 {
                    final List e;
                    final k f;
                    final Set g;
                    final r h;
                    final String i;

                    com.dcinside.app.util.n.g.b(List list0, k k0, Set set0, r r0, String s) {
                        this.e = list0;
                        this.f = k0;
                        this.g = set0;
                        this.h = r0;
                        this.i = s;
                        super(1);
                    }

                    public final k a(Map map0) {
                        N0 n00;
                        M0 m00;
                        Spanned spanned0;
                        int v;
                        String s4;
                        for(Object object0: this.e) {
                            com.dcinside.app.response.j j0 = (com.dcinside.app.response.j)object0;
                            com.dcinside.app.response.j.a j$a0 = (com.dcinside.app.response.j.a)map0.get(j0.a0());
                            if(j$a0 != null) {
                                j0.z0(j$a0.j());
                                j0.k0(j$a0);
                            }
                        }
                        List list0 = this.f.d();
                        if(list0 == null) {
                            list0 = u.H();
                        }
                        for(Object object1: list0) {
                            com.dcinside.app.response.j j1 = (com.dcinside.app.response.j)object1;
                            String s = Dl.t(Dl.C(Dl.M(j1.X())));
                            L.o(s, "nbsp(...)");
                            String s1 = j1.f0();
                            String s2 = j1.R();
                            String s3 = "";
                            if(m0.a.a.k(j1.O())) {
                                s4 = j1.O();
                                v = 10000018;
                            }
                            else {
                                String s5 = j1.V();
                                if(this.g.isEmpty() || this.h == null || s1 != null && s1.length() != 0 && L.g(s1, this.i)) {
                                    spanned0 = Dl.c(s5);
                                }
                                else {
                                    if(s5 == null) {
                                        s5 = "";
                                    }
                                    spanned0 = Dl.c(this.h.m(s5, "**"));
                                }
                                s4 = spanned0;
                                v = 10000007;
                            }
                            if(s1 == null || s1.length() == 0) {
                                if(s2 == null || s2.length() == 0) {
                                    String s6 = j1.X();
                                    if(s6 != null) {
                                        s3 = s6;
                                    }
                                    m00 = new M0(s3);
                                }
                                else {
                                    m00 = new O0(s2);
                                }
                                n00 = m00;
                            }
                            else {
                                n00 = new N0(s1);
                            }
                            j1.z0(s);
                            j1.k0(new com.dcinside.app.response.j.a(v, s, null, s4, n00));
                        }
                        return this.f;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Map)object0));
                    }
                }


                @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Api.kt\ncom/dcinside/app/util/Api$imageNoteList$2\n*L\n1#1,121:1\n263#2:122\n*E\n"})
                public static final class com.dcinside.app.util.n.g.c implements Comparator {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        return kotlin.comparisons.a.l(((String)object1).length(), ((String)object0).length());
                    }
                }

                r r0;
                List list0 = k0.c();
                if(list0 != null) {
                    List list1 = list0.isEmpty() ? null : list0;
                    if(list1 != null) {
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                        n.a.I(linkedHashSet0);
                        n.a.M(linkedHashSet0);
                        try {
                            r0 = null;
                            r0 = new r(u.m3(u.u5(linkedHashSet0, new com.dcinside.app.util.n.g.c()), "|", null, null, 0, null, null, 62, null));
                        }
                        catch(Exception unused_ex) {
                        }
                        String s = B.E.c0();
                        ArrayList arrayList0 = new ArrayList(u.b0(list1, 10));
                        for(Object object0: list1) {
                            arrayList0.add(g.Q2(((com.dcinside.app.response.j)object0)).M3(rx.schedulers.c.a()).g3((Object object0) -> {
                                L.p(new com.dcinside.app.util.n.g.a(linkedHashSet0, r0, s), "$tmp0");
                                return (V)new com.dcinside.app.util.n.g.a(linkedHashSet0, r0, s).invoke(object0);
                            }));
                        }
                        return g.m0(arrayList0, (Object[] arr_object) -> {
                            L.m(arr_object);
                            Map map0 = new LinkedHashMap(s.u(Y.j(arr_object.length), 16));
                            for(int v = 0; v < arr_object.length; ++v) {
                                Object object0 = arr_object[v];
                                L.n(object0, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, com.dcinside.app.response.ReplyItem.ContentSample>");
                                V v1 = r0.a(((Number)((V)object0).a()).intValue(), ((com.dcinside.app.response.j.a)((V)object0).b()));
                                map0.put(v1.e(), v1.f());
                            }
                            return map0;
                        }).g3((Object object0) -> {
                            L.p(new com.dcinside.app.util.n.g.b(list1, k0, linkedHashSet0, r0, s), "$tmp0");
                            return (k)new com.dcinside.app.util.n.g.b(list1, k0, linkedHashSet0, r0, s).invoke(object0);
                        });
                    }
                }
                return g.Q2(k0);
            }

            // 检测为 Lambda 实现
            private static final V e(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final Map f(Object[] arr_object) [...]

            // 检测为 Lambda 实现
            private static final k g(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.d(((k)object0));
            }
        }

        G g0;
        L.p(s, "galleryId");
        try {
            g0 = null;
            g0 = (G)G.b().get(((int)dl.a.H0()));
        }
        catch(Exception unused_ex) {
        }
        if(g0 == null) {
            g0 = G.b;
        }
        g g1 = uk.Lj().f2((Object object0) -> {
            L.p(new com.dcinside.app.util.n.f(s, v, v1, s1, v2, s2, (g0 == G.b ? G.b.c() : "new")), "$tmp0");
            return (g)new com.dcinside.app.util.n.f(s, v, v1, s1, v2, s2, (g0 == G.b ? G.b.c() : "new")).invoke(object0);
        }).M3(rx.schedulers.c.e()).f2((Object object0) -> {
            L.p(com.dcinside.app.util.n.g.e, "$tmp0");
            return (g)com.dcinside.app.util.n.g.e.invoke(object0);
        }).M3(rx.android.schedulers.a.c());
        L.o(g1, "observeOn(...)");
        return g1;
    }

    // 检测为 Lambda 实现
    private static final g K(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g L(Function1 function10, Object object0) [...]

    private final void M(Set set0) {
        ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
        for(Object object0: set0) {
            arrayList0.add(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(v.l2(((String)object0), "\\", "\\\\", false, 4, null), "+", "\\+", false, 4, null), "*", "\\*", false, 4, null), "?", "\\?", false, 4, null), "^", "\\^", false, 4, null), "$", "\\$", false, 4, null), "(", "\\(", false, 4, null), ")", "\\)", false, 4, null), "[", "\\[", false, 4, null), "]", "\\]", false, 4, null), "{", "\\{", false, 4, null), "}", "\\}", false, 4, null), "|", "\\|", false, 4, null), ".", "\\.", false, 4, null));
        }
        set0.clear();
        set0.addAll(arrayList0);
    }

    @l
    public final g N(@l WeakReference weakReference0, @l String s, int v, int v1, @m String s1, int v2, @l G g0, boolean z) {
        static final class com.dcinside.app.util.n.h extends N implements Function1 {
            final boolean e;
            final G f;
            final String g;
            final int h;
            final int i;
            final String j;
            final int k;

            com.dcinside.app.util.n.h(boolean z, G g0, String s, int v, int v1, String s1, int v2) {
                this.e = z;
                this.f = g0;
                this.g = s;
                this.h = v;
                this.i = v1;
                this.j = s1;
                this.k = v2;
                super(1);
            }

            public final g b(String s) {
                static final class com.dcinside.app.util.n.h.a extends N implements Function1 {
                    public static final com.dcinside.app.util.n.h.a e;

                    static {
                        com.dcinside.app.util.n.h.a.e = new com.dcinside.app.util.n.h.a();
                    }

                    com.dcinside.app.util.n.h.a() {
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("user_id", B.E.k0());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.b extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.h.b(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        if(m0.a.a.k(this.e)) {
                            o0.invoke("permission_pw", this.e);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.c extends N implements Function1 {
                    final int e;

                    com.dcinside.app.util.n.h.c(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        int v = this.e;
                        if(v > 0) {
                            o0.invoke("comment_no", String.valueOf(v));
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.d extends N implements Function1 {
                    public static final com.dcinside.app.util.n.h.d e;

                    static {
                        com.dcinside.app.util.n.h.d.e = new com.dcinside.app.util.n.h.d();
                    }

                    com.dcinside.app.util.n.h.d() {
                        super(1);
                    }

                    @l
                    public final g b(@m String s) {
                        g g2;
                        try {
                            L.o(uk.a, "GSON");
                            List list0 = c0.a.a.b(uk.a, s, k.class);
                            k k0 = list0 == null || list0.isEmpty() ? null : ((k)list0.get(0));
                            if(k0 != null) {
                                if(m0.a.a.h(k0.e()) && m0.a.a.h(k0.a())) {
                                    g g0 = g.Q2(k0);
                                    L.o(g0, "just(...)");
                                    return g0;
                                }
                                g g1 = g.X1(new f(k0.a()));
                                L.o(g1, "error(...)");
                                return g1;
                            }
                            g2 = xk.r(s, new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                        }
                        catch(Exception exception0) {
                            g2 = xk.r(s, exception0);
                        }
                        L.m(g2);
                        return g2;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.b(((String)object0));
                    }
                }


                static final class com.dcinside.app.util.n.h.e extends N implements A3.a {
                    public static final com.dcinside.app.util.n.h.e e;

                    static {
                        com.dcinside.app.util.n.h.e.e = new com.dcinside.app.util.n.h.e();
                    }

                    com.dcinside.app.util.n.h.e() {
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return "https://app.dcinside.com/";
                    }
                }


                static final class com.dcinside.app.util.n.h.f extends N implements Function1 {
                    public static final com.dcinside.app.util.n.h.f e;

                    static {
                        com.dcinside.app.util.n.h.f.e = new com.dcinside.app.util.n.h.f();
                    }

                    com.dcinside.app.util.n.h.f() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "it");
                        function10.invoke("api");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.g extends N implements Function1 {
                    public static final com.dcinside.app.util.n.h.g e;

                    static {
                        com.dcinside.app.util.n.h.g.e = new com.dcinside.app.util.n.h.g();
                    }

                    com.dcinside.app.util.n.h.g() {
                        super(1);
                    }

                    public final void a(@l Function1 function10) {
                        L.p(function10, "it");
                        function10.invoke("comment_new.php");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Function1)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.h extends N implements Function1 {
                    final boolean e;

                    com.dcinside.app.util.n.h.h(boolean z) {
                        this.e = z;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        if(this.e) {
                            o0.invoke("style", "new");
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.i extends N implements Function1 {
                    final boolean e;
                    final G f;

                    com.dcinside.app.util.n.h.i(boolean z, G g0) {
                        this.e = z;
                        this.f = g0;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        if(!this.e) {
                            o0.invoke("csort", this.f.c());
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.j extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.h.j(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.k extends N implements Function1 {
                    final int e;

                    com.dcinside.app.util.n.h.k(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("no", String.valueOf(this.e));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.l extends N implements Function1 {
                    final int e;

                    com.dcinside.app.util.n.h.l(int v) {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        int v = this.e;
                        if(v > 0) {
                            o0.invoke("re_page", String.valueOf(Math.max(v, 1)));
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.util.n.h.m extends N implements Function1 {
                    final String e;

                    com.dcinside.app.util.n.h.m(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l o o0) {
                        L.p(o0, "it");
                        o0.invoke("app_id", this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((o)object0));
                        return S0.a;
                    }
                }

                return uk.vk().I().J("api_replyList").K(com.dcinside.app.util.n.h.e.e).G(com.dcinside.app.util.n.h.f.e).G(com.dcinside.app.util.n.h.g.e).H(new com.dcinside.app.util.n.h.h(this.e)).H(new com.dcinside.app.util.n.h.i(this.e, this.f)).H(new com.dcinside.app.util.n.h.j(this.g)).H(new com.dcinside.app.util.n.h.k(this.h)).H(new com.dcinside.app.util.n.h.l(this.i)).H(new com.dcinside.app.util.n.h.m(s)).H(com.dcinside.app.util.n.h.a.e).H(new com.dcinside.app.util.n.h.b(this.j)).H(new com.dcinside.app.util.n.h.c(this.k)).w(com.dcinside.app.util.n.h.d.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        @s0({"SMAP\nApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$replyList$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,603:1\n1#2:604\n177#3,6:605\n183#3,3:612\n1062#4:611\n1557#4:615\n1628#4,3:616\n8443#5,2:619\n9125#5,4:621\n*S KotlinDebug\n*F\n+ 1 Api.kt\ncom/dcinside/app/util/Api$replyList$2\n*L\n104#1:605,6\n104#1:612,3\n104#1:611\n106#1:615\n106#1:616,3\n195#1:619,2\n195#1:621,4\n*E\n"})
        static final class com.dcinside.app.util.n.i extends N implements Function1 {
            final WeakReference e;

            com.dcinside.app.util.n.i(WeakReference weakReference0) {
                this.e = weakReference0;
                super(1);
            }

            public final g d(k k0) {
                static final class com.dcinside.app.util.n.i.a extends N implements Function1 {
                    final Set e;
                    final r f;
                    final String g;
                    final WeakReference h;

                    com.dcinside.app.util.n.i.a(Set set0, r r0, String s, WeakReference weakReference0) {
                        this.e = set0;
                        this.f = r0;
                        this.g = s;
                        this.h = weakReference0;
                        super(1);
                    }

                    public final V a(com.dcinside.app.response.j j0) {
                        String s13;
                        Spanned spanned0;
                        int v;
                        String s5;
                        String s4;
                        String s = Dl.t(Dl.C(Dl.M(j0.X())));
                        L.o(s, "nbsp(...)");
                        String s1 = j0.f0();
                        String s2 = j0.R();
                        m0.a.a a$a0 = m0.a.a;
                        String s3 = "";
                        if(a$a0.k(j0.O())) {
                            s4 = j0.O();
                            s5 = null;
                            v = 10000018;
                        }
                        else if(a$a0.j(j0.L())) {
                            v = v.W2((j0.K() == null ? "" : j0.K()), "bigdccon", false, 2, null) ? 10000022 : 10000004;
                            String s6 = j0.V();
                            List list0 = s6 == null ? null : v.V4(s6, new String[]{"|"}, false, 0, 6, null);
                            String s7 = j0.L();
                            List list1 = s7 == null ? null : v.V4(s7, new String[]{"|"}, false, 0, 6, null);
                            String s8 = j0.J();
                            List list2 = s8 == null ? null : v.V4(s8, new String[]{"|"}, false, 0, 6, null);
                            j0.q0(new com.dcinside.app.dccon.a(new com.dcinside.app.dccon.b((list0 == null ? null : ((String)u.G2(list0))), (list1 == null ? null : ((String)u.G2(list1))), (list2 == null ? null : ((String)u.G2(list2))), false, false, false, 56, null), (list1 == null || list1.size() <= 1 ? null : new com.dcinside.app.dccon.b((list0 == null ? null : ((String)u.v3(list0))), ((String)u.v3(list1)), (list2 == null ? null : ((String)u.v3(list2))), false, false, false, 56, null)), true));
                            s5 = null;
                            s4 = null;
                        }
                        else if(a$a0.j(j0.g0())) {
                            s4 = j0.V();
                            v = 10000005;
                            s5 = null;
                        }
                        else {
                            String s9 = j0.V();
                            com.dcinside.app.voice.a a0 = com.dcinside.app.voice.a.e.b(com.dcinside.app.voice.a.d, s9, com.dcinside.app.voice.a.e, false, 4, null);
                            if(a0 == null) {
                                if(this.e.isEmpty() || this.f == null || s1 != null && s1.length() != 0 && L.g(s1, this.g)) {
                                    spanned0 = Dl.c(s9);
                                }
                                else {
                                    if(s9 == null) {
                                        s9 = "";
                                    }
                                    spanned0 = Dl.c(this.f.m(s9, "**"));
                                }
                                s4 = spanned0;
                                v = 10000007;
                                s5 = null;
                            }
                            else {
                                String s10 = a0.c();
                                if(s10 == null) {
                                    s10 = "";
                                }
                                String s11 = a0.d() == null ? "" : a0.d();
                                String s12 = this.e.isEmpty() || this.f == null || s1 != null && s1.length() != 0 && L.g(s1, this.g) ? s10 + s11 : this.f.m(s10 + s11, "**");
                                Object object0 = this.h.get();
                                if(((Context)object0) == null) {
                                    s13 = null;
                                }
                                else {
                                    org.jsoup.nodes.f f0 = Dl.A(a0.b());
                                    L.o(f0, "soup(...)");
                                    s13 = y.u(((Context)object0), f0, true, true, true, 0, null, false, null, false, false, false, 0xFE0, null).i().toString();
                                }
                                s5 = s13;
                                s4 = s12;
                                v = 10000006;
                            }
                        }
                        if(s1 != null && s1.length() != 0) {
                            return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, s5, s4, new N0(s1)));
                        }
                        if(s2 != null && s2.length() != 0) {
                            return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, s5, s4, new O0(s2)));
                        }
                        String s14 = j0.X();
                        if(s14 != null) {
                            s3 = s14;
                        }
                        return r0.a(j0.a0(), new com.dcinside.app.response.j.a(v, s, s5, s4, new M0(s3)));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.response.j)object0));
                    }
                }


                static final class com.dcinside.app.util.n.i.b extends N implements Function1 {
                    final List e;
                    final k f;

                    com.dcinside.app.util.n.i.b(List list0, k k0) {
                        this.e = list0;
                        this.f = k0;
                        super(1);
                    }

                    public final k a(Map map0) {
                        for(Object object0: this.e) {
                            com.dcinside.app.response.j j0 = (com.dcinside.app.response.j)object0;
                            com.dcinside.app.response.j.a j$a0 = (com.dcinside.app.response.j.a)map0.get(j0.a0());
                            if(j$a0 != null) {
                                j0.z0(j$a0.j());
                                j0.k0(j$a0);
                            }
                        }
                        return this.f;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Map)object0));
                    }
                }


                @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Api.kt\ncom/dcinside/app/util/Api$replyList$2\n*L\n1#1,121:1\n104#2:122\n*E\n"})
                public static final class com.dcinside.app.util.n.i.c implements Comparator {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        return kotlin.comparisons.a.l(((String)object1).length(), ((String)object0).length());
                    }
                }

                r r0 = null;
                List list0 = k0.c();
                if(list0 != null) {
                    if(list0.isEmpty()) {
                        list0 = null;
                    }
                    if(list0 != null) {
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                        n.a.I(linkedHashSet0);
                        n.a.M(linkedHashSet0);
                        try {
                            r0 = new r(u.m3(u.u5(linkedHashSet0, new com.dcinside.app.util.n.i.c()), "|", null, null, 0, null, null, 62, null));
                        }
                        catch(Exception unused_ex) {
                        }
                        String s = B.E.c0();
                        WeakReference weakReference0 = this.e;
                        ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                        for(Object object0: list0) {
                            arrayList0.add(g.Q2(((com.dcinside.app.response.j)object0)).M3(rx.schedulers.c.a()).g3((Object object0) -> {
                                L.p(new com.dcinside.app.util.n.i.a(linkedHashSet0, r0, s, weakReference0), "$tmp0");
                                return (V)new com.dcinside.app.util.n.i.a(linkedHashSet0, r0, s, weakReference0).invoke(object0);
                            }));
                        }
                        return g.m0(arrayList0, (Object[] arr_object) -> {
                            L.m(arr_object);
                            Map map0 = new LinkedHashMap(s.u(Y.j(arr_object.length), 16));
                            for(int v = 0; v < arr_object.length; ++v) {
                                Object object0 = arr_object[v];
                                L.n(object0, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, com.dcinside.app.response.ReplyItem.ContentSample>");
                                V v1 = r0.a(((Number)((V)object0).a()).intValue(), ((com.dcinside.app.response.j.a)((V)object0).b()));
                                map0.put(v1.e(), v1.f());
                            }
                            return map0;
                        }).g3((Object object0) -> {
                            L.p(new com.dcinside.app.util.n.i.b(list0, k0), "$tmp0");
                            return (k)new com.dcinside.app.util.n.i.b(list0, k0).invoke(object0);
                        });
                    }
                }
                return g.Q2(k0);
            }

            // 检测为 Lambda 实现
            private static final V e(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final Map f(Object[] arr_object) [...]

            // 检测为 Lambda 实现
            private static final k g(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.d(((k)object0));
            }
        }

        L.p(weakReference0, "weakContext");
        L.p(s, "galleryId");
        L.p(g0, "sort");
        g g1 = uk.Lj().f2((Object object0) -> {
            L.p(new com.dcinside.app.util.n.h(z, g0, s, v, v1, s1, v2), "$tmp0");
            return (g)new com.dcinside.app.util.n.h(z, g0, s, v, v1, s1, v2).invoke(object0);
        }).M3(rx.schedulers.c.e()).f2((Object object0) -> {
            L.p(new com.dcinside.app.util.n.i(weakReference0), "$tmp0");
            return (g)new com.dcinside.app.util.n.i(weakReference0).invoke(object0);
        }).M3(rx.android.schedulers.a.c());
        L.o(g1, "observeOn(...)");
        return g1;
    }

    // 检测为 Lambda 实现
    private static final g O(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g P(Function1 function10, Object object0) [...]

    private final rx.k Q(List list0, String s) {
        rx.k k0 = rx.k.n((rx.m m0) -> {
            L.p(list0, "$list");
            F0 f00 = F0.g4();
            try {
                f00.c4((F0 f00) -> {
                    L.p(list0, "$list");
                    Class class0 = y0.class;
                    y0 y00 = (y0)f00.C4(class0).i0("userId", s).r0();
                    if(y00 == null) {
                        X0 x00 = f00.n3(class0, s);
                        L.o(x00, "createObject(...)");
                        y00 = (y0)x00;
                    }
                    if(!list0.isEmpty()) {
                        y00.Q5().L0();
                        y00.Q5().addAll(list0);
                        y00.V5(System.currentTimeMillis());
                        return;
                    }
                    if(y00.Q5().size() < 2 || y00.R5() <= 0L) {
                        y00.Q5().L0();
                        y00.Q5().addAll(list0);
                    }
                    y00.V5(System.currentTimeMillis());
                }, () -> {
                    L.p(list0, "$list");
                    m0.e(list0);
                }, (Throwable throwable0) -> m0.onError(throwable0));
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(f00, null);
        });
        L.o(k0, "create(...)");
        return k0;
    }

    // 检测为 Lambda 实现
    private static final void R(String s, List list0, rx.m m0) [...]

    // 检测为 Lambda 实现
    private static final void S(String s, List list0, F0 f00) [...]

    // 检测为 Lambda 实现
    private static final void T(rx.m m0, List list0) [...]

    // 检测为 Lambda 实现
    private static final void U(rx.m m0, Throwable throwable0) [...]

    private final void r(List list0) {
        ArrayList arrayList0;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((com.dcinside.app.model.b)object0).B(Bk.e(((com.dcinside.app.model.b)object0).n()));
            ((com.dcinside.app.model.b)object0).z(Bk.e(((com.dcinside.app.model.b)object0).l()));
            String s = ((com.dcinside.app.model.b)object0).m();
            if(s == null) {
                arrayList0 = null;
            }
            else {
                List list1 = v.V4(s, new String[]{","}, false, 0, 6, null);
                if(list1 != null) {
                    arrayList0 = new ArrayList();
                    for(Object object1: list1) {
                        String s1 = v.G5(((String)object1)).toString();
                        if(s1.length() <= 0) {
                            s1 = null;
                        }
                        if(s1 != null) {
                            arrayList0.add(s1);
                        }
                    }
                }
            }
            ((com.dcinside.app.model.b)object0).A(arrayList0);
            ((com.dcinside.app.model.b)object0).x(null);
            ((com.dcinside.app.model.b)object0).y(null);
            ((com.dcinside.app.model.b)object0).w(null);
        }
    }

    @l
    @z3.n
    public static final g s(@m String s) {
        g g0;
        List list0;
        try {
            L.o(uk.a, "GSON");
            list0 = null;
            list0 = c0.a.a.b(uk.a, s, com.dcinside.app.model.c.class);
        }
        catch(Exception unused_ex) {
        }
        if(list0 != null) {
            com.dcinside.app.model.c c0 = (com.dcinside.app.model.c)u.G2(list0);
            if(c0 != null) {
                if(c0.f()) {
                    n.a.r(c0.h());
                    n.a.r(c0.i());
                    n.a.r(c0.l());
                    n.a.r(c0.g());
                    n.a.r(c0.m());
                    n.a.r(c0.o());
                    g0 = g.Q2(c0);
                    L.o(g0, "just(...)");
                    return g0;
                }
                String s1 = c0.a();
                g0 = g.X1((s1 == null ? new f(0x7F150310) : new f(s1)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                L.o(g0, "error(...)");
                return g0;
            }
        }
        g g1 = g.X1(new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g1, "error(...)");
        return g1;
    }

    @l
    @z3.n
    public static final g t(@l String s) {
        g g0;
        List list0;
        L.p(s, "data");
        try {
            L.o(uk.a, "GSON");
            list0 = null;
            list0 = c0.a.a.b(uk.a, s, com.dcinside.app.response.f.class);
        }
        catch(Exception unused_ex) {
        }
        if(list0 != null) {
            com.dcinside.app.response.f f0 = (com.dcinside.app.response.f)u.G2(list0);
            if(f0 != null) {
                if(f0.f()) {
                    g0 = g.Q2(f0);
                    L.o(g0, "just(...)");
                    return g0;
                }
                String s1 = f0.a();
                g0 = g.X1((s1 == null ? new f(0x7F150310) : new f(s1)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                L.o(g0, "error(...)");
                return g0;
            }
        }
        g g1 = g.X1(new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g1, "error(...)");
        return g1;
    }

    @l
    @z3.n
    public static final g u(@l String s) {
        g g1;
        List list0;
        L.p(s, "data");
        try {
            L.o(uk.a, "GSON");
            list0 = null;
            list0 = c0.a.a.b(uk.a, s, com.dcinside.app.response.g.class);
        }
        catch(Exception unused_ex) {
        }
        if(list0 != null) {
            com.dcinside.app.response.g g0 = (com.dcinside.app.response.g)u.G2(list0);
            if(g0 != null) {
                if(g0.f()) {
                    g1 = g.Q2(g0);
                    L.o(g1, "just(...)");
                    return g1;
                }
                String s1 = g0.a();
                g1 = g.X1((s1 == null ? new f(0x7F150310) : new f(s1)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                L.o(g1, "error(...)");
                return g1;
            }
        }
        g g2 = g.X1(new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g2, "error(...)");
        return g2;
    }

    @z3.n
    private static final g v(Object object0) {
        g g0 = g.Q2(object0);
        L.o(g0, "just(...)");
        return g0;
    }

    @l
    @z3.n
    public static final g w(@l String s, @m String s1) {
        g g0;
        List list0;
        L.p(s, "data");
        try {
            L.o(uk.a, "GSON");
            list0 = null;
            list0 = c0.a.a.b(uk.a, s, PostModify.class);
        }
        catch(Exception unused_ex) {
        }
        if(list0 != null) {
            PostModify postModify0 = (PostModify)u.G2(list0);
            if(postModify0 != null) {
                if(postModify0.f()) {
                    postModify0.l0(s1);
                    g0 = g.Q2(postModify0);
                    L.o(g0, "just(...)");
                    return g0;
                }
                String s2 = postModify0.a();
                g0 = g.X1((s2 == null ? new f(0x7F150310) : new f(s2)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                L.o(g0, "error(...)");
                return g0;
            }
        }
        g g1 = g.X1(new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g1, "error(...)");
        return g1;
    }

    @l
    @z3.n
    public static final g x(@m String s) {
        if(s == null || !m0.a.a.d(s, n.g)) {
            n.f = null;
        }
        if(n.f == null) {
            synchronized(x.class) {
                if(n.f == null) {
                    String s1 = B.E.k0();
                    String s2 = B.E.c0();
                    n.g = s1;
                    n.f = n.a.C(s1, s2);
                }
            }
        }
        g g0 = n.f;
        L.m(g0);
        return g0;
    }

    @z3.n
    public static final void y() {
        n.f = null;
    }

    @l
    @z3.n
    public static final g z(@m String s) {
        g g0;
        try {
            if(s != null) {
                int v = s.length() - 1;
                int v1 = 0;
                boolean z = false;
                while(v1 <= v) {
                    boolean z1 = L.t(s.charAt((z ? v : v1)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v;
                    }
                    else if(z1) {
                        ++v1;
                    }
                    else {
                        z = true;
                    }
                }
                String s1 = s.subSequence(v1, v + 1).toString();
                if(v.v2(s1, "<", false, 2, null) && v.N1(s1, "]", false, 2, null)) {
                    s = v.l2(s1, "<br />", "", false, 4, null);
                }
            }
            L.o(uk.a, "GSON");
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            if(f00 != null) {
                if(f00.f()) {
                    g0 = g.Q2(f00);
                    L.m(g0);
                    return g0;
                }
                if(f00.e()) {
                    g g1 = xk.r("", new q(f00.a()));
                    L.o(g1, "toError(...)");
                    return g1;
                }
                if(xk.a(f00.a())) {
                    g g2 = xk.r("", new com.dcinside.app.http.e(f00.c()));
                    L.o(g2, "toError(...)");
                    return g2;
                }
                String s2 = f00.a();
                g0 = g.X1((s2 == null ? new f(0x7F150310) : new f(s2)));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                L.o(g0, "error(...)");
                return g0;
            }
        }
        catch(Exception exception0) {
            g g3 = xk.r(s, exception0);
            L.o(g3, "toError(...)");
            return g3;
        }
        g g4 = xk.r(s, new f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        L.o(g4, "toError(...)");
        return g4;
    }
}

