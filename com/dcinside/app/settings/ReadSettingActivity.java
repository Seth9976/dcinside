package com.dcinside.app.settings;

import A3.p;
import Y.B0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import com.dcinside.app.type.A;
import com.dcinside.app.type.z;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import com.google.android.material.animation.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nReadSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadSettingActivity.kt\ncom/dcinside/app/settings/ReadSettingActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n37#2,2:334\n37#2,2:340\n37#2,2:342\n1557#3:336\n1628#3,3:337\n*S KotlinDebug\n*F\n+ 1 ReadSettingActivity.kt\ncom/dcinside/app/settings/ReadSettingActivity\n*L\n164#1:334,2\n194#1:340,2\n227#1:342,2\n193#1:336\n193#1:337,3\n*E\n"})
public final class ReadSettingActivity extends c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b implements com.dcinside.app.settings.c.a {
        private final int a;
        private final boolean b;
        private final int c;
        private final int d;
        private final long e;
        private final boolean f;
        private final boolean g;

        public b(int v, boolean z, int v1, int v2, long v3, boolean z1, boolean z2) {
            this.a = v;
            this.b = z;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            this.f = z1;
            this.g = z2;
        }

        @Override  // com.dcinside.app.settings.c$a
        public boolean a(@l com.dcinside.app.settings.c.a c$a0) {
            L.p(c$a0, "other");
            if(!(c$a0 instanceof b)) {
                return false;
            }
            return this == c$a0 ? false : this.g != ((b)c$a0).g;
        }

        public final int b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final int e() {
            return this.d;
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
            return this.f == ((b)object0).f ? this.g == ((b)object0).g : false;
        }

        @Override  // com.dcinside.app.settings.c$a
        public void f() {
            ll.b0(this.a);
            dl.a.o4(this.b);
            dl.a.v5(this.c);
            dl.a.t5(this.d);
            dl.a.c4(this.e);
            dl.a.d5(this.f);
            dl.a.g5(this.g);
        }

        public final long g() {
            return this.e;
        }

        public final boolean h() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return (((((this.a * 0x1F + androidx.compose.foundation.c.a(this.b)) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + ((int)(this.e ^ this.e >>> 0x20))) * 0x1F + androidx.compose.foundation.c.a(this.f)) * 0x1F + androidx.compose.foundation.c.a(this.g);
        }

        public final boolean i() {
            return this.g;
        }

        @l
        public final b j(int v, boolean z, int v1, int v2, long v3, boolean z1, boolean z2) {
            return new b(v, z, v1, v2, v3, z1, z2);
        }

        public static b k(b readSettingActivity$b0, int v, boolean z, int v1, int v2, long v3, boolean z1, boolean z2, int v4, Object object0) {
            int v5 = (v4 & 1) == 0 ? v : readSettingActivity$b0.a;
            boolean z3 = (v4 & 2) == 0 ? z : readSettingActivity$b0.b;
            int v6 = (v4 & 4) == 0 ? v1 : readSettingActivity$b0.c;
            int v7 = (v4 & 8) == 0 ? v2 : readSettingActivity$b0.d;
            long v8 = (v4 & 16) == 0 ? v3 : readSettingActivity$b0.e;
            boolean z4 = (v4 & 0x20) == 0 ? z1 : readSettingActivity$b0.f;
            return (v4 & 0x40) == 0 ? readSettingActivity$b0.j(v5, z3, v6, v7, v8, z4, z2) : readSettingActivity$b0.j(v5, z3, v6, v7, v8, z4, readSettingActivity$b0.g);
        }

        public final long l() {
            return this.e;
        }

        public final boolean m() {
            return this.b;
        }

        public final boolean n() {
            return this.g;
        }

        public final int o() {
            return this.d;
        }

        public final int p() {
            return this.a;
        }

        public final boolean q() {
            return this.f;
        }

        public final int r() {
            return this.c;
        }

        @Override
        @l
        public String toString() {
            return "InitialValue(readImageHideCount=" + this.a + ", hideImageMobile=" + this.b + ", readImgNoteOption=" + this.c + ", readBestBoxStatus=" + this.d + ", gifPlayConfig=" + this.e + ", readImageNumberCheck=" + this.f + ", postReadWriterCheck=" + this.g + ")";
        }
    }

    private int A;
    private long B;
    private int C;
    private int D;
    @m
    private b E;
    @m
    private ValueAnimator F;
    @l
    private final com.dcinside.app.settings.ReadSettingActivity.c G;
    @l
    public static final a H = null;
    private static final long I = 400L;
    private static final long J = 2000L;
    @l
    private static final int[] K = null;
    @l
    public static final String L = "is_focus_image_note";
    private B0 z;

    static {
        ReadSettingActivity.H = new a(null);
        ReadSettingActivity.K = new int[]{0x7FFFFFFF, 5, 4, 3, 2, 1, 0};
    }

    public ReadSettingActivity() {
        public static final class com.dcinside.app.settings.ReadSettingActivity.c extends OnBackPressedCallback {
            final ReadSettingActivity d;

            com.dcinside.app.settings.ReadSettingActivity.c(ReadSettingActivity readSettingActivity0) {
                this.d = readSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.Q1();
            }
        }

        super(null, 1, null);
        this.A = ll.a0();
        this.B = dl.a.k0();
        this.C = dl.a.G1();
        this.D = dl.a.D1();
        this.G = new com.dcinside.app.settings.ReadSettingActivity.c(this);
    }

    private final void B2() {
        int v = this.A;
        B0 b00 = null;
        switch(v) {
            case 0: {
                B0 b06 = this.z;
                if(b06 == null) {
                    L.S("binding");
                    b06 = null;
                }
                b06.l.setText(0x7F150850);  // string:read_image_hide_count_hide "모두 숨김"
                B0 b07 = this.z;
                if(b07 == null) {
                    L.S("binding");
                    b07 = null;
                }
                b07.h.setAlpha(1.0f);
                B0 b08 = this.z;
                if(b08 == null) {
                    L.S("binding");
                    b08 = null;
                }
                b08.h.setEnabled(true);
                B0 b09 = this.z;
                if(b09 == null) {
                    L.S("binding");
                    b09 = null;
                }
                b09.j.setEnabled(true);
                B0 b010 = this.z;
                if(b010 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b010;
                }
                b00.i.setEnabled(true);
                return;
            }
            case 0x7FFFFFFF: {
                B0 b011 = this.z;
                if(b011 == null) {
                    L.S("binding");
                    b011 = null;
                }
                b011.l.setText(0x7F150851);  // string:read_image_hide_count_show "모두 보임"
                B0 b012 = this.z;
                if(b012 == null) {
                    L.S("binding");
                    b012 = null;
                }
                b012.h.setAlpha(0.4f);
                B0 b013 = this.z;
                if(b013 == null) {
                    L.S("binding");
                    b013 = null;
                }
                b013.h.setEnabled(false);
                B0 b014 = this.z;
                if(b014 == null) {
                    L.S("binding");
                    b014 = null;
                }
                b014.j.setEnabled(false);
                B0 b015 = this.z;
                if(b015 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b015;
                }
                b00.i.setEnabled(false);
                return;
            }
            default: {
                String s = String.valueOf(v);
                B0 b01 = this.z;
                if(b01 == null) {
                    L.S("binding");
                    b01 = null;
                }
                String s1 = this.getString(0x7F150852, new Object[]{s});  // string:read_image_hide_count_value "%1$s개 보임"
                b01.l.setText(s1);
                B0 b02 = this.z;
                if(b02 == null) {
                    L.S("binding");
                    b02 = null;
                }
                b02.h.setAlpha(1.0f);
                B0 b03 = this.z;
                if(b03 == null) {
                    L.S("binding");
                    b03 = null;
                }
                b03.h.setEnabled(true);
                B0 b04 = this.z;
                if(b04 == null) {
                    L.S("binding");
                    b04 = null;
                }
                b04.j.setEnabled(true);
                B0 b05 = this.z;
                if(b05 == null) {
                    L.S("binding");
                }
                else {
                    b00 = b05;
                }
                b00.i.setEnabled(true);
            }
        }
    }

    private final void C2() {
        ValueAnimator valueAnimator0 = this.F;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.F = null;
        }
        if(this.getIntent().getBooleanExtra("is_focus_image_note", false)) {
            ValueAnimator valueAnimator1 = ValueAnimator.ofObject(d.b(), new Object[]{vk.b(this, 0x7F040512), vk.b(this, 0x1010054)});  // attr:replyHighlightBg
            valueAnimator1.setStartDelay(400L);
            valueAnimator1.setDuration(2000L);
            valueAnimator1.addUpdateListener((ValueAnimator valueAnimator0) -> {
                L.p(this, "this$0");
                L.p(valueAnimator0, "animation");
                B0 b00 = this.z;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                Object object0 = valueAnimator0.getAnimatedValue();
                L.n(object0, "null cannot be cast to non-null type kotlin.Int");
                b00.m.setBackgroundColor(((int)(((Integer)object0))));
            });
            valueAnimator1.start();
            this.F = valueAnimator1;
        }
    }

    // 检测为 Lambda 实现
    private static final void D2(ReadSettingActivity readSettingActivity0, ValueAnimator valueAnimator0) [...]

    private final int E2(long v) {
        if(v == 0L) {
            return 0x7F150406;  // string:gif_play_config_value0 "항상 사용"
        }
        return v == 1L ? 0x7F150407 : 0x7F150408;  // string:gif_play_config_value1 "3G/LTE/5G"
    }

    private final String F2(int v) {
        z z0;
        try {
            z0 = z.values()[v];
        }
        catch(Exception unused_ex) {
            z0 = z.c;
        }
        String s = this.getString(z0.c());
        L.o(s, "getString(...)");
        return s;
    }

    private final String G2(int v) {
        A a0;
        try {
            a0 = (A)A.b().get(v);
        }
        catch(Exception unused_ex) {
            a0 = A.d;
        }
        String s = this.getString(a0.c());
        L.o(s, "getString(...)");
        return s;
    }

    private final String H2(Context context0, int v) {
        int v1 = ReadSettingActivity.K[v];
        if(v1 == 0x7FFFFFFF) {
            L.m("모두 보임");
            return "모두 보임";
        }
        if(v1 == 0) {
            L.m("모두 숨김");
            return "모두 숨김";
        }
        String s = context0.getString(0x7F150852, new Object[]{String.valueOf(v1)});  // string:read_image_hide_count_value "%1$s개 보임"
        L.m(s);
        return s;
    }

    private final void I2() {
        static final class com.dcinside.app.settings.ReadSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.settings.ReadSettingActivity.d e;

            static {
                com.dcinside.app.settings.ReadSettingActivity.d.e = new com.dcinside.app.settings.ReadSettingActivity.d();
            }

            com.dcinside.app.settings.ReadSettingActivity.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F150405);  // string:gif_play_config_title "움짤 터치 재생"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
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


        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(1);
            }

            public final Long a(Integer integer0) {
                return (long)(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class g extends N implements Function1 {
            final ReadSettingActivity e;

            g(ReadSettingActivity readSettingActivity0) {
                this.e = readSettingActivity0;
                super(1);
            }

            public final void a(Long long0) {
                L.m(long0);
                this.e.B = (long)long0;
                B0 b00 = this.e.z;
                if(b00 == null) {
                    L.S("binding");
                    b00 = null;
                }
                b00.e.setText(this.e.E2(((long)long0)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Long)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a.v(com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.ReadSettingActivity.d.e), 0x7F03000F, 0, 2, null).d().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).g3((Object object0) -> {
            L.p(f.e, "$tmp0");
            return (Long)f.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new g(this), "$tmp0");
            new g(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Long J2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Boolean L2(Function1 function10, Object object0) [...]

    private final void M2() {
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.s, "settingReadImageNumberSwitch");
        boolean z = b00.s.isChecked();
        b00.s.setChecked(!z);
    }

    private final void N2() {
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        b00.B.toggle();
    }

    private final void O2() {
        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F1509A5);  // string:setting_read_show_read_like_posts_title "개념글 박스"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


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


        static final class j extends N implements Function1 {
            final ReadSettingActivity e;

            j(ReadSettingActivity readSettingActivity0) {
                this.e = readSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.Y2(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        z[] arr_z = z.values();
        for(int v = 0; v < arr_z.length; ++v) {
            arrayList0.add(this.getString(arr_z[v].c()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(h.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(i.e, "$tmp0");
            return (Boolean)i.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new j(this), "$tmp0");
            new j(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean P2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Q2(Function1 function10, Object object0) [...]

    private final void R2() {
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        L.o(b00.i, "settingReadImageHideMobileSwitch");
        boolean z = b00.i.isChecked();
        b00.i.setChecked(!z);
    }

    private final void S2() {
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
                L.p(p$a0, "b");
                return p$a0.J(0x7F15099C);  // string:setting_read_image_hide_title "이미지 보이기·숨기기"
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
            final ReadSettingActivity e;

            t(ReadSettingActivity readSettingActivity0) {
                this.e = readSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                int[] arr_v = ReadSettingActivity.K;
                L.m(integer0);
                this.e.A = arr_v[((int)integer0)];
                this.e.B2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        kotlin.ranges.l l0 = kotlin.collections.l.le(ReadSettingActivity.K);
        ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(this.H2(this, ((T)iterator0).b()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(r.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(s.e, "$tmp0");
            return (Boolean)s.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new t(this), "$tmp0");
            new t(this).invoke(object0);
        });
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a T1() {
        int v = this.A;
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        boolean z = b00.i.isChecked();
        int v1 = this.C;
        int v2 = this.D;
        long v3 = this.B;
        B0 b01 = this.z;
        if(b01 == null) {
            L.S("binding");
            b01 = null;
        }
        boolean z1 = b01.s.isChecked();
        B0 b02 = this.z;
        if(b02 == null) {
            L.S("binding");
            throw new NullPointerException();
        }
        return new b(v, z, v1, v2, v3, z1, b02.B.isChecked());
    }

    // 检测为 Lambda 实现
    private static final Boolean T2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a V1() {
        com.dcinside.app.settings.c.a c$a0 = this.E;
        L.m(c$a0);
        return c$a0;
    }

    private final void V2() {
        static final class com.dcinside.app.settings.ReadSettingActivity.u extends N implements Function1 {
            public static final com.dcinside.app.settings.ReadSettingActivity.u e;

            static {
                com.dcinside.app.settings.ReadSettingActivity.u.e = new com.dcinside.app.settings.ReadSettingActivity.u();
            }

            com.dcinside.app.settings.ReadSettingActivity.u() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F1504DF);  // string:image_note_setting_title "이미지 댓글 표시"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class v extends N implements Function1 {
            public static final v e;

            static {
                v.e = new v();
            }

            v() {
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


        static final class com.dcinside.app.settings.ReadSettingActivity.w extends N implements Function1 {
            final ReadSettingActivity e;

            com.dcinside.app.settings.ReadSettingActivity.w(ReadSettingActivity readSettingActivity0) {
                this.e = readSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.Z2(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: A.b()) {
            arrayList0.add(this.getString(((A)object0).c()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.ReadSettingActivity.u.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(v.e, "$tmp0");
            return (Boolean)v.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.ReadSettingActivity.w(this), "$tmp0");
            new com.dcinside.app.settings.ReadSettingActivity.w(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean W2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void X2(Function1 function10, Object object0) [...]

    private final void Y2(int v) {
        this.D = v;
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        String s = this.F2(v);
        b00.u.setText(s);
    }

    private final void Z2(int v) {
        this.C = v;
        B0 b00 = this.z;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        String s = this.G2(v);
        b00.p.setText(s);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$1", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends o implements p {
            int k;
            final ReadSettingActivity l;

            k(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
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
                this.l.S2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$2", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ReadSettingActivity.l extends o implements p {
            int k;
            final ReadSettingActivity l;

            com.dcinside.app.settings.ReadSettingActivity.l(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ReadSettingActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.M2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$3", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ReadSettingActivity.m extends o implements p {
            int k;
            final ReadSettingActivity l;

            com.dcinside.app.settings.ReadSettingActivity.m(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ReadSettingActivity.m(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$4", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends o implements p {
            int k;
            final ReadSettingActivity l;

            n(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
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
                this.l.O2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$5", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ReadSettingActivity.o extends o implements p {
            int k;
            final ReadSettingActivity l;

            com.dcinside.app.settings.ReadSettingActivity.o(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ReadSettingActivity.o(this.l, d0).invokeSuspend(S0.a);
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
                this.l.R2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$6", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.ReadSettingActivity.p extends o implements p {
            int k;
            final ReadSettingActivity l;

            com.dcinside.app.settings.ReadSettingActivity.p(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.ReadSettingActivity.p(this.l, d0).invokeSuspend(S0.a);
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
                this.l.I2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.ReadSettingActivity$onCreate$7", f = "ReadSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends o implements p {
            int k;
            final ReadSettingActivity l;

            q(ReadSettingActivity readSettingActivity0, kotlin.coroutines.d d0) {
                this.l = readSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new q(this.l, d0).invokeSuspend(S0.a);
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
                this.l.N2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.getOnBackPressedDispatcher().h(this.G);
        B0 b00 = B0.c(this.getLayoutInflater());
        L.o(b00, "inflate(...)");
        this.z = b00;
        if(b00 == null) {
            L.S("binding");
            b00 = null;
        }
        this.setContentView(b00.b());
        B0 b01 = this.z;
        if(b01 == null) {
            L.S("binding");
            b01 = null;
        }
        this.S0(b01.y);
        kr.bhbfhfb.designcompat.a.d(this);
        this.B2();
        B0 b02 = this.z;
        if(b02 == null) {
            L.S("binding");
            b02 = null;
        }
        dl dl0 = dl.a;
        boolean z = dl0.v0();
        b02.i.setChecked(z);
        B0 b03 = this.z;
        if(b03 == null) {
            L.S("binding");
            b03 = null;
        }
        boolean z1 = dl0.l1();
        b03.s.setChecked(z1);
        B0 b04 = this.z;
        if(b04 == null) {
            L.S("binding");
            b04 = null;
        }
        String s = this.G2(this.C);
        b04.p.setText(s);
        B0 b05 = this.z;
        if(b05 == null) {
            L.S("binding");
            b05 = null;
        }
        String s1 = this.F2(this.D);
        b05.u.setText(s1);
        B0 b06 = this.z;
        if(b06 == null) {
            L.S("binding");
            b06 = null;
        }
        b06.e.setText(this.E2(this.B));
        B0 b07 = this.z;
        if(b07 == null) {
            L.S("binding");
            b07 = null;
        }
        boolean z2 = dl0.p1();
        b07.B.setChecked(z2);
        com.dcinside.app.settings.c.a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.settings.ReadSettingActivity.InitialValue");
        this.E = (b)c$a0;
        B0 b08 = this.z;
        if(b08 == null) {
            L.S("binding");
            b08 = null;
        }
        L.o(b08.f, "settingReadImageHide");
        k readSettingActivity$k0 = new k(this, null);
        com.dcinside.app.internal.r.M(b08.f, null, readSettingActivity$k0, 1, null);
        B0 b09 = this.z;
        if(b09 == null) {
            L.S("binding");
            b09 = null;
        }
        L.o(b09.q, "settingReadImageNumber");
        com.dcinside.app.settings.ReadSettingActivity.l readSettingActivity$l0 = new com.dcinside.app.settings.ReadSettingActivity.l(this, null);
        com.dcinside.app.internal.r.M(b09.q, null, readSettingActivity$l0, 1, null);
        B0 b010 = this.z;
        if(b010 == null) {
            L.S("binding");
            b010 = null;
        }
        L.o(b010.m, "settingReadImageNote");
        com.dcinside.app.settings.ReadSettingActivity.m readSettingActivity$m0 = new com.dcinside.app.settings.ReadSettingActivity.m(this, null);
        com.dcinside.app.internal.r.M(b010.m, null, readSettingActivity$m0, 1, null);
        B0 b011 = this.z;
        if(b011 == null) {
            L.S("binding");
            b011 = null;
        }
        L.o(b011.v, "settingReadShowReadLikePosts");
        n readSettingActivity$n0 = new n(this, null);
        com.dcinside.app.internal.r.M(b011.v, null, readSettingActivity$n0, 1, null);
        B0 b012 = this.z;
        if(b012 == null) {
            L.S("binding");
            b012 = null;
        }
        L.o(b012.h, "settingReadImageHideMobile");
        com.dcinside.app.settings.ReadSettingActivity.o readSettingActivity$o0 = new com.dcinside.app.settings.ReadSettingActivity.o(this, null);
        com.dcinside.app.internal.r.M(b012.h, null, readSettingActivity$o0, 1, null);
        B0 b013 = this.z;
        if(b013 == null) {
            L.S("binding");
            b013 = null;
        }
        L.o(b013.b, "settingGifPlayConfig");
        com.dcinside.app.settings.ReadSettingActivity.p readSettingActivity$p0 = new com.dcinside.app.settings.ReadSettingActivity.p(this, null);
        com.dcinside.app.internal.r.M(b013.b, null, readSettingActivity$p0, 1, null);
        B0 b014 = this.z;
        if(b014 == null) {
            L.S("binding");
            b014 = null;
        }
        L.o(b014.z, "settingWriteNickColor");
        q readSettingActivity$q0 = new q(this, null);
        com.dcinside.app.internal.r.M(b014.z, null, readSettingActivity$q0, 1, null);
        this.C2();
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
}

