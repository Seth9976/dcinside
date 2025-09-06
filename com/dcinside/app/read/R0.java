package com.dcinside.app.read;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Editable;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import com.dcinside.app.model.Q;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.s;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.k;
import com.dcinside.app.realm.t;
import com.dcinside.app.response.j;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import i0.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.q0;
import kotlin.text.v;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nReadReplyRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadReplyRequest.kt\ncom/dcinside/app/read/ReadReplyRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class r0 implements com.dcinside.app.read.s0 {
    private final com.dcinside.app.read.s0 a;
    @m
    private WeakReference b;
    @m
    private o c;
    private boolean d;

    public r0(@l B0 b00, @l com.dcinside.app.read.s0 s00) {
        L.p(b00, "writer");
        L.p(s00, "listener");
        super();
        this.a = s00;
        this.b = new WeakReference(b00);
        this.d = true;
    }

    public final void A(@l g g0, boolean z) {
        static final class b extends N implements Function1 {
            final a e;

            b(a a0) {
                this.e = a0;
                super(1);
            }

            public final g a(V v0) {
                s s0 = (s)v0.f();
                String[] arr_s = s0 == null ? new String[]{((s)v0.e()).c()} : new String[]{s0.c(), ((s)v0.e()).c()};
                this.e.c((s0 == null ? new int[]{((s)v0.e()).a()} : new int[]{s0.a(), ((s)v0.e()).a()}));
                if(s0 != null) {
                    k.g.b(s0.e(), s0.a());
                }
                k.g.b(((s)v0.e()).e(), ((s)v0.e()).a());
                return uk.sG(this.e.d(arr_s));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((V)object0));
            }
        }


        static final class c extends N implements Function1 {
            final r0 e;
            final a f;

            c(r0 r00, a a0) {
                this.e = r00;
                this.f = a0;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.y(this.f.m(), this.f.o(), this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        L.p(g0, "observable");
        o[] arr_o = new o[1];
        boolean z1 = false;
        arr_o[0] = this.c;
        if(!kl.a(arr_o) && !z) {
            return;
        }
        a a0 = this.u(false);
        if(a0 == null) {
            return;
        }
        if(!z) {
            dl dl0 = dl.a;
            String s = B.E.c0();
            if(s == null) {
                s = "";
            }
            if(dl0.J(s) > System.currentTimeMillis() && dl0.K2()) {
                z1 = true;
            }
            a0.z(z1);
        }
        com.dcinside.app.read.s0.a.a(this, true, null, 2, null);
        this.c = g0.f2((Object object0) -> {
            L.p(new b(a0), "$tmp0");
            return (g)new b(a0).invoke(object0);
        }).z5((Object object0) -> {
            L.p(new c(this, a0), "$tmp0");
            new c(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(g0, "$observable");
            if(this.d) {
                this.d = false;
                this.A(g0, true);
                return;
            }
            this.b(false, throwable0);
        }, () -> {
            L.p(this, "this$0");
            com.dcinside.app.read.s0.a.a(this, false, null, 2, null);
        });
    }

    public static void B(r0 r00, g g0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        r00.A(g0, z);
    }

    // 检测为 Lambda 实现
    private static final void C(r0 r00) [...]

    // 检测为 Lambda 实现
    private static final g D(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void E(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F(r0 r00, g g0, Throwable throwable0) [...]

    public final void G() {
        static final class d extends N implements Function1 {
            final r0 e;
            final a f;

            d(r0 r00, a a0) {
                this.e = r00;
                this.f = a0;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.y(this.f.m(), this.f.o(), this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        if(!kl.a(new o[]{this.c})) {
            return;
        }
        a a0 = this.u(true);
        if(a0 == null) {
            return;
        }
        com.dcinside.app.read.s0.a.a(this, true, null, 2, null);
        this.c = uk.sG(a0).z5((Object object0) -> {
            L.p(new d(this, a0), "$tmp0");
            new d(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.b(false, throwable0);
        }, () -> {
            L.p(this, "this$0");
            com.dcinside.app.read.s0.a.a(this, false, null, 2, null);
        });
    }

    // 检测为 Lambda 实现
    private static final void H(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I(r0 r00, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void J(r0 r00) [...]

    private final void K(com.dcinside.app.voice.m m0, Q q0, Q0 q00, j j0, boolean z, boolean z1) {
        static final class h extends N implements Function1 {
            final r0 e;
            final a f;

            h(r0 r00, a a0) {
                this.e = r00;
                this.f = a0;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.y(this.f.m(), this.f.o(), this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        q0 q01 = m0.getAllowGuestInfo();
        String s = (String)q01.a();
        String s1 = (String)q01.b();
        boolean z2 = ((Boolean)q01.c()).booleanValue();
        if(z2) {
            s = q0.I0();
        }
        a a0 = new a().u(q00).y(j0).w(q0).v(s).x(s1).r(z2);
        if(z) {
            V v0 = this.w(m0);
            a0.t(m0.getInputText()).a(((String)v0.a())).b(((String)v0.b()));
            a0.e(m0.getInputRecord()).t(this.x(m0, q0.G0()));
        }
        else {
            V v1 = this.w(m0);
            a0.t(m0.getInputText()).a(((String)v1.a())).b(((String)v1.b()));
        }
        com.dcinside.app.read.s0.a.a(this, true, null, 2, null);
        this.c = (z ? uk.rG(a0, z1) : uk.sG(a0)).z5((Object object0) -> {
            L.p(new h(this, a0), "$tmp0");
            new h(this, a0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.b(false, throwable0);
        }, () -> {
            L.p(this, "this$0");
            com.dcinside.app.read.s0.a.a(this, false, null, 2, null);
        });
    }

    public final void L(@l com.dcinside.app.voice.m m0, boolean z) {
        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150B93);  // string:voice_subject_empty "보이스 제목(설명)이 입력되지 않았습니다.\n제목(설명) 없이 등록하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
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


        static final class com.dcinside.app.read.r0.g extends N implements Function1 {
            final r0 e;
            final com.dcinside.app.voice.m f;
            final Q g;
            final Q0 h;
            final j i;
            final boolean j;

            com.dcinside.app.read.r0.g(r0 r00, com.dcinside.app.voice.m m0, Q q0, Q0 q00, j j0, boolean z) {
                this.e = r00;
                this.f = m0;
                this.g = q0;
                this.h = q00;
                this.i = j0;
                this.j = z;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.K(this.f, this.g, this.h, this.i, true, this.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(m0, "view");
        boolean z1 = true;
        if(!kl.a(new o[]{this.c})) {
            return;
        }
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            B0 b00 = (B0)weakReference0.get();
            if(b00 != null) {
                Context context0 = b00.U().S().getContext();
                if(context0 == null) {
                    return;
                }
                Q q0 = this.c();
                if(q0 == null) {
                    return;
                }
                boolean z2 = m0.getInputType() == com.dcinside.app.voice.m.l.a;
                String s = m0.getTitle();
                if(!z2 || !m0.a.a.i(s)) {
                    z1 = false;
                }
                Q0 q00 = b00.S();
                j j0 = b00.T();
                if(z1) {
                    this.c = com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(e.e).z(0x7F150B91).x(0x7F150B92).b().Z1((Object object0) -> {
                        L.p(f.e, "$tmp0");
                        return (Boolean)f.e.invoke(object0);
                    }).y5((Object object0) -> {
                        L.p(new com.dcinside.app.read.r0.g(this, m0, q0, q00, j0, z), "$tmp0");
                        new com.dcinside.app.read.r0.g(this, m0, q0, q00, j0, z).invoke(object0);
                    }, (Throwable throwable0) -> {
                        L.p(this, "this$0");
                        this.S(0x7F150B94);  // string:voice_subject_error "보이스 입력에 실패하였습니다."
                    });
                    return;
                }
                this.K(m0, q0, q00, j0, z2, z);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean M(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void N(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O(r0 r00, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void P(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Q(r0 r00, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void R(r0 r00) [...]

    private final void S(@StringRes int v) {
        int v1;
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            B0 b00 = (B0)weakReference0.get();
            if(b00 != null) {
                J0 j00 = b00.U();
                if(j00 != null) {
                    View view0 = j00.T();
                    if(view0 != null) {
                        if(Build.VERSION.SDK_INT >= 23) {
                            WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(view0.getRootWindowInsets());
                            v1 = windowInsetsCompat0.C(8) ? windowInsetsCompat0.f(8).d : 0;
                        }
                        else {
                            v1 = ll.q();
                        }
                        com.hjq.toast.s.u(80, 0, v1 + view0.getHeight() + view0.getResources().getDimensionPixelSize(0x7F0703D9));  // dimen:reply_toast_margin
                        com.hjq.toast.s.E(v);
                    }
                }
            }
        }
    }

    @Override  // com.dcinside.app.read.s0
    public void a() {
        this.a.a();
    }

    @Override  // com.dcinside.app.read.s0
    public void b(boolean z, @m Throwable throwable0) {
        this.a.b(z, throwable0);
    }

    @Override  // com.dcinside.app.read.s0
    @m
    public Q c() {
        return this.a.c();
    }

    @Override  // com.dcinside.app.read.s0
    public void d() {
        this.a.d();
    }

    @Override  // com.dcinside.app.read.s0
    public void f(@m a a0) {
        this.a.f(a0);
    }

    @m
    public final a u(boolean z) {
        Q q0 = this.c();
        if(q0 == null) {
            return null;
        }
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            B0 b00 = (B0)weakReference0.get();
            if(b00 != null) {
                com.dcinside.app.view.tool.e e0 = b00.Q();
                if(e0 == null) {
                    return null;
                }
                J0 j00 = b00.U();
                a a0 = new a();
                if(e0.l()) {
                    if(e0.h()) {
                        a0.a(e0.i()).b(e0.j());
                        goto label_18;
                    }
                    this.S(0x7F15078D);  // string:please_code_input "코드를 입력해 주세요."
                    return null;
                }
            label_18:
                if(b00.b0()) {
                    String s = j00.W().getText().toString();
                    if(j00.s() && j00.O0()) {
                        s = q0.I0();
                        if(s == null) {
                            s = "";
                        }
                    }
                    String s1 = j00.X().getText().toString();
                    if(s.length() < 2) {
                        this.S(0x7F15078B);  // string:please_check_guest_info "닉네임 및 비밀번호를 확인해주세요."
                        return null;
                    }
                    if(s1.length() < 2) {
                        this.S(0x7F15078B);  // string:please_check_guest_info "닉네임 및 비밀번호를 확인해주세요."
                        return null;
                    }
                    a0.v(s).x(s1);
                    a0.r(j00.s() && j00.O0());
                }
                if(z) {
                    Editable editable0 = j00.b0().getText();
                    String s2 = editable0 == null ? null : editable0.toString();
                    if(s2 != null && s2.length() != 0) {
                        String s3 = com.dcinside.app.realm.o.h.j(q0.G0());
                        if(s3.length() != 0) {
                            int v = jl.a.D0() - (s3.length() + 1);
                            if(s2.length() > v) {
                                s2 = v.m5(s2, kotlin.ranges.s.W1(0, v));
                            }
                            s2 = s2 + " " + s3;
                        }
                        a0.t(s2);
                        return a0.u(b00.S()).y(b00.T()).w(q0);
                    }
                    this.S(0x7F15078C);  // string:please_check_reply "댓글을 확인해주세요."
                    return null;
                }
                return a0.u(b00.S()).y(b00.T()).w(q0);
            }
        }
        return null;
    }

    public static a v(r0 r00, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return r00.u(z);
    }

    private final V w(com.dcinside.app.voice.m m0) {
        com.dcinside.app.view.tool.e e0 = m0.getCaptchaCodeManager();
        return e0.l() ? kotlin.r0.a(e0.i(), e0.j()) : kotlin.r0.a(null, null);
    }

    private final String x(com.dcinside.app.voice.m m0, String s) {
        String s3;
        String s1 = m0.getTitle();
        if(s1.length() <= 0) {
            s1 = null;
        }
        if(s1 == null) {
            return "";
        }
        String s2 = com.dcinside.app.realm.o.h.j(s);
        if(s2.length() > 0) {
            int v = jl.a.D0();
            if(s1.length() > v - 2) {
                s1 = v.m5(s1, kotlin.ranges.s.W1(0, v - 2));
            }
            s3 = m0.getContext().getString(0x7F150B90, new Object[]{s1});  // string:voice_subject_append "[%s]"
            L.m(s3);
            return s3;
        }
        int v1 = jl.a.D0() - (s2.length() + 3);
        if(s1.length() > v1) {
            s1 = v.m5(s1, kotlin.ranges.s.W1(0, v1));
        }
        String s4 = m0.getContext().getString(0x7F150B90, new Object[]{s1});  // string:voice_subject_append "[%s]"
        L.o(s4, "getString(...)");
        s3 = String.format("%s %s", Arrays.copyOf(new Object[]{s4, s2}, 2));
        L.o(s3, "format(...)");
        return s3;
    }

    private final void y(String s, String s1, a a0) {
        static final class com.dcinside.app.read.r0.a extends N implements Function1 {
            public static final com.dcinside.app.read.r0.a e;

            static {
                com.dcinside.app.read.r0.a.e = new com.dcinside.app.read.r0.a();
            }

            com.dcinside.app.read.r0.a() {
                super(1);
            }

            public final void a(@l com.dcinside.app.realm.f0 f00) {
                L.p(f00, "it");
                f00.w6(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.realm.f0)object0));
                return S0.a;
            }
        }

        boolean z = true;
        Q q0 = a0 == null ? null : a0.n();
        if(q0 != null) {
            com.dcinside.app.realm.helper.a.a.r(q0, com.dcinside.app.read.r0.a.e);
        }
        if(!m0.a.a.f(new CharSequence[]{s, s1})) {
            try {
                B0 b00 = this.b == null ? null : ((B0)this.b.get());
                if(q0 == null) {
                label_11:
                    if(b00 != null && b00.H0()) {
                        s = null;
                    }
                }
                else {
                    String s2 = q0.p0();
                    if(s2 != null && s2.length() > 0) {
                        s = null;
                        goto label_13;
                    }
                    goto label_11;
                }
            label_13:
                t.i.c(s, s1);
                if(b00 != null && b00.K()) {
                    dl dl0 = dl.a;
                    if(!b00.H0()) {
                        z = false;
                    }
                    dl0.m6(z);
                }
                goto label_22;
            }
            catch(Exception exception0) {
            }
            timber.log.b.a.y(exception0);
        }
    label_22:
        this.f(a0);
        this.a();
    }

    public final void z() {
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        this.c = null;
    }
}

