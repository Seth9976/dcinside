package com.dcinside.app.settings;

import A3.p;
import A3.q;
import Y.A0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewGroupKt;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.B;
import com.dcinside.app.type.C;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nQuickWriteSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickWriteSettingActivity.kt\ncom/dcinside/app/settings/QuickWriteSettingActivity\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,105:1\n1317#2,2:106\n*S KotlinDebug\n*F\n+ 1 QuickWriteSettingActivity.kt\ncom/dcinside/app/settings/QuickWriteSettingActivity\n*L\n89#1:106,2\n*E\n"})
public final class QuickWriteSettingActivity extends d {
    private A0 u;

    private final void I1() {
        @f(c = "com.dcinside.app.settings.QuickWriteSettingActivity$initView$1", f = "QuickWriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements q {
            int k;
            final QuickWriteSettingActivity l;

            a(QuickWriteSettingActivity quickWriteSettingActivity0, kotlin.coroutines.d d0) {
                this.l = quickWriteSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.QuickWriteSettingActivity$initView$2", f = "QuickWriteSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final QuickWriteSettingActivity l;

            b(QuickWriteSettingActivity quickWriteSettingActivity0, kotlin.coroutines.d d0) {
                this.l = quickWriteSettingActivity0;
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
                A0 a00 = this.l.u;
                A0 a01 = null;
                if(a00 == null) {
                    L.S("binding");
                    a00 = null;
                }
                SwitchCompat switchCompat0 = a00.d;
                A0 a02 = this.l.u;
                if(a02 == null) {
                    L.S("binding");
                }
                else {
                    a01 = a02;
                }
                switchCompat0.setChecked(!a01.d.isChecked());
                return S0.a;
            }
        }

        A0 a00 = this.u;
        A0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        L.o(a00.d, "quickWriteSettingEnable");
        a quickWriteSettingActivity$a0 = new a(this, null);
        r.J(a00.d, null, quickWriteSettingActivity$a0, 1, null);
        A0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
            a02 = null;
        }
        L.o(a02.e, "quickWriteSettingEnableView");
        b quickWriteSettingActivity$b0 = new b(this, null);
        r.M(a02.e, null, quickWriteSettingActivity$b0, 1, null);
        A0 a03 = this.u;
        if(a03 == null) {
            L.S("binding");
            a03 = null;
        }
        G g0 = (RadioGroup radioGroup0, int v) -> {
            L.p(this, "this$0");
            L.m(radioGroup0);
            this.L1(radioGroup0, v);
        };
        a03.l.setOnCheckedChangeListener(g0);
        A0 a04 = this.u;
        if(a04 == null) {
            L.S("binding");
        }
        else {
            a01 = a04;
        }
        H h0 = (RadioGroup radioGroup0, int v) -> {
            L.p(this, "this$0");
            L.m(radioGroup0);
            this.L1(radioGroup0, v);
        };
        a01.g.setOnCheckedChangeListener(h0);
    }

    // 检测为 Lambda 实现
    private static final void J1(QuickWriteSettingActivity quickWriteSettingActivity0, RadioGroup radioGroup0, int v) [...]

    // 检测为 Lambda 实现
    private static final void K1(QuickWriteSettingActivity quickWriteSettingActivity0, RadioGroup radioGroup0, int v) [...]

    private final void L1(RadioGroup radioGroup0, int v) {
        for(Object object0: ViewGroupKt.e(radioGroup0)) {
            View view0 = (View)object0;
            CompoundButton compoundButton0 = view0 instanceof CompoundButton ? ((CompoundButton)view0) : null;
            if(compoundButton0 != null) {
                compoundButton0.jumpDrawablesToCurrentState();
            }
        }
        switch(radioGroup0.getId()) {
            case 0x7F0B0C04: {  // id:quick_write_setting_floating_group
                switch(v) {
                    case 0x7F0B0C05: {  // id:quick_write_setting_floating_icon
                        dl.a.s5(C.b.c());
                        return;
                    }
                    case 0x7F0B0C06: {  // id:quick_write_setting_floating_keep
                        dl.a.s5(C.c.c());
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 0x7F0B0C18: {  // id:quick_write_setting_list_group
                switch(v) {
                    case 0x7F0B0C19: {  // id:quick_write_setting_list_keep
                        dl.a.o5(B.b.c());
                        return;
                    }
                    case 0x7F0B0C1A: {  // id:quick_write_setting_list_refresh
                        dl.a.o5(B.c.c());
                    }
                }
            }
        }
    }

    private final void M1() {
        A0 a00 = this.u;
        A0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        boolean z = a00.d.isChecked();
        if(z) {
            A0 a02 = this.u;
            if(a02 == null) {
                L.S("binding");
                a02 = null;
            }
            a02.c.setEnabled(true);
            A0 a03 = this.u;
            if(a03 == null) {
                L.S("binding");
                a03 = null;
            }
            a03.c.setAlpha(1.0f);
        }
        else {
            A0 a04 = this.u;
            if(a04 == null) {
                L.S("binding");
                a04 = null;
            }
            a04.c.setEnabled(false);
            A0 a05 = this.u;
            if(a05 == null) {
                L.S("binding");
                a05 = null;
            }
            a05.c.setAlpha(0.5f);
        }
        A0 a06 = this.u;
        if(a06 == null) {
            L.S("binding");
            a06 = null;
        }
        a06.m.setEnabled(z);
        A0 a07 = this.u;
        if(a07 == null) {
            L.S("binding");
            a07 = null;
        }
        a07.n.setEnabled(z);
        A0 a08 = this.u;
        if(a08 == null) {
            L.S("binding");
            a08 = null;
        }
        a08.h.setEnabled(z);
        A0 a09 = this.u;
        if(a09 == null) {
            L.S("binding");
        }
        else {
            a01 = a09;
        }
        a01.i.setEnabled(z);
        dl.a.o6(z);
    }

    private final void N1() {
        A0 a00 = this.u;
        A0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        dl dl0 = dl.a;
        boolean z = dl0.C2();
        a00.d.setChecked(z);
        int v = dl0.y1();
        if(v == B.b.c()) {
            A0 a02 = this.u;
            if(a02 == null) {
                L.S("binding");
                a02 = null;
            }
            a02.m.setChecked(true);
        }
        else if(v == B.c.c()) {
            A0 a03 = this.u;
            if(a03 == null) {
                L.S("binding");
                a03 = null;
            }
            a03.n.setChecked(true);
        }
        int v1 = dl0.C1();
        if(v1 == C.b.c()) {
            A0 a04 = this.u;
            if(a04 == null) {
                L.S("binding");
            }
            else {
                a01 = a04;
            }
            a01.h.setChecked(true);
        }
        else if(v1 == C.c.c()) {
            A0 a05 = this.u;
            if(a05 == null) {
                L.S("binding");
            }
            else {
                a01 = a05;
            }
            a01.i.setChecked(true);
        }
        this.M1();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        A0 a00 = A0.c(this.getLayoutInflater());
        L.o(a00, "inflate(...)");
        this.u = a00;
        A0 a01 = null;
        if(a00 == null) {
            L.S("binding");
            a00 = null;
        }
        this.setContentView(a00.b());
        A0 a02 = this.u;
        if(a02 == null) {
            L.S("binding");
        }
        else {
            a01 = a02;
        }
        this.S0(a01.p);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle(0x7F15082E);  // string:quick_post_write_setting "퀵쓰기"
        this.I1();
        this.N1();
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

