package com.dcinside.app.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.uk;
import io.realm.F0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nRealmBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealmBaseActivity.kt\ncom/dcinside/app/base/RealmBaseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public abstract class g extends d {
    @m
    private F0 u;
    @m
    private ActivityResultLauncher v;

    @m
    public final F0 F1() {
        return this.u;
    }

    @m
    public final ActivityResultLauncher G1() {
        return this.v;
    }

    // 检测为 Lambda 实现
    private static final void H1(g g0, ActivityResult activityResult0) [...]

    public final void I1(@m ActivityResultLauncher activityResultLauncher0) {
        this.v = activityResultLauncher0;
    }

    private final void J1(Intent intent0) {
        String s = intent0.getStringExtra("com.dcinside.app.auth.AuthSecondActivity.EXTRA_OTP_LOGIN");
        B b0 = (B)uk.a.r(s, B.class);
        L.m(b0);
        com.dcinside.app.main.login.g.a.r(this, b0, false, this.F1());
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.u = F0.g4();
        this.v = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            Intent intent0 = activityResult0.a();
            if(activityResult0.c() == -1 && intent0 != null) {
                this.J1(intent0);
            }
        });
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        F0 f00 = this.u;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.close();
            }
        }
        this.u = null;
    }
}

