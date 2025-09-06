package com.dcinside.app.type;

import android.net.Uri.Builder;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import com.hjq.toast.s;
import java.util.List;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import y4.l;
import y4.m;

public enum e {
    @s0({"SMAP\nAdultVerifyType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdultVerifyType.kt\ncom/dcinside/app/type/AdultVerifyType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n295#2,2:119\n*S KotlinDebug\n*F\n+ 1 AdultVerifyType.kt\ncom/dcinside/app/type/AdultVerifyType$Companion\n*L\n77#1:119,2\n*E\n"})
    public static final class a {
        public final class com.dcinside.app.type.e.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[e.values().length];
                try {
                    arr_v[e.b.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[e.c.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.dcinside.app.type.e.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @l
        public final String e(boolean z, @m String s, @m Integer integer0) {
            if(!z) {
                return "";
            }
            if(s == null) {
                return "";
            }
            int v = com.dcinside.app.type.e.a.a.a[a.g(integer0).ordinal()];
            if(v != 1) {
                if(v != 2) {
                    throw new J();
                }
                for(Object object0: jl.a.B()) {
                    List list0 = ((com.dcinside.app.model.e)object0).g();
                    if(list0 != null && list0.contains(s)) {
                        goto label_16;
                    }
                    List list1 = ((com.dcinside.app.model.e)object0).g();
                    if(list1 == null || !list1.contains("*")) {
                        continue;
                    }
                    goto label_16;
                }
                object0 = null;
            label_16:
                if(((com.dcinside.app.model.e)object0) != null) {
                    String s1 = ((com.dcinside.app.model.e)object0).h();
                    return s1 == null ? "" : s1;
                }
            }
            return "";
        }

        public static String f(a e$a0, boolean z, String s, Integer integer0, int v, Object object0) {
            if((v & 4) != 0) {
                integer0 = null;
            }
            return e$a0.e(z, s, integer0);
        }

        private static final e g(Integer integer0) {
            static final class b extends N implements Function1 {
                public static final b e;

                static {
                    b.e = new b();
                }

                b() {
                    super(1);
                }

                @m
                public final Integer a(@l B b0) {
                    L.p(b0, "it");
                    return b0.Y5();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((B)object0));
                }
            }

            if(integer0 == null) {
                integer0 = (Integer)B.E.W(b.e);
            }
            if(integer0 == null) {
                dl dl0 = dl.a;
                if(System.currentTimeMillis() > dl0.m0()) {
                    dl0.d4("");
                    dl0.e4(0L);
                }
                return dl0.l0().length() == 0 ? e.c : e.b;
            }
            return ((int)integer0) == 1 ? e.b : e.c;
        }

        public final void h(@l AppCompatActivity appCompatActivity0, @l String s) {
            static final class c extends N implements Function1 {
                final String e;

                c(String s) {
                    this.e = s;
                    super(1);
                }

                @m
                public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                    L.p(p$a0, "b");
                    return p$a0.n(this.e);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((com.dcinside.app.perform.p.a)object0));
                }
            }


            static final class d extends N implements Function1 {
                public static final d e;

                static {
                    d.e = new d();
                }

                d() {
                    super(1);
                }

                public final Boolean a(Boolean boolean0) {
                    return boolean0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Boolean)object0));
                }
            }


            static final class com.dcinside.app.type.e.a.e extends N implements Function1 {
                public static final com.dcinside.app.type.e.a.e e;

                static {
                    com.dcinside.app.type.e.a.e.e = new com.dcinside.app.type.e.a.e();
                }

                com.dcinside.app.type.e.a.e() {
                    super(1);
                }

                public final g a(Boolean boolean0) {
                    return uk.Lj();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Boolean)object0));
                }
            }


            static final class f extends N implements Function1 {
                final AppCompatActivity e;

                f(AppCompatActivity appCompatActivity0) {
                    this.e = appCompatActivity0;
                    super(1);
                }

                public final void b(String s) {
                    String s1 = dl.a.c0();
                    Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority("m.dcinside.com").appendPath("api").appendPath("adult_cert").appendQueryParameter("app_id", s);
                    String s2 = B.E.k0();
                    if(s2 == null) {
                        s2 = "";
                    }
                    Uri.Builder uri$Builder1 = uri$Builder0.appendQueryParameter("confirm_id", s2);
                    if(s1 == null) {
                        s1 = "";
                    }
                    String s3 = uri$Builder1.appendQueryParameter("client_token", s1).build().toString();
                    L.o(s3, "toString(...)");
                    Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e);
                    if(awesomeWebView$Builder0 != null) {
                        Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.R5(this.e, 1030);
                        if(awesomeWebView$Builder1 != null) {
                            Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.J6(true);
                            if(awesomeWebView$Builder2 != null) {
                                Builder awesomeWebView$Builder3 = awesomeWebView$Builder2.K6(2);
                                if(awesomeWebView$Builder3 != null) {
                                    awesomeWebView$Builder3.y5(s3);
                                }
                            }
                        }
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.b(((String)object0));
                    return S0.a;
                }
            }

            L.p(appCompatActivity0, "activity");
            L.p(s, "msg");
            com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new c(s)).z(0x7F1501E3).x(0x7F1501F2).b().Z1((Object object0) -> {
                L.p(d.e, "$tmp0");
                return (Boolean)d.e.invoke(object0);
            }).f2((Object object0) -> {
                L.p(com.dcinside.app.type.e.a.e.e, "$tmp0");
                return (g)com.dcinside.app.type.e.a.e.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new f(appCompatActivity0), "$tmp0");
                new f(appCompatActivity0).invoke(object0);
            }, (Throwable throwable0) -> s.A(0x7F1502FC));  // string:failed_access_server "서버에 연결할 수 없습니다. (%1$s)"
        }

        // 检测为 Lambda 实现
        private static final Boolean i(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final g j(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final void k(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final void l(Throwable throwable0) [...]
    }

    VERIFIED,
    UNVERIFIED;

    @l
    public static final a a;
    private static final e[] d;
    private static final kotlin.enums.a e;

    static {
        e.d = arr_e;
        L.p(arr_e, "entries");
        e.e = new kotlin.enums.d(arr_e);
        e.a = new a(null);
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return e.e;
    }
}

