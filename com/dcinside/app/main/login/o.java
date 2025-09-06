package com.dcinside.app.main.login;

import A3.p;
import Y.M7;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.auth.k;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.ManagerItem;
import com.dcinside.app.model.MinorInfo;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.d;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.D;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nSettingSimpleLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingSimpleLoginFragment.kt\ncom/dcinside/app/main/login/SettingSimpleLoginFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,378:1\n172#2,9:379\n257#3,2:388\n257#3,2:390\n257#3,2:392\n257#3,2:394\n257#3,2:398\n257#3,2:400\n257#3,2:404\n257#3,2:406\n257#3,2:408\n60#4:396\n1#5:397\n25#6:402\n25#6:403\n*S KotlinDebug\n*F\n+ 1 SettingSimpleLoginFragment.kt\ncom/dcinside/app/main/login/SettingSimpleLoginFragment\n*L\n69#1:379,9\n106#1:388,2\n107#1:390,2\n108#1:392,2\n109#1:394,2\n189#1:398,2\n192#1:400,2\n227#1:404,2\n238#1:406,2\n276#1:408,2\n179#1:396\n206#1:402\n222#1:403\n*E\n"})
public final class o extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public interface b {
        void T();
    }

    public static final int A = 9;
    @m
    private M7 b;
    private ViewTreeObserver.OnGlobalLayoutListener c;
    @m
    private F0 d;
    @m
    private g1 e;
    @l
    private final P0 f;
    private boolean g;
    @m
    private rx.subscriptions.b h;
    @m
    private b i;
    @m
    private rx.o j;
    private int k;
    @m
    private String l;
    @l
    private com.dcinside.app.type.m m;
    private boolean n;
    private int o;
    @l
    private final D p;
    @l
    public static final a q = null;
    @l
    public static final String r = "simpleLoginResultKey";
    @l
    public static final String s = "com.dcinside.app.extra.GALLERY_ID ";
    @l
    public static final String t = "com.dcinside.app.extra.GALLERY_GRADE";
    @l
    public static final String u = "com.dcinside.app.extra.TYPE";
    @l
    public static final String v = "com.dcinside.app.extra.POST_HEAD_LEVEL";
    @l
    public static final String w = "com.dcinside.app.extra.LOGOUT_ENABLE";
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 1;

    static {
        o.q = new a(null);
    }

    public o() {
        @s0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
        public static final class com.dcinside.app.main.login.o.m extends N implements A3.a {
            final Fragment e;

            public com.dcinside.app.main.login.o.m(Fragment fragment0) {
                this.e = fragment0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                ViewModelStore viewModelStore0 = this.e.requireActivity().getViewModelStore();
                L.o(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
        public static final class n extends N implements A3.a {
            final A3.a e;
            final Fragment f;

            public n(A3.a a0, Fragment fragment0) {
                this.e = a0;
                this.f = fragment0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                CreationExtras creationExtras0;
                A3.a a0 = this.e;
                if(a0 == null) {
                    creationExtras0 = this.f.requireActivity().getDefaultViewModelCreationExtras();
                    L.o(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                }
                else {
                    creationExtras0 = (CreationExtras)a0.invoke();
                    if(creationExtras0 == null) {
                        creationExtras0 = this.f.requireActivity().getDefaultViewModelCreationExtras();
                        L.o(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                        return creationExtras0;
                    }
                }
                return creationExtras0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
        public static final class com.dcinside.app.main.login.o.o extends N implements A3.a {
            final Fragment e;

            public com.dcinside.app.main.login.o.o(Fragment fragment0) {
                this.e = fragment0;
                super(0);
            }

            @l
            public final Factory b() {
                Factory viewModelProvider$Factory0 = this.e.requireActivity().getDefaultViewModelProviderFactory();
                L.o(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                return viewModelProvider$Factory0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.f = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "result");
            this.R0(g10);
        };
        this.m = com.dcinside.app.type.m.g;
        this.n = true;
        this.p = FragmentViewModelLazyKt.h(this, m0.d(u.class), new com.dcinside.app.main.login.o.m(this), new n(null, this), new com.dcinside.app.main.login.o.o(this));
    }

    public final void C0(boolean z, @m B b0, @l A3.a a0) {
        L.p(a0, "afterAction");
        switch(this.o) {
            case 1: {
                if(z) {
                    this.Z0(0x7F1501C3);  // string:cannot_change_post_head_login_level "고정닉 전용 말머리를 사용 중입니다. 말머리 변경 후 계정을 전환해주세요."
                    return;
                }
                a0.invoke();
                return;
            }
            case 9: {
                if(z) {
                    this.Z0(0x7F1501C4);  // string:cannot_change_post_head_manager_level "매니저 전용 말머리를 사용 중입니다. 말머리 변경 후 계정을 
                                          // 전환해주세요."
                    return;
                }
                this.F0(b0, a0);
                return;
            }
            default: {
                a0.invoke();
            }
        }
    }

    private final void D0() {
        B b0;
        g1 g10 = this.e;
        if(g10 == null) {
            b0 = null;
        }
        else {
            RealmQuery realmQuery0 = g10.x4();
            if(realmQuery0 == null) {
                b0 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.b0("flagSimple", Boolean.TRUE);
                b0 = realmQuery1 == null ? null : ((B)realmQuery1.r0());
            }
        }
        if(b0 != null) {
            dl dl0 = dl.a;
            if(!dl0.f2()) {
                M7 m70 = this.L0();
                L.o(m70.d, "settingSimpleLoginEditGuide");
                m70.d.setVisibility(0);
                dl0.Q5(true);
                return;
            }
            M7 m71 = this.L0();
            L.o(m71.d, "settingSimpleLoginEditGuide");
            m71.d.setVisibility(8);
        }
    }

    private final void E0() {
        B b0 = B.E.V(this.d);
        TextView textView0 = this.L0().g;
        L.o(textView0, "settingSimpleLoginLogout");
        textView0.setVisibility((b0 == null || this.g ? 8 : 0));
    }

    private final void F0(B b0, A3.a a0) {
        String s = b0 == null ? null : b0.r6();
        if(s == null) {
            this.Z0(0x7F1501C4);  // string:cannot_change_post_head_manager_level "매니저 전용 말머리를 사용 중입니다. 말머리 변경 후 계정을 
                                  // 전환해주세요."
            return;
        }
        String s1 = this.l;
        if(s1 == null) {
            this.Z0(0x7F1501C5);  // string:cannot_change_post_head_unknown "대상 정보를 조회할 수 없습니다. 잠시 후 다시 시도해주세요."
            return;
        }
        Boolean boolean0 = this.M0().c(s1, s);
        if(boolean0 == null) {
            this.Z0(0x7F1501C5);  // string:cannot_change_post_head_unknown "대상 정보를 조회할 수 없습니다. 잠시 후 다시 시도해주세요."
            return;
        }
        if(boolean0.booleanValue()) {
            a0.invoke();
            return;
        }
        this.Z0(0x7F1501C4);  // string:cannot_change_post_head_manager_level "매니저 전용 말머리를 사용 중입니다. 말머리 변경 후 계정을 
                              // 전환해주세요."
    }

    private final void G0() {
        @s0({"SMAP\nSettingSimpleLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingSimpleLoginFragment.kt\ncom/dcinside/app/main/login/SettingSimpleLoginFragment$checkPostWriteScreen$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1611#2,9:379\n1863#2:388\n1864#2:390\n1620#2:391\n1#3:389\n*S KotlinDebug\n*F\n+ 1 SettingSimpleLoginFragment.kt\ncom/dcinside/app/main/login/SettingSimpleLoginFragment$checkPostWriteScreen$3\n*L\n345#1:379,9\n345#1:388\n345#1:390\n345#1:391\n345#1:389\n*E\n"})
        static final class c extends N implements Function1 {
            final o e;
            final String f;

            c(o o0, String s) {
                this.e = o0;
                this.f = s;
                super(1);
            }

            public final void a(MinorInfo minorInfo0) {
                Collection collection0;
                String s = minorInfo0.I();
                if(s == null) {
                    s = "";
                }
                List list0 = kotlin.collections.u.S(new String[]{s});
                List list1 = minorInfo0.M();
                if(list1 == null) {
                    collection0 = kotlin.collections.u.H();
                }
                else {
                    collection0 = new ArrayList();
                    for(Object object0: list1) {
                        String s1 = ((ManagerItem)object0).i();
                        if(s1 != null) {
                            collection0.add(s1);
                        }
                    }
                }
                list0.addAll(collection0);
                this.e.M0().d(this.f, list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((MinorInfo)object0));
                return S0.a;
            }
        }

        String s = this.l;
        if(s == null) {
            return;
        }
        this.j = uk.tk(this.m == com.dcinside.app.type.m.g, s).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            this.U0(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.U0(false);
        }).y5((Object object0) -> {
            L.p(new c(this, s), "$tmp0");
            new c(this, s).invoke(object0);
        }, new com.dcinside.app.main.login.l());
    }

    private static final void H0(Throwable throwable0) {
    }

    // 检测为 Lambda 实现
    private static final void I0(o o0) [...]

    // 检测为 Lambda 实现
    private static final void J0(o o0) [...]

    // 检测为 Lambda 实现
    private static final void K0(Function1 function10, Object object0) [...]

    private final M7 L0() {
        M7 m70 = this.b;
        L.m(m70);
        return m70;
    }

    private final u M0() {
        return (u)this.p.getValue();
    }

    // 检测为 Lambda 实现
    private static final void N0(o o0, g1 g10) [...]

    private final void O0() {
        this.dismissAllowingStateLoss();
    }

    private final void P0() {
        static final class com.dcinside.app.main.login.o.d extends N implements A3.a {
            final o e;

            com.dcinside.app.main.login.o.d(o o0) {
                this.e = o0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                B.E.X();
                this.e.dismissAllowingStateLoss();
            }
        }

        this.C0(true, null, new com.dcinside.app.main.login.o.d(this));
    }

    private final void Q0(boolean z) {
        if(!z) {
            this.dismissAllowingStateLoss();
            return;
        }
        this.g = true;
        M7 m70 = this.L0();
        L.o(m70.b, "settingSimpleLoginAccountList");
        Adapter recyclerView$Adapter0 = m70.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof t)) {
            recyclerView$Adapter0 = null;
        }
        if(((t)recyclerView$Adapter0) != null) {
            ((t)recyclerView$Adapter0).B(this.g);
        }
        this.L0().k.setVisibility(4);
        this.L0().h.setVisibility(4);
        M7 m71 = this.L0();
        String s = this.getString(0x7F1501F2);  // string:close "닫기"
        m71.c.setText(s);
        this.E0();
    }

    private final void R0(g1 g10) {
        if(g10.isEmpty()) {
            this.dismissAllowingStateLoss();
            return;
        }
        g1 g11 = g10.x4().b0("flagSimple", Boolean.TRUE).p0();
        M7 m70 = this.L0();
        L.o(m70.b, "settingSimpleLoginAccountList");
        Adapter recyclerView$Adapter0 = m70.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof t)) {
            recyclerView$Adapter0 = null;
        }
        if(((t)recyclerView$Adapter0) != null) {
            L.m(g11);
            ((t)recyclerView$Adapter0).I(g11);
        }
        if(this.g) {
            this.L0().k.setVisibility(4);
        }
        else {
            int v = 0;
            this.L0().k.setVisibility(0);
            TextView textView0 = this.L0().c;
            L.o(textView0, "settingSimpleLoginEdit");
            if(g11.isEmpty()) {
                v = 8;
            }
            textView0.setVisibility(v);
        }
        this.E0();
    }

    private final void S0() {
        b o$b0 = this.i;
        if(o$b0 != null) {
            o$b0.T();
        }
    }

    private final void T0(View view0) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        k.a.a();
        Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(appCompatActivity0);
        if(awesomeWebView$Builder0 != null) {
            Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
            if(awesomeWebView$Builder1 != null) {
                Object object0 = view0.getTag();
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                awesomeWebView$Builder1.y5(((String)object0));
            }
        }
    }

    public final void U0(boolean z) {
        ProgressBar progressBar0 = this.L0().j;
        L.o(progressBar0, "settingSimpleLoginProgress");
        progressBar0.setVisibility((z ? 0 : 8));
    }

    private final void V0() {
        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupLayout$1", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            e(o o0, kotlin.coroutines.d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Q0(!this.l.g);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupLayout$2", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.login.o.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            com.dcinside.app.main.login.o.f(o o0, kotlin.coroutines.d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.login.o.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.P0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupLayout$3", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            g(o o0, kotlin.coroutines.d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.S0();
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupLayout$4", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            h(o o0, kotlin.coroutines.d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.P0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupLayout$6", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final o m;

            i(o o0, kotlin.coroutines.d d0) {
                this.m = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                i o$i0 = new i(this.m, d0);
                o$i0.l = view0;
                return o$i0.invokeSuspend(S0.a);
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
                this.m.T0(((View)this.l));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        M7 m70 = this.L0();
        Spanned spanned0 = Dl.c(this.getString(0x7F150543, new Object[]{s}));  // string:login_second_auth_settings "<font color=#BDBDBD>2단계 인증으로 보안을 강화하세요.</font> 
                                                                               // <font color=%s><u>보안 센터 ></u></font>"
        m70.h.setText(spanned0);
        M7 m71 = this.L0();
        L.o(m71.c, "settingSimpleLoginEdit");
        e o$e0 = new e(this, null);
        r.M(m71.c, null, o$e0, 1, null);
        M7 m72 = this.L0();
        L.o(m72.g, "settingSimpleLoginLogout");
        com.dcinside.app.main.login.o.f o$f0 = new com.dcinside.app.main.login.o.f(this, null);
        r.M(m72.g, null, o$f0, 1, null);
        M7 m73 = this.L0();
        L.o(m73.k, "settingSimpleLoginSignIn");
        g o$g0 = new g(this, null);
        r.M(m73.k, null, o$g0, 1, null);
        M7 m74 = this.L0();
        L.o(m74.l, "settingSimpleLoginSignOut");
        h o$h0 = new h(this, null);
        r.M(m74.l, null, o$h0, 1, null);
        M7 m75 = this.L0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(context0);
        m75.b.setLayoutManager(linearLayoutManager0);
        t t0 = new t(this);
        m75.b.setAdapter(t0);
        M7 m76 = this.L0();
        L.o(m76.h, "settingSimpleLoginOtpDesc");
        i o$i0 = new i(this, null);
        r.M(m76.h, null, o$i0, 1, null);
    }

    private final void W0() {
        static final class j extends N implements Function1 {
            final o e;

            j(o o0) {
                this.e = o0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.e e0) {
                this.e.O0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.e)object0));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.login.SettingSimpleLoginFragment$setupListener$4", f = "SettingSimpleLoginFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.login.o.k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final o l;

            com.dcinside.app.main.login.o.k(o o0, kotlin.coroutines.d d0) {
                this.l = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.login.o.k(this.l, d0).invokeSuspend(S0.a);
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

        this.c = () -> {
            L.p(this, "this$0");
            Dialog dialog0 = this.getDialog();
            com.google.android.material.bottomsheet.c c0 = dialog0 instanceof com.google.android.material.bottomsheet.c ? ((com.google.android.material.bottomsheet.c)dialog0) : null;
            if(c0 != null) {
                FrameLayout frameLayout0 = (FrameLayout)c0.findViewById(0x7F0B03C6);  // id:design_bottom_sheet
                if(frameLayout0 != null) {
                    frameLayout0.setBackgroundResource(0x106000D);
                    BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(frameLayout0);
                    bottomSheetBehavior0.g(3);
                    bottomSheetBehavior0.f1(false);
                    bottomSheetBehavior0.p1(0);
                }
            }
        };
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener0 == null) {
                    L.S("listener");
                    viewTreeObserver$OnGlobalLayoutListener0 = null;
                }
                viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
        rx.subscriptions.b b0 = this.h;
        if(b0 != null) {
            b0.l();
        }
        this.h = new rx.subscriptions.b();
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 != null) {
            rx.g g0 = com.dcinside.app.rx.bus.c.c(appCompatActivity0, com.dcinside.app.rx.bus.e.class);
            if(g0 != null) {
                rx.o o0 = g0.x5((Object object0) -> {
                    L.p(new j(this), "$tmp0");
                    new j(this).invoke(object0);
                });
                if(o0 != null) {
                    rx.subscriptions.b b1 = this.h;
                    if(b1 != null) {
                        b1.a(o0);
                    }
                }
            }
        }
        M7 m70 = this.L0();
        L.o(m70.i, "settingSimpleLoginParent");
        com.dcinside.app.main.login.o.k o$k0 = new com.dcinside.app.main.login.o.k(this, null);
        r.M(m70.i, null, o$k0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void X0(o o0) [...]

    // 检测为 Lambda 实现
    private static final void Y0(Function1 function10, Object object0) [...]

    private final void Z0(@StringRes int v) {
        static final class com.dcinside.app.main.login.o.l extends N implements Function1 {
            final int e;

            com.dcinside.app.main.login.o.l(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.main.login.o.l(v)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
    }

    @Override  // com.google.android.material.bottomsheet.d
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = new com.google.android.material.bottomsheet.c(this.requireContext(), this.getTheme());
        ((com.google.android.material.bottomsheet.c)dialog0).w(true);
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = M7.d(layoutInflater0, viewGroup0, false);
        View view0 = this.L0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        this.i = null;
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener0 == null) {
                    L.S("listener");
                    viewTreeObserver$OnGlobalLayoutListener0 = null;
                }
                viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
        g1 g10 = this.e;
        if(g10 != null) {
            g10.D();
        }
        F0 f00 = this.d;
        if(f00 != null) {
            f00.close();
        }
        rx.subscriptions.b b0 = this.h;
        if(b0 != null) {
            b0.l();
        }
        this.h = null;
        rx.o o0 = this.j;
        if(o0 != null) {
            o0.l();
        }
        this.j = null;
        FragmentKt.d(this, "simpleLoginResultKey", new Bundle());
        this.L0().b.setAdapter(null);
        super.onDestroyView();
        this.b = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.M0().clear();
        Bundle bundle1 = this.getArguments();
        int v = 0;
        if(bundle1 != null) {
            this.k = bundle1.getInt("com.dcinside.app.extra.TYPE", 0);
            this.l = bundle1.getString("com.dcinside.app.extra.GALLERY_ID ");
            int v1 = bundle1.getInt("com.dcinside.app.extra.GALLERY_GRADE", 0);
            this.m = com.dcinside.app.type.m.d.a(v1);
            this.o = bundle1.getInt("com.dcinside.app.extra.POST_HEAD_LEVEL", 0);
            this.n = bundle1.getBoolean("com.dcinside.app.extra.LOGOUT_ENABLE", true);
        }
        FragmentActivity fragmentActivity0 = this.requireActivity();
        g1 g10 = null;
        this.i = fragmentActivity0 instanceof b ? ((b)fragmentActivity0) : null;
        this.V0();
        this.W0();
        F0 f00 = F0.g4();
        this.d = f00;
        if(f00 != null) {
            RealmQuery realmQuery0 = f00.C4(B.class);
            if(realmQuery0 != null) {
                RealmQuery realmQuery1 = realmQuery0.g2("lastLoginTime", r1.c);
                if(realmQuery1 != null) {
                    g10 = realmQuery1.p0();
                }
            }
        }
        this.e = g10;
        if(g10 != null) {
            g10.l(this.f);
        }
        g1 g11 = this.e;
        if(g11 != null) {
            this.R0(g11);
        }
        if(this.k == 1) {
            M7 m70 = this.L0();
            L.o(m70.n, "settingSimpleLoginTop");
            m70.n.setVisibility(8);
            M7 m71 = this.L0();
            L.o(m71.k, "settingSimpleLoginSignIn");
            m71.k.setVisibility(8);
            M7 m72 = this.L0();
            L.o(m72.h, "settingSimpleLoginOtpDesc");
            m72.h.setVisibility(8);
            TextView textView0 = this.L0().l;
            L.o(textView0, "settingSimpleLoginSignOut");
            if(this.n) {
                String s = B.E.k0();
                if(s == null || s.length() <= 0) {
                    v = 8;
                }
            }
            else {
                v = 8;
            }
            textView0.setVisibility(v);
            this.G0();
        }
        this.D0();
    }

    public static void r0(Throwable throwable0) {
    }
}

