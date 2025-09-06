package com.dcinside.app.post.manager;

import A3.p;
import Y.m1;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.E;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.B;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;

@s0({"SMAP\nManagerNotifyDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerNotifyDialogFragment.kt\ncom/dcinside/app/post/manager/ManagerNotifyDialogFragment\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,264:1\n35#2:265\n257#3,2:266\n257#3,2:268\n*S KotlinDebug\n*F\n+ 1 ManagerNotifyDialogFragment.kt\ncom/dcinside/app/post/manager/ManagerNotifyDialogFragment\n*L\n50#1:265\n87#1:266,2\n88#1:268,2\n*E\n"})
public final class g extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @y4.m
    private m1 a;
    @y4.m
    private o b;
    @l
    public static final a c = null;
    @l
    public static final String d = "com.dcinside.app.extra.NAME";
    @l
    public static final String e = "com.dcinside.app.extra.ID";
    @l
    public static final String f = "com.dcinside.app.extra.IS_MANAGER";
    @l
    public static final String g = "com.dcinside.app.extra.TYPE";
    @l
    public static final String h = "com.dcinside.app.extra.RESULT";
    @l
    public static final String i = "com.dcinside.app.key.ManagerNotifyDialogFragment";

    static {
        g.c = new a(null);
    }

    private final void A0() {
        FragmentKt.d(this, "com.dcinside.app.key.ManagerNotifyDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.RESULT", i.e.c())}));
        this.dismissAllowingStateLoss();
    }

    private final void B0() {
        FragmentKt.d(this, "com.dcinside.app.key.ManagerNotifyDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.RESULT", i.f.c())}));
        this.dismissAllowingStateLoss();
    }

    private final void C0(boolean z) {
        this.z0().k.setVisibility((z ? 0 : 8));
    }

    private final void D0(String s, boolean z) {
        this.E0(s, z, false);
    }

    private final void E0(String s, boolean z, boolean z1) {
        static final class com.dcinside.app.post.manager.g.g extends N implements Function1 {
            final boolean e;
            final g f;

            com.dcinside.app.post.manager.g.g(boolean z, g g0) {
                this.e = z;
                this.f = g0;
                super(1);
            }

            public final void a(E e0) {
                if(L.g(e0.d(), "success")) {
                    if(this.e) {
                        Bundle bundle0 = BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.RESULT", i.c.c())});
                        FragmentKt.d(this.f, "com.dcinside.app.key.ManagerNotifyDialogFragment", bundle0);
                    }
                    else {
                        Bundle bundle1 = BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.RESULT", i.d.c())});
                        FragmentKt.d(this.f, "com.dcinside.app.key.ManagerNotifyDialogFragment", bundle1);
                    }
                    this.f.dismissAllowingStateLoss();
                    return;
                }
                String s = e0.o();
                if(s == null) {
                    s = this.f.getString(0x7F150310);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                    L.o(s, "getString(...)");
                }
                this.f.L0(s, (e0.m() == null ? "" : e0.m()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((E)object0));
                return S0.a;
            }
        }

        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = uk.Ij(s, (z ? "master" : "sub"), (z1 ? "Y" : "N")).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            this.C0(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.C0(false);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.manager.g.g(z1, this), "$tmp0");
            new com.dcinside.app.post.manager.g.g(z1, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0.getCause());
            Dl.G(this.getContext(), this.getString(0x7F1502FC));  // string:failed_access_server "서버에 연결할 수 없습니다. (%1$s)"
        });
    }

    // 检测为 Lambda 实现
    private static final void F0(g g0) [...]

    // 检测为 Lambda 实现
    private static final void G0(g g0) [...]

    // 检测为 Lambda 实现
    private static final void H0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I0(g g0, Throwable throwable0) [...]

    private final String J0(m m0) {
        String s;
        switch(m0) {
            case 1: {
                s = this.getString(0x7F150614);  // string:manager_notify_gall_type_mini "미니"
                L.o(s, "getString(...)");
                return s;
            }
            case 2: {
                s = this.getString(0x7F150615);  // string:manager_notify_gall_type_minor "마이너"
                L.o(s, "getString(...)");
                return s;
            }
            case 3: {
                s = this.getString(0x7F150616);  // string:manager_notify_gall_type_person "인물"
                L.o(s, "getString(...)");
                return s;
            }
            default: {
                return "";
            }
        }
    }

    private final void K0(m m0) {
        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$setPolicy$1", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;

            h(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
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
                m1 m10 = this.l.z0();
                boolean z = this.l.z0().h.isSelected();
                m10.h.setSelected(!z);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$setPolicy$2", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.manager.g.i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;

            com.dcinside.app.post.manager.g.i(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new com.dcinside.app.post.manager.g.i(this.l, d0).invokeSuspend(S0.a);
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
                m1 m10 = this.l.z0();
                boolean z = this.l.z0().d.isSelected();
                m10.d.setSelected(!z);
                return S0.a;
            }
        }

        m1 m10 = this.z0();
        L.o(m10.i, "managerNotifyPrivacyPolicy");
        h g$h0 = new h(this, null);
        r.M(m10.i, null, g$h0, 1, null);
        m1 m11 = this.z0();
        L.o(m11.e, "managerNotifyManagementPolicy");
        com.dcinside.app.post.manager.g.i g$i0 = new com.dcinside.app.post.manager.g.i(this, null);
        r.M(m11.e, null, g$i0, 1, null);
        String s = this.getString(0x7F15061C);  // string:manager_notify_minor_policy_tag "https://nstatic.dcinside.com/dc/m/info/rule.html#m_privacy"
        L.m(s);
        String s1 = this.getString(0x7F15061B);  // string:manager_notify_minor_management_tag "https://nstatic.dcinside.com/dc/m/info/rule.html#m_rule"
        L.m(s1);
        this.z0().j.setTag(s);
        this.z0().f.setTag(s1);
        String s2 = this.getString(0x7F150620);  // string:manager_notify_privacy_target "개인정보보호정책"
        L.o(s2, "getString(...)");
        String s3 = this.getString(0x7F150618);  // string:manager_notify_management_target "운영원칙"
        L.o(s3, "getString(...)");
        m1 m12 = this.z0();
        L.o(m12.j, "managerNotifyPrivacyTitle");
        this.x0(m12.j, s2);
        m1 m13 = this.z0();
        L.o(m13.f, "managerNotifyManagementTitle");
        this.x0(m13.f, s3);
    }

    private final void L0(String s, String s1) {
        static final class j extends N implements Function1 {
            final String e;

            j(String s) {
                this.e = s;
                super(1);
            }

            @y4.m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class k extends N implements Function1 {
            final g e;
            final AppCompatActivity f;

            k(g g0, AppCompatActivity appCompatActivity0) {
                this.e = g0;
                this.f = appCompatActivity0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                static final class com.dcinside.app.post.manager.g.k.a extends N implements Function1 {
                    final AppCompatActivity e;

                    com.dcinside.app.post.manager.g.k.a(AppCompatActivity appCompatActivity0) {
                        this.e = appCompatActivity0;
                        super(1);
                    }

                    public final void b(String s) {
                        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority("m.dcinside.com").appendPath("auth").appendPath("minicertify").appendQueryParameter("app_id", s);
                        String s1 = B.E.k0();
                        if(s1 == null) {
                            s1 = "";
                        }
                        String s2 = uri$Builder0.appendQueryParameter("confirm_id", s1).build().toString();
                        L.o(s2, "toString(...)");
                        com.dcinside.app.main.a.j(this.e, s2);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.b(((String)object0));
                        return S0.a;
                    }
                }

                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    uk.Lj().x5((Object object0) -> {
                        L.p(new com.dcinside.app.post.manager.g.k.a(this.f), "$tmp0");
                        new com.dcinside.app.post.manager.g.k.a(this.f).invoke(object0);
                    });
                    return;
                }
                Bundle bundle0 = BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.RESULT", i.d.c())});
                FragmentKt.d(this.e, "com.dcinside.app.key.ManagerNotifyDialogFragment", bundle0);
                this.e.dismissAllowingStateLoss();
            }

            // 检测为 Lambda 实现
            private static final void c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.manager.g.l extends N implements Function1 {
            final String e;

            com.dcinside.app.post.manager.g.l(String s) {
                this.e = s;
                super(1);
            }

            @y4.m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        L.n(fragmentActivity0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        if(L.g(s1, "auth_mini")) {
            e.e.a(((AppCompatActivity)fragmentActivity0)).n(new j(s)).z(0x7F15034A).x(0x7F1501C1).b().y5((Object object0) -> {
                L.p(new k(this, ((AppCompatActivity)fragmentActivity0)), "$tmp0");
                new k(this, ((AppCompatActivity)fragmentActivity0)).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                timber.log.b.a.y(throwable0.getCause());
                Dl.G(this.getContext(), this.getString(0x7F1502FC));  // string:failed_access_server "서버에 연결할 수 없습니다. (%1$s)"
            });
            return;
        }
        e.e.a(((AppCompatActivity)fragmentActivity0)).n(new com.dcinside.app.post.manager.g.l(s)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    static void M0(g g0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "";
        }
        g0.L0(s, s1);
    }

    // 检测为 Lambda 实现
    private static final void N0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O0(g g0, Throwable throwable0) [...]

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @y4.m ViewGroup viewGroup0, @y4.m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = m1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.z0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        int v = 0;
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Context context0 = dialog0.getContext();
            if(context0 != null) {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                if(configuration0 != null) {
                    v = Dk.d(Math.min(configuration0.smallestScreenWidthDp, 380));
                }
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setLayout(v, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @y4.m Bundle bundle0) {
        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$onViewCreated$1", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;

            c(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.B0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$onViewCreated$2", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.manager.g.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;

            com.dcinside.app.post.manager.g.d(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new com.dcinside.app.post.manager.g.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.A0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$onViewCreated$3", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.manager.g.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;
            final String m;
            final boolean n;

            com.dcinside.app.post.manager.g.e(g g0, String s, boolean z, d d0) {
                this.l = g0;
                this.m = s;
                this.n = z;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new com.dcinside.app.post.manager.g.e(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                this.l.D0(this.m, this.n);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.manager.ManagerNotifyDialogFragment$onViewCreated$4", f = "ManagerNotifyDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.manager.g.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final g l;
            final String m;
            final boolean n;

            com.dcinside.app.post.manager.g.f(g g0, String s, boolean z, d d0) {
                this.l = g0;
                this.m = s;
                this.n = z;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new com.dcinside.app.post.manager.g.f(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                this.l.q0(this.m, this.n);
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.setCancelable(false);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        boolean z = bundle1.getBoolean("com.dcinside.app.extra.IS_MANAGER");
        String s = bundle1.getString("com.dcinside.app.extra.NAME");
        if(s == null) {
            return;
        }
        String s1 = bundle1.getString("com.dcinside.app.extra.ID");
        if(s1 == null) {
            return;
        }
        int v = bundle1.getInt("com.dcinside.app.extra.TYPE");
        m m0 = m.d.a(v);
        String s2 = this.J0(m0);
        m1 m10 = this.z0();
        L.o(m10.c, "managerNotifyClose");
        c g$c0 = new c(this, null);
        r.M(m10.c, null, g$c0, 1, null);
        m1 m11 = this.z0();
        L.o(m11.g, "managerNotifyNextAgain");
        com.dcinside.app.post.manager.g.d g$d0 = new com.dcinside.app.post.manager.g.d(this, null);
        r.M(m11.g, null, g$d0, 1, null);
        m1 m12 = this.z0();
        L.o(m12.l, "managerNotifyReject");
        com.dcinside.app.post.manager.g.e g$e0 = new com.dcinside.app.post.manager.g.e(this, s1, z, null);
        r.M(m12.l, null, g$e0, 1, null);
        m1 m13 = this.z0();
        L.o(m13.b, "managerNotifyAccept");
        com.dcinside.app.post.manager.g.f g$f0 = new com.dcinside.app.post.manager.g.f(this, s1, z, null);
        r.M(m13.b, null, g$f0, 1, null);
        if(z) {
            m1 m14 = this.z0();
            String s3 = this.getString(0x7F150622, new Object[]{s, s2});  // string:manager_notify_title "%1$s %2$s 갤러리의\n 매니저를 위임받으셨습니다. \n\n수락하시겠습니까?"
            m14.m.setText(s3);
        }
        else {
            m1 m15 = this.z0();
            String s4 = this.getString(0x7F1509EE, new Object[]{s, s2});  // string:sub_manager_notify_title "%1$s %2$s 갤러리의\n 부매니저로 임명되셨습니다.\n\n 수락하시겠습니까?"
            m15.m.setText(s4);
            m1 m16 = this.z0();
            L.o(m16.i, "managerNotifyPrivacyPolicy");
            m16.i.setVisibility(8);
            m1 m17 = this.z0();
            L.o(m17.e, "managerNotifyManagementPolicy");
            m17.e.setVisibility(8);
        }
        this.y0(s);
        m1 m18 = this.z0();
        String s5 = this.getString(0x7F15061F, new Object[]{s2});  // string:manager_notify_privacy_policy "%1$s 갤러리 개인정보보호정책에 동의합니다."
        m18.j.setText(s5);
        m1 m19 = this.z0();
        String s6 = this.getString(0x7F150617, new Object[]{s2});  // string:manager_notify_management_policy "%1$s 갤러리 운영원칙에 동의합니다."
        m19.f.setText(s6);
        this.K0(m0);
    }

    private final void q0(String s, boolean z) {
        if(z && (!this.z0().d.isSelected() || !this.z0().h.isSelected())) {
            String s1 = this.getString(0x7F15061E);  // string:manager_notify_not_check_policy_alert "개인정보보호정책과 운영원칙에 동의하셔야 위임 수락이 가능합니다."
            L.o(s1, "getString(...)");
            g.M0(this, s1, null, 2, null);
            return;
        }
        this.E0(s, z, true);
    }

    private final void x0(TextView textView0, String s) {
        Object object0 = textView0.getTag();
        String s1 = object0 instanceof String ? ((String)object0) : null;
        if(s1 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(textView0.getText());
        int v = v.s3(spannableStringBuilder0, s, 0, false, 6, null);
        Context context0 = textView0.getContext();
        L.o(context0, "getContext(...)");
        spannableStringBuilder0.setSpan(new com.dcinside.app.span.e(vk.b(context0, 0x1010036), true, s1, com.dcinside.app.span.e.a.b), v, s.length() + v, 33);
        textView0.setText(spannableStringBuilder0);
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void y0(String s) {
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(this.z0().m.getText());
        spannableStringBuilder0.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.requireContext(), 0x7F0600A6)), 0, (s == null ? 0 : s.length()), 33);  // color:caution_hate_word
        this.z0().m.setText(spannableStringBuilder0);
    }

    private final m1 z0() {
        m1 m10 = this.a;
        L.m(m10);
        return m10;
    }
}

