package com.dcinside.app.settings.launchericon;

import Y.v0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.base.g;
import com.dcinside.app.post.r1;
import com.dcinside.app.view.tool.NonPredictiveGridLayoutManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nLauncherIconSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherIconSettingActivity.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,79:1\n25#2:80\n*S KotlinDebug\n*F\n+ 1 LauncherIconSettingActivity.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingActivity\n*L\n35#1:80\n*E\n"})
public final class LauncherIconSettingActivity extends g implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private v0 w;
    @m
    private o x;
    @l
    public static final a y = null;
    @l
    public static final String z = "com.dcinside.app.extra.LAUNCHER_ICON_ID";

    static {
        LauncherIconSettingActivity.y = new a(null);
    }

    @Override  // com.dcinside.app.settings.launchericon.d
    public void A(@m Bitmap bitmap0) {
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @s0({"SMAP\nLauncherIconSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherIconSettingActivity.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingActivity$onCreate$3\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,79:1\n25#2:80\n*S KotlinDebug\n*F\n+ 1 LauncherIconSettingActivity.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingActivity$onCreate$3\n*L\n41#1:80\n*E\n"})
        public static final class b extends OnBackPressedCallback {
            final LauncherIconSettingActivity d;

            b(LauncherIconSettingActivity launcherIconSettingActivity0) {
                this.d = launcherIconSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                v0 v00 = this.d.w;
                Adapter recyclerView$Adapter0 = null;
                if(v00 == null) {
                    L.S("binding");
                    v00 = null;
                }
                L.o(v00.b, "settingLauncherIconRecycler");
                Adapter recyclerView$Adapter1 = v00.b.getAdapter();
                if(recyclerView$Adapter1 instanceof com.dcinside.app.settings.launchericon.b) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0) != null && ((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0).v() >= 0) {
                    Intent intent0 = new Intent();
                    intent0.putExtra("com.dcinside.app.extra.LAUNCHER_ICON_ID", ((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0).v());
                    this.d.setResult(-1, intent0);
                }
                this.d.finish();
            }
        }

        super.onCreate(bundle0);
        v0 v00 = v0.c(this.getLayoutInflater());
        L.o(v00, "inflate(...)");
        this.w = v00;
        Adapter recyclerView$Adapter0 = null;
        if(v00 == null) {
            L.S("binding");
            v00 = null;
        }
        this.setContentView(v00.b());
        v0 v01 = this.w;
        if(v01 == null) {
            L.S("binding");
            v01 = null;
        }
        this.S0(v01.c);
        kr.bhbfhfb.designcompat.a.d(this);
        v0 v02 = this.w;
        if(v02 == null) {
            L.S("binding");
            v02 = null;
        }
        L.o(v02.b, "settingLauncherIconRecycler");
        NonPredictiveGridLayoutManager nonPredictiveGridLayoutManager0 = new NonPredictiveGridLayoutManager(4, 1, false);
        v02.b.setLayoutManager(nonPredictiveGridLayoutManager0);
        com.dcinside.app.settings.launchericon.b b0 = new com.dcinside.app.settings.launchericon.b();
        v02.b.setAdapter(b0);
        Adapter recyclerView$Adapter1 = v02.b.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.settings.launchericon.b) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0).G(com.dcinside.app.settings.launchericon.a.b.a());
            ((com.dcinside.app.settings.launchericon.b)recyclerView$Adapter0).H(this);
        }
        this.getOnBackPressedDispatcher().h(new b(this));
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
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

    @Override  // com.dcinside.app.settings.launchericon.d
    public void p(@l com.dcinside.app.settings.launchericon.a a0) {
        L.p(a0, "icon");
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = r1.a.f(this, a0);
    }
}

