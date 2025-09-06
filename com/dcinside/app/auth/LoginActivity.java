package com.dcinside.app.auth;

import Y.B;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.dcinside.app.base.g;
import com.dcinside.app.view.DcToolbar;
import io.realm.F0;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class LoginActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Activity activity0, @m String s) {
            L.p(activity0, "activity");
            Intent intent0 = new Intent(activity0, LoginActivity.class).putExtra("dIdx", s);
            L.o(intent0, "putExtra(...)");
            activity0.startActivityForResult(intent0, 0x3F4);
        }

        @l
        @n
        public final Intent b(@m Context context0, boolean z) {
            Intent intent0 = new Intent(context0, LoginActivity.class).putExtra("s", z);
            L.o(intent0, "putExtra(...)");
            return intent0;
        }
    }

    private B w;
    @l
    public static final a x = null;
    @l
    public static final String y = "s";
    @l
    public static final String z = "dIdx";

    static {
        LoginActivity.x = new a(null);
    }

    private final void K1() {
        Fragment fragment0 = this.getSupportFragmentManager().s0("com.dcinside.app.auth.r");
        if(fragment0 == null) {
            fragment0 = new r();
        }
        this.getSupportFragmentManager().u().D(0x7F0B073D, fragment0, "com.dcinside.app.auth.r").q();  // id:login_container
    }

    private final void L1(boolean z) {
        Intent intent0 = new Intent(this, AuthenticatorActivity.class);
        Intent intent1 = this.getIntent();
        if(intent1 != null) {
            intent0.putExtra("s", intent1.getBooleanExtra("s", false));
        }
        if(z) {
            this.startActivity(intent0);
            return;
        }
        this.startActivityForResult(intent0, 0x3F5);
    }

    private final void M1() {
        static final class b extends N implements Function1 {
            final LoginActivity e;

            b(LoginActivity loginActivity0) {
                this.e = loginActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                this.e.finish();
            }
        }

        com.dcinside.app.realm.B.b b$b0 = com.dcinside.app.realm.B.E;
        com.dcinside.app.realm.B b0 = b$b0.V(this.F1());
        if(b0 == null) {
            this.finish();
            return;
        }
        b$b0.Z(this, b0, new b(this));
    }

    @l
    @n
    public static final Intent N1(@m Context context0, boolean z) {
        return LoginActivity.x.b(context0, z);
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 0x3F5: {
                if(v1 == -1) {
                    this.getIntent().putExtra("com.dcinside.app.EXTRA_LOGIN_URL_RESULT", com.dcinside.app.realm.B.E.k0());
                    this.setResult(-1, this.getIntent());
                }
                this.finish();
                break;
            }
            case 0x40C: {
                Fragment fragment0 = this.getSupportFragmentManager().r0(0x7F0B073D);  // id:login_container
                if(fragment0 == null) {
                    return;
                }
                fragment0.onActivityResult(0x40C, v1, intent0);
                return;
            label_8:
                if(v1 == -1 && intent0 != null && intent0.getBooleanExtra("com.dcinside.app.EXTRA_DC_WITHDRAW_SUCCESS", false)) {
                    this.M1();
                    return;
                }
                break;
            }
            default: {
                goto label_8;
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    @SuppressLint({"PrivateResource"})
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        B b0 = B.c(this.getLayoutInflater());
        L.o(b0, "inflate(...)");
        this.w = b0;
        B b1 = null;
        if(b0 == null) {
            L.S("binding");
            b0 = null;
        }
        this.setContentView(b0.b());
        B b2 = this.w;
        if(b2 == null) {
            L.S("binding");
        }
        else {
            b1 = b2;
        }
        DcToolbar dcToolbar0 = b1.c;
        L.o(dcToolbar0, "loginToolbar");
        this.S0(dcToolbar0);
        kr.bhbfhfb.designcompat.a.d(this);
        F0 f00 = this.F1();
        L.m(f00);
        if(com.dcinside.app.realm.B.E.l0(f00) == null) {
            this.L1(false);
        }
        else {
            this.K1();
        }
        if(this.getIntent().hasExtra("s")) {
            dcToolbar0.setNavigationIcon(0x7F08012F);  // drawable:btn_close
        }
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

