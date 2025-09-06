package com.dcinside.app.auth;

import A3.p;
import Y.h2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class r extends Fragment {
    @m
    private h2 a;

    private final void o0() {
        @f(c = "com.dcinside.app.auth.LoginInfoFragment$applyClickEvent$1", f = "LoginInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final r l;

            a(r r0, d d0) {
                this.l = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.t0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.LoginInfoFragment$applyClickEvent$2", f = "LoginInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final r m;

            b(r r0, d d0) {
                this.m = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b r$b0 = new b(this.m, d0);
                r$b0.l = view0;
                return r$b0.invokeSuspend(S0.a);
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
                this.m.u0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.LoginInfoFragment$applyClickEvent$3", f = "LoginInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            Object l;
            final r m;

            c(r r0, d d0) {
                this.m = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c r$c0 = new c(this.m, d0);
                r$c0.l = view0;
                return r$c0.invokeSuspend(S0.a);
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
                this.m.u0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.LoginInfoFragment$applyClickEvent$4", f = "LoginInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.auth.r.d extends o implements p {
            int k;
            Object l;
            final r m;

            com.dcinside.app.auth.r.d(r r0, d d0) {
                this.m = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.auth.r.d r$d0 = new com.dcinside.app.auth.r.d(this.m, d0);
                r$d0.l = view0;
                return r$d0.invokeSuspend(S0.a);
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
                this.m.u0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.auth.LoginInfoFragment$applyClickEvent$5", f = "LoginInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            Object l;
            final r m;

            e(r r0, d d0) {
                this.m = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                e r$e0 = new e(this.m, d0);
                r$e0.l = view0;
                return r$e0.invokeSuspend(S0.a);
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
                this.m.u0(((View)this.l));
                return S0.a;
            }
        }

        h2 h20 = this.p0();
        L.o(h20.e, "loginInfoLogout");
        a r$a0 = new a(this, null);
        com.dcinside.app.internal.r.M(h20.e, null, r$a0, 1, null);
        h2 h21 = this.p0();
        L.o(h21.i, "loginInfoSettingNormal");
        b r$b0 = new b(this, null);
        com.dcinside.app.internal.r.M(h21.i, null, r$b0, 1, null);
        h2 h22 = this.p0();
        L.o(h22.j, "loginInfoSettingPassword");
        c r$c0 = new c(this, null);
        com.dcinside.app.internal.r.M(h22.j, null, r$c0, 1, null);
        h2 h23 = this.p0();
        L.o(h23.k, "loginInfoSettingSecurity");
        com.dcinside.app.auth.r.d r$d0 = new com.dcinside.app.auth.r.d(this, null);
        com.dcinside.app.internal.r.M(h23.k, null, r$d0, 1, null);
        h2 h24 = this.p0();
        L.o(h24.m, "loginInfoWithdraw");
        e r$e0 = new e(this, null);
        com.dcinside.app.internal.r.M(h24.m, null, r$e0, 1, null);
        h2 h25 = this.p0();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(h25.m.getText());
        spannableStringBuilder0.setSpan(new UnderlineSpan(), 0, spannableStringBuilder0.length(), 33);
        h25.m.setText(spannableStringBuilder0);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = h2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof g) {
            B b0 = B.E.V(((g)fragmentActivity0).F1());
            if(b0 != null) {
                h2 h20 = this.p0();
                String s = b0.r6();
                h20.d.setText(s);
                h2 h21 = this.p0();
                String s1 = b0.m6();
                h21.g.setText(s1);
                h2 h22 = this.p0();
                Spanned spanned0 = Dl.c(this.getString(0x7F150545));  // string:login_simple_active_otp "2단계 <font color=#FF0000>ON</font>"
                h22.h.setText(spanned0);
                String s2 = b0.A6();
                String s3 = b0.n6();
                if(!L.g("1", s2) && !Boolean.parseBoolean(s2) && !m0.a.a.k(s3)) {
                    this.p0().h.setVisibility(8);
                    return;
                }
                this.p0().h.setVisibility(0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 != null && fragmentActivity0.getIntent().hasExtra("s")) {
            kr.bhbfhfb.designcompat.a.g(((AppCompatActivity)this.getActivity()), 0x7F150987);  // string:setting_member_info "로그인 정보"
        }
        this.o0();
    }

    private final h2 p0() {
        h2 h20 = this.a;
        L.m(h20);
        return h20;
    }

    private final void q0(int v, String s) {
        static final class com.dcinside.app.auth.r.f extends N implements Function1 {
            final int e;

            com.dcinside.app.auth.r.f(int v) {
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


        static final class com.dcinside.app.auth.r.g extends N implements Function1 {
            public static final com.dcinside.app.auth.r.g e;

            static {
                com.dcinside.app.auth.r.g.e = new com.dcinside.app.auth.r.g();
            }

            com.dcinside.app.auth.r.g() {
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


        static final class h extends N implements Function1 {
            final String e;
            final AppCompatActivity f;

            h(String s, AppCompatActivity appCompatActivity0) {
                this.e = s;
                this.f = appCompatActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                String s = new Uri.Builder().scheme("https").authority("msign.dcinside.com").appendPath("config").appendPath(this.e).appendQueryParameter("from_app", "1").build().toString();
                L.o(s, "toString(...)");
                com.dcinside.app.main.a.i(this.f, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(s == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.auth.r.f(v)).z(0x7F15023E).x(0x7F1501F2).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.auth.r.g.e, "$tmp0");
            return (Boolean)com.dcinside.app.auth.r.g.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new h(s, appCompatActivity0), "$tmp0");
            new h(s, appCompatActivity0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean r0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s0(Function1 function10, Object object0) [...]

    private final void t0() {
        static final class i extends N implements Function1 {
            final Activity e;

            i(Activity activity0) {
                this.e = activity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    Intent intent0 = ((g)this.e).getIntent();
                    ((g)this.e).setResult(-1, intent0);
                    ((g)this.e).finish();
                    return;
                }
                ((g)this.e).finish();
                Dl.D(this.e, 0x7F150322);  // string:failed_logout "로그아웃을 실패했습니다.\n잠시 후 다시 시도해주세요."
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof g) {
            B b0 = B.E.V(((g)fragmentActivity0).F1());
            i r$i0 = new i(fragmentActivity0);
            B.E.Y(((g)fragmentActivity0), b0, r$i0);
        }
    }

    private final void u0(View view0) {
        String s = null;
        Integer integer0 = view0 == null ? null : view0.getId();
        if(integer0 != null && ((int)integer0) == 0x7F0B0749) {  // id:login_info_setting_normal
            Object object0 = view0.getTag();
            if(object0 instanceof String) {
                s = (String)object0;
            }
            this.q0(0x7F15098C, s);  // string:setting_member_normal_message "기본 정보 변경은 모바일 웹에서 가능합니다. 모바일 웹 페이지로 이동하시겠습니까?"
            return;
        }
        if(integer0 != null && ((int)integer0) == 0x7F0B074A) {  // id:login_info_setting_password
            Object object1 = view0.getTag();
            if(object1 instanceof String) {
                s = (String)object1;
            }
            this.q0(0x7F15098E, s);  // string:setting_member_password_message "비밀번호 변경은 모바일 웹에서 가능합니다. 모바일 웹 페이지로 이동하시겠습니까?"
            return;
        }
        if(integer0 != null && ((int)integer0) == 0x7F0B074B) {  // id:login_info_setting_security
            Object object2 = view0.getTag();
            if(object2 instanceof String) {
                s = (String)object2;
            }
            this.q0(0x7F150990, s);  // string:setting_member_security_message "보안센터 설정은 모바일 웹에서 가능합니다. 모바일 웹 페이지로 이동하시겠습니까?"
            return;
        }
        if(integer0 != null && ((int)integer0) == 0x7F0B074D) {  // id:login_info_withdraw
            this.v0();
        }
    }

    private final void v0() {
        static final class j extends N implements Function1 {
            final AppCompatActivity e;
            final r f;

            j(AppCompatActivity appCompatActivity0, r r0) {
                this.e = appCompatActivity0;
                this.f = r0;
                super(1);
            }

            public final void b(String s) {
                Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority("msign.dcinside.com").appendPath("config").appendPath("member_out").appendQueryParameter("app_id", s);
                String s1 = B.E.k0();
                if(s1 == null) {
                    s1 = "";
                }
                String s2 = uri$Builder0.appendQueryParameter("confirm_id", s1).build().toString();
                L.o(s2, "toString(...)");
                Builder awesomeWebView$Builder0 = com.dcinside.app.main.a.d(this.e);
                if(awesomeWebView$Builder0 != null) {
                    Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.N5(true);
                    if(awesomeWebView$Builder1 != null) {
                        Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.S5(this.f, 2000);
                        if(awesomeWebView$Builder2 != null) {
                            Builder awesomeWebView$Builder3 = awesomeWebView$Builder2.J6(true);
                            if(awesomeWebView$Builder3 != null) {
                                Builder awesomeWebView$Builder4 = awesomeWebView$Builder3.K6(2);
                                if(awesomeWebView$Builder4 != null) {
                                    awesomeWebView$Builder4.y5(s2);
                                }
                            }
                        }
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
        uk.Lj().y5((Object object0) -> {
            L.p(new j(appCompatActivity0, this), "$tmp0");
            new j(appCompatActivity0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Context context0 = this.getContext();
            if(context0 == null) {
                return;
            }
            Dl.D(context0, 0x7F1504F7);  // string:important_data_changed "앱을 종료 후 다시 실행해주세요."
        });
    }

    // 检测为 Lambda 实现
    private static final void w0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x0(r r0, Throwable throwable0) [...]
}

