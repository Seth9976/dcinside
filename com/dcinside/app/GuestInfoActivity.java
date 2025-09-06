package com.dcinside.app;

import A3.p;
import A3.q;
import Y.w;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.t;
import com.dcinside.app.util.Dl;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class GuestInfoActivity extends d {
    private w u;

    private final void H1(@StringRes int v) {
        String s = this.getString(v);
        L.o(s, "getString(...)");
        this.I1(s);
    }

    private final void I1(String s) {
        static final class a extends N implements Function1 {
            final String e;

            a(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }

        e.e.a(this).n(new a(s)).z(0x104000A).b().t5();
    }

    // 检测为 Lambda 实现
    private static final void J1(GuestInfoActivity guestInfoActivity0, MenuItem menuItem0, View view0) [...]

    private final void K1() {
        w w0 = this.u;
        w w1 = null;
        if(w0 == null) {
            L.S("binding");
            w0 = null;
        }
        SwitchCompat switchCompat0 = w0.c;
        w w2 = this.u;
        if(w2 == null) {
            L.S("binding");
        }
        else {
            w1 = w2;
        }
        switchCompat0.setChecked(!w1.c.isChecked());
    }

    private final void L1(boolean z) {
        w w0 = this.u;
        w w1 = null;
        if(w0 == null) {
            L.S("binding");
            w0 = null;
        }
        w0.b.setEnabled(z);
        w w2 = this.u;
        if(w2 == null) {
            L.S("binding");
            w2 = null;
        }
        w2.e.setEnabled(z);
        w w3 = this.u;
        if(w3 == null) {
            L.S("binding");
            w3 = null;
        }
        w3.f.setEnabled(z);
        w w4 = this.u;
        if(w4 == null) {
            L.S("binding");
            w4 = null;
        }
        w4.c.setChecked(z);
        w w5 = this.u;
        if(w5 == null) {
            L.S("binding");
            w5 = null;
        }
        if(w5.b.isEnabled()) {
            w w6 = this.u;
            if(w6 == null) {
                L.S("binding");
            }
            else {
                w1 = w6;
            }
            w1.b.setAlpha(1.0f);
            return;
        }
        w w7 = this.u;
        if(w7 == null) {
            L.S("binding");
        }
        else {
            w1 = w7;
        }
        w1.b.setAlpha(0.5f);
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.GuestInfoActivity$onCreate$1", f = "GuestInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final GuestInfoActivity l;

            b(GuestInfoActivity guestInfoActivity0, kotlin.coroutines.d d0) {
                this.l = guestInfoActivity0;
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
                this.l.K1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.GuestInfoActivity$onCreate$2", f = "GuestInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements q {
            int k;
            boolean l;
            final GuestInfoActivity m;

            c(GuestInfoActivity guestInfoActivity0, kotlin.coroutines.d d0) {
                this.m = guestInfoActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                c guestInfoActivity$c0 = new c(this.m, d0);
                guestInfoActivity$c0.l = z;
                return guestInfoActivity$c0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.L1(this.l);
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        w w0 = w.c(this.getLayoutInflater());
        L.o(w0, "inflate(...)");
        this.u = w0;
        w w1 = null;
        if(w0 == null) {
            L.S("binding");
            w0 = null;
        }
        this.setContentView(w0.b());
        this.getWindow().setSoftInputMode(3);
        w w2 = this.u;
        if(w2 == null) {
            L.S("binding");
            w2 = null;
        }
        this.S0(w2.g);
        kr.bhbfhfb.designcompat.a.d(this);
        t t0 = t.i.a();
        w w3 = this.u;
        if(w3 == null) {
            L.S("binding");
            w3 = null;
        }
        boolean z = t0.R5();
        w3.c.setChecked(z);
        w w4 = this.u;
        if(w4 == null) {
            L.S("binding");
            w4 = null;
        }
        L.o(w4.d, "guestEnableView");
        b guestInfoActivity$b0 = new b(this, null);
        r.M(w4.d, null, guestInfoActivity$b0, 1, null);
        w w5 = this.u;
        if(w5 == null) {
            L.S("binding");
            w5 = null;
        }
        L.o(w5.c, "guestEnable");
        c guestInfoActivity$c0 = new c(this, null);
        r.J(w5.c, null, guestInfoActivity$c0, 1, null);
        w w6 = this.u;
        if(w6 == null) {
            L.S("binding");
            w6 = null;
        }
        String s = t0.S5();
        w6.e.setText(s);
        w w7 = this.u;
        if(w7 == null) {
            L.S("binding");
            w7 = null;
        }
        String s1 = t0.T5();
        w7.f.setText(s1);
        w w8 = this.u;
        if(w8 == null) {
            L.S("binding");
            w8 = null;
        }
        this.L1(w8.c.isChecked());
        w w9 = this.u;
        if(w9 == null) {
            L.S("binding");
        }
        else {
            w1 = w9;
        }
        w1.g.setNavigationIcon(0x7F08012F);  // drawable:btn_close
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100016, menu0);  // mipmap:ic_launcher25
        MenuItem menuItem0 = menu0.findItem(0x7F0B0070);  // id:action_save
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B082E));  // id:menu_save
            if(button0 != null) {
                button0.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    L.m(menuItem0);
                    this.onOptionsItemSelected(menuItem0);
                });
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0070: {  // id:action_save
                w w0 = this.u;
                w w1 = null;
                if(w0 == null) {
                    L.S("binding");
                    w0 = null;
                }
                if(w0.c.isChecked()) {
                    w w2 = this.u;
                    if(w2 == null) {
                        L.S("binding");
                        w2 = null;
                    }
                    String s = String.valueOf(w2.e.getText());
                    w w3 = this.u;
                    if(w3 == null) {
                        L.S("binding");
                        w3 = null;
                    }
                    String s1 = String.valueOf(w3.f.getText());
                    m0.a.a a$a0 = m0.a.a;
                    if(a$a0.i(s)) {
                        this.H1(0x7F150802);  // string:post_write_nick_confirm "닉네임을 입력해 주세요."
                        return true;
                    }
                    if(s.length() < 2) {
                        String s2 = this.getString(0x7F150803, new Object[]{2});  // string:post_write_nick_more "닉네임은 최소 %1$d자 이상 입력해 주세요."
                        L.o(s2, "getString(...)");
                        this.I1(s2);
                        return true;
                    }
                    if(a$a0.i(s1)) {
                        this.H1(0x7F150807);  // string:post_write_pw_confirm "비밀번호를 입력해 주세요."
                        return true;
                    }
                    if(s1.length() < 4) {
                        String s3 = this.getString(0x7F150808, new Object[]{4});  // string:post_write_pw_more "비밀번호는 최소 %1$d자리 이상 입력해 주세요.\n\n쉬운 비밀번호는 타인이 수정 또는 삭제하기 
                                                                                  // 쉬우니 어려운 비밀번호를 입력해 주세요."
                        L.o(s3, "getString(...)");
                        this.I1(s3);
                        return true;
                    }
                }
                w w4 = this.u;
                if(w4 == null) {
                    L.S("binding");
                    w4 = null;
                }
                boolean z = w4.c.isChecked();
                w w5 = this.u;
                if(w5 == null) {
                    L.S("binding");
                    w5 = null;
                }
                String s4 = String.valueOf(w5.e.getText());
                w w6 = this.u;
                if(w6 == null) {
                    L.S("binding");
                }
                else {
                    w1 = w6;
                }
                String s5 = String.valueOf(w1.f.getText());
                try {
                    t.i.b(z, s4, s5);
                    this.finish();
                }
                catch(Exception exception0) {
                    Dl.G(this, exception0.getMessage());
                }
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

