package com.dcinside.app.totalsearch.gallery;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.e;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.Application;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.p0;
import com.dcinside.app.totalsearch.a.d;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalGalleryManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryManager.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,209:1\n255#2:210\n257#2,2:234\n257#2,2:236\n257#2,2:238\n108#3:211\n80#3,22:212\n*S KotlinDebug\n*F\n+ 1 TotalGalleryManager.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryManager\n*L\n104#1:210\n164#1:234,2\n165#1:236,2\n187#1:238,2\n117#1:211\n117#1:212,22\n*E\n"})
public final class t {
    @s0({"SMAP\nTotalGalleryManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryManager.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryManager$Companion\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n60#2:210\n1#3:211\n*S KotlinDebug\n*F\n+ 1 TotalGalleryManager.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryManager$Companion\n*L\n203#1:210\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void b(@l Context context0, @m b b0, @l Function1 function10) {
            static final class com.dcinside.app.totalsearch.gallery.t.a.a extends N implements Function1 {
                final Function1 e;

                com.dcinside.app.totalsearch.gallery.t.a.a(Function1 function10) {
                    this.e = function10;
                    super(1);
                }

                public final void a(p0 p00) {
                    Boolean boolean0 = Boolean.valueOf(p00.a());
                    this.e.invoke(boolean0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((p0)object0));
                    return S0.a;
                }
            }

            L.p(context0, "context");
            L.p(function10, "changed");
            o o0 = c.c(context0, p0.class).x5((Object object0) -> {
                L.p(new com.dcinside.app.totalsearch.gallery.t.a.a(function10), "$tmp0");
                new com.dcinside.app.totalsearch.gallery.t.a.a(function10).invoke(object0);
            });
            if(b0 != null) {
                b0.a(o0);
            }
        }

        // 检测为 Lambda 实现
        private static final void c(Function1 function10, Object object0) [...]
    }

    @l
    private final RecyclerView a;
    @m
    private final View b;
    private final boolean c;
    @m
    private View d;
    @l
    private Pattern e;
    @l
    private b f;
    @l
    private Map g;
    @l
    private com.dcinside.app.totalsearch.gallery.a h;
    @m
    private String i;
    @l
    public static final a j;

    static {
        t.j = new a(null);
    }

    public t(@m j j0, @l RecyclerView recyclerView0, @m View view0, boolean z) {
        L.p(recyclerView0, "vwRecycler");
        super();
        this.a = recyclerView0;
        this.b = view0;
        this.c = z;
        Pattern pattern0 = Pattern.compile("[ㄱ-ㅎ]*$");
        L.o(pattern0, "compile(...)");
        this.e = pattern0;
        this.f = new b();
        this.g = new LinkedHashMap();
        this.h = new com.dcinside.app.totalsearch.gallery.a(j0, z);
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        stickyHeaderGridLayoutManager0.n3((int v, View view0, e stickyHeaderGridLayoutManager$e0, int v1) -> {
            L.p(view0, "headerView");
            view0.setTag(0x7F0B0F51, Boolean.TRUE);  // id:sticky_header_view
        });
        stickyHeaderGridLayoutManager0.m3(0);
        recyclerView0.setLayoutManager(stickyHeaderGridLayoutManager0);
        recyclerView0.setAdapter(this.h);
        recyclerView0.addItemDecoration(new l0.b(recyclerView0.getContext()));
    }

    public t(j j0, RecyclerView recyclerView0, View view0, boolean z, int v, w w0) {
        if((v & 1) != 0) {
            j0 = null;
        }
        this(j0, recyclerView0, view0, z);
    }

    // 检测为 Lambda 实现
    private static final void d(int v, View view0, e stickyHeaderGridLayoutManager$e0, int v1) [...]

    @m
    public final g f(@m String s, @m com.dcinside.app.totalsearch.a a0) {
        static final class com.dcinside.app.totalsearch.gallery.t.b extends N implements Function1 {
            final com.dcinside.app.totalsearch.a e;
            final t f;

            com.dcinside.app.totalsearch.gallery.t.b(com.dcinside.app.totalsearch.a a0, t t0) {
                this.e = a0;
                this.f = t0;
                super(1);
            }

            public final g b(@l String s) {
                static final class com.dcinside.app.totalsearch.gallery.t.b.a extends N implements Function1 {
                    final String e;

                    com.dcinside.app.totalsearch.gallery.t.b.a(String s) {
                        this.e = s;
                        super(1);
                    }

                    public final com.dcinside.app.totalsearch.gallery.w a(@m com.dcinside.app.totalsearch.a a0) {
                        return new com.dcinside.app.totalsearch.gallery.w(this.e, a0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.totalsearch.a)object0));
                    }
                }

                L.p(s, "text");
                com.dcinside.app.totalsearch.a a0 = this.e == null ? ((com.dcinside.app.totalsearch.a)this.f.g.get(s)) : this.e;
                if(a0 == null) {
                    return s.length() >= 2 ? uk.FG(s, new d[0]).g3((Object object0) -> {
                        L.p(new com.dcinside.app.totalsearch.gallery.t.b.a(s), "$tmp0");
                        return (com.dcinside.app.totalsearch.gallery.w)new com.dcinside.app.totalsearch.gallery.t.b.a(s).invoke(object0);
                    }).A1(200L, TimeUnit.MILLISECONDS) : g.Q2(new com.dcinside.app.totalsearch.gallery.w("", new com.dcinside.app.totalsearch.a(null, null, null, null, null, null, null, null, null, false, 0, false, 0xFFF, null)));
                }
                return g.Q2(new com.dcinside.app.totalsearch.gallery.w(s, a0));
            }

            // 检测为 Lambda 实现
            private static final com.dcinside.app.totalsearch.gallery.w c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class com.dcinside.app.totalsearch.gallery.t.c extends N implements Function1 {
            final t e;

            com.dcinside.app.totalsearch.gallery.t.c(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(@l com.dcinside.app.totalsearch.gallery.w w0) {
                L.p(w0, "result");
                String s = w0.a();
                L.o(s, "getSearchText(...)");
                com.dcinside.app.totalsearch.a a0 = w0.b();
                L.o(a0, "getTotalSearch(...)");
                this.e.g.put(s, a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.gallery.w)object0));
                return S0.a;
            }
        }

        String s1;
        if(s == null) {
            s1 = "";
        }
        else {
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
            s1 = s.subSequence(v1, v + 1).toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        if(a0 == null && s1.length() > 0) {
            s1 = this.e.matcher(s1).replaceAll("");
            L.o(s1, "replaceAll(...)");
        }
        if(this.c && s1.length() < 2 || L.g(this.i, s1)) {
            return null;
        }
        this.i = s1;
        this.f.c();
        return g.Q2(s1).f2((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.gallery.t.b(a0, this), "$tmp0");
            return (g)new com.dcinside.app.totalsearch.gallery.t.b(a0, this).invoke(object0);
        }).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).P1((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.gallery.t.c(this), "$tmp0");
            new com.dcinside.app.totalsearch.gallery.t.c(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final g g(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void h(Function1 function10, Object object0) [...]

    public final void i() {
        if(this.c) {
            this.h.d0();
            this.a.setVisibility(8);
            this.f.c();
        }
    }

    private final void j() {
        View view0 = this.d;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }

    public final boolean k() {
        return this.a.getVisibility() == 0;
    }

    public final void l() {
        this.f.l();
        this.g.clear();
    }

    public final void m(@l Throwable throwable0) {
        L.p(throwable0, "error");
        this.a.setVisibility(8);
        Dl.G(Application.e.c(), throwable0.getMessage());
        throwable0.printStackTrace();
    }

    public final void n(@l o o0) {
        L.p(o0, "subscription");
        this.f.a(o0);
    }

    public final void o(boolean z) {
        int v = 0;
        this.a.setVisibility((this.h.E() <= 0 ? 0 : 8));
        View view0 = this.b;
        if(view0 != null) {
            if(this.h.E() != 0) {
                v = 8;
            }
            view0.setVisibility(v);
        }
        if(z) {
            this.j();
        }
    }

    public final void p(@l com.dcinside.app.totalsearch.gallery.w w0) {
        L.p(w0, "result");
        com.dcinside.app.totalsearch.gallery.a a0 = this.h;
        com.dcinside.app.totalsearch.a a1 = w0.b();
        L.o(a1, "getTotalSearch(...)");
        a0.l0(w0.a(), a1);
    }

    public final void q(@m View view0) {
        this.d = view0;
    }
}

