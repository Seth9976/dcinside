package com.dcinside.app.settings;

import A3.p;
import A3.q;
import Y.G0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.CompoundButton;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SwitchCompat;
import com.dcinside.app.internal.r;
import com.dcinside.app.read.I;
import com.dcinside.app.read.P0;
import com.dcinside.app.util.dl;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class WriteSettingActivity extends c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b implements com.dcinside.app.settings.c.a {
        private final boolean a;
        @l
        private final P0 b;
        private final boolean c;

        public b(boolean z, @l P0 p00, boolean z1) {
            L.p(p00, "replyInputHintType");
            super();
            this.a = z;
            this.b = p00;
            this.c = z1;
        }

        @Override  // com.dcinside.app.settings.c$a
        public boolean a(@l com.dcinside.app.settings.c.a c$a0) {
            L.p(c$a0, "other");
            if(!(c$a0 instanceof b)) {
                return false;
            }
            return this == c$a0 ? false : this.b != ((b)c$a0).b;
        }

        public final boolean b() {
            return this.a;
        }

        @l
        public final P0 c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        @l
        public final b e(boolean z, @l P0 p00, boolean z1) {
            L.p(p00, "replyInputHintType");
            return new b(z, p00, z1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(this.a != ((b)object0).a) {
                return false;
            }
            return this.b == ((b)object0).b ? this.c == ((b)object0).c : false;
        }

        @Override  // com.dcinside.app.settings.c$a
        public void f() {
            dl.a.u6(this.a);
            dl.a.G5(this.b);
            dl.a.O3(this.c);
        }

        public static b g(b writeSettingActivity$b0, boolean z, P0 p00, boolean z1, int v, Object object0) {
            if((v & 1) != 0) {
                z = writeSettingActivity$b0.a;
            }
            if((v & 2) != 0) {
                p00 = writeSettingActivity$b0.b;
            }
            if((v & 4) != 0) {
                z1 = writeSettingActivity$b0.c;
            }
            return writeSettingActivity$b0.e(z, p00, z1);
        }

        public final boolean h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (androidx.compose.foundation.c.a(this.a) * 0x1F + this.b.hashCode()) * 0x1F + androidx.compose.foundation.c.a(this.c);
        }

        @l
        public final P0 i() {
            return this.b;
        }

        public final boolean j() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return "InitialValue(isWriteChangeLoginEnable=" + this.a + ", replyInputHintType=" + this.b + ", enableEasyAi=" + this.c + ")";
        }
    }

    public final class com.dcinside.app.settings.WriteSettingActivity.c {
        public static final int[] a;

        static {
            int[] arr_v = new int[P0.values().length];
            try {
                arr_v[P0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[P0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[P0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.settings.WriteSettingActivity.c.a = arr_v;
        }
    }

    @l
    private P0 A;
    private boolean B;
    private boolean C;
    @m
    private b D;
    @l
    private final e E;
    @l
    public static final a F = null;
    @l
    public static final String G = "EXTRA_OPEN_POST_WRITE";
    private G0 z;

    static {
        WriteSettingActivity.F = new a(null);
    }

    public WriteSettingActivity() {
        public static final class e extends OnBackPressedCallback {
            final WriteSettingActivity d;

            e(WriteSettingActivity writeSettingActivity0) {
                this.d = writeSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.setResult(-1);
                this.d.Q1();
            }
        }

        super(null, 1, null);
        this.A = dl.a.U1();
        this.B = dl.a.a3();
        this.C = dl.a.W();
        this.E = new e(this);
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a T1() {
        return new b(this.B, this.A, this.C);
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a V1() {
        com.dcinside.app.settings.c.a c$a0 = this.D;
        L.m(c$a0);
        return c$a0;
    }

    private final void g2() {
        public static final class d extends AnimatorListenerAdapter {
            final View a;

            d(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                L.p(animator0, "animation");
                this.a.setVisibility(8);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(@l Animator animator0) {
                L.p(animator0, "animation");
                this.a.setAlpha(0.8f);
                this.a.setVisibility(0);
            }
        }

        G0 g00 = this.z;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        View view0 = g00.g;
        L.m(view0);
        ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        view0.animate().setStartDelay(0xFAL).alpha(0.0f).setDuration(2000L).setListener(new d(view0));
    }

    private final int n2(boolean z) {
        return z == I.c.c() || z != I.d.c() ? 0x7F1509B5 : 0x7F1509B6;  // string:setting_write_post_hint_item0 "사용함"
    }

    private final int o2(P0 p00) {
        switch(p00) {
            case 1: {
                return 0x7F1509BA;  // string:setting_write_reply_hint_item2 "사용 안 함"
            }
            case 2: {
                return 0x7F1509B8;  // string:setting_write_reply_hint_item0 "닉네임"
            }
            case 3: {
                return 0x7F1509B9;  // string:setting_write_reply_hint_item1 "프로필 이미지"
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // com.dcinside.app.settings.c
    public void onBackPressed() {
        this.E.g();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.WriteSettingActivity$onCreate$1", f = "WriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.WriteSettingActivity.l extends o implements p {
            int k;
            final WriteSettingActivity l;

            com.dcinside.app.settings.WriteSettingActivity.l(WriteSettingActivity writeSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.WriteSettingActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.WriteSettingActivity$onCreate$2", f = "WriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.WriteSettingActivity.m extends o implements p {
            int k;
            final WriteSettingActivity l;

            com.dcinside.app.settings.WriteSettingActivity.m(WriteSettingActivity writeSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.WriteSettingActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.WriteSettingActivity$onCreate$3", f = "WriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends o implements p {
            int k;
            final WriteSettingActivity l;

            n(WriteSettingActivity writeSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new n(this.l, d0).invokeSuspend(S0.a);
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
                this.l.u2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.WriteSettingActivity$onCreate$4", f = "WriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.WriteSettingActivity.o extends o implements q {
            int k;
            final WriteSettingActivity l;

            com.dcinside.app.settings.WriteSettingActivity.o(WriteSettingActivity writeSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.WriteSettingActivity.o(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.y2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        G0 g00 = G0.c(this.getLayoutInflater());
        L.o(g00, "inflate(...)");
        this.z = g00;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        this.setContentView(g00.b());
        this.getOnBackPressedDispatcher().h(this.E);
        G0 g01 = this.z;
        if(g01 == null) {
            L.S("binding");
            g01 = null;
        }
        this.S0(g01.b);
        kr.bhbfhfb.designcompat.a.d(this);
        G0 g02 = this.z;
        if(g02 == null) {
            L.S("binding");
            g02 = null;
        }
        int v = this.o2(this.A);
        g02.o.setText(v);
        G0 g03 = this.z;
        if(g03 == null) {
            L.S("binding");
            g03 = null;
        }
        int v1 = this.n2(this.B);
        g03.j.setText(v1);
        G0 g04 = this.z;
        if(g04 == null) {
            L.S("binding");
            g04 = null;
        }
        g04.h.setChecked(this.C);
        com.dcinside.app.settings.c.a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.settings.WriteSettingActivity.InitialValue");
        this.D = (b)c$a0;
        G0 g05 = this.z;
        if(g05 == null) {
            L.S("binding");
            g05 = null;
        }
        L.o(g05.c, "settingWriteChangeLogin");
        com.dcinside.app.settings.WriteSettingActivity.l writeSettingActivity$l0 = new com.dcinside.app.settings.WriteSettingActivity.l(this, null);
        r.M(g05.c, null, writeSettingActivity$l0, 1, null);
        G0 g06 = this.z;
        if(g06 == null) {
            L.S("binding");
            g06 = null;
        }
        L.o(g06.k, "settingWriteReplyHint");
        com.dcinside.app.settings.WriteSettingActivity.m writeSettingActivity$m0 = new com.dcinside.app.settings.WriteSettingActivity.m(this, null);
        r.M(g06.k, null, writeSettingActivity$m0, 1, null);
        G0 g07 = this.z;
        if(g07 == null) {
            L.S("binding");
            g07 = null;
        }
        L.o(g07.f, "settingWritePostAi");
        n writeSettingActivity$n0 = new n(this, null);
        r.M(g07.f, null, writeSettingActivity$n0, 1, null);
        G0 g08 = this.z;
        if(g08 == null) {
            L.S("binding");
            g08 = null;
        }
        L.o(g08.h, "settingWritePostAiSwitch");
        com.dcinside.app.settings.WriteSettingActivity.o writeSettingActivity$o0 = new com.dcinside.app.settings.WriteSettingActivity.o(this, null);
        r.J(g08.h, null, writeSettingActivity$o0, 1, null);
        if(this.getIntent().getBooleanExtra("EXTRA_OPEN_POST_WRITE", false)) {
            this.g2();
        }
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.E.g();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p2(I i0) {
        this.B = i0.c();
        G0 g00 = this.z;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        L.o(g00.j, "settingWritePostHintValue");
        int v = this.n2(i0.c());
        r.o0(g00.j, v);
    }

    private final void q2(P0 p00) {
        this.A = p00;
        G0 g00 = this.z;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        L.o(g00.o, "settingWriteReplyHintValue");
        int v = this.o2(p00);
        r.o0(g00.o, v);
    }

    private final void r2() {
        static final class com.dcinside.app.settings.WriteSettingActivity.f extends N implements Function1 {
            public static final com.dcinside.app.settings.WriteSettingActivity.f e;

            static {
                com.dcinside.app.settings.WriteSettingActivity.f.e = new com.dcinside.app.settings.WriteSettingActivity.f();
            }

            com.dcinside.app.settings.WriteSettingActivity.f() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F1509BB);  // string:setting_write_reply_hint_title "작성중 닉네임 표시"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class h extends N implements Function1 {
            final WriteSettingActivity e;
            final I[] f;

            h(WriteSettingActivity writeSettingActivity0, I[] arr_i) {
                this.e = writeSettingActivity0;
                this.f = arr_i;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.p2(this.f[((int)integer0)]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        String[] arr_s = this.getResources().getStringArray(0x7F03001C);  // array:setting_write_write_hint_items
        L.o(arr_s, "getStringArray(...)");
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.WriteSettingActivity.f.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(g.e, "$tmp0");
            return (Boolean)g.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new h(this, new I[]{I.c, I.d}), "$tmp0");
            new h(this, new I[]{I.c, I.d}).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean s2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t2(Function1 function10, Object object0) [...]

    private final void u2() {
        G0 g00 = this.z;
        G0 g01 = null;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        SwitchCompat switchCompat0 = g00.h;
        G0 g02 = this.z;
        if(g02 == null) {
            L.S("binding");
        }
        else {
            g01 = g02;
        }
        switchCompat0.setChecked(!g01.h.isChecked());
    }

    private final void v2() {
        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F1509BB);  // string:setting_write_reply_hint_title "작성중 닉네임 표시"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class k extends N implements Function1 {
            final WriteSettingActivity e;
            final P0[] f;

            k(WriteSettingActivity writeSettingActivity0, P0[] arr_p0) {
                this.e = writeSettingActivity0;
                this.f = arr_p0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.q2(this.f[((int)integer0)]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        String[] arr_s = this.getResources().getStringArray(0x7F03001B);  // array:setting_write_reply_hint_items
        L.o(arr_s, "getStringArray(...)");
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(i.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(j.e, "$tmp0");
            return (Boolean)j.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new k(this, new P0[]{P0.d, P0.e, P0.c}), "$tmp0");
            new k(this, new P0[]{P0.d, P0.e, P0.c}).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean w2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x2(Function1 function10, Object object0) [...]

    private final void y2() {
        G0 g00 = this.z;
        if(g00 == null) {
            L.S("binding");
            g00 = null;
        }
        this.C = g00.h.isChecked();
    }
}

