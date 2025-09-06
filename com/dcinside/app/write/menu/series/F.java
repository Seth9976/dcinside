package com.dcinside.app.write.menu.series;

import A3.p;
import Y.j1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.internal.c;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.h0;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class f extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private j1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "extra_series_subject";

    static {
        f.b = new a(null);
    }

    private final void l0() {
        String s = String.valueOf(this.m0().d.getText());
        if(s.length() == 0) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
            if(appCompatActivity0 != null) {
                c.v(appCompatActivity0, 0x7F15094A);  // string:series_need_subject "제목을 입력해 주세요."
            }
            return;
        }
        Context context0 = this.getContext();
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new h0(s));
        }
        this.dismissAllowingStateLoss();
    }

    private final j1 m0() {
        j1 j10 = this.a;
        L.m(j10);
        return j10;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = j1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
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
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.series.SeriesCopyDialog$onViewCreated$1", f = "SeriesCopyDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final f l;

            b(f f0, d d0) {
                this.l = f0;
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


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.series.SeriesCopyDialog$onViewCreated$2", f = "SeriesCopyDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.series.f.c extends o implements p {
            int k;
            final f l;

            com.dcinside.app.write.menu.series.f.c(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.write.menu.series.f.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.l0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        j1 j10 = this.m0();
        L.o(j10.c, "seriesCopyCancel");
        String s = null;
        b f$b0 = new b(this, null);
        r.M(j10.c, null, f$b0, 1, null);
        j1 j11 = this.m0();
        L.o(j11.b, "seriesCopyApply");
        com.dcinside.app.write.menu.series.f.c f$c0 = new com.dcinside.app.write.menu.series.f.c(this, null);
        r.M(j11.b, null, f$c0, 1, null);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            s = bundle1.getString("extra_series_subject");
        }
        this.m0().d.setText(s);
    }
}

