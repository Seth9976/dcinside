package com.dcinside.app.settings.block;

import Y.n;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.core.os.BundleKt;
import com.dcinside.app.base.g;
import com.dcinside.app.util.Dl;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

public final class BlockSettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "galleryId";
    @l
    public static final String B = "galleryName";
    private n w;
    @m
    private String x;
    @m
    private String y;
    @l
    public static final a z;

    static {
        BlockSettingActivity.z = new a(null);
    }

    // 检测为 Lambda 实现
    private static final void L1(BlockSettingActivity blockSettingActivity0, i tabLayout$i0, int v) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        n n0 = n.c(this.getLayoutInflater());
        L.o(n0, "inflate(...)");
        this.w = n0;
        n n1 = null;
        if(n0 == null) {
            L.S("binding");
            n0 = null;
        }
        this.setContentView(n0.b());
        n n2 = this.w;
        if(n2 == null) {
            L.S("binding");
            n2 = null;
        }
        this.S0(n2.b);
        kr.bhbfhfb.designcompat.a.d(this);
        this.x = this.getIntent().getStringExtra("galleryId");
        this.y = this.getIntent().getStringExtra("galleryName");
        if(m0.a.a.h(this.x)) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        if(this.F1() == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        b b0 = new b(this, BundleKt.b(new V[]{r0.a("galleryId", this.x), r0.a("galleryName", this.y)}));
        n n3 = this.w;
        if(n3 == null) {
            L.S("binding");
            n3 = null;
        }
        n3.c.setAdapter(b0);
        n n4 = this.w;
        if(n4 == null) {
            L.S("binding");
            n4 = null;
        }
        TabLayout tabLayout0 = n4.d;
        n n5 = this.w;
        if(n5 == null) {
            L.S("binding");
        }
        else {
            n1 = n5;
        }
        com.dcinside.app.settings.block.a a0 = (i tabLayout$i0, int v) -> {
            L.p(this, "this$0");
            L.p(tabLayout$i0, "tab");
            switch(v) {
                case 0: {
                    tabLayout$i0.D("게시물");
                    return;
                }
                case 1: {
                    tabLayout$i0.D("이미지");
                    return;
                }
                case 2: {
                    tabLayout$i0.D("디시콘");
                    return;
                }
                case 3: {
                    tabLayout$i0.D("신고");
                }
            }
        };
        new d(tabLayout0, n1.c, a0).a();
        this.setResult(-1);
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

