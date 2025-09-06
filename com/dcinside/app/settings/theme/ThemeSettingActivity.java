package com.dcinside.app.settings.theme;

import Y.F0;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.dcinside.app.base.g;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ThemeSettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "com.dcinside.app.extra.DARK";
    private F0 w;
    private boolean x;
    @l
    public static final a y = null;
    @l
    public static final String z = "com.dcinside.app.extra.THEME";

    static {
        ThemeSettingActivity.y = new a(null);
    }

    // 检测为 Lambda 实现
    private static final boolean L1(ThemeSettingActivity themeSettingActivity0, View view0, int v) [...]

    private final boolean M1(int v) {
        F0 f00 = this.w;
        if(f00 == null) {
            L.S("binding");
            f00 = null;
        }
        com.dcinside.app.settings.theme.a a0 = (com.dcinside.app.settings.theme.a)f00.b.getAdapter();
        if(a0 != null) {
            com.dcinside.app.type.g g0 = a0.v(v);
            if(g0 != null) {
                int v1 = g0.ordinal();
                if(!this.x) {
                    if(dl.a.s2() != v1) {
                    label_13:
                        Intent intent0 = new Intent();
                        intent0.putExtra("com.dcinside.app.extra.THEME", v1);
                        intent0.putExtra("com.dcinside.app.extra.DARK", this.x);
                        this.setResult(-1, intent0);
                    }
                }
                else if(dl.a.r2() != v1) {
                    goto label_13;
                }
                this.finish();
                return true;
            }
        }
        return false;
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        F0 f00 = F0.c(this.getLayoutInflater());
        L.o(f00, "inflate(...)");
        this.w = f00;
        F0 f01 = null;
        if(f00 == null) {
            L.S("binding");
            f00 = null;
        }
        this.setContentView(f00.b());
        F0 f02 = this.w;
        if(f02 == null) {
            L.S("binding");
            f02 = null;
        }
        this.S0(f02.c);
        kr.bhbfhfb.designcompat.a.d(this);
        Intent intent0 = this.getIntent();
        boolean z = intent0 == null ? false : intent0.getBooleanExtra("com.dcinside.app.extra.DARK", false);
        this.x = z;
        this.setTitle((z ? 0x7F1508E6 : 0x7F150901));  // string:screen_setting_dark_theme_text "야간 모드 색상"
        F0 f03 = this.w;
        if(f03 == null) {
            L.S("binding");
        }
        else {
            f01 = f03;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        f01.b.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.settings.theme.a a0 = new com.dcinside.app.settings.theme.a(this.x);
        f01.b.setAdapter(a0);
        b b0 = new b(this);
        f01.b.addItemDecoration(b0);
        d d0 = (View view0, int v) -> {
            L.p(this, "this$0");
            L.p(view0, "<anonymous parameter 0>");
            return this.M1(v);
        };
        com.dcinside.app.util.ql.b.e(f01.b, d0);
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

