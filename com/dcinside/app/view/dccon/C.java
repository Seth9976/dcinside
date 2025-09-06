package com.dcinside.app.view.dccon;

import A3.p;
import Y.g1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.BigDcconResult;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.vk;
import com.dcinside.rich.spans.RichBoldSpan;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nBigDcconDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigDcconDialogFragment.kt\ncom/dcinside/app/view/dccon/BigDcconDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,100:1\n257#2,2:101\n257#2,2:103\n*S KotlinDebug\n*F\n+ 1 BigDcconDialogFragment.kt\ncom/dcinside/app/view/dccon/BigDcconDialogFragment\n*L\n52#1:101,2\n53#1:103,2\n*E\n"})
public final class c extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private g1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.view.dccon.BigDcconDialogFragment.EXTRA_BIG_DCCON_RESULT";

    static {
        c.b = new a(null);
    }

    private final g1 k0() {
        g1 g10 = this.a;
        L.m(g10);
        return g10;
    }

    private final void l0(BigDcconResult bigDcconResult0) {
        String s = this.getString(0x7F15015B, new Object[]{Bk.H((bigDcconResult0.w() <= 0L ? 0L : 1000L * bigDcconResult0.w()))});  // string:big_dccon_active_expire_date "%1$s까지 사용 가능"
        L.o(s, "getString(...)");
        int v = v.s3(s, "까지", 0, false, 6, null);
        if(v < 1) {
            this.k0().b.setText(s);
        }
        else {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s);
            Context context0 = this.getContext();
            if(context0 == null) {
                return;
            }
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(vk.b(context0, 0x7F04013E)), 0, v, 17);  // attr:colorFocus
            spannableStringBuilder0.setSpan(new StyleSpan(1), 0, v, 33);
            this.k0().b.setText(spannableStringBuilder0);
        }
        String s1 = this.getString(0x7F15015A, new Object[]{bigDcconResult0.r(), bigDcconResult0.u(), bigDcconResult0.v()});  // string:big_dccon_active_desc "안내 글 %1$d개, 댓글 %2$d개 작성 시 %3$d일간 사용"
        L.o(s1, "getString(...)");
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(s1);
        spannableStringBuilder1.setSpan(new RichBoldSpan(), 0, 2, 33);
        this.k0().c.setText(spannableStringBuilder1);
    }

    private final void m0(BigDcconResult bigDcconResult0) {
        String s = this.getString(0x7F15015E, new Object[]{bigDcconResult0.q(), bigDcconResult0.t()});  // string:big_dccon_inactive_current_status "현재 글 %1$d개, 댓글 %2$d개 작성 중입니다."
        L.o(s, "getString(...)");
        this.k0().g.setText(s);
        String s1 = this.getString(0x7F15015F, new Object[]{bigDcconResult0.r(), bigDcconResult0.u(), bigDcconResult0.v()});  // string:big_dccon_inactive_desc "식별 코드 기준으로 당일 글 %1$d개, 댓글 %2$d개 작성 시 대왕디시콘을 %3$d일간 
                                                                                                                              // 사용할 수 있습니다."
        L.o(s1, "getString(...)");
        this.k0().h.setText(s1);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = g1.d(layoutInflater0, viewGroup0, false);
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
        View view0 = this.k0().b();
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
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.view.dccon.BigDcconDialogFragment$onViewCreated$1", f = "BigDcconDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final c l;

            b(c c0, d d0) {
                this.l = c0;
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


        @f(c = "com.dcinside.app.view.dccon.BigDcconDialogFragment$onViewCreated$2", f = "BigDcconDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.dccon.c.c extends o implements p {
            int k;
            final c l;

            com.dcinside.app.view.dccon.c.c(c c0, d d0) {
                this.l = c0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.dccon.c.c(this.l, d0).invokeSuspend(S0.a);
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

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        BigDcconResult bigDcconResult0 = (BigDcconResult)BundleCompat.b(bundle1, "com.dcinside.app.view.dccon.BigDcconDialogFragment.EXTRA_BIG_DCCON_RESULT", BigDcconResult.class);
        if(bigDcconResult0 == null) {
            return;
        }
        e e0 = e.a.a("");
        Group group0 = this.k0().d;
        L.o(group0, "bigDcconActiveGroup");
        e e1 = e.c;
        int v = 0;
        group0.setVisibility((e0 == e1 ? 8 : 0));
        Group group1 = this.k0().i;
        L.o(group1, "bigDcconInactiveGroup");
        if(e0 != e.d) {
            v = 8;
        }
        group1.setVisibility(v);
        g1 g10 = this.k0();
        L.o(g10.f, "bigDcconDialog");
        b c$b0 = new b(this, null);
        r.M(g10.f, null, c$b0, 1, null);
        g1 g11 = this.k0();
        L.o(g11.k, "dialogBigDcconClose");
        com.dcinside.app.view.dccon.c.c c$c0 = new com.dcinside.app.view.dccon.c.c(this, null);
        r.M(g11.k, null, c$c0, 1, null);
        if(e0 == e1) {
            this.l0(bigDcconResult0);
            return;
        }
        this.m0(bigDcconResult0);
    }
}

