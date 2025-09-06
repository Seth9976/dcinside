package com.dcinside.app.post.fragments;

import A3.p;
import Y.A1;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import java.net.URLEncoder;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class g extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static enum b {
        CARRIER,
        VPN,
        UNKNOWN;

        private static final b[] d;
        private static final kotlin.enums.a e;

        static {
            b.d = arr_g$b;
            L.p(arr_g$b, "entries");
            b.e = new d(arr_g$b);
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.e;
        }
    }

    @m
    private A1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "vpnBanMessage";
    @l
    public static final String d = "vpnBanGalleryId";

    static {
        g.b = new a(null);
    }

    private final A1 n0() {
        A1 a10 = this.a;
        L.m(a10);
        return a10;
    }

    private final b o0(String s) {
        if(v.W2(s, "통신사 IP", false, 2, null)) {
            return b.a;
        }
        return v.W2(s, "VPN IP", false, 2, null) ? b.b : b.c;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = A1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.n0().b();
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
        @f(c = "com.dcinside.app.post.fragments.BanVPNDialogFragment$onViewCreated$1", f = "BanVPNDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final g l;

            c(g g0, kotlin.coroutines.d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.dismiss();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.fragments.BanVPNDialogFragment$onViewCreated$2$1", f = "BanVPNDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.g.d extends o implements p {
            int k;
            final g l;

            com.dcinside.app.post.fragments.g.d(g g0, kotlin.coroutines.d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.g.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        String s = "";
        String s1 = bundle1 == null ? null : bundle1.getString("vpnBanMessage", "");
        if(s1 != null) {
            s = s1;
        }
        int v = v.s3(s, "사용 가능", 0, false, 6, null);
        String s2 = s.substring(0, v);
        L.o(s2, "substring(...)");
        String s3 = s.substring(v);
        L.o(s3, "substring(...)");
        b g$b0 = this.o0(s);
        this.n0().e.setText(s2);
        A1 a10 = this.n0();
        String s4 = v.l2(s3, "사용 가능 시간", "사용 가능", false, 4, null);
        a10.d.setText(s4);
        A1 a11 = this.n0();
        L.o(a11.c, "banReportNotVpnClose");
        c g$c0 = new c(this, null);
        r.M(a11.c, null, g$c0, 1, null);
        TextView textView0 = this.n0().b;
        if(g$b0 == b.c) {
            textView0.setVisibility(8);
        }
        textView0.setText(Dl.c(this.getString(0x7F1508C8)));  // string:report_not_vpn_ip "<u>IP 오류 신고</u>"
        L.m(textView0);
        r.M(textView0, null, new com.dcinside.app.post.fragments.g.d(this, null), 1, null);
    }

    private final void p0() {
        static final class e extends N implements Function1 {
            final AppCompatActivity e;
            final String f;
            final String g;

            e(AppCompatActivity appCompatActivity0, String s, String s1) {
                this.e = appCompatActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void b(String s) {
                String s1 = "app_id=" + URLEncoder.encode(s, "UTF-8") + "&id=" + URLEncoder.encode(this.g, "UTF-8");
                L.o(s1, "let(...)");
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
                    if(awesomeWebView$Builder1 != null) {
                        awesomeWebView$Builder1.z5(this.f, s1);
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            String s = bundle0.getString("vpnBanGalleryId");
            if(s != null) {
                String s1 = this.getString(0x7F150B4F);  // string:url_report_not_vpn "https://m.dcinside.com/singo/remoteip"
                L.o(s1, "getString(...)");
                uk.Lj().y5((Object object0) -> {
                    L.p(new e(appCompatActivity0, s1, s), "$tmp0");
                    new e(appCompatActivity0, s1, s).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(appCompatActivity0, "$activity");
                    Dl.D(appCompatActivity0, 0x7F1504F7);  // string:important_data_changed "앱을 종료 후 다시 실행해주세요."
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void q0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r0(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]
}

