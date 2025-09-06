package com.dcinside.app.ad.util;

import Q.d;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.dcinside.app.model.c;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.WebViews;
import com.dcinside.app.wv.f;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.z0;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

public final class r extends a {
    @l
    private final String c;
    private final int d;
    @l
    private final d e;
    @l
    private WeakReference f;
    @m
    private f g;
    private boolean h;
    @m
    private o i;
    @m
    private I0 j;

    public r(@l String s, int v, @m ViewGroup viewGroup0, @l d d0) {
        L.p(s, "galleryId");
        L.p(d0, "adPort");
        super();
        this.c = s;
        this.d = v;
        this.e = d0;
        this.f = new WeakReference(viewGroup0);
    }

    private final void A(String s) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.ad.util.AdSequentialScriptAd$onLoadSuccess$1", f = "AdSequentialScriptAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            public final class com.dcinside.app.ad.util.r.e.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[d.values().length];
                    try {
                        arr_v[d.d.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.ad.util.r.e.a.a = arr_v;
                }
            }

            int k;
            final ViewGroup l;
            final r m;
            final String n;

            e(ViewGroup viewGroup0, r r0, String s, kotlin.coroutines.d d0) {
                this.l = viewGroup0;
                this.m = r0;
                this.n = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new e(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Context context0 = this.l.getContext();
                VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
                L.m(context0);
                videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x7F0406F5));  // attr:windowBackgroundColor
                videoEnabledWebView0.setTag(0x7F0B10CA, b.a(true));  // id:web_fixed_size
                if(com.dcinside.app.ad.util.r.e.a.a[this.m.e.ordinal()] == 1) {
                    int v = Dk.b(0x7F0703DE);  // dimen:script_no_image_height
                    videoEnabledWebView0.setLayoutParams(new ViewGroup.LayoutParams(Dk.b(0x7F0703DF), v));  // dimen:script_no_image_width
                }
                else {
                    videoEnabledWebView0.setLayoutParams(new ViewGroup.LayoutParams(-1, Dk.b(0x7F0703DD)));  // dimen:script_ad_size
                }
                this.l.addView(videoEnabledWebView0);
                f f0 = B.a.e(videoEnabledWebView0);
                this.m.g = f0;
                WebViews.r(videoEnabledWebView0, this.n);
                return S0.a;
            }
        }

        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.f.get();
        if(viewGroup0 == null) {
            r.z(this, null, 1, null);
            return;
        }
        s.c(viewGroup0);
        z0 z00 = () -> i.a;
        I0 i00 = this.j;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.j = k.f(z00, h0.e(), null, new e(viewGroup0, this, s, null), 2, null);
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.h;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        I0 i00 = this.j;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.j = null;
        f f0 = this.g;
        if(f0 != null) {
            f0.onDestroy();
        }
        this.g = null;
        this.f.clear();
        o o0 = this.i;
        if(o0 != null) {
            o0.l();
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        static final class com.dcinside.app.ad.util.r.a extends N implements Function1 {
            final r e;

            com.dcinside.app.ad.util.r.a(r r0) {
                this.e = r0;
                super(1);
            }

            @m
            public final List a(c c0) {
                L.m(c0);
                return this.e.e.c(c0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((c)object0));
            }
        }


        static final class com.dcinside.app.ad.util.r.b extends N implements Function1 {
            final r e;

            com.dcinside.app.ad.util.r.b(r r0) {
                this.e = r0;
                super(1);
            }

            public final String a(@m List list0) {
                String s = this.e.c;
                int v = this.e.d;
                return com.dcinside.app.model.b.j.f(list0, s, v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        @s0({"SMAP\nAdSequentialScriptAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSequentialScriptAd.kt\ncom/dcinside/app/ad/util/AdSequentialScriptAd$onLoad$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
        static final class com.dcinside.app.ad.util.r.c extends N implements Function1 {
            public static final com.dcinside.app.ad.util.r.c e;

            static {
                com.dcinside.app.ad.util.r.c.e = new com.dcinside.app.ad.util.r.c();
            }

            com.dcinside.app.ad.util.r.c() {
                super(1);
            }

            public final g b(String s) {
                if(s != null) {
                    if(s.length() <= 0) {
                        s = null;
                    }
                    if(s != null) {
                        g g0 = g.Q2(WebViews.h(s));
                        return g0 == null ? g.X1(new IllegalStateException("script ad not found")) : g0;
                    }
                }
                return g.X1(new IllegalStateException("script ad not found"));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class com.dcinside.app.ad.util.r.d extends N implements Function1 {
            final r e;

            com.dcinside.app.ad.util.r.d(r r0) {
                this.e = r0;
                super(1);
            }

            public final void b(String s) {
                L.m(s);
                this.e.A(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        if(this.a()) {
            return;
        }
        this.i = uk.Pj().g3((Object object0) -> {
            L.p(new com.dcinside.app.ad.util.r.a(this), "$tmp0");
            return (List)new com.dcinside.app.ad.util.r.a(this).invoke(object0);
        }).g3((Object object0) -> {
            L.p(new com.dcinside.app.ad.util.r.b(this), "$tmp0");
            return (String)new com.dcinside.app.ad.util.r.b(this).invoke(object0);
        }).f2((Object object0) -> {
            L.p(com.dcinside.app.ad.util.r.c.e, "$tmp0");
            return (g)com.dcinside.app.ad.util.r.c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.ad.util.r.d(this), "$tmp0");
            new com.dcinside.app.ad.util.r.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.y(throwable0);
        });
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
        f f0 = this.g;
        if(f0 != null) {
            f0.onPause();
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
        f f0 = this.g;
        if(f0 != null) {
            f0.onResume();
        }
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.h = z;
    }

    // 检测为 Lambda 实现
    private static final List t(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final String u(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g v(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x(r r0, Throwable throwable0) [...]

    private final void y(Throwable throwable0) {
        String s;
        if(this.a()) {
            return;
        }
        if(throwable0 == null) {
            s = "script failed";
        }
        else {
            s = throwable0.getMessage();
            if(s == null) {
                s = "script failed";
            }
        }
        this.c(s);
    }

    static void z(r r0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        r0.y(throwable0);
    }
}

