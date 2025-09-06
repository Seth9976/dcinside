package com.dcinside.app.post.fragments;

import A3.p;
import Y.t1;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentKt;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nCaptureModeSelectDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureModeSelectDialogFragment.kt\ncom/dcinside/app/post/fragments/CaptureModeSelectDialogFragment\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,86:1\n35#2:87\n*S KotlinDebug\n*F\n+ 1 CaptureModeSelectDialogFragment.kt\ncom/dcinside/app/post/fragments/CaptureModeSelectDialogFragment\n*L\n31#1:87\n*E\n"})
public final class i extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private t1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.read.CaptureModeSelectDialogFragment";
    @l
    public static final String d = "com.dcinside.app.read.CaptureModeSelectDialogFragment.EXTRA_MODE";

    static {
        i.b = new a(null);
    }

    private final t1 l0() {
        t1 t10 = this.a;
        L.m(t10);
        return t10;
    }

    private final void m0(boolean z) {
        FragmentKt.d(this, "com.dcinside.app.read.CaptureModeSelectDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.read.CaptureModeSelectDialogFragment.EXTRA_MODE", Boolean.valueOf(z))}));
        this.dismissAllowingStateLoss();
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = t1.d(layoutInflater0, viewGroup0, false);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window1 = dialog1.getWindow();
            if(window1 != null) {
                window1.requestFeature(1);
            }
        }
        View view0 = this.l0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentKt.b(this, "com.dcinside.app.read.CaptureModeSelectDialogFragment");
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        int v;
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            v = 0;
        }
        else {
            Context context0 = dialog0.getContext();
            if(context0 == null) {
                v = 0;
            }
            else {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                v = configuration0 == null ? 0 : Dk.d(Math.min(configuration0.smallestScreenWidthDp - 20, 310));
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
        @f(c = "com.dcinside.app.post.fragments.CaptureModeSelectDialogFragment$onViewCreated$1", f = "CaptureModeSelectDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final i l;

            b(i i0, d d0) {
                this.l = i0;
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
                this.l.dismissAllowingStateLoss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.CaptureModeSelectDialogFragment$onViewCreated$2", f = "CaptureModeSelectDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final i l;

            c(i i0, d d0) {
                this.l = i0;
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
                this.l.m0(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.CaptureModeSelectDialogFragment$onViewCreated$3", f = "CaptureModeSelectDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.i.d extends o implements p {
            int k;
            final i l;

            com.dcinside.app.post.fragments.i.d(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.fragments.i.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.m0(true);
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Context context0 = this.l0().b().getContext();
        t1 t10 = this.l0();
        L.o(t10.d, "captureClose");
        b i$b0 = new b(this, null);
        r.M(t10.d, null, i$b0, 1, null);
        t1 t11 = this.l0();
        L.o(t11.f, "captureReadWrap");
        c i$c0 = new c(this, null);
        r.M(t11.f, null, i$c0, 1, null);
        t1 t12 = this.l0();
        L.o(t12.c, "captureAllWrap");
        com.dcinside.app.post.fragments.i.d i$d0 = new com.dcinside.app.post.fragments.i.d(this, null);
        r.M(t12.c, null, i$d0, 1, null);
        int v = dl.a.q2().m() ? ContextCompat.getColor(context0, 0x7F0605B8) : ContextCompat.getColor(context0, 0x7F06008C);  // color:white
        this.l0().b.setColorFilter(v);
        this.l0().e.setColorFilter(v);
    }
}

