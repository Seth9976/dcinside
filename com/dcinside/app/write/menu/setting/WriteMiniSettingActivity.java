package com.dcinside.app.write.menu.setting;

import A3.p;
import Y.Z;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable.Factory;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.write.menu.MenuVisible;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nWriteMiniSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMiniSettingActivity.kt\ncom/dcinside/app/write/menu/setting/WriteMiniSettingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,346:1\n1557#2:347\n1628#2,3:348\n255#3:351\n257#3,2:352\n257#3,2:354\n*S KotlinDebug\n*F\n+ 1 WriteMiniSettingActivity.kt\ncom/dcinside/app/write/menu/setting/WriteMiniSettingActivity\n*L\n87#1:347\n87#1:348,3\n120#1:351\n121#1:352,2\n124#1:354,2\n*E\n"})
public final class WriteMiniSettingActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m String s, boolean z, @m String s1, boolean z1, @m MenuVisible menuVisible0, @m String s2, @m String s3) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, WriteMiniSettingActivity.class);
            intent0.putExtra("com.dcinside.app.EXTRA_REMOVE_DATE", s1);
            intent0.putExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD", s);
            intent0.putExtra("com.dcinside.app.EXTRA_HAS_SECRET", z);
            intent0.putExtra("com.dcinside.app.EXTRA_ENABLE_FIX", z1);
            intent0.putExtra("com.dcinside.app.EXTRA_MENU_INFO", menuVisible0);
            intent0.putExtra("com.dcinside.app.EXTRA_GALLERY_ID", s2);
            intent0.putExtra("com.dcinside.app.EXTRA_POST_NUMBER", s3);
            appCompatActivity0.startActivityForResult(intent0, 1044);
        }
    }

    @l
    public static final String A = "com.dcinside.app.EXTRA_REMOVE_DATE";
    @l
    public static final String B = "com.dcinside.app.EXTRA_SECRET_PASSWORD";
    @l
    public static final String C = "com.dcinside.app.EXTRA_ENABLE_FIX";
    @l
    public static final String D = "com.dcinside.app.EXTRA_HAS_SECRET";
    @l
    private static final String E = "com.dcinside.app.EXTRA_MENU_INFO";
    @l
    private static final String F = "com.dcinside.app.EXTRA_GALLERY_ID";
    @l
    private static final String G = "com.dcinside.app.EXTRA_POST_NUMBER";
    private Z u;
    @m
    private DatePickerDialog v;
    @m
    private o w;
    @m
    private String x;
    @m
    private String y;
    @l
    public static final a z;

    static {
        WriteMiniSettingActivity.z = new a(null);
    }

    private final void P1() {
        Z z0 = this.u;
        Z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        L.o(z0.L, "postSettingAdultDetail");
        if(z0.L.getVisibility() == 0) {
            Z z2 = this.u;
            if(z2 == null) {
                L.S("binding");
                z2 = null;
            }
            L.o(z2.L, "postSettingAdultDetail");
            z2.L.setVisibility(8);
            Z z3 = this.u;
            if(z3 == null) {
                L.S("binding");
            }
            else {
                z1 = z3;
            }
            z1.d.setRotation(0.0f);
            return;
        }
        Z z4 = this.u;
        if(z4 == null) {
            L.S("binding");
            z4 = null;
        }
        L.o(z4.L, "postSettingAdultDetail");
        z4.L.setVisibility(0);
        Z z5 = this.u;
        if(z5 == null) {
            L.S("binding");
        }
        else {
            z1 = z5;
        }
        z1.d.setRotation(180.0f);
    }

    private final void Q1() {
        Intent intent0 = new Intent();
        Z z0 = this.u;
        Z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        if(z0.u.isChecked()) {
            Z z2 = this.u;
            if(z2 == null) {
                L.S("binding");
                z2 = null;
            }
            String s = z2.m.getText().toString();
            Z z3 = this.u;
            if(z3 == null) {
                L.S("binding");
                z3 = null;
            }
            Object object0 = z3.q.getSelectedItem();
            Z z4 = this.u;
            if(z4 == null) {
                L.S("binding");
                z4 = null;
            }
            String s1 = this.getString(0x7F1507AE, new Object[]{s, object0, z4.r.getSelectedItem()});  // string:post_auto_del_date_merge "%1$s %2$s:%3$s"
            L.o(s1, "getString(...)");
            Date date0 = Bk.h(s1);
            long v = date0 == null ? 0L : date0.getTime();
            if(v < System.currentTimeMillis()) {
                this.X1(0x7F1507B1);  // string:post_auto_del_time_error "현재 시간 이후로 설정해주세요."
                return;
            }
            intent0.putExtra("com.dcinside.app.EXTRA_REMOVE_DATE", Bk.I(v));
        }
        Z z5 = this.u;
        if(z5 == null) {
            L.S("binding");
            z5 = null;
        }
        if(z5.I.isChecked()) {
            boolean z6 = this.getIntent().getBooleanExtra("com.dcinside.app.EXTRA_HAS_SECRET", false);
            Z z7 = this.u;
            if(z7 == null) {
                L.S("binding");
                z7 = null;
            }
            String s2 = String.valueOf(z7.D.getText());
            if(s2.length() == 0 && !z6) {
                this.X1(0x7F15092B);  // string:secret_setting_need_input "비밀번호를 설정해주세요."
                return;
            }
            intent0.putExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD", s2);
            intent0.putExtra("com.dcinside.app.EXTRA_HAS_SECRET", z6);
        }
        else {
            intent0.putExtra("com.dcinside.app.EXTRA_HAS_SECRET", false);
        }
        Z z8 = this.u;
        if(z8 == null) {
            L.S("binding");
        }
        else {
            z1 = z8;
        }
        intent0.putExtra("com.dcinside.app.EXTRA_ENABLE_FIX", z1.z.isChecked());
        this.setResult(-1, intent0);
        Nk.a.a(this);
        this.finish();
    }

    private final void R1() {
        @f(c = "com.dcinside.app.write.menu.setting.WriteMiniSettingActivity$initCallback$1$1", f = "WriteMiniSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final WriteMiniSettingActivity l;

            b(WriteMiniSettingActivity writeMiniSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeMiniSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.e2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.setting.WriteMiniSettingActivity$initCallback$2", f = "WriteMiniSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final WriteMiniSettingActivity l;

            c(WriteMiniSettingActivity writeMiniSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeMiniSettingActivity0;
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
                this.l.P1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.menu.setting.WriteMiniSettingActivity$initCallback$3", f = "WriteMiniSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final WriteMiniSettingActivity l;

            com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.d(WriteMiniSettingActivity writeMiniSettingActivity0, kotlin.coroutines.d d0) {
                this.l = writeMiniSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.P1();
                return S0.a;
            }
        }

        Z z0 = this.u;
        Z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        L.m(z0.m);
        b writeMiniSettingActivity$b0 = new b(this, null);
        r.M(z0.m, null, writeMiniSettingActivity$b0, 1, null);
        Z z2 = this.u;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        L.o(z2.c, "postAdultDetail");
        c writeMiniSettingActivity$c0 = new c(this, null);
        r.M(z2.c, null, writeMiniSettingActivity$c0, 1, null);
        Z z3 = this.u;
        if(z3 == null) {
            L.S("binding");
            z3 = null;
        }
        L.o(z3.d, "postAdultDetailIcon");
        com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.d writeMiniSettingActivity$d0 = new com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.d(this, null);
        r.M(z3.d, null, writeMiniSettingActivity$d0, 1, null);
        Z z4 = this.u;
        if(z4 == null) {
            L.S("binding");
            z4 = null;
        }
        P p0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(compoundButton0);
            this.a2(compoundButton0, z);
        };
        z4.I.setOnCheckedChangeListener(p0);
        Z z5 = this.u;
        if(z5 == null) {
            L.S("binding");
            z5 = null;
        }
        Q q0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(compoundButton0);
            this.a2(compoundButton0, z);
        };
        z5.u.setOnCheckedChangeListener(q0);
        Z z6 = this.u;
        if(z6 == null) {
            L.S("binding");
        }
        else {
            z1 = z6;
        }
        S s0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.b2(z);
        };
        z1.z.setOnCheckedChangeListener(s0);
    }

    // 检测为 Lambda 实现
    private static final void S1(WriteMiniSettingActivity writeMiniSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void T1(WriteMiniSettingActivity writeMiniSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void U1(WriteMiniSettingActivity writeMiniSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    private final void V1() {
        Intent intent0 = this.getIntent();
        this.x = intent0.getStringExtra("com.dcinside.app.EXTRA_GALLERY_ID");
        this.y = intent0.getStringExtra("com.dcinside.app.EXTRA_POST_NUMBER");
        String s = intent0.getStringExtra("com.dcinside.app.EXTRA_REMOVE_DATE");
        Calendar calendar0 = Calendar.getInstance();
        boolean z = true;
        if(s == null) {
            calendar0.add(11, 1);
            calendar0.add(12, 5);
        }
        else {
            Date date0 = Bk.i(s);
            calendar0.setTimeInMillis((date0 == null ? System.currentTimeMillis() : date0.getTime()));
        }
        String s1 = Bk.F(calendar0.getTimeInMillis());
        Z z1 = this.u;
        Z z2 = null;
        if(z1 == null) {
            L.S("binding");
            z1 = null;
        }
        z1.m.setText(s1);
        int v = calendar0.get(11);
        int v1 = calendar0.get(12);
        Z z3 = this.u;
        if(z3 == null) {
            L.S("binding");
            z3 = null;
        }
        z3.q.setSelection(v);
        Z z4 = this.u;
        if(z4 == null) {
            L.S("binding");
            z4 = null;
        }
        z4.r.setSelection(v1 / 5);
        String s2 = intent0.getStringExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD");
        if(s2 == null) {
            s2 = "";
        }
        Z z5 = this.u;
        if(z5 == null) {
            L.S("binding");
            z5 = null;
        }
        Editable editable0 = Editable.Factory.getInstance().newEditable(s2);
        z5.D.setText(editable0);
        boolean z6 = intent0.getBooleanExtra("com.dcinside.app.EXTRA_HAS_SECRET", false);
        boolean z7 = intent0.getBooleanExtra("com.dcinside.app.EXTRA_ENABLE_FIX", false);
        Z z8 = this.u;
        if(z8 == null) {
            L.S("binding");
            z8 = null;
        }
        boolean z9 = z6 || s2.length() > 0;
        z8.I.setChecked(z9);
        Z z10 = this.u;
        if(z10 == null) {
            L.S("binding");
            z10 = null;
        }
        SwitchCompat switchCompat0 = z10.u;
        if(s == null || s.length() <= 0) {
            z = false;
        }
        switchCompat0.setChecked(z);
        Z z11 = this.u;
        if(z11 == null) {
            L.S("binding");
        }
        else {
            z2 = z11;
        }
        z2.z.setChecked(z7);
    }

    private final void W1() {
        Z z0 = this.u;
        Z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        AppCompatSpinner appCompatSpinner0 = z0.q;
        int v = 0;
        Iterable iterable0 = u.V5(s.W1(0, 24));
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        appCompatSpinner0.setAdapter(new ArrayAdapter(this, 0x7F0E0286, arrayList0));  // layout:view_spinner_item_center
        Z z2 = this.u;
        if(z2 == null) {
            L.S("binding");
            z2 = null;
        }
        String[] arr_s = this.getResources().getStringArray(0x7F030035);  // array:time_select_auto_del_minute
        L.o(arr_s, "getStringArray(...)");
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E0286, arr_s);  // layout:view_spinner_item_center
        z2.r.setAdapter(arrayAdapter0);
        MenuVisible menuVisible0 = (MenuVisible)this.getIntent().getParcelableExtra("com.dcinside.app.EXTRA_MENU_INFO");
        boolean z3 = true;
        boolean z4 = menuVisible0 != null && menuVisible0.a();
        boolean z5 = menuVisible0 != null && menuVisible0.f();
        if(menuVisible0 == null || !menuVisible0.c()) {
            z3 = false;
        }
        else {
            String s = B.E.k0();
            if(s == null || s.length() == 0) {
                z3 = false;
            }
        }
        Z z6 = this.u;
        if(z6 == null) {
            L.S("binding");
            z6 = null;
        }
        z6.s.setVisibility((z4 ? 0 : 8));
        Z z7 = this.u;
        if(z7 == null) {
            L.S("binding");
            z7 = null;
        }
        z7.G.setVisibility((z5 ? 0 : 8));
        Z z8 = this.u;
        if(z8 == null) {
            L.S("binding");
        }
        else {
            z1 = z8;
        }
        ConstraintLayout constraintLayout0 = z1.y;
        if(!z3) {
            v = 8;
        }
        constraintLayout0.setVisibility(v);
    }

    private final void X1(int v) {
        static final class e extends N implements Function1 {
            final int e;

            e(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f extends N implements Function1 {
            public static final com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f e;

            static {
                com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f.e = new com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f();
            }

            com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f() {
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


        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new e(v)).z(0x7F150925).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f.e, "$tmp0");
            return (Boolean)com.dcinside.app.write.menu.setting.WriteMiniSettingActivity.f.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(g.e, "$tmp0");
            g.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean Y1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Z1(Function1 function10, Object object0) [...]

    private final void a2(CompoundButton compoundButton0, boolean z) {
        int v = compoundButton0.getId();
        compoundButton0.setChecked(z);
        Z z1 = null;
        switch(v) {
            case 0x7F0B0A2E: {  // id:post_auto_del_use
                Z z2 = this.u;
                if(z2 == null) {
                    L.S("binding");
                }
                else {
                    z1 = z2;
                }
                z1 = z1.t;
                break;
            }
            case 0x7F0B0B14: {  // id:post_secret_use
                Z z3 = this.u;
                if(z3 == null) {
                    L.S("binding");
                }
                else {
                    z1 = z3;
                }
                z1 = z1.H;
            }
        }
        if(z1 != null) {
            ((View)z1).setVisibility((z ? 0 : 8));
        }
    }

    private final void b2(boolean z) {
        static final class h extends N implements Function1 {
            final WriteMiniSettingActivity e;

            h(WriteMiniSettingActivity writeMiniSettingActivity0) {
                this.e = writeMiniSettingActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                Z z0 = null;
                if(f00.f()) {
                    Z z2 = this.e.u;
                    if(z2 == null) {
                        L.S("binding");
                        z2 = null;
                    }
                    z2.v.setVisibility(0);
                }
                else {
                    Dl.G(this.e, f00.a());
                    Z z1 = this.e.u;
                    if(z1 == null) {
                        L.S("binding");
                        z1 = null;
                    }
                    z1.z.setChecked(false);
                }
                Z z3 = this.e.u;
                if(z3 == null) {
                    L.S("binding");
                }
                else {
                    z0 = z3;
                }
                z0.x.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }

        Z z1 = null;
        if(z) {
            o o0 = this.w;
            if(o0 != null) {
                o0.l();
            }
            Z z2 = this.u;
            if(z2 == null) {
                L.S("binding");
            }
            else {
                z1 = z2;
            }
            z1.x.setVisibility(0);
            this.w = uk.Xj(this.x, this.y).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                L.p(new h(this), "$tmp0");
                new h(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
                Z z0 = this.u;
                Z z1 = null;
                if(z0 == null) {
                    L.S("binding");
                    z0 = null;
                }
                z0.z.setChecked(false);
                Z z2 = this.u;
                if(z2 == null) {
                    L.S("binding");
                }
                else {
                    z1 = z2;
                }
                z1.x.setVisibility(8);
            });
            return;
        }
        o o1 = this.w;
        if(o1 != null) {
            o1.l();
        }
        Z z3 = this.u;
        if(z3 == null) {
            L.S("binding");
            z3 = null;
        }
        z3.x.setVisibility(8);
        Z z4 = this.u;
        if(z4 == null) {
            L.S("binding");
        }
        else {
            z1 = z4;
        }
        z1.v.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final void c2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d2(WriteMiniSettingActivity writeMiniSettingActivity0, Throwable throwable0) [...]

    private final void e2() {
        Z z0 = this.u;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        Date date0 = Bk.g(z0.m.getText().toString());
        long v = date0 == null ? System.currentTimeMillis() : date0.getTime();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        int v1 = calendar0.get(1);
        int v2 = calendar0.get(2);
        int v3 = calendar0.get(5);
        com.dcinside.app.write.menu.setting.O o0 = (DatePicker datePicker0, int v, int v1, int v2) -> {
            L.p(this, "this$0");
            calendar0.set(v, v1, v2);
            Z z0 = this.u;
            if(z0 == null) {
                L.S("binding");
                z0 = null;
            }
            String s = Bk.F(calendar0.getTimeInMillis());
            z0.m.setText(s);
        };
        DatePickerDialog datePickerDialog0 = this.v;
        if(datePickerDialog0 != null) {
            L.m(datePickerDialog0);
            if(datePickerDialog0.isShowing()) {
                DatePickerDialog datePickerDialog1 = this.v;
                L.m(datePickerDialog1);
                datePickerDialog1.cancel();
            }
            this.v = null;
        }
        DatePickerDialog datePickerDialog2 = new DatePickerDialog(this, dl.a.q2().h(), o0, v1, v2, v3);
        this.v = datePickerDialog2;
        DatePicker datePicker0 = datePickerDialog2.getDatePicker();
        if(datePicker0 != null) {
            try {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.add(12, 5);
                datePicker0.setMinDate(calendar1.getTimeInMillis());
                calendar1.add(2, 3);
                datePicker0.setMaxDate(calendar1.getTimeInMillis());
            }
            catch(Exception unused_ex) {
            }
        }
        DatePickerDialog datePickerDialog3 = this.v;
        if(datePickerDialog3 != null) {
            datePickerDialog3.show();
        }
    }

    // 检测为 Lambda 实现
    private static final void f2(Calendar calendar0, WriteMiniSettingActivity writeMiniSettingActivity0, DatePicker datePicker0, int v, int v1, int v2) [...]

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        this.Q1();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Z z0 = Z.c(this.getLayoutInflater());
        L.o(z0, "inflate(...)");
        this.u = z0;
        Z z1 = null;
        if(z0 == null) {
            L.S("binding");
            z0 = null;
        }
        this.setContentView(z0.b());
        Z z2 = this.u;
        if(z2 == null) {
            L.S("binding");
        }
        else {
            z1 = z2;
        }
        this.S0(z1.A);
        kr.bhbfhfb.designcompat.a.d(this);
        this.W1();
        this.R1();
        this.V1();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.w;
        if(o0 != null) {
            o0.l();
        }
        this.w = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

