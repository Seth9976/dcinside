package com.dcinside.app.gallery.search;

import A3.p;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.wv.h;
import java.net.URLEncoder;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;

public final class c extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final View c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final TextView f;
    @l
    private final ImageView g;
    @l
    private m h;

    public c(@l View view0) {
        @f(c = "com.dcinside.app.gallery.search.AboutGalleryHolder$1", f = "AboutGalleryHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final c l;

            a(c c0, d d0) {
                this.l = c0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.c.setVisibility(8);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.search.AboutGalleryHolder$2", f = "AboutGalleryHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            public final class com.dcinside.app.gallery.search.c.b.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[m.values().length];
                    try {
                        arr_v[m.h.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[m.j.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.gallery.search.c.b.a.a = arr_v;
                }
            }

            int k;
            final c l;

            b(c c0, d d0) {
                this.l = c0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k == 0) {
                    f0.n(object0);
                    switch(this.l.v()) {
                        case 1: {
                            this.l.n();
                            return S0.a;
                        }
                        case 2: {
                            this.l.A();
                            return S0.a;
                        }
                        default: {
                            this.l.z();
                            return S0.a;
                        }
                    }
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }


        @f(c = "com.dcinside.app.gallery.search.AboutGalleryHolder$3", f = "AboutGalleryHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.search.c.c extends o implements p {
            int k;
            Object l;
            final c m;

            com.dcinside.app.gallery.search.c.c(c c0, d d0) {
                this.m = c0;
                super(3, d0);
            }

            @y4.m
            public final Object g(@l O o0, @l View view0, @y4.m d d0) {
                com.dcinside.app.gallery.search.c.c c$c0 = new com.dcinside.app.gallery.search.c.c(this.m, d0);
                c$c0.l = view0;
                return c$c0.invokeSuspend(S0.a);
            }

            // 检测为 Lambda 实现
            private static final void h(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void i(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.g(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                static final class com.dcinside.app.gallery.search.c.c.a extends N implements Function1 {
                    final AppCompatActivity e;
                    final String f;

                    com.dcinside.app.gallery.search.c.c.a(AppCompatActivity appCompatActivity0, String s) {
                        this.e = appCompatActivity0;
                        this.f = s;
                        super(1);
                    }

                    public final void b(String s) {
                        String s1 = B.E.k0();
                        String s2 = "";
                        if(s1 == null) {
                            s1 = "";
                        }
                        String s3 = dl.a.c0();
                        if(s3 != null) {
                            s2 = s3;
                        }
                        String s4 = "app_id=" + URLEncoder.encode(s, "UTF-8") + "&confirm_id=" + URLEncoder.encode(s1, "UTF-8") + "&client_token=" + URLEncoder.encode(s2, "UTF-8");
                        L.o(s4, "let(...)");
                        Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e);
                        if(awesomeWebView$Builder0 != null) {
                            Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                            if(awesomeWebView$Builder1 != null) {
                                Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.K6(2);
                                if(awesomeWebView$Builder2 != null) {
                                    Builder awesomeWebView$Builder3 = awesomeWebView$Builder2.j2(h.a(this.e));
                                    if(awesomeWebView$Builder3 != null) {
                                        awesomeWebView$Builder3.z5(this.f, s4);
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

                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                String s = B.E.k0();
                if(m0.a.a.h(s)) {
                    this.m.o();
                    return S0.a;
                }
                Context context0 = view0.getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 == null) {
                    return S0.a;
                }
                Object object1 = view0.getTag();
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                uk.Lj().y5((Object object0) -> new com.dcinside.app.gallery.search.c.c.a(appCompatActivity0, ((String)object1)).invoke(object0), (Throwable throwable0) -> Dl.D(appCompatActivity0, 0x7F1504F7));  // string:important_data_changed "앱을 종료 후 다시 실행해주세요."
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B028B);  // id:category_about_title
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0284);  // id:category_about_create
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0285);  // id:category_about_detail
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B028A);  // id:category_about_detail_title
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0288);  // id:category_about_detail_content
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B0289);  // id:category_about_detail_content1
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0287);  // id:category_about_detail_close
        L.o(view7, "findViewById(...)");
        this.g = (ImageView)view7;
        this.h = m.h;
        r.M(((ImageView)view7), null, new a(this, null), 1, null);
        r.M(((TextView)view1), null, new b(this, null), 1, null);
        r.M(((TextView)view2), null, new com.dcinside.app.gallery.search.c.c(this, null), 1, null);
    }

    private final void A() {
        Context context0 = this.itemView.getContext();
        CategoryHotActivity categoryHotActivity0 = context0 instanceof CategoryHotActivity ? ((CategoryHotActivity)context0) : null;
        if(categoryHotActivity0 == null) {
            return;
        }
        categoryHotActivity0.L1();
    }

    private final void n() {
        int v = this.c.getVisibility() == 0 ? 8 : 0;
        this.c.setVisibility(v);
    }

    private final void o() {
        static final class com.dcinside.app.gallery.search.c.d extends N implements Function1 {
            public static final com.dcinside.app.gallery.search.c.d e;

            static {
                com.dcinside.app.gallery.search.c.d.e = new com.dcinside.app.gallery.search.c.d();
            }

            com.dcinside.app.gallery.search.c.d() {
                super(1);
            }

            @y4.m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150517);  // string:join_mini_need_login "로그인이 필요합니다. 로그인하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
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


        static final class com.dcinside.app.gallery.search.c.f extends N implements Function1 {
            final c e;

            com.dcinside.app.gallery.search.c.f(c c0) {
                this.e = c0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.x();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.gallery.search.c.d.e).z(0x7F1500AA).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.gallery.search.c.f(this), "$tmp0");
            new com.dcinside.app.gallery.search.c.f(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean p(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void q(Function1 function10, Object object0) [...]

    @l
    public final TextView r() {
        return this.b;
    }

    @l
    public final TextView s() {
        return this.e;
    }

    @l
    public final TextView t() {
        return this.f;
    }

    @l
    public final TextView u() {
        return this.d;
    }

    @l
    public final m v() {
        return this.h;
    }

    @l
    public final TextView w() {
        return this.a;
    }

    private final void x() {
        static final class g extends N implements p {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(3);
            }

            public final void a(int v, int v1, @y4.m Intent intent0) {
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        com.dcinside.app.base.d d0 = context0 instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)context0) : null;
        if(d0 == null) {
            return;
        }
        if(com.dcinside.app.main.login.g.a.p()) {
            com.dcinside.app.base.d.y1(d0, 0, null, null, 0, false, 0x1F, null);
            return;
        }
        Intent intent0 = LoginActivity.x.b(d0, false);
        com.dcinside.app.base.d.t.a(d0, intent0, 0x403, g.e);
    }

    public final void y(@l m m0) {
        L.p(m0, "<set-?>");
        this.h = m0;
    }

    private final void z() {
        Context context0 = this.itemView.getContext();
        CategoryHotActivity categoryHotActivity0 = context0 instanceof CategoryHotActivity ? ((CategoryHotActivity)context0) : null;
        if(categoryHotActivity0 == null) {
            return;
        }
        categoryHotActivity0.K1();
    }
}

