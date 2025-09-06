package com.dcinside.app.auth;

import Y.E1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.p;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;

public final class y extends p {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    private E1 k;
    @y4.m
    private m l;

    public y(@l Context context0) {
        L.p(context0, "context");
        super(context0, 0, 2, null);
    }

    private final void B() {
        @f(c = "com.dcinside.app.auth.OtpGuideDialog$initCallbacks$1", f = "OtpGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.p {
            int k;
            Object l;
            final y m;

            b(y y0, d d0) {
                this.m = y0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                b y$b0 = new b(this.m, d0);
                y$b0.l = view0;
                return y$b0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                k.a.a();
                Context context0 = Al.h(this.m.getContext());
                Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
                if(activity0 == null) {
                    return S0.a;
                }
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(activity0);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        Object object1 = view0.getTag();
                        L.n(object1, "null cannot be cast to non-null type kotlin.String");
                        awesomeWebView$Builder1.y5(((String)object1));
                    }
                }
                this.m.dismiss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.OtpGuideDialog$initCallbacks$2", f = "OtpGuideDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.p {
            int k;
            final y l;

            c(y y0, d d0) {
                this.l = y0;
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
                this.l.dismiss();
                return S0.a;
            }
        }

        E1 e10 = this.k;
        if(e10 == null) {
            L.S("binding");
            e10 = null;
        }
        L.o(e10.e, "otpManagerGuideConfirm");
        b y$b0 = new b(this, null);
        r.M(e10.e, null, y$b0, 1, null);
        E1 e11 = this.k;
        if(e11 == null) {
            L.S("binding");
            e11 = null;
        }
        L.o(e11.c, "otpManagerGuideClose");
        c y$c0 = new c(this, null);
        r.M(e11.c, null, y$c0, 1, null);
    }

    private final void C() {
        Resources resources0 = this.getContext().getResources();
        E1 e10 = this.k;
        E1 e11 = null;
        if(e10 == null) {
            L.S("binding");
            e10 = null;
        }
        vk.p(0x7F04012E, new View[]{e10.f});  // attr:colorAccent
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
        L.o(s, "format(...)");
        String s1 = resources0.getString(0x7F15074E, new Object[]{s});  // string:otp_manager_guide_main_title "<font color=%1$s>2단계 인증</font>으로<br>보안을 강화하세요."
        L.o(s1, "getString(...)");
        E1 e12 = this.k;
        if(e12 == null) {
            L.S("binding");
            e12 = null;
        }
        Spanned spanned0 = Dl.c(s1);
        e12.i.setText(spanned0);
        int v = 0x7F15074C;  // string:otp_manager_guide_hacking_minor_desc "매니저/부매니저 식별 코드가 도용되면 마이너 갤러리에 큰 피해가 
                             // 발생할 수 있습니다."
        switch((this.l == null ? -1 : a.a[this.l.ordinal()])) {
            case 1: {
                v = 0x7F15074A;  // string:otp_manager_guide_hacking_desc "매니저/부매니저 식별 코드가 도용되면 갤러리에 큰 피해가 발생할 수 있습니다."
                break;
            }
            case 3: {
                v = 0x7F15074B;  // string:otp_manager_guide_hacking_mini_desc "매니저/부매니저 식별 코드가 도용되면 미니 갤러리에 큰 피해가 발생할 
                                 // 수 있습니다."
            }
        }
        E1 e13 = this.k;
        if(e13 == null) {
            L.S("binding");
        }
        else {
            e11 = e13;
        }
        String s2 = this.getContext().getString(v);
        e11.g.setText(s2);
    }

    public final void D(@l m m0) {
        L.p(m0, "grade");
        this.l = m0;
    }

    @Override  // com.dcinside.app.perform.p
    protected void onCreate(@y4.m Bundle bundle0) {
        super.onCreate(bundle0);
        E1 e10 = E1.c(this.getLayoutInflater());
        L.o(e10, "inflate(...)");
        this.k = e10;
        if(e10 == null) {
            L.S("binding");
            e10 = null;
        }
        this.setContentView(e10.b());
        this.C();
        this.B();
        this.setCancelable(false);
    }
}

