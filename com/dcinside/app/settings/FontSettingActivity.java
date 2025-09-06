package com.dcinside.app.settings;

import A3.p;
import Y.p0;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.j;
import com.dcinside.app.type.k;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nFontSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontSettingActivity.kt\ncom/dcinside/app/settings/FontSettingActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n11102#2:197\n11437#2,3:198\n11102#2:203\n11437#2,3:204\n11102#2:209\n11437#2,3:210\n37#3,2:201\n37#3,2:207\n37#3,2:213\n*S KotlinDebug\n*F\n+ 1 FontSettingActivity.kt\ncom/dcinside/app/settings/FontSettingActivity\n*L\n125#1:197\n125#1:198,3\n140#1:203\n140#1:204,3\n155#1:209\n155#1:210,3\n126#1:201,2\n141#1:207,2\n156#1:213,2\n*E\n"})
public final class FontSettingActivity extends c {
    static final class a implements com.dcinside.app.settings.c.a {
        @l
        private final Context a;
        private final boolean b;
        @l
        private final j c;
        @l
        private final j d;
        @l
        private final k e;

        public a(@l Context context0, boolean z, @l j j0, @l j j1, @l k k0) {
            L.p(context0, "ctx");
            L.p(j0, "replyTextSize");
            L.p(j1, "listTextSize");
            L.p(k0, "readTextSize");
            super();
            this.a = context0;
            this.b = z;
            this.c = j0;
            this.d = j1;
            this.e = k0;
        }

        @Override  // com.dcinside.app.settings.c$a
        public boolean a(@l com.dcinside.app.settings.c.a c$a0) {
            L.p(c$a0, "other");
            if(!(c$a0 instanceof a)) {
                return false;
            }
            if(this == c$a0) {
                return false;
            }
            if(this.b != ((a)c$a0).b) {
                return true;
            }
            if(this.d != ((a)c$a0).d) {
                return true;
            }
            return this.c == ((a)c$a0).c ? this.e != ((a)c$a0).e : true;
        }

        @l
        public final Context b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        @l
        public final j d() {
            return this.c;
        }

        @l
        public final j e() {
            return this.d;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(!L.g(this.a, ((a)object0).a)) {
                return false;
            }
            if(this.b != ((a)object0).b) {
                return false;
            }
            if(this.c != ((a)object0).c) {
                return false;
            }
            return this.d == ((a)object0).d ? this.e == ((a)object0).e : false;
        }

        @Override  // com.dcinside.app.settings.c$a
        public void f() {
            dl.a.V3(this.b);
            dl.a.H5(this.c);
            dl.a.I4(this.d);
            dl.a.z5(this.e);
        }

        @l
        public final k g() {
            return this.e;
        }

        @l
        public final a h(@l Context context0, boolean z, @l j j0, @l j j1, @l k k0) {
            L.p(context0, "ctx");
            L.p(j0, "replyTextSize");
            L.p(j1, "listTextSize");
            L.p(k0, "readTextSize");
            return new a(context0, z, j0, j1, k0);
        }

        @Override
        public int hashCode() {
            return (((this.a.hashCode() * 0x1F + androidx.compose.foundation.c.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        }

        public static a i(a fontSettingActivity$a0, Context context0, boolean z, j j0, j j1, k k0, int v, Object object0) {
            if((v & 1) != 0) {
                context0 = fontSettingActivity$a0.a;
            }
            if((v & 2) != 0) {
                z = fontSettingActivity$a0.b;
            }
            if((v & 4) != 0) {
                j0 = fontSettingActivity$a0.c;
            }
            if((v & 8) != 0) {
                j1 = fontSettingActivity$a0.d;
            }
            if((v & 16) != 0) {
                k0 = fontSettingActivity$a0.e;
            }
            return fontSettingActivity$a0.h(context0, z, j0, j1, k0);
        }

        @l
        public final Context j() {
            return this.a;
        }

        public final boolean k() {
            return this.b;
        }

        @l
        public final j l() {
            return this.d;
        }

        @l
        public final k m() {
            return this.e;
        }

        @l
        public final j n() {
            return this.c;
        }

        @Override
        @l
        public String toString() {
            return "InitialValue(ctx=" + this.a + ", fixReadTextSize=" + this.b + ", replyTextSize=" + this.c + ", listTextSize=" + this.d + ", readTextSize=" + this.e + ")";
        }
    }

    @l
    private j A;
    @l
    private k B;
    private a C;
    private p0 D;
    @l
    private final b E;
    @l
    private j z;

    public FontSettingActivity() {
        public static final class b extends OnBackPressedCallback {
            final FontSettingActivity d;

            b(FontSettingActivity fontSettingActivity0) {
                this.d = fontSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.Q1();
            }
        }

        super(null, 1, null);
        this.z = dl.a.V1();
        this.A = dl.a.Q0();
        this.B = dl.a.M1();
        this.E = new b(this);
    }

    // 检测为 Lambda 实现
    private static final void A2(Function1 function10, Object object0) [...]

    private final void B2(int v) {
        j j0;
        try {
            j0 = j.values()[v];
        }
        catch(Exception unused_ex) {
            j0 = j.h;
        }
        this.z = j0;
        p0 p00 = this.D;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        String s = this.z.e(this);
        p00.o.setText(s);
    }

    @Override  // com.dcinside.app.settings.c
    public void S1() {
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a T1() {
        p0 p00 = this.D;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        return new a(this, p00.d.isChecked(), this.z, this.A, this.B);
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a V1() {
        com.dcinside.app.settings.c.a c$a0 = this.C;
        if(c$a0 == null) {
            L.S("initialValue");
            return null;
        }
        return c$a0;
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.FontSettingActivity$onCreate$1", f = "FontSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.FontSettingActivity.c extends o implements p {
            int k;
            final FontSettingActivity l;

            com.dcinside.app.settings.FontSettingActivity.c(FontSettingActivity fontSettingActivity0, d d0) {
                this.l = fontSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.FontSettingActivity.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.FontSettingActivity$onCreate$2", f = "FontSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.FontSettingActivity.d extends o implements p {
            int k;
            final FontSettingActivity l;

            com.dcinside.app.settings.FontSettingActivity.d(FontSettingActivity fontSettingActivity0, d d0) {
                this.l = fontSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.FontSettingActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.q2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.FontSettingActivity$onCreate$3", f = "FontSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final FontSettingActivity l;

            e(FontSettingActivity fontSettingActivity0, d d0) {
                this.l = fontSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.u2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.FontSettingActivity$onCreate$4", f = "FontSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.FontSettingActivity.f extends o implements p {
            int k;
            final FontSettingActivity l;

            com.dcinside.app.settings.FontSettingActivity.f(FontSettingActivity fontSettingActivity0, d d0) {
                this.l = fontSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.FontSettingActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.getOnBackPressedDispatcher().h(this.E);
        p0 p00 = p0.c(this.getLayoutInflater());
        L.o(p00, "inflate(...)");
        this.D = p00;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        this.setContentView(p00.b());
        p0 p01 = this.D;
        if(p01 == null) {
            L.S("binding");
            p01 = null;
        }
        this.S0(p01.p);
        kr.bhbfhfb.designcompat.a.d(this);
        p0 p02 = this.D;
        if(p02 == null) {
            L.S("binding");
            p02 = null;
        }
        String s = this.z.e(this);
        p02.o.setText(s);
        p0 p03 = this.D;
        if(p03 == null) {
            L.S("binding");
            p03 = null;
        }
        String s1 = this.A.e(this);
        p03.h.setText(s1);
        p0 p04 = this.D;
        if(p04 == null) {
            L.S("binding");
            p04 = null;
        }
        String s2 = this.B.d(this);
        p04.l.setText(s2);
        p0 p05 = this.D;
        if(p05 == null) {
            L.S("binding");
            p05 = null;
        }
        boolean z = dl.a.d0();
        p05.d.setChecked(z);
        p0 p06 = this.D;
        if(p06 == null) {
            L.S("binding");
            p06 = null;
        }
        this.b2(p06.i);
        com.dcinside.app.settings.c.a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.settings.FontSettingActivity.InitialValue");
        this.C = (a)c$a0;
        p0 p07 = this.D;
        if(p07 == null) {
            L.S("binding");
            p07 = null;
        }
        L.o(p07.m, "settingFontReplyTextSize");
        com.dcinside.app.settings.FontSettingActivity.c fontSettingActivity$c0 = new com.dcinside.app.settings.FontSettingActivity.c(this, null);
        r.M(p07.m, null, fontSettingActivity$c0, 1, null);
        p0 p08 = this.D;
        if(p08 == null) {
            L.S("binding");
            p08 = null;
        }
        L.o(p08.f, "settingFontListTextSize");
        com.dcinside.app.settings.FontSettingActivity.d fontSettingActivity$d0 = new com.dcinside.app.settings.FontSettingActivity.d(this, null);
        r.M(p08.f, null, fontSettingActivity$d0, 1, null);
        p0 p09 = this.D;
        if(p09 == null) {
            L.S("binding");
            p09 = null;
        }
        L.o(p09.j, "settingFontReadTextSize");
        e fontSettingActivity$e0 = new e(this, null);
        r.M(p09.j, null, fontSettingActivity$e0, 1, null);
        p0 p010 = this.D;
        if(p010 == null) {
            L.S("binding");
            p010 = null;
        }
        L.o(p010.b, "settingFontFixReadTextSize");
        com.dcinside.app.settings.FontSettingActivity.f fontSettingActivity$f0 = new com.dcinside.app.settings.FontSettingActivity.f(this, null);
        r.M(p010.b, null, fontSettingActivity$f0, 1, null);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p2() {
        p0 p00 = this.D;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        L.o(p00.d, "settingFontFixReadTextSizeSwitch");
        boolean z = p00.d.isChecked();
        p00.d.setChecked(!z);
    }

    private final void q2() {
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
            final FontSettingActivity e;

            h(FontSettingActivity fontSettingActivity0) {
                this.e = fontSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.t2(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        j[] arr_j = j.values();
        ArrayList arrayList0 = new ArrayList(arr_j.length);
        for(int v = 0; v < arr_j.length; ++v) {
            arrayList0.add(arr_j[v].e(this));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).m(), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(g.e, "$tmp0");
            return (Boolean)g.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean r2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s2(Function1 function10, Object object0) [...]

    private final void t2(int v) {
        j j0;
        try {
            j0 = j.values()[v];
        }
        catch(Exception unused_ex) {
            j0 = j.h;
        }
        this.A = j0;
        p0 p00 = this.D;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        String s = this.A.e(this);
        p00.h.setText(s);
    }

    private final void u2() {
        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
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


        static final class com.dcinside.app.settings.FontSettingActivity.j extends N implements Function1 {
            final FontSettingActivity e;

            com.dcinside.app.settings.FontSettingActivity.j(FontSettingActivity fontSettingActivity0) {
                this.e = fontSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.x2(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        k[] arr_k = k.values();
        ArrayList arrayList0 = new ArrayList(arr_k.length);
        for(int v = 0; v < arr_k.length; ++v) {
            arrayList0.add(arr_k[v].d(this));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).m(), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(i.e, "$tmp0");
            return (Boolean)i.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.FontSettingActivity.j(this), "$tmp0");
            new com.dcinside.app.settings.FontSettingActivity.j(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean v2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w2(Function1 function10, Object object0) [...]

    private final void x2(int v) {
        k k0;
        try {
            k0 = k.values()[v];
        }
        catch(Exception unused_ex) {
            k0 = k.g;
        }
        this.B = k0;
        p0 p00 = this.D;
        if(p00 == null) {
            L.S("binding");
            p00 = null;
        }
        String s = this.B.d(this);
        p00.l.setText(s);
    }

    private final void y2() {
        static final class com.dcinside.app.settings.FontSettingActivity.k extends N implements Function1 {
            public static final com.dcinside.app.settings.FontSettingActivity.k e;

            static {
                com.dcinside.app.settings.FontSettingActivity.k.e = new com.dcinside.app.settings.FontSettingActivity.k();
            }

            com.dcinside.app.settings.FontSettingActivity.k() {
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


        static final class com.dcinside.app.settings.FontSettingActivity.l extends N implements Function1 {
            final FontSettingActivity e;

            com.dcinside.app.settings.FontSettingActivity.l(FontSettingActivity fontSettingActivity0) {
                this.e = fontSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.B2(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        j[] arr_j = j.values();
        ArrayList arrayList0 = new ArrayList(arr_j.length);
        for(int v = 0; v < arr_j.length; ++v) {
            arrayList0.add(arr_j[v].e(this));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).m(), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(com.dcinside.app.settings.FontSettingActivity.k.e, "$tmp0");
            return (Boolean)com.dcinside.app.settings.FontSettingActivity.k.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.FontSettingActivity.l(this), "$tmp0");
            new com.dcinside.app.settings.FontSettingActivity.l(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean z2(Function1 function10, Object object0) [...]
}

