package com.dcinside.app.gallery.status;

import A3.p;
import Y.Q1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ql.b;
import com.dcinside.app.util.uk;
import com.dcinside.app.wv.h;
import java.net.URLEncoder;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;

public final class n extends Fragment {
    @m
    private Q1 a;
    @m
    private o b;
    @m
    private a c;

    @Override  // androidx.fragment.app.Fragment
    public void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v1 == -1) {
            this.t0();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = Q1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Q1 q10 = this.p0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(q10.c.getContext());
        q10.c.setLayoutManager(linearLayoutManager0);
        a a0 = new a();
        this.c = a0;
        q10.c.setAdapter(a0);
        b.d(q10.c);
        this.x0();
        this.t0();
    }

    private final Q1 p0() {
        Q1 q10 = this.a;
        L.m(q10);
        return q10;
    }

    private final void q0(String s) {
        static final class com.dcinside.app.gallery.status.n.a extends N implements Function1 {
            final n e;
            final Context f;
            final String g;

            com.dcinside.app.gallery.status.n.a(n n0, Context context0, String s) {
                this.e = n0;
                this.f = context0;
                this.g = s;
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
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e.getActivity());
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.K6(2);
                        if(awesomeWebView$Builder2 != null) {
                            Builder awesomeWebView$Builder3 = awesomeWebView$Builder2.j2(h.a(this.f));
                            if(awesomeWebView$Builder3 != null) {
                                awesomeWebView$Builder3.z5(this.g, s4);
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

        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        uk.Lj().y5((Object object0) -> {
            L.p(new com.dcinside.app.gallery.status.n.a(this, context0, s), "$tmp0");
            new com.dcinside.app.gallery.status.n.a(this, context0, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this.getActivity(), 0x7F1504F7);  // string:important_data_changed "앱을 종료 후 다시 실행해주세요."
        });
    }

    // 检测为 Lambda 实现
    private static final void r0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s0(n n0, Throwable throwable0) [...]

    public final void t0() {
        static final class com.dcinside.app.gallery.status.n.b extends N implements Function1 {
            final n e;

            com.dcinside.app.gallery.status.n.b(n n0) {
                this.e = n0;
                super(1);
            }

            public final void a(e e0) {
                L.m(e0);
                this.e.y0(e0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((e)object0));
                return S0.a;
            }
        }

        String s = B.E.k0();
        if(s != null && s.length() != 0) {
            this.p0().d.setVisibility(0);
            o o0 = this.b;
            if(o0 != null) {
                o0.l();
            }
            this.b = uk.bG().A5(c.e()).M3(rx.android.schedulers.a.c()).T1(() -> {
                L.p(this, "this$0");
                this.p0().d.setVisibility(8);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.gallery.status.n.b(this), "$tmp0");
                new com.dcinside.app.gallery.status.n.b(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Context context0 = this.getContext();
                if(context0 == null) {
                    return;
                }
                Dl.D(context0, 0x7F15037E);  // string:gallery_all_failed "갤러리 목록 갱신을 실패했습니다."
            });
            return;
        }
        this.y0(new e());
    }

    // 检测为 Lambda 实现
    private static final void u0(n n0) [...]

    // 检测为 Lambda 实现
    private static final void v0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w0(n n0, Throwable throwable0) [...]

    private final void x0() {
        @f(c = "com.dcinside.app.gallery.status.ManageListFragment$setupListener$1", f = "ManageListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.status.n.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final n m;

            com.dcinside.app.gallery.status.n.c(n n0, d d0) {
                this.m = n0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.gallery.status.n.c n$c0 = new com.dcinside.app.gallery.status.n.c(this.m, d0);
                n$c0.l = view0;
                return n$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Object object1 = ((View)this.l).getTag();
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                this.m.q0(((String)object1));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.status.ManageListFragment$setupListener$2", f = "ManageListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.status.n.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final n m;

            com.dcinside.app.gallery.status.n.d(n n0, d d0) {
                this.m = n0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.gallery.status.n.d n$d0 = new com.dcinside.app.gallery.status.n.d(this.m, d0);
                n$d0.l = view0;
                return n$d0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Object object1 = ((View)this.l).getTag();
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                this.m.q0(((String)object1));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.status.ManageListFragment$setupListener$3", f = "ManageListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.status.n.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final n m;

            com.dcinside.app.gallery.status.n.e(n n0, d d0) {
                this.m = n0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.gallery.status.n.e n$e0 = new com.dcinside.app.gallery.status.n.e(this.m, d0);
                n$e0.l = view0;
                return n$e0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Object object1 = ((View)this.l).getTag();
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                this.m.q0(((String)object1));
                return S0.a;
            }
        }

        Q1 q10 = this.p0();
        L.o(q10.b.c, "gallMakeMinor");
        com.dcinside.app.gallery.status.n.c n$c0 = new com.dcinside.app.gallery.status.n.c(this, null);
        r.M(q10.b.c, null, n$c0, 1, null);
        Q1 q11 = this.p0();
        L.o(q11.b.b, "gallMakeMini");
        com.dcinside.app.gallery.status.n.d n$d0 = new com.dcinside.app.gallery.status.n.d(this, null);
        r.M(q11.b.b, null, n$d0, 1, null);
        Q1 q12 = this.p0();
        L.o(q12.b.d, "gallMakePerson");
        com.dcinside.app.gallery.status.n.e n$e0 = new com.dcinside.app.gallery.status.n.e(this, null);
        r.M(q12.b.d, null, n$e0, 1, null);
    }

    private final void y0(e e0) {
        boolean z = e0.h();
        if(z) {
            this.p0().c.setVisibility(8);
            this.p0().b.b().setVisibility(0);
        }
        else {
            a a0 = this.c;
            if(a0 != null) {
                a0.H(e0);
            }
            this.p0().c.setVisibility(0);
            this.p0().b.b().setVisibility(8);
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        MyGalleryStatusActivity myGalleryStatusActivity0 = fragmentActivity0 instanceof MyGalleryStatusActivity ? ((MyGalleryStatusActivity)fragmentActivity0) : null;
        if(myGalleryStatusActivity0 != null) {
            myGalleryStatusActivity0.P1(z);
        }
    }
}

