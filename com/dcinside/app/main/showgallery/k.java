package com.dcinside.app.main.showgallery;

import A3.p;
import Y.G1;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.dcinside.app.bookmark.J;
import com.dcinside.app.bookmark.K;
import com.dcinside.app.bookmark.v;
import com.dcinside.app.settings.recent.RecentGallerySettingActivity;
import com.dcinside.app.settings.recent.b;
import com.dcinside.app.type.F;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nShowAllGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,255:1\n1#2:256\n1#2:260\n120#3,3:257\n124#3:261\n177#3,9:264\n204#3,7:273\n257#4,2:262\n257#4,2:280\n257#4,2:282\n*S KotlinDebug\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog\n*L\n91#1:260\n91#1:257,3\n91#1:261\n205#1:264,9\n206#1:273,7\n115#1:262,2\n227#1:280,2\n244#1:282,2\n*E\n"})
public final class k extends DialogFragment implements K {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private G1 a;
    @m
    private g1 b;
    @l
    private final P0 c;
    @m
    private v d;
    @l
    private final com.dcinside.app.main.showgallery.m e;
    @l
    private F f;
    @m
    private b g;
    @m
    private o h;
    @l
    public static final a i = null;
    @l
    public static final String j = "EXTRA_RECENT_MODE";

    static {
        k.i = new a(null);
    }

    public k() {
        static final class com.dcinside.app.main.showgallery.k.b extends N implements Function1 {
            final k e;

            com.dcinside.app.main.showgallery.k.b(k k0) {
                this.e = k0;
                super(1);
            }

            public final void a(@l V v0) {
                L.p(v0, "<name for destructuring parameter 0>");
                this.e.G0(((com.dcinside.app.realm.s0)v0.a()), ((com.dcinside.app.realm.m)v0.b()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final k e;

            c(k k0) {
                this.e = k0;
                super(1);
            }

            public final void a(@l V v0) {
                L.p(v0, "<name for destructuring parameter 0>");
                this.e.R0(((com.dcinside.app.realm.s0)v0.a()), ((com.dcinside.app.realm.m)v0.b()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }


        static final class d extends N implements Function1 {
            final k e;

            d(k k0) {
                this.e = k0;
                super(1);
            }

            public final void a(@l com.dcinside.app.realm.s0 s00) {
                L.p(s00, "r");
                this.e.P0(s00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.realm.s0)object0));
                return S0.a;
            }
        }

        this.c = (g1 g10) -> {
            L.p(this, "this$0");
            L.m(g10);
            this.Q0(g10);
        };
        this.e = new com.dcinside.app.main.showgallery.m(new com.dcinside.app.main.showgallery.k.b(this), new c(this), new d(this));
        this.f = F.b;
    }

    private final void B0() {
        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F15086A);  // string:recent_delete_all_basic "목록을 모두 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
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


        static final class g extends N implements Function1 {
            final k e;

            g(k k0) {
                this.e = k0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.F0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(this.f == F.b) {
            b b0 = this.g;
            if(b0 != null) {
                try {
                    b0.dismissAllowingStateLoss();
                }
                catch(Exception unused_ex) {
                }
            }
            FragmentManager fragmentManager0 = this.getChildFragmentManager();
            L.o(fragmentManager0, "getChildFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = b.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.settings.recent.b");
            if(fragment0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.settings.recent.DeleteAllGalleryDialog");
            }
            ((b)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
            ((b)fragment0).show(fragmentManager0, "com.dcinside.app.settings.recent.b");
            this.g = (b)fragment0;
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(e.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
            L.p(f.e, "$tmp0");
            return (Boolean)f.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new g(this), "$tmp0");
            new g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.G(this.getContext(), throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean C0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void D0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void E0(k k0, Throwable throwable0) [...]

    private final void F0() {
        public static final class h implements J {
            @Override  // com.dcinside.app.bookmark.J
            public void a(boolean z) {
            }
        }

        G1 g10 = this.N0();
        L.o(g10.g, "dialogAllGalleryProgress");
        g10.g.setVisibility(0);
        v v0 = this.d;
        if(v0 != null) {
            v0.q(new h());
        }
    }

    private final void G0(com.dcinside.app.realm.s0 s00, com.dcinside.app.realm.m m0) {
        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F15086C);  // string:recent_delete_basic "최근 방문 목록에서 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
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


        @s0({"SMAP\nShowAllGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog$deleteItem$3\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n112#2,3:256\n129#2,15:260\n116#2:275\n129#2,15:276\n1#3:259\n*S KotlinDebug\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog$deleteItem$3\n*L\n154#1:256,3\n154#1:260,15\n154#1:275\n154#1:276,15\n154#1:259\n*E\n"})
        static final class com.dcinside.app.main.showgallery.k.k extends N implements Function1 {
            final com.dcinside.app.realm.s0 e;

            com.dcinside.app.main.showgallery.k.k(com.dcinside.app.realm.s0 s00) {
                this.e = s00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                com.dcinside.app.realm.s0 s00 = this.e;
                F0 f00 = F0.g4();
                L.m(f00);
                if(f00.E0()) {
                    s00.z5();
                    com.dcinside.app.realm.helper.a.a.f();
                }
                else {
                    f00.beginTransaction();
                    goto label_8;
                }
                goto label_21;
                try {
                label_8:
                    s00.z5();
                    com.dcinside.app.realm.helper.a.a.f();
                    f00.p();
                    goto label_21;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable2;
                }
            label_21:
                kotlin.io.c.a(f00, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.main.showgallery.k.l extends N implements Function1 {
            public static final com.dcinside.app.main.showgallery.k.l e;

            static {
                com.dcinside.app.main.showgallery.k.l.e = new com.dcinside.app.main.showgallery.k.l();
            }

            com.dcinside.app.main.showgallery.k.l() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F15086D);  // string:recent_delete_favorite "즐겨찾기 해제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.main.showgallery.k.m extends N implements Function1 {
            public static final com.dcinside.app.main.showgallery.k.m e;

            static {
                com.dcinside.app.main.showgallery.k.m.e = new com.dcinside.app.main.showgallery.k.m();
            }

            com.dcinside.app.main.showgallery.k.m() {
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


        static final class n extends N implements Function1 {
            final k e;
            final com.dcinside.app.realm.m f;

            n(k k0, com.dcinside.app.realm.m m0) {
                this.e = k0;
                this.f = m0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                v v0 = this.e.d;
                if(v0 != null) {
                    v0.u(this.e.getContext(), this.f.S5(), this.f.R5());
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(s00 != null) {
            com.dcinside.app.perform.e.e.a(appCompatActivity0).n(i.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
                L.p(j.e, "$tmp0");
                return (Boolean)j.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.main.showgallery.k.k(s00), "$tmp0");
                new com.dcinside.app.main.showgallery.k.k(s00).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.G(this.getContext(), throwable0.getMessage());
            });
            return;
        }
        if(m0 != null) {
            com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.main.showgallery.k.l.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.main.showgallery.k.m.e, "$tmp0");
                return (Boolean)com.dcinside.app.main.showgallery.k.m.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new n(this, m0), "$tmp0");
                new n(this, m0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.G(this.getContext(), throwable0.getMessage());
            });
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean H0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void J0(k k0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean K0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void L0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M0(k k0, Throwable throwable0) [...]

    private final G1 N0() {
        G1 g10 = this.a;
        L.m(g10);
        return g10;
    }

    private final void O0() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryDialog$initView$1$1", f = "ShowAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nShowAllGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog$initView$1$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,255:1\n177#2,9:256\n*S KotlinDebug\n*F\n+ 1 ShowAllGalleryDialog.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryDialog$initView$1$1\n*L\n118#1:256,9\n*E\n"})
        static final class com.dcinside.app.main.showgallery.k.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final k m;

            com.dcinside.app.main.showgallery.k.o(k k0, kotlin.coroutines.d d0) {
                this.m = k0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.main.showgallery.k.o k$o0 = new com.dcinside.app.main.showgallery.k.o(this.m, d0);
                k$o0.l = view0;
                return k$o0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Context context0 = ((View)this.l).getContext();
                L.o(context0, "getContext(...)");
                RecentGallerySettingActivity.C.a(context0);
                try {
                    this.m.dismissAllowingStateLoss();
                }
                catch(Exception unused_ex) {
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryDialog$initView$2", f = "ShowAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.showgallery.k.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;

            com.dcinside.app.main.showgallery.k.p(kotlin.coroutines.d d0) {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.showgallery.k.p(d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryDialog$initView$3", f = "ShowAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final k l;

            q(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new q(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.B0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryDialog$initView$4", f = "ShowAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final k l;

            r(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new r(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.showgallery.ShowAllGalleryDialog$initView$5", f = "ShowAllGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class s extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final k l;

            s(k k0, kotlin.coroutines.d d0) {
                this.l = k0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new s(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        public static final class t extends SpanSizeLookup {
            final k e;

            t(k k0) {
                this.e = k0;
                super();
            }

            @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
            public int f(int v) {
                if(!this.e.e.A()) {
                    return 1;
                }
                return v == this.e.e.getItemCount() - 1 ? 2 : 1;
            }
        }

        V v0 = this.f == F.b ? r0.a(this.getString(0x7F150872), this.getString(0x7F15086E)) : r0.a(this.getString(0x7F150873), this.getString(0x7F15086F));  // string:recent_missing_basic "최근 방문 갤러리"
        ImageView imageView0 = this.N0().i;
        L.m(imageView0);
        imageView0.setVisibility((this.f == F.b ? 0 : 8));
        com.dcinside.app.internal.r.M(imageView0, null, new com.dcinside.app.main.showgallery.k.o(this, null), 1, null);
        this.N0().e.setText(((String)v0.b()));
        this.N0().j.setText(((String)v0.a()));
        G1 g10 = this.N0();
        L.o(g10.d, "dialogAllGalleryDeleteWrap");
        com.dcinside.app.main.showgallery.k.p k$p0 = new com.dcinside.app.main.showgallery.k.p(null);
        com.dcinside.app.internal.r.M(g10.d, null, k$p0, 1, null);
        G1 g11 = this.N0();
        L.o(g11.c, "dialogAllGalleryDeleteAll");
        q k$q0 = new q(this, null);
        com.dcinside.app.internal.r.M(g11.c, null, k$q0, 1, null);
        G1 g12 = this.N0();
        L.o(g12.k, "dialogAllWrap");
        r k$r0 = new r(this, null);
        com.dcinside.app.internal.r.M(g12.k, null, k$r0, 1, null);
        G1 g13 = this.N0();
        L.o(g13.b, "dialogAllGalleryClose");
        s k$s0 = new s(this, null);
        com.dcinside.app.internal.r.M(g13.b, null, k$s0, 1, null);
        G1 g14 = this.N0();
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(g14.f.getContext(), 2);
        g14.f.setLayoutManager(gridLayoutManager0);
        g14.f.setAdapter(this.e);
        gridLayoutManager0.m4(new t(this));
    }

    private final void P0(com.dcinside.app.realm.s0 s00) {
        if(s00 == null) {
            return;
        }
        Context context0 = this.getContext();
        com.dcinside.app.base.g g0 = context0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)context0) : null;
        if(g0 == null) {
            return;
        }
        com.dcinside.app.realm.s0.j.q(g0, s00);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void Q0(g1 g10) {
        int v = 8;
        this.N0().e.setVisibility((g10.isEmpty() ? 0 : 8));
        ConstraintLayout constraintLayout0 = this.N0().d;
        if(!g10.isEmpty()) {
            v = 0;
        }
        constraintLayout0.setVisibility(v);
        this.e.C(g10);
        this.e.notifyDataSetChanged();
    }

    private final void R0(com.dcinside.app.realm.s0 s00, com.dcinside.app.realm.m m0) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        String s = null;
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(s00 == null) {
        label_10:
            if(m0 != null) {
                s = m0.R5();
            }
        }
        else {
            String s1 = s00.R5();
            if(s1 != null) {
                s = s1;
                Xk.i(appCompatActivity0, s);
                this.dismissAllowingStateLoss();
                return;
            }
            goto label_10;
        }
        Xk.i(appCompatActivity0, s);
        this.dismissAllowingStateLoss();
    }

    // 检测为 Lambda 实现
    private static final void S0(k k0, g1 g10) [...]

    @Override  // com.dcinside.app.bookmark.K
    public void n(@l v v0, int v1, @m List list0) {
        L.p(v0, "favoriteBasket");
        ProgressBar progressBar0 = this.N0().g;
        L.o(progressBar0, "dialogAllGalleryProgress");
        int v2 = 0;
        progressBar0.setVisibility((v1 == 1 ? 0 : 8));
        this.N0().e.setVisibility((list0 == null || list0.isEmpty() ? 0 : 8));
        ConstraintLayout constraintLayout0 = this.N0().d;
        if(list0 == null || list0.isEmpty()) {
            v2 = 8;
        }
        constraintLayout0.setVisibility(v2);
        this.e.B(list0);
        this.e.notifyDataSetChanged();
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = G1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.N0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        g1 g10 = this.b;
        if(g10 != null) {
            g10.D();
        }
        this.b = null;
        o o0 = this.h;
        if(o0 != null) {
            o0.l();
        }
        this.h = null;
        super.onDestroy();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        F f0;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        Integer integer0 = bundle1 == null ? null : bundle1.getInt("EXTRA_RECENT_MODE");
        F[] arr_f = F.values();
        for(int v = 0; true; ++v) {
            f0 = null;
            if(v >= arr_f.length) {
                break;
            }
            F f1 = arr_f[v];
            if(integer0 != null && ((int)integer0) == f1.c()) {
                f0 = f1;
                break;
            }
        }
        if(f0 == null) {
            this.dismissAllowingStateLoss();
            return;
        }
        this.f = f0;
        this.O0();
        if(f0 == F.b) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                g1 g10 = com.dcinside.app.realm.s0.j.n(f00);
                this.b = g10;
                if(g10 != null) {
                    g10.l(this.c);
                }
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(f00, null);
            return;
        }
        this.d = new v(null, this);
    }
}

