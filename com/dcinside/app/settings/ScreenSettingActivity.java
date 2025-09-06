package com.dcinside.app.settings;

import Y.D0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.widget.SwitchCompat;
import com.dcinside.app.perform.e;
import com.dcinside.app.settings.launchericon.LauncherIconSettingActivity;
import com.dcinside.app.settings.theme.ThemeSettingActivity;
import com.dcinside.app.type.J;
import com.dcinside.app.type.P;
import com.dcinside.app.type.g;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nScreenSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenSettingActivity.kt\ncom/dcinside/app/settings/ScreenSettingActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,331:1\n257#2,2:332\n257#2,2:334\n257#2,2:336\n257#2,2:338\n257#2,2:340\n257#2,2:342\n257#2,2:344\n257#2,2:346\n257#2,2:348\n*S KotlinDebug\n*F\n+ 1 ScreenSettingActivity.kt\ncom/dcinside/app/settings/ScreenSettingActivity\n*L\n62#1:332,2\n64#1:334,2\n66#1:336,2\n70#1:338,2\n71#1:340,2\n73#1:342,2\n77#1:344,2\n78#1:346,2\n79#1:348,2\n*E\n"})
public final class ScreenSettingActivity extends c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b implements com.dcinside.app.settings.c.a {
        public final class com.dcinside.app.settings.ScreenSettingActivity.b.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[P.values().length];
                try {
                    arr_v[P.c.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[P.d.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[P.e.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.dcinside.app.settings.ScreenSettingActivity.b.a.a = arr_v;
            }
        }

        @l
        private final Context a;
        private final int b;
        private final int c;
        private final boolean d;
        private final boolean e;
        private final int f;
        @l
        private final J g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final long l;
        @l
        private final P m;

        public b(@l Context context0, int v, int v1, boolean z, boolean z1, int v2, @l J j0, boolean z2, boolean z3, boolean z4, boolean z5, long v3, @l P p0) {
            L.p(context0, "ctx");
            L.p(j0, "splitRatio");
            L.p(p0, "themeMode");
            super();
            this.a = context0;
            this.b = v;
            this.c = v1;
            this.d = z;
            this.e = z1;
            this.f = v2;
            this.g = j0;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
            this.l = v3;
            this.m = p0;
        }

        public final boolean A() {
            return this.h;
        }

        public final boolean B() {
            return this.j;
        }

        public final boolean C() {
            return this.i;
        }

        public final boolean D() {
            return this.k;
        }

        @Override  // com.dcinside.app.settings.c$a
        public boolean a(@l com.dcinside.app.settings.c.a c$a0) {
            L.p(c$a0, "other");
            if(!(c$a0 instanceof b)) {
                return false;
            }
            if(this == c$a0) {
                return false;
            }
            switch(this.m) {
                case 1: {
                    if(this.b != ((b)c$a0).b) {
                        return true;
                    }
                    break;
                }
                case 2: {
                    if(this.c != ((b)c$a0).c) {
                        return true;
                    }
                    break;
                }
                case 3: {
                    if(P.b.h()) {
                        if(this.c != ((b)c$a0).c) {
                            return true;
                        }
                    }
                    else if(this.b != ((b)c$a0).b) {
                        return true;
                    }
                }
            }
            if(this.d != ((b)c$a0).d) {
                return true;
            }
            if(this.g != ((b)c$a0).g) {
                return true;
            }
            if(this.h != ((b)c$a0).h) {
                return true;
            }
            if(this.i != ((b)c$a0).i) {
                return true;
            }
            return this.j == ((b)c$a0).j ? this.l != ((b)c$a0).l : true;
        }

        @l
        public final Context b() {
            return this.a;
        }

        public final boolean c() {
            return this.j;
        }

        public final boolean d() {
            return this.k;
        }

        public final long e() {
            return this.l;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(!L.g(this.a, ((b)object0).a)) {
                return false;
            }
            if(this.b != ((b)object0).b) {
                return false;
            }
            if(this.c != ((b)object0).c) {
                return false;
            }
            if(this.d != ((b)object0).d) {
                return false;
            }
            if(this.e != ((b)object0).e) {
                return false;
            }
            if(this.f != ((b)object0).f) {
                return false;
            }
            if(this.g != ((b)object0).g) {
                return false;
            }
            if(this.h != ((b)object0).h) {
                return false;
            }
            if(this.i != ((b)object0).i) {
                return false;
            }
            if(this.j != ((b)object0).j) {
                return false;
            }
            if(this.k != ((b)object0).k) {
                return false;
            }
            return this.l == ((b)object0).l ? this.m == ((b)object0).m : false;
        }

        @Override  // com.dcinside.app.settings.c$a
        public void f() {
            ll.y0(this.d);
            dl.a.g6(this.b);
            dl.a.f6(this.c);
            dl.a.N5(this.e);
            dl.a.c6(this.f);
            dl.a.T5(this.h);
            long v = dl.a.L0();
            dl.a.S4(v);
            dl.a.D4(this.l);
            dl.a.Y5(this.g.c());
            dl.a.W5(this.i);
            dl.a.V5(this.j);
            dl.a.X5(this.k);
        }

        @l
        public final P g() {
            return this.m;
        }

        public final int h() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return (((((((((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + androidx.compose.foundation.c.a(this.d)) * 0x1F + androidx.compose.foundation.c.a(this.e)) * 0x1F + this.f) * 0x1F + this.g.hashCode()) * 0x1F + androidx.compose.foundation.c.a(this.h)) * 0x1F + androidx.compose.foundation.c.a(this.i)) * 0x1F + androidx.compose.foundation.c.a(this.j)) * 0x1F + androidx.compose.foundation.c.a(this.k)) * 0x1F + ((int)(this.l ^ this.l >>> 0x20))) * 0x1F + this.m.hashCode();
        }

        public final int i() {
            return this.c;
        }

        public final boolean j() {
            return this.d;
        }

        public final boolean k() {
            return this.e;
        }

        public final int l() {
            return this.f;
        }

        @l
        public final J m() {
            return this.g;
        }

        public final boolean n() {
            return this.h;
        }

        public final boolean o() {
            return this.i;
        }

        @l
        public final b p(@l Context context0, int v, int v1, boolean z, boolean z1, int v2, @l J j0, boolean z2, boolean z3, boolean z4, boolean z5, long v3, @l P p0) {
            L.p(context0, "ctx");
            L.p(j0, "splitRatio");
            L.p(p0, "themeMode");
            return new b(context0, v, v1, z, z1, v2, j0, z2, z3, z4, z5, v3, p0);
        }

        public static b q(b screenSettingActivity$b0, Context context0, int v, int v1, boolean z, boolean z1, int v2, J j0, boolean z2, boolean z3, boolean z4, boolean z5, long v3, P p0, int v4, Object object0) {
            Context context1 = (v4 & 1) == 0 ? context0 : screenSettingActivity$b0.a;
            int v5 = (v4 & 2) == 0 ? v : screenSettingActivity$b0.b;
            int v6 = (v4 & 4) == 0 ? v1 : screenSettingActivity$b0.c;
            boolean z6 = (v4 & 8) == 0 ? z : screenSettingActivity$b0.d;
            boolean z7 = (v4 & 16) == 0 ? z1 : screenSettingActivity$b0.e;
            int v7 = (v4 & 0x20) == 0 ? v2 : screenSettingActivity$b0.f;
            J j1 = (v4 & 0x40) == 0 ? j0 : screenSettingActivity$b0.g;
            boolean z8 = (v4 & 0x80) == 0 ? z2 : screenSettingActivity$b0.h;
            boolean z9 = (v4 & 0x100) == 0 ? z3 : screenSettingActivity$b0.i;
            boolean z10 = (v4 & 0x200) == 0 ? z4 : screenSettingActivity$b0.j;
            boolean z11 = (v4 & 0x400) == 0 ? z5 : screenSettingActivity$b0.k;
            long v8 = (v4 & 0x800) == 0 ? v3 : screenSettingActivity$b0.l;
            return (v4 & 0x1000) == 0 ? screenSettingActivity$b0.p(context1, v5, v6, z6, z7, v7, j1, z8, z9, z10, z11, v8, p0) : screenSettingActivity$b0.p(context1, v5, v6, z6, z7, v7, j1, z8, z9, z10, z11, v8, screenSettingActivity$b0.m);
        }

        @l
        public final Context r() {
            return this.a;
        }

        public final long s() {
            return this.l;
        }

        public final boolean t() {
            return this.e;
        }

        @Override
        @l
        public String toString() {
            return "InitialValue(ctx=" + this.a + ", themeLightIndex=" + this.b + ", themeDarkIndex=" + this.c + ", statusBarEnable=" + this.d + ", settingSlideEnable=" + this.e + ", swipeSensitivity=" + this.f + ", splitRatio=" + this.g + ", isSplitModeEnable=" + this.h + ", isSplitModePortraitEnable=" + this.i + ", isSplitModeLandscapeEnable=" + this.j + ", isSplitPostFullEnable=" + this.k + ", launcherIcon=" + this.l + ", themeMode=" + this.m + ")";
        }

        @l
        public final J u() {
            return this.g;
        }

        public final boolean v() {
            return this.d;
        }

        public final int w() {
            return this.f;
        }

        public final int x() {
            return this.c;
        }

        public final int y() {
            return this.b;
        }

        @l
        public final P z() {
            return this.m;
        }
    }

    private int A;
    private int B;
    private long C;
    @l
    private P D;
    private b E;
    private D0 F;
    @m
    private ActivityResultLauncher G;
    @m
    private ActivityResultLauncher H;
    @l
    private final com.dcinside.app.settings.ScreenSettingActivity.c I;
    @l
    public static final a J = null;
    @l
    public static final String K = "EXTRA_SETTING_THEME_SYSTEM_DIRECT";
    @l
    private static final String L = "EXTRA_SETTING_THEME_LIGHT_INDEX";
    @l
    private static final String M = "EXTRA_SETTING_THEME_DARK_INDEX";
    @l
    private static final String N = "EXTRA_SETTING_SPLIT_RATIO";
    @l
    private static final String O = "EXTRA_SETTING_LAUNCHER_ICON";
    @l
    private J z;

    static {
        ScreenSettingActivity.J = new a(null);
    }

    public ScreenSettingActivity() {
        public static final class com.dcinside.app.settings.ScreenSettingActivity.c extends OnBackPressedCallback {
            final ScreenSettingActivity d;

            com.dcinside.app.settings.ScreenSettingActivity.c(ScreenSettingActivity screenSettingActivity0) {
                this.d = screenSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.Q1();
            }
        }

        super(null, 1, null);
        int v = dl.a.i2();
        this.z = J.b.a(v);
        this.A = dl.a.s2();
        this.B = dl.a.r2();
        this.C = dl.a.L0();
        this.D = dl.a.t2();
        this.I = new com.dcinside.app.settings.ScreenSettingActivity.c(this);
    }

    // 检测为 Lambda 实现
    private static final void A2(ScreenSettingActivity screenSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    private final void B2(ActivityResult activityResult0) {
        D0 d00 = null;
        Intent intent0 = activityResult0.a();
        if(activityResult0.c() == -1 && intent0 != null) {
            if(intent0.getBooleanExtra("com.dcinside.app.extra.DARK", false)) {
                int v = intent0.getIntExtra("com.dcinside.app.extra.THEME", 6);
                this.B = v;
                g g0 = g.a.c(v);
                D0 d01 = this.F;
                if(d01 == null) {
                    L.S("binding");
                }
                else {
                    d00 = d01;
                }
                int v1 = g0.f();
                d00.c.setImageResource(v1);
                if(!dl.a.q2().m()) {
                    Dl.E(this, 0x7F150A39, 1);  // string:theme_setting_must_be_a_dark_mode "변경된 테마색은 야간 모드 ON 시 적용할 수 있습니다."
                }
            }
            else {
                int v2 = intent0.getIntExtra("com.dcinside.app.extra.THEME", 0);
                this.A = v2;
                g g1 = g.a.c(v2);
                D0 d02 = this.F;
                if(d02 == null) {
                    L.S("binding");
                }
                else {
                    d00 = d02;
                }
                int v3 = g1.f();
                d00.y.setImageResource(v3);
                if(dl.a.q2().m()) {
                    Dl.E(this, 0x7F150A3A, 1);  // string:theme_setting_must_be_a_light_mode "변경된 테마색은 야간 모드 OFF 시 적용할 수 있습니다."
                }
            }
        }
    }

    private final void C2() {
        static final class o extends N implements Function1 {
            public static final o e;

            static {
                o.e = new o();
            }

            o() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F1508FD);  // string:screen_setting_theme_mode_title "야간 모드"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class p extends N implements Function1 {
            public static final p e;

            static {
                p.e = new p();
            }

            p() {
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


        static final class q extends N implements Function1 {
            final ScreenSettingActivity e;

            q(ScreenSettingActivity screenSettingActivity0) {
                this.e = screenSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                int v;
                if(integer0 != null && ((int)integer0) == 0) {
                    v = P.e.d();
                }
                else if(integer0 == null || ((int)integer0) != 1) {
                    v = integer0 == null || ((int)integer0) != 2 ? P.c.d() : P.c.d();
                }
                else {
                    v = P.d.d();
                }
                com.dcinside.app.type.P.a p$a0 = P.b;
                P p0 = p$a0.o(v);
                this.e.D = p0;
                D0 d00 = this.e.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                String s = this.e.D.c(this.e);
                d00.A.setText(s);
                p$a0.i(this.e.D);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a e$a0 = e.e.a(this).n(o.e);
        String[] arr_s = this.getResources().getStringArray(0x7F030016);  // array:screen_setting_night_mode_items
        L.o(arr_s, "getStringArray(...)");
        com.dcinside.app.perform.e.a.w(e$a0, arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(p.e, "$tmp0");
            return (Boolean)p.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new q(this), "$tmp0");
            new q(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean D2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void E2(Function1 function10, Object object0) [...]

    private final void F2() {
        static final class r extends N implements Function1 {
            public static final r e;

            static {
                r.e = new r();
            }

            r() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F1508F3);  // string:screen_setting_split_ratio_title "분할 비율"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class s extends N implements Function1 {
            public static final s e;

            static {
                s.e = new s();
            }

            s() {
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


        static final class t extends N implements Function1 {
            final ScreenSettingActivity e;

            t(ScreenSettingActivity screenSettingActivity0) {
                this.e = screenSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                J j0 = J.b.a(((int)integer0));
                this.e.z = j0;
                D0 d00 = this.e.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                String s = this.e.z.d(this.e);
                d00.q.setText(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a e$a0 = e.e.a(this).n(r.e);
        String[] arr_s = this.getResources().getStringArray(0x7F030017);  // array:screen_setting_split_ratio_items
        L.o(arr_s, "getStringArray(...)");
        com.dcinside.app.perform.e.a.w(e$a0, arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(s.e, "$tmp0");
            return (Boolean)s.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new t(this), "$tmp0");
            new t(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean G2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.settings.c
    public void S1() {
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a T1() {
        int v = this.A;
        int v1 = this.B;
        D0 d00 = this.F;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        boolean z = d00.s.isChecked();
        D0 d01 = this.F;
        if(d01 == null) {
            L.S("binding");
            d01 = null;
        }
        boolean z1 = d01.i.isChecked();
        D0 d02 = this.F;
        if(d02 == null) {
            L.S("binding");
            d02 = null;
        }
        int v2 = d02.v.getProgress();
        J j0 = this.z;
        D0 d03 = this.F;
        if(d03 == null) {
            L.S("binding");
            d03 = null;
        }
        boolean z2 = d03.k.isChecked();
        D0 d04 = this.F;
        if(d04 == null) {
            L.S("binding");
            d04 = null;
        }
        boolean z3 = d04.o.isChecked();
        D0 d05 = this.F;
        if(d05 == null) {
            L.S("binding");
            d05 = null;
        }
        boolean z4 = d05.m.isChecked();
        D0 d06 = this.F;
        if(d06 == null) {
            L.S("binding");
            throw new NullPointerException();
        }
        return new b(this, v, v1, z, z1, v2, j0, z2, z3, z4, d06.g.isChecked(), this.C, this.D);
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a V1() {
        com.dcinside.app.settings.c.a c$a0 = this.E;
        if(c$a0 == null) {
            L.S("initialValue");
            return null;
        }
        return c$a0;
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$10", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            d(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new d(this.l, d0).invokeSuspend(S0.a);
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                d00.g.toggle();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$11", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ScreenSettingActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            com.dcinside.app.settings.ScreenSettingActivity.e(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ScreenSettingActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                d00.s.toggle();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$12", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ScreenSettingActivity.f extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            com.dcinside.app.settings.ScreenSettingActivity.f(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ScreenSettingActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                d00.i.toggle();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$13", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ScreenSettingActivity.g extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            com.dcinside.app.settings.ScreenSettingActivity.g(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ScreenSettingActivity.g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v2(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$14", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            h(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v2(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$15", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            i(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
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
                this.l.C2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$16", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            j(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
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
                this.l.t2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$4", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            k(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
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
                this.l.F2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$5", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nScreenSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenSettingActivity.kt\ncom/dcinside/app/settings/ScreenSettingActivity$onCreate$5\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,331:1\n255#2:332\n*S KotlinDebug\n*F\n+ 1 ScreenSettingActivity.kt\ncom/dcinside/app/settings/ScreenSettingActivity$onCreate$5\n*L\n110#1:332\n*E\n"})
        static final class com.dcinside.app.settings.ScreenSettingActivity.l extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            com.dcinside.app.settings.ScreenSettingActivity.l(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ScreenSettingActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                SwitchCompat switchCompat0 = d00.k;
                L.o(switchCompat0, "screenSettingSplitEnable");
                if(switchCompat0.getVisibility() == 0) {
                    switchCompat0.toggle();
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$6", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ScreenSettingActivity.m extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            com.dcinside.app.settings.ScreenSettingActivity.m(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ScreenSettingActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                d00.o.toggle();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.ScreenSettingActivity$onCreate$8", f = "ScreenSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final ScreenSettingActivity l;

            n(ScreenSettingActivity screenSettingActivity0, kotlin.coroutines.d d0) {
                this.l = screenSettingActivity0;
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
                D0 d00 = this.l.F;
                if(d00 == null) {
                    L.S("binding");
                    d00 = null;
                }
                d00.m.toggle();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.G = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "it");
            this.B2(activityResult0);
        });
        this.H = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "it");
            this.w2(activityResult0);
        });
        this.getOnBackPressedDispatcher().h(this.I);
        D0 d00 = D0.c(this.getLayoutInflater());
        L.o(d00, "inflate(...)");
        this.F = d00;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        this.setContentView(d00.b());
        D0 d01 = this.F;
        if(d01 == null) {
            L.S("binding");
            d01 = null;
        }
        this.S0(d01.B);
        kr.bhbfhfb.designcompat.a.d(this);
        Al al0 = Al.a;
        if(al0.i(this)) {
            D0 d02 = this.F;
            if(d02 == null) {
                L.S("binding");
                d02 = null;
            }
            L.o(d02.j, "screenSettingSplit");
            d02.j.setVisibility(0);
            D0 d03 = this.F;
            if(d03 == null) {
                L.S("binding");
                d03 = null;
            }
            dl dl0 = dl.a;
            boolean z = dl0.S2();
            d03.k.setChecked(z);
            D0 d04 = this.F;
            if(d04 == null) {
                L.S("binding");
                d04 = null;
            }
            L.o(d04.p, "screenSettingSplitRatio");
            int v = al0.k(this) ? 0 : 8;
            d04.p.setVisibility(v);
            D0 d05 = this.F;
            if(d05 == null) {
                L.S("binding");
                d05 = null;
            }
            String s = this.z.d(this);
            d05.q.setText(s);
            D0 d06 = this.F;
            if(d06 == null) {
                L.S("binding");
                d06 = null;
            }
            L.o(d06.f, "screenSettingPostFull");
            d06.f.setVisibility(0);
            D0 d07 = this.F;
            if(d07 == null) {
                L.S("binding");
                d07 = null;
            }
            boolean z1 = dl0.W2();
            d07.g.setChecked(z1);
            if(al0.j(this)) {
                D0 d08 = this.F;
                if(d08 == null) {
                    L.S("binding");
                    d08 = null;
                }
                L.o(d08.k, "screenSettingSplitEnable");
                d08.k.setVisibility(8);
                D0 d09 = this.F;
                if(d09 == null) {
                    L.S("binding");
                    d09 = null;
                }
                L.o(d09.n, "screenSettingSplitPortrait");
                d09.n.setVisibility(0);
                D0 d010 = this.F;
                if(d010 == null) {
                    L.S("binding");
                    d010 = null;
                }
                boolean z2 = dl0.V2();
                d010.o.setChecked(z2);
                D0 d011 = this.F;
                if(d011 == null) {
                    L.S("binding");
                    d011 = null;
                }
                L.o(d011.l, "screenSettingSplitLandscape");
                d011.l.setVisibility(0);
                D0 d012 = this.F;
                if(d012 == null) {
                    L.S("binding");
                    d012 = null;
                }
                boolean z3 = dl0.U2();
                d012.m.setChecked(z3);
            }
        }
        else {
            D0 d013 = this.F;
            if(d013 == null) {
                L.S("binding");
                d013 = null;
            }
            L.o(d013.j, "screenSettingSplit");
            d013.j.setVisibility(8);
            D0 d014 = this.F;
            if(d014 == null) {
                L.S("binding");
                d014 = null;
            }
            L.o(d014.p, "screenSettingSplitRatio");
            d014.p.setVisibility(8);
            D0 d015 = this.F;
            if(d015 == null) {
                L.S("binding");
                d015 = null;
            }
            L.o(d015.f, "screenSettingPostFull");
            d015.f.setVisibility(8);
        }
        D0 d016 = this.F;
        if(d016 == null) {
            L.S("binding");
            d016 = null;
        }
        String s1 = this.D.c(this);
        d016.A.setText(s1);
        D0 d017 = this.F;
        if(d017 == null) {
            L.S("binding");
            d017 = null;
        }
        boolean z4 = ll.x();
        d017.s.setChecked(z4);
        D0 d018 = this.F;
        if(d018 == null) {
            L.S("binding");
            d018 = null;
        }
        dl dl1 = dl.a;
        boolean z5 = dl1.b2();
        d018.i.setChecked(z5);
        D0 d019 = this.F;
        if(d019 == null) {
            L.S("binding");
            d019 = null;
        }
        int v1 = dl1.n2();
        d019.v.setProgress(v1);
        V v2 = this.u2();
        int v3 = ((Number)v2.a()).intValue();
        int v4 = ((Number)v2.b()).intValue();
        D0 d020 = this.F;
        if(d020 == null) {
            L.S("binding");
            d020 = null;
        }
        d020.y.setImageResource(v3);
        D0 d021 = this.F;
        if(d021 == null) {
            L.S("binding");
            d021 = null;
        }
        d021.c.setImageResource(v4);
        D0 d022 = this.F;
        if(d022 == null) {
            L.S("binding");
            d022 = null;
        }
        this.b2(d022.e);
        com.dcinside.app.settings.c.a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.settings.ScreenSettingActivity.InitialValue");
        this.E = (b)c$a0;
        if(bundle0 != null) {
            this.A = bundle0.getInt("EXTRA_SETTING_THEME_LIGHT_INDEX");
            this.B = bundle0.getInt("EXTRA_SETTING_THEME_DARK_INDEX");
            int v5 = bundle0.getInt("EXTRA_SETTING_SPLIT_RATIO");
            this.z = J.b.a(v5);
            this.C = bundle0.getLong("EXTRA_SETTING_LAUNCHER_ICON");
            D0 d023 = this.F;
            if(d023 == null) {
                L.S("binding");
                d023 = null;
            }
            String s2 = this.z.d(this);
            d023.q.setText(s2);
            com.dcinside.app.type.g.a g$a0 = g.a;
            g g0 = g$a0.c(this.A);
            D0 d024 = this.F;
            if(d024 == null) {
                L.S("binding");
                d024 = null;
            }
            int v6 = g0.f();
            d024.y.setImageResource(v6);
            g g1 = g$a0.c(this.B);
            D0 d025 = this.F;
            if(d025 == null) {
                L.S("binding");
                d025 = null;
            }
            int v7 = g1.f();
            d025.c.setImageResource(v7);
        }
        D0 d026 = this.F;
        if(d026 == null) {
            L.S("binding");
            d026 = null;
        }
        L.o(d026.p, "screenSettingSplitRatio");
        k screenSettingActivity$k0 = new k(this, null);
        com.dcinside.app.internal.r.M(d026.p, null, screenSettingActivity$k0, 1, null);
        D0 d027 = this.F;
        if(d027 == null) {
            L.S("binding");
            d027 = null;
        }
        L.o(d027.j, "screenSettingSplit");
        com.dcinside.app.settings.ScreenSettingActivity.l screenSettingActivity$l0 = new com.dcinside.app.settings.ScreenSettingActivity.l(this, null);
        com.dcinside.app.internal.r.M(d027.j, null, screenSettingActivity$l0, 1, null);
        D0 d028 = this.F;
        if(d028 == null) {
            L.S("binding");
            d028 = null;
        }
        L.o(d028.n, "screenSettingSplitPortrait");
        com.dcinside.app.settings.ScreenSettingActivity.m screenSettingActivity$m0 = new com.dcinside.app.settings.ScreenSettingActivity.m(this, null);
        com.dcinside.app.internal.r.M(d028.n, null, screenSettingActivity$m0, 1, null);
        D0 d029 = this.F;
        if(d029 == null) {
            L.S("binding");
            d029 = null;
        }
        com.dcinside.app.settings.V v8 = (CompoundButton compoundButton0, boolean z) -> {
            boolean z1;
            L.p(this, "this$0");
            D0 d00 = this.F;
            D0 d01 = null;
            if(d00 == null) {
                L.S("binding");
                d00 = null;
            }
            SwitchCompat switchCompat0 = d00.k;
            if(z) {
                z1 = true;
            }
            else {
                D0 d02 = this.F;
                if(d02 == null) {
                    L.S("binding");
                }
                else {
                    d01 = d02;
                }
                z1 = d01.m.isChecked();
            }
            switchCompat0.setChecked(z1);
        };
        d029.o.setOnCheckedChangeListener(v8);
        D0 d030 = this.F;
        if(d030 == null) {
            L.S("binding");
            d030 = null;
        }
        L.o(d030.l, "screenSettingSplitLandscape");
        n screenSettingActivity$n0 = new n(this, null);
        com.dcinside.app.internal.r.M(d030.l, null, screenSettingActivity$n0, 1, null);
        D0 d031 = this.F;
        if(d031 == null) {
            L.S("binding");
            d031 = null;
        }
        W w0 = (CompoundButton compoundButton0, boolean z) -> {
            boolean z1;
            L.p(this, "this$0");
            D0 d00 = this.F;
            D0 d01 = null;
            if(d00 == null) {
                L.S("binding");
                d00 = null;
            }
            SwitchCompat switchCompat0 = d00.k;
            if(z) {
                z1 = true;
            }
            else {
                D0 d02 = this.F;
                if(d02 == null) {
                    L.S("binding");
                }
                else {
                    d01 = d02;
                }
                z1 = d01.m.isChecked();
            }
            switchCompat0.setChecked(z1);
        };
        d031.m.setOnCheckedChangeListener(w0);
        D0 d032 = this.F;
        if(d032 == null) {
            L.S("binding");
            d032 = null;
        }
        L.o(d032.f, "screenSettingPostFull");
        d screenSettingActivity$d0 = new d(this, null);
        com.dcinside.app.internal.r.M(d032.f, null, screenSettingActivity$d0, 1, null);
        D0 d033 = this.F;
        if(d033 == null) {
            L.S("binding");
            d033 = null;
        }
        L.o(d033.r, "screenSettingStatus");
        com.dcinside.app.settings.ScreenSettingActivity.e screenSettingActivity$e0 = new com.dcinside.app.settings.ScreenSettingActivity.e(this, null);
        com.dcinside.app.internal.r.M(d033.r, null, screenSettingActivity$e0, 1, null);
        D0 d034 = this.F;
        if(d034 == null) {
            L.S("binding");
            d034 = null;
        }
        L.o(d034.h, "screenSettingSlide");
        com.dcinside.app.settings.ScreenSettingActivity.f screenSettingActivity$f0 = new com.dcinside.app.settings.ScreenSettingActivity.f(this, null);
        com.dcinside.app.internal.r.M(d034.h, null, screenSettingActivity$f0, 1, null);
        D0 d035 = this.F;
        if(d035 == null) {
            L.S("binding");
            d035 = null;
        }
        L.o(d035.x, "screenSettingTheme");
        com.dcinside.app.settings.ScreenSettingActivity.g screenSettingActivity$g0 = new com.dcinside.app.settings.ScreenSettingActivity.g(this, null);
        com.dcinside.app.internal.r.M(d035.x, null, screenSettingActivity$g0, 1, null);
        D0 d036 = this.F;
        if(d036 == null) {
            L.S("binding");
            d036 = null;
        }
        L.o(d036.b, "screenSettingDarkTheme");
        h screenSettingActivity$h0 = new h(this, null);
        com.dcinside.app.internal.r.M(d036.b, null, screenSettingActivity$h0, 1, null);
        D0 d037 = this.F;
        if(d037 == null) {
            L.S("binding");
            d037 = null;
        }
        L.o(d037.z, "screenSettingThemeMode");
        i screenSettingActivity$i0 = new i(this, null);
        com.dcinside.app.internal.r.M(d037.z, null, screenSettingActivity$i0, 1, null);
        D0 d038 = this.F;
        if(d038 == null) {
            L.S("binding");
            d038 = null;
        }
        L.o(d038.d, "screenSettingLauncherIcon");
        j screenSettingActivity$j0 = new j(this, null);
        com.dcinside.app.internal.r.M(d038.d, null, screenSettingActivity$j0, 1, null);
        if(this.getIntent().getBooleanExtra("EXTRA_SETTING_THEME_SYSTEM_DIRECT", false)) {
            this.C2();
            this.getIntent().putExtra("EXTRA_SETTING_THEME_SYSTEM_DIRECT", false);
        }
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

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("EXTRA_SETTING_THEME_LIGHT_INDEX", this.A);
        bundle0.putInt("EXTRA_SETTING_THEME_DARK_INDEX", this.B);
        bundle0.putInt("EXTRA_SETTING_SPLIT_RATIO", this.z.c());
        bundle0.putLong("EXTRA_SETTING_LAUNCHER_ICON", this.C);
    }

    private final void t2() {
        Intent intent0 = new Intent(this, LauncherIconSettingActivity.class);
        intent0.putExtra("com.dcinside.app.extra.LAUNCHER_ICON_ID", this.C);
        ActivityResultLauncher activityResultLauncher0 = this.H;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    private final V u2() {
        return r0.a(g.a.c(this.A).f(), g.a.c(this.B).f());
    }

    private final void v2(boolean z) {
        Intent intent0 = new Intent(this, ThemeSettingActivity.class);
        intent0.putExtra("com.dcinside.app.extra.DARK", z);
        ActivityResultLauncher activityResultLauncher0 = this.G;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    private final void w2(ActivityResult activityResult0) {
        Intent intent0 = activityResult0.a();
        if(activityResult0.c() == -1 && intent0 != null) {
            long v = intent0.getLongExtra("com.dcinside.app.extra.LAUNCHER_ICON_ID", 0L);
            dl dl0 = dl.a;
            if(dl0.L0() != v) {
                this.C = v;
                this.a2(true);
                return;
            }
            this.C = dl0.L0();
            this.a2(false);
        }
    }

    // 检测为 Lambda 实现
    private static final void x2(ScreenSettingActivity screenSettingActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void y2(ScreenSettingActivity screenSettingActivity0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void z2(ScreenSettingActivity screenSettingActivity0, CompoundButton compoundButton0, boolean z) [...]
}

