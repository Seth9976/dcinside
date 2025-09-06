package com.dcinside.app.auth;

import Y.C;
import android.os.Bundle;
import android.view.MenuItem;
import com.dcinside.app.base.g;
import kotlin.jvm.internal.L;
import kr.bhbfhfb.designcompat.a;
import y4.l;
import y4.m;

public final class LoginNotificationActivity extends g {
    private C w;

    private final void K1() {
        C c0 = this.w;
        C c1 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        this.S0(c0.f);
        a.d(this);
        C c2 = this.w;
        if(c2 == null) {
            L.S("binding");
        }
        else {
            c1 = c2;
        }
        c1.f.setNavigationIcon(0x7F08012F);  // drawable:btn_close
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        C c0 = C.c(this.getLayoutInflater());
        L.o(c0, "inflate(...)");
        this.w = c0;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        this.setContentView(c0.b());
        this.K1();
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

    @Override  // com.dcinside.app.base.d
    public boolean t1() {
        return false;
    }
}

