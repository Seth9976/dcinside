package com.dcinside.app.settings.hate;

import A3.p;
import Y.s0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.OnBackPressedCallback;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.y;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import kr.better.widget.BetterTextView;
import y4.l;
import y4.m;

public final class HateSettingActivity extends d {
    private s0 u;
    @l
    private final b v;

    public HateSettingActivity() {
        public static final class b extends OnBackPressedCallback {
            final HateSettingActivity d;

            b(HateSettingActivity hateSettingActivity0) {
                this.d = hateSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.v = new b(this);
    }

    private final void N1() {
        static final class a extends N implements Function1 {
            final boolean e;

            a(boolean z) {
                this.e = z;
                super(1);
            }

            public final void a(@l y y0) {
                L.p(y0, "it");
                y0.W5(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((y)object0));
                return S0.a;
            }
        }

        s0 s00 = this.u;
        s0 s01 = null;
        if(s00 == null) {
            L.S("binding");
            s00 = null;
        }
        boolean z = s00.e.isChecked();
        a hateSettingActivity$a0 = new a(z);
        y.h.j("", hateSettingActivity$a0);
        s0 s02 = this.u;
        if(s02 == null) {
            L.S("binding");
            s02 = null;
        }
        float f = 0.4f;
        s02.f.setAlpha((z ? 1.0f : 0.4f));
        s02.f.setEnabled(z);
        s0 s03 = this.u;
        if(s03 == null) {
            L.S("binding");
        }
        else {
            s01 = s03;
        }
        BetterTextView betterTextView0 = s01.g;
        if(z) {
            f = 1.0f;
        }
        betterTextView0.setAlpha(f);
    }

    private final int O1(int v) {
        return v == 0 || v != 1 ? 0x7F15043D : 0x7F15043E;  // string:hate_word_setting_warn_before "본문 보기 전 경고"
    }

    // 检测为 Lambda 实现
    private static final void P1(HateSettingActivity hateSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    private final void Q1() {
        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F15043F);  // string:hate_word_setting_warning "경고 표시 방법"
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
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            public final Integer a(Integer integer0) {
                return integer0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class i extends N implements Function1 {
            final HateSettingActivity e;

            i(HateSettingActivity hateSettingActivity0) {
                this.e = hateSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                static final class com.dcinside.app.settings.hate.HateSettingActivity.i.a extends N implements Function1 {
                    final Integer e;

                    com.dcinside.app.settings.hate.HateSettingActivity.i.a(Integer integer0) {
                        this.e = integer0;
                        super(1);
                    }

                    public final void a(@l y y0) {
                        L.p(y0, "it");
                        L.o(this.e, "$warnType");
                        y0.X5(this.e.intValue());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((y)object0));
                        return S0.a;
                    }
                }

                com.dcinside.app.settings.hate.HateSettingActivity.i.a hateSettingActivity$i$a0 = new com.dcinside.app.settings.hate.HateSettingActivity.i.a(integer0);
                y.h.j("", hateSettingActivity$i$a0);
                s0 s00 = this.e.u;
                if(s00 == null) {
                    L.S("binding");
                    s00 = null;
                }
                L.m(integer0);
                s00.h.setText(this.e.O1(((int)integer0)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a.v(e.e.a(this).n(f.e), 0x7F030011, 0, 2, null).d().Z1((Object object0) -> {
            L.p(g.e, "$tmp0");
            return (Boolean)g.e.invoke(object0);
        }).g3((Object object0) -> {
            L.p(h.e, "$tmp0");
            return (Integer)h.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new i(this), "$tmp0");
            new i(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean R1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Integer S1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T1(Function1 function10, Object object0) [...]

    private final void U1() {
        HateWordSettingActivity.z.a(this, "");
    }

    private final void V1() {
        s0 s00 = this.u;
        if(s00 == null) {
            L.S("binding");
            s00 = null;
        }
        L.o(s00.e, "settingHateWordNoticeSwitch");
        boolean z = s00.e.isChecked();
        s00.e.setChecked(!z);
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.hate.HateSettingActivity$onCreate$1", f = "HateSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final HateSettingActivity l;

            c(HateSettingActivity hateSettingActivity0, kotlin.coroutines.d d0) {
                this.l = hateSettingActivity0;
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
                this.l.V1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.hate.HateSettingActivity$onCreate$2", f = "HateSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.hate.HateSettingActivity.d extends o implements p {
            int k;
            final HateSettingActivity l;

            com.dcinside.app.settings.hate.HateSettingActivity.d(HateSettingActivity hateSettingActivity0, kotlin.coroutines.d d0) {
                this.l = hateSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.hate.HateSettingActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Q1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.hate.HateSettingActivity$onCreate$3", f = "HateSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.hate.HateSettingActivity.e extends o implements p {
            int k;
            final HateSettingActivity l;

            com.dcinside.app.settings.hate.HateSettingActivity.e(HateSettingActivity hateSettingActivity0, kotlin.coroutines.d d0) {
                this.l = hateSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.hate.HateSettingActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.U1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        s0 s00 = s0.c(this.getLayoutInflater());
        L.o(s00, "inflate(...)");
        this.u = s00;
        s0 s01 = null;
        if(s00 == null) {
            L.S("binding");
            s00 = null;
        }
        this.setContentView(s00.b());
        this.getOnBackPressedDispatcher().h(this.v);
        s0 s02 = this.u;
        if(s02 == null) {
            L.S("binding");
            s02 = null;
        }
        this.S0(s02.b);
        kr.bhbfhfb.designcompat.a.d(this);
        y y0 = y.h.i("");
        s0 s03 = this.u;
        if(s03 == null) {
            L.S("binding");
            s03 = null;
        }
        boolean z = y0.R5();
        s03.e.setChecked(z);
        s0 s04 = this.u;
        if(s04 == null) {
            L.S("binding");
            s04 = null;
        }
        int v = this.O1(y0.S5());
        s04.h.setText(v);
        s0 s05 = this.u;
        if(s05 == null) {
            L.S("binding");
            s05 = null;
        }
        L.o(s05.d, "settingHateWordNotice");
        c hateSettingActivity$c0 = new c(this, null);
        r.M(s05.d, null, hateSettingActivity$c0, 1, null);
        s0 s06 = this.u;
        if(s06 == null) {
            L.S("binding");
            s06 = null;
        }
        L.o(s06.f, "settingHateWordNoticeType");
        com.dcinside.app.settings.hate.HateSettingActivity.d hateSettingActivity$d0 = new com.dcinside.app.settings.hate.HateSettingActivity.d(this, null);
        r.M(s06.f, null, hateSettingActivity$d0, 1, null);
        s0 s07 = this.u;
        if(s07 == null) {
            L.S("binding");
            s07 = null;
        }
        L.o(s07.c, "settingHateWordEdit");
        com.dcinside.app.settings.hate.HateSettingActivity.e hateSettingActivity$e0 = new com.dcinside.app.settings.hate.HateSettingActivity.e(this, null);
        r.M(s07.c, null, hateSettingActivity$e0, 1, null);
        s0 s08 = this.u;
        if(s08 == null) {
            L.S("binding");
        }
        else {
            s01 = s08;
        }
        com.dcinside.app.settings.hate.a a0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.N1();
        };
        s01.e.setOnCheckedChangeListener(a0);
        this.N1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

