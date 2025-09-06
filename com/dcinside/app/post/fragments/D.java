package com.dcinside.app.post.fragments;

import A3.p;
import Y.v1;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.q;
import com.dcinside.app.rx.bus.h;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Nk;
import io.realm.F0;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAutoRefreshSettingDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoRefreshSettingDialogFragment.kt\ncom/dcinside/app/post/fragments/AutoRefreshSettingDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,161:1\n1#2:162\n1#2:167\n1#2:172\n35#3:163\n120#4,3:164\n124#4:168\n120#4,3:169\n124#4:173\n*S KotlinDebug\n*F\n+ 1 AutoRefreshSettingDialogFragment.kt\ncom/dcinside/app/post/fragments/AutoRefreshSettingDialogFragment\n*L\n100#1:167\n131#1:172\n55#1:163\n100#1:164,3\n100#1:168\n131#1:169,3\n131#1:173\n*E\n"})
public final class d extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private v1 a;
    @m
    private String b;
    @m
    private String c;
    @m
    private TextWatcher d;
    @l
    public static final a e = null;
    @l
    public static final String f = "com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment_EXTRA_GALLERY_NAME";
    @l
    public static final String g = "com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment_EXTRA_GALLERY_ID";

    static {
        d.e = new a(null);
    }

    public d() {
        public static final class g implements TextWatcher {
            final d a;

            g(d d0) {
                this.a = d0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                if(charSequence0 != null && charSequence0.length() > 0) {
                    this.a.t0();
                }
            }
        }

        this.d = new g(this);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(3);
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window1 = dialog1.getWindow();
            if(window1 != null) {
                View view0 = window1.getCurrentFocus();
                if(view0 != null) {
                    Nk.a.c(view0);
                }
            }
        }
        super.dismissAllowingStateLoss();
    }

    private final void o0() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150126);  // string:auto_refresh_interval_out_range "간격은 5~60초 사이로 설정 가능합니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class com.dcinside.app.post.fragments.d.d extends N implements Function1 {
            public static final com.dcinside.app.post.fragments.d.d e;

            static {
                com.dcinside.app.post.fragments.d.d.e = new com.dcinside.app.post.fragments.d.d();
            }

            com.dcinside.app.post.fragments.d.d() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        boolean z = this.r0().g.isChecked();
        Long long0 = v.d1(this.r0().k.getText().toString());
        long v = long0 == null ? 0L : ((long)long0);
        AppCompatActivity appCompatActivity0 = null;
        if(v < 5L) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            e.e.a(appCompatActivity0).n(b.e).z(0x7F15034A).b().Z1((Object object0) -> {
                L.p(c.e, "$tmp0");
                return (Boolean)c.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(com.dcinside.app.post.fragments.d.d.e, "$tmp0");
                com.dcinside.app.post.fragments.d.d.e.invoke(object0);
            });
            return;
        }
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            q.o.f(f00, this.b, z, v);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(f00, null);
        Context context0 = this.getContext();
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new h(true));
        }
        this.dismissAllowingStateLoss();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCancel(@l DialogInterface dialogInterface0) {
        L.p(dialogInterface0, "dialog");
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(3);
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window1 = dialog1.getWindow();
            if(window1 != null) {
                View view0 = window1.getCurrentFocus();
                if(view0 != null) {
                    Nk.a.c(view0);
                }
            }
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 != null) {
            com.dcinside.app.rx.bus.c.a(appCompatActivity0, new h(false));
        }
        super.onCancel(dialogInterface0);
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
        this.a = v1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.r0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        this.r0().k.removeTextChangedListener(this.d);
        this.d = null;
        super.onDestroyView();
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
                    v = Dk.d(Math.min(configuration0.smallestScreenWidthDp, 380) - 20);
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
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        String s = null;
        this.b = bundle1 == null ? null : bundle1.getString("com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment_EXTRA_GALLERY_ID");
        Bundle bundle2 = this.getArguments();
        if(bundle2 != null) {
            s = bundle2.getString("com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment_EXTRA_GALLERY_NAME");
        }
        this.c = s;
        this.s0();
    }

    // 检测为 Lambda 实现
    private static final Boolean p0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void q0(Function1 function10, Object object0) [...]

    private final v1 r0() {
        v1 v10 = this.a;
        L.m(v10);
        return v10;
    }

    private final void s0() {
        @f(c = "com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment$initView$1", f = "AutoRefreshSettingDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.d.e extends o implements p {
            int k;
            final d l;

            com.dcinside.app.post.fragments.d.e(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.d.e(this.l, d0).invokeSuspend(S0.a);
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
                FragmentActivity fragmentActivity0 = this.l.getActivity();
                AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                if(appCompatActivity0 != null) {
                    com.dcinside.app.rx.bus.c.a(appCompatActivity0, new h(false));
                }
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.AutoRefreshSettingDialogFragment$initView$2", f = "AutoRefreshSettingDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.d.f extends o implements p {
            int k;
            final d l;

            com.dcinside.app.post.fragments.d.f(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.d.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o0();
                return S0.a;
            }
        }

        q q0;
        this.r0().h.setText(this.c);
        v1 v10 = this.r0();
        L.o(v10.c, "autoRefreshSettingClose");
        String s = null;
        com.dcinside.app.post.fragments.d.e d$e0 = new com.dcinside.app.post.fragments.d.e(this, null);
        boolean z = true;
        r.M(v10.c, null, d$e0, 1, null);
        v1 v11 = this.r0();
        L.o(v11.b, "autoRefreshSettingApply");
        com.dcinside.app.post.fragments.d.f d$f0 = new com.dcinside.app.post.fragments.d.f(this, null);
        r.M(v11.b, null, d$f0, 1, null);
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            q0 = q.o.b(f00, this.b);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(f00, null);
        SwitchCompat switchCompat0 = this.r0().g;
        if(q0 == null || !q0.Q5()) {
            z = false;
        }
        switchCompat0.setChecked(z);
        EditText editText0 = this.r0().k;
        if(q0 != null) {
            s = q0.R5().toString();
        }
        editText0.setText(s);
        this.r0().k.addTextChangedListener(this.d);
    }

    private final void t0() {
        Long long0 = v.d1(this.r0().k.getText().toString());
        if((long0 == null ? 0L : ((long)long0)) > 60L) {
            this.r0().k.setText(null);
        }
    }
}

