package com.dcinside.app.settings;

import A3.p;
import Y.F1;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentKt;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class b0 extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private F1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.setting.ImageBlockSettingFragment";
    @l
    public static final String d = "com.dcinside.app.setting.ImageBlockSettingFragment.rangeType";

    static {
        b0.b = new a(null);
    }

    private final F1 l0() {
        F1 f10 = this.a;
        L.m(f10);
        return f10;
    }

    private final void m0(int v) {
        FragmentKt.d(this, "com.dcinside.app.setting.ImageBlockSettingFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.setting.ImageBlockSettingFragment.rangeType", v)}));
        this.dismissAllowingStateLoss();
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
        this.a = F1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.l0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        FragmentKt.b(this, "com.dcinside.app.setting.ImageBlockSettingFragment");
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.SelectImageBlockRangeFragment$onViewCreated$1", f = "SelectImageBlockRangeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final b0 l;

            b(b0 b00, d d0) {
                this.l = b00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.m0(0);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.SelectImageBlockRangeFragment$onViewCreated$2", f = "SelectImageBlockRangeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final b0 l;

            c(b0 b00, d d0) {
                this.l = b00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.m0(1);
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        F1 f10 = this.l0();
        L.o(f10.b, "dialogBlockImageNormal");
        b b0$b0 = new b(this, null);
        r.M(f10.b, null, b0$b0, 1, null);
        F1 f11 = this.l0();
        L.o(f11.d, "dialogBlockImageWide");
        c b0$c0 = new c(this, null);
        r.M(f11.d, null, b0$c0, 1, null);
    }
}

