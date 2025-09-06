package com.dcinside.app.totalsearch.gallery;

import Y.w2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.ad.naver.a;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.p0;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.totalsearch.a.d;
import com.dcinside.app.totalsearch.a.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.c;
import rx.g;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalGalleryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryFragment.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,184:1\n257#2,2:185\n*S KotlinDebug\n*F\n+ 1 TotalGalleryFragment.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryFragment\n*L\n158#1:185,2\n*E\n"})
public final class j extends Fragment implements a, c {
    @s0({"SMAP\nTotalGalleryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryFragment.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryFragment$ScrollListener\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,184:1\n147#2:185\n*S KotlinDebug\n*F\n+ 1 TotalGalleryFragment.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryFragment$ScrollListener\n*L\n175#1:185\n*E\n"})
    public static final class com.dcinside.app.totalsearch.gallery.j.a extends OnScrollListener {
        @l
        private final t a;

        public com.dcinside.app.totalsearch.gallery.j.a(@l j j0) {
            L.p(j0, "fragment");
            super();
            this.a = new t(j0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
        public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
            L.p(recyclerView0, "recyclerView");
            super.onScrollStateChanged(recyclerView0, v);
            j j0 = (j)this.a.a();
            if(j0 == null) {
                return;
            }
            j0.B0(v != 0);
        }
    }

    @m
    private w2 a;
    @m
    private o b;
    @m
    private String c;
    @m
    private com.dcinside.app.totalsearch.a d;
    private o e;
    private rx.subjects.c f;
    @m
    private com.dcinside.app.totalsearch.gallery.t g;
    private boolean h;

    public j() {
        this.b = f.e();
        this.e = f.e();
        this.f = rx.subjects.c.C7();
    }

    // 检测为 Lambda 实现
    private static final void A0(j j0, Throwable throwable0) [...]

    private final void B0(boolean z) {
        if(this.h != z) {
            this.h = z;
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(fragmentActivity0, new p0(z));
            }
        }
    }

    @Override  // com.dcinside.app.ad.naver.a
    public void O(int v) {
        this.f.onNext(v);
    }

    @Override  // l0.c
    public void R() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        TotalSearchActivity totalSearchActivity0 = fragmentActivity0 instanceof TotalSearchActivity ? ((TotalSearchActivity)fragmentActivity0) : null;
        if(totalSearchActivity0 == null) {
            return;
        }
        totalSearchActivity0.i2();
    }

    @Override  // l0.c
    public void a() {
        static final class com.dcinside.app.totalsearch.gallery.j.c extends N implements Function1 {
            final j e;
            final String f;

            com.dcinside.app.totalsearch.gallery.j.c(j j0, String s) {
                this.e = j0;
                this.f = s;
                super(1);
            }

            public final void a(@m com.dcinside.app.totalsearch.a a0) {
                this.e.u0(a0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        TotalSearchActivity totalSearchActivity0 = fragmentActivity0 instanceof TotalSearchActivity ? ((TotalSearchActivity)fragmentActivity0) : null;
        if(totalSearchActivity0 == null) {
            return;
        }
        String s = totalSearchActivity0.e2();
        if(s != null && (this.d == null || !m0.a.a.d(this.c, s))) {
            o o0 = this.b;
            if(o0 != null) {
                o0.l();
            }
            this.y0(true);
            this.b = uk.FG(s, new d[]{e.d}).y5((Object object0) -> {
                L.p(new com.dcinside.app.totalsearch.gallery.j.c(this, s), "$tmp0");
                new com.dcinside.app.totalsearch.gallery.j.c(this, s).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.m(throwable0);
                this.v0(throwable0);
            });
            return;
        }
        this.u0(this.d, this.c);
    }

    @Override  // l0.c
    public void a0() {
        this.t0().d.scrollToPosition(0);
    }

    @Override  // androidx.fragment.app.Fragment
    @m
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = w2.d(layoutInflater0, viewGroup0, false);
        return this.t0().b();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.dcinside.app.totalsearch.gallery.t t0 = this.g;
        if(t0 != null) {
            t0.l();
        }
        this.g = null;
        this.t0().d.clearOnScrollListeners();
        kl.b(new o[]{this.b, this.e});
        this.b = null;
        this.f.d();
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        w2 w20 = this.t0();
        L.o(w20.d, "searchGalleryRecycler");
        w2 w21 = this.t0();
        this.g = new com.dcinside.app.totalsearch.gallery.t(this, w20.d, w21.b, false);
        w2 w22 = this.t0();
        com.dcinside.app.totalsearch.gallery.j.a j$a0 = new com.dcinside.app.totalsearch.gallery.j.a(this);
        w22.d.addOnScrollListener(j$a0);
    }

    private final w2 t0() {
        w2 w20 = this.a;
        L.m(w20);
        return w20;
    }

    private final void u0(com.dcinside.app.totalsearch.a a0, String s) {
        static final class b extends N implements Function1 {
            final j e;
            final String f;

            b(j j0, String s) {
                this.e = j0;
                this.f = s;
                super(1);
            }

            public final void e(w w0) {
                static final class com.dcinside.app.totalsearch.gallery.j.b.a extends N implements A3.o {
                    public static final com.dcinside.app.totalsearch.gallery.j.b.a e;

                    static {
                        com.dcinside.app.totalsearch.gallery.j.b.a.e = new com.dcinside.app.totalsearch.gallery.j.b.a();
                    }

                    com.dcinside.app.totalsearch.gallery.j.b.a() {
                        super(2);
                    }

                    public final w a(w w0, Integer integer0) {
                        return w0;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((w)object0), ((Integer)object1));
                    }
                }


                static final class com.dcinside.app.totalsearch.gallery.j.b.b extends N implements Function1 {
                    final j e;

                    com.dcinside.app.totalsearch.gallery.j.b.b(j j0) {
                        this.e = j0;
                        super(1);
                    }

                    public final void a(w w0) {
                        this.e.y0(false);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((w)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.totalsearch.gallery.j.b.c extends N implements Function1 {
                    public static final com.dcinside.app.totalsearch.gallery.j.b.c e;

                    static {
                        com.dcinside.app.totalsearch.gallery.j.b.c.e = new com.dcinside.app.totalsearch.gallery.j.b.c();
                    }

                    com.dcinside.app.totalsearch.gallery.j.b.c() {
                        super(1);
                    }

                    public final Integer a(Throwable throwable0) {
                        return 0;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Throwable)object0));
                    }
                }

                g g0 = this.e.f.i6(1500L, TimeUnit.MILLISECONDS).a4((Object object0) -> {
                    L.p(com.dcinside.app.totalsearch.gallery.j.b.c.e, "$tmp0");
                    return (Integer)com.dcinside.app.totalsearch.gallery.j.b.c.e.invoke(object0);
                });
                boolean z = true;
                kl.b(new o[]{this.e.e});
                o o0 = g.u0(g.Q2(w0), g0, (Object object0, Object object1) -> {
                    L.p(com.dcinside.app.totalsearch.gallery.j.b.a.e, "$tmp0");
                    return (w)com.dcinside.app.totalsearch.gallery.j.b.a.e.invoke(object0, object1);
                }).H5(1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                    L.p(new com.dcinside.app.totalsearch.gallery.j.b.b(this.e), "$tmp0");
                    new com.dcinside.app.totalsearch.gallery.j.b.b(this.e).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    this.e.y0(false);
                });
                this.e.e = o0;
                com.dcinside.app.totalsearch.gallery.t t0 = this.e.g;
                if(t0 != null) {
                    L.m(w0);
                    t0.p(w0);
                }
                com.dcinside.app.totalsearch.gallery.t t1 = this.e.g;
                if(t1 != null) {
                    if(this.f != null && this.f.length() != 0) {
                        z = false;
                    }
                    t1.o(z);
                }
            }

            // 检测为 Lambda 实现
            private static final Integer f(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final w g(A3.o o0, Object object0, Object object1) [...]

            // 检测为 Lambda 实现
            private static final void h(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void i(j j0, Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.e(((w)object0));
                return S0.a;
            }
        }

        this.d = a0;
        this.c = s;
        g g0 = this.g == null ? null : this.g.f(s, a0);
        if(g0 == null) {
            return;
        }
        o o0 = g0.y5((Object object0) -> {
            L.p(new b(this, s), "$tmp0");
            new b(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.dcinside.app.totalsearch.gallery.t t0 = this.g;
            if(t0 != null) {
                L.m(throwable0);
                t0.m(throwable0);
            }
        });
        com.dcinside.app.totalsearch.gallery.t t0 = this.g;
        if(t0 != null) {
            L.m(o0);
            t0.n(o0);
        }
    }

    private final void v0(Throwable throwable0) {
        this.y0(false);
        if(throwable0 instanceof com.dcinside.app.http.a) {
            int v = B.E.k0() == null ? 5 : 4;
            B.E.s(this, v, "", 0);
            return;
        }
        Dl.G(Application.e.c(), throwable0.getMessage());
        throwable0.printStackTrace();
    }

    // 检测为 Lambda 实现
    private static final void w0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x0(j j0, Throwable throwable0) [...]

    private final void y0(boolean z) {
        FrameLayout frameLayout0 = this.t0().c;
        L.o(frameLayout0, "searchGalleryProgress");
        frameLayout0.setVisibility((z ? 0 : 8));
    }

    // 检测为 Lambda 实现
    private static final void z0(Function1 function10, Object object0) [...]
}

