package com.dcinside.app.post.fragments;

import Q.c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.auth.y;
import com.dcinside.app.perform.p;
import com.dcinside.app.post.r.a;
import com.dcinside.app.post.r;
import com.dcinside.app.post.s;
import com.dcinside.app.realm.A;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.q;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.n;
import y4.l;
import y4.m;

@s0({"SMAP\nPostListBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListBaseFragment.kt\ncom/dcinside/app/post/fragments/PostListBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,221:1\n1#2:222\n1#2:226\n120#3,3:223\n124#3:228\n37#4:227\n*S KotlinDebug\n*F\n+ 1 PostListBaseFragment.kt\ncom/dcinside/app/post/fragments/PostListBaseFragment\n*L\n98#1:226\n98#1:223,3\n98#1:228\n100#1:227\n*E\n"})
public abstract class l0 extends V implements ViewStub.OnInflateListener, a, com.dcinside.app.post.s.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a c;
    @m
    private s d;
    @m
    private r e;
    private boolean f;
    @l
    private c g;
    @m
    private GalleryInfo h;

    public l0() {
        this(null, 1, null);
    }

    public l0(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.c = a0;
        this.g = new c(false);
    }

    public l0(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    private final void E0(@StringRes int v, String s) {
        View view0 = this.K0();
        if(view0 == null) {
            return;
        }
        if(view0 instanceof ViewStub) {
            ((ViewStub)view0).setOnInflateListener(this);
            ((ViewStub)view0).setVisibility(0);
            view0 = this.K0();
            if(view0 == null) {
                return;
            }
            view0.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.L0();
            });
            view0.findViewById(0x7F0B0A84).setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                r r0 = this.e;
                if(r0 != null) {
                    r0.a(this.h);
                }
            });
        }
        else {
            view0.setVisibility(0);
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0A85);  // id:post_list_item_situation_msg
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0A83);  // id:post_list_item_situation_date
        L.m(textView0);
        com.dcinside.app.internal.r.o0(textView0, v);
        textView1.setText(s);
    }

    // 检测为 Lambda 实现
    private static final void F0(l0 l00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void G0(l0 l00, View view0) [...]

    @l
    public final c H0() {
        return this.g;
    }

    @m
    public final GalleryInfo I0() {
        return this.h;
    }

    @m
    public final s J0() {
        return this.d;
    }

    @m
    public abstract View K0();

    public abstract void L0();

    public void M0(@l GalleryInfo galleryInfo0) {
        L.p(galleryInfo0, "info");
        String s = galleryInfo0.r();
        if(s == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = null;
        AppCompatActivity appCompatActivity1 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity1 != null) {
            if(com.dcinside.app.internal.c.n(appCompatActivity1)) {
                appCompatActivity0 = appCompatActivity1;
            }
            if(appCompatActivity0 != null) {
                r r0 = this.e;
                if(r0 != null) {
                    r0.b(galleryInfo0);
                }
                this.O0(galleryInfo0, s, appCompatActivity0);
            }
        }
    }

    protected final void N0(@m GalleryInfo galleryInfo0) {
        @f(c = "com.dcinside.app.post.fragments.PostListBaseFragment$galleryInfo$1", f = "PostListBaseFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.l0.a extends o implements A3.o {
            int k;
            final l0 l;
            final GalleryInfo m;

            com.dcinside.app.post.fragments.l0.a(l0 l00, GalleryInfo galleryInfo0, d d0) {
                this.l = l00;
                this.m = galleryInfo0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.post.fragments.l0.a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.post.fragments.l0.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M0(this.m);
                return S0.a;
            }
        }

        if(L.g(this.h, galleryInfo0)) {
            return;
        }
        this.h = galleryInfo0;
        String s = galleryInfo0 == null ? null : galleryInfo0.r();
        this.g = s == null ? new c(false) : new c(s, (this.h == null ? null : this.h.q()));
        if(galleryInfo0 == null) {
            return;
        }
        k.f(this, h0.e(), null, new com.dcinside.app.post.fragments.l0.a(this, galleryInfo0, null), 2, null);
    }

    private final void O0(GalleryInfo galleryInfo0, String s, AppCompatActivity appCompatActivity0) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final void a(Integer integer0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.l0.c extends N implements Function1 {
            final String e;

            com.dcinside.app.post.fragments.l0.c(String s) {
                this.e = s;
                super(1);
            }

            public final void a(@l q q0) {
                L.p(q0, "it");
                q0.g6(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((q)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.l0.d extends N implements Function1 {
            final String e;

            com.dcinside.app.post.fragments.l0.d(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F150379).n(this.e).d(false);  // string:gallery_alert_manager_alarm_title "매니저 알림"
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


        static final class com.dcinside.app.post.fragments.l0.f extends N implements Function1 {
            final l0 e;
            final GalleryInfo f;
            final String g;
            final AppCompatActivity h;

            com.dcinside.app.post.fragments.l0.f(l0 l00, GalleryInfo galleryInfo0, String s, AppCompatActivity appCompatActivity0) {
                this.e = l00;
                this.f = galleryInfo0;
                this.g = s;
                this.h = appCompatActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.O0(this.f, this.g, this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class g extends N implements Function1 {
            final String e;

            g(String s) {
                this.e = s;
                super(1);
            }

            public final void a(@l q q0) {
                L.p(q0, "it");
                q0.j6(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((q)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.l0.h extends N implements Function1 {
            final String e;

            com.dcinside.app.post.fragments.l0.h(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F15037C).n(this.e).d(false);  // string:gallery_alert_minor_reason_title "마이너 갤러리 접근 제한 안내"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
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


        static final class j extends N implements Function1 {
            final l0 e;
            final GalleryInfo f;
            final String g;
            final AppCompatActivity h;

            j(l0 l00, GalleryInfo galleryInfo0, String s, AppCompatActivity appCompatActivity0) {
                this.e = l00;
                this.f = galleryInfo0;
                this.g = s;
                this.h = appCompatActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.O0(this.f, this.g, this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.l0.k extends N implements Function1 {
            final AppCompatActivity e;
            final GalleryInfo f;

            com.dcinside.app.post.fragments.l0.k(AppCompatActivity appCompatActivity0, GalleryInfo galleryInfo0) {
                this.e = appCompatActivity0;
                this.f = galleryInfo0;
                super(1);
            }

            @l
            public final p a(@l n n0) {
                L.p(n0, "it");
                p p0 = new y(this.e);
                ((y)p0).D(this.f.q());
                return p0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((n)object0));
            }
        }


        static final class com.dcinside.app.post.fragments.l0.l extends N implements A3.a {
            final F0 e;

            com.dcinside.app.post.fragments.l0.l(F0 f00) {
                this.e = f00;
                super(0);
            }

            @m
            public final B b() {
                return B.E.V(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nPostListBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListBaseFragment.kt\ncom/dcinside/app/post/fragments/PostListBaseFragment$showManagerAlert$1$isManager$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
        static final class com.dcinside.app.post.fragments.l0.m extends N implements A3.a {
            final D e;
            final GalleryInfo f;

            com.dcinside.app.post.fragments.l0.m(D d0, GalleryInfo galleryInfo0) {
                this.e = d0;
                this.f = galleryInfo0;
                super(0);
            }

            @l
            public final Boolean b() {
                B b0 = l0.P0(this.e);
                return Boolean.valueOf(b0 != null && L.g(b0.j6(), this.f.A()));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        D d0;
        kotlin.jvm.internal.l0.h l0$h0;
        F0 f00 = F0.g4();
        L.m(f00);
        if(com.dcinside.app.internal.c.o(appCompatActivity0)) {
            goto label_52;
        }
        else {
            l0$h0 = new kotlin.jvm.internal.l0.h();
            RealmQuery realmQuery0 = f00.C4(q.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            l0$h0.a = realmQuery0.i0("galleryId", s).r0();
            d0 = E.a(new com.dcinside.app.post.fragments.l0.l(f00));
            D d1 = E.a(new com.dcinside.app.post.fragments.l0.m(d0, galleryInfo0));
            String s1 = galleryInfo0.z();
            q q0 = (q)l0$h0.a;
            if(!L.g(s1, (q0 == null ? null : q0.V5())) && l0.Q0(d1)) {
                l0.X0(f00, l0$h0, s, new com.dcinside.app.post.fragments.l0.c(s1));
                if(s1 != null && s1.length() > 0) {
                    com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.post.fragments.l0.d(s1)).z(0x104000A).b().Z1((Object object0) -> {
                        L.p(e.e, "$tmp0");
                        return (Boolean)e.e.invoke(object0);
                    }).x5((Object object0) -> {
                        L.p(new com.dcinside.app.post.fragments.l0.f(this, galleryInfo0, s, appCompatActivity0), "$tmp0");
                        new com.dcinside.app.post.fragments.l0.f(this, galleryInfo0, s, appCompatActivity0).invoke(object0);
                    });
                    kotlin.io.c.a(f00, null);
                    return;
                }
            }
        }
        String s2 = galleryInfo0.H();
        q q1 = (q)l0$h0.a;
        if(L.g(s2, (q1 == null ? null : q1.Y5()))) {
            goto label_27;
        }
        else {
            l0.X0(f00, l0$h0, s, new g(s2));
            if(s2 != null && s2.length() > 0) {
                String s3 = appCompatActivity0.getString(0x7F15037B, new Object[]{(galleryInfo0.s() == null ? "" : galleryInfo0.s()), s2});  // string:gallery_alert_minor_reason_content "다음 사유를 준수하지 않을 경우 %1$s 마이너 갤러리가 접근 제한될 
                                                                                                                                             // 수 있습니다. 접근 제한되지 않기 위해서는 운영원칙에 따라 마이너 갤러리를 관리해야 합니다.\n\n사유 : %2$s"
                L.o(s3, "getString(...)");
                com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.post.fragments.l0.h(s3)).z(0x104000A).b().Z1((Object object0) -> {
                    L.p(i.e, "$tmp0");
                    return (Boolean)i.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new j(this, galleryInfo0, s, appCompatActivity0), "$tmp0");
                    new j(this, galleryInfo0, s, appCompatActivity0).invoke(object0);
                });
            }
        }
        kotlin.io.c.a(f00, null);
        return;
    label_27:
        if(this.f) {
            kotlin.io.c.a(f00, null);
            return;
        }
        try {
            if(jl.a.r0() == 0L) {
                goto label_50;
            }
            long v = System.currentTimeMillis();
            dl dl0 = dl.a;
            if(Math.abs(dl0.b1() - v) <= TimeUnit.SECONDS.toMillis(604800L)) {
                goto label_48;
            }
            if(l0.Q0(d1)) {
                B b0 = l0.P0(d0);
                if(b0 == null) {
                    this.f = true;
                    dl0.T4(v);
                    com.dcinside.app.perform.e.e.a(appCompatActivity0).p(new com.dcinside.app.post.fragments.l0.k(appCompatActivity0, galleryInfo0)).y5((Object object0) -> {
                        L.p(b.e, "$tmp0");
                        b.e.invoke(object0);
                    }, new com.dcinside.app.post.fragments.h0());
                }
                else {
                    String s4 = b0.n6();
                    if(s4 == null || s4.length() <= 0) {
                        this.f = true;
                        dl0.T4(v);
                        com.dcinside.app.perform.e.e.a(appCompatActivity0).p(new com.dcinside.app.post.fragments.l0.k(appCompatActivity0, galleryInfo0)).y5((Object object0) -> {
                            L.p(b.e, "$tmp0");
                            b.e.invoke(object0);
                        }, new com.dcinside.app.post.fragments.h0());
                    }
                }
            }
            goto label_52;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable1;
        }
    label_48:
        kotlin.io.c.a(f00, null);
        return;
    label_50:
        kotlin.io.c.a(f00, null);
        return;
    label_52:
        kotlin.io.c.a(f00, null);
    }

    private static final B P0(D d0) {
        return (B)d0.getValue();
    }

    private static final boolean Q0(D d0) {
        return ((Boolean)d0.getValue()).booleanValue();
    }

    // 检测为 Lambda 实现
    private static final Boolean R0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void S0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Boolean T0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V0(Function1 function10, Object object0) [...]

    private static final void W0(Throwable throwable0) {
    }

    private static final void X0(F0 f00, kotlin.jvm.internal.l0.h l0$h0, String s, Function1 function10) {
        f00.Y3((F0 f00) -> {
            L.p(l0$h0, "$params");
            L.p(function10, "$onUpdate");
            L.p(s, "$galleryId");
            q q0 = (q)l0$h0.a;
            if(q0 != null) {
                function10.invoke(q0);
                return;
            }
            q q1 = new q();
            q1.e6(s);
            function10.invoke(q1);
            l0$h0.a = f00.t2(q1, new W[0]);
        });
    }

    // 检测为 Lambda 实现
    private static final void Y0(kotlin.jvm.internal.l0.h l0$h0, Function1 function10, String s, F0 f00) [...]

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.c.getCoroutineContext();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.e = null;
        this.d = null;
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.d = new s(this);
        this.e = new r(this);
    }

    @Override  // com.dcinside.app.post.r$a
    public void r(@l A a0) {
        L.p(a0, "situation");
        com.dcinside.app.type.r r0 = com.dcinside.app.type.s.c(a0);
        if(a0.R5() <= System.currentTimeMillis()) {
            this.E0(r0.e(), (com.dcinside.app.type.r.f == r0 ? null : Bk.F(a0.U5())));
            return;
        }
        View view0 = this.K0();
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.c.t();
    }

    public static void x0(Throwable throwable0) {
    }
}

