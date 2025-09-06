package com.dcinside.app.memo;

import Y.K0;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import com.dcinside.app.base.g;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.google.android.material.tabs.TabLayout.f;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class UserMemoActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "galleryId";
    private K0 w;
    @m
    private String x;
    @l
    private final f y;
    @l
    public static final a z;

    static {
        UserMemoActivity.z = new a(null);
    }

    public UserMemoActivity() {
        public static final class b implements f {
            final UserMemoActivity a;

            b(UserMemoActivity userMemoActivity0) {
                this.a = userMemoActivity0;
                super();
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void N(@m i tabLayout$i0) {
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void R(@m i tabLayout$i0) {
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void j(@m i tabLayout$i0) {
                if(tabLayout$i0 != null && tabLayout$i0.k() == 1) {
                    dl.a.n4(false);
                    tabLayout$i0.D("전체 갤러리");
                }
            }
        }

        this.y = new b(this);
    }

    private final void L1() {
        K0 k00 = this.w;
        K0 k01 = null;
        if(k00 == null) {
            L.S("binding");
            k00 = null;
        }
        y y0 = new y(this, this.x);
        k00.d.setAdapter(y0);
        K0 k02 = this.w;
        if(k02 == null) {
            L.S("binding");
            k02 = null;
        }
        k02.c.setVisibility(0);
        K0 k03 = this.w;
        if(k03 == null) {
            L.S("binding");
            k03 = null;
        }
        TabLayout tabLayout0 = k03.e;
        K0 k04 = this.w;
        if(k04 == null) {
            L.S("binding");
            k04 = null;
        }
        o o0 = (i tabLayout$i0, int v) -> {
            String s;
            L.p(this, "this$0");
            L.p(tabLayout$i0, "tab");
            switch(v) {
                case 0: {
                    s = "현재 갤러리";
                    break;
                }
                case 1: {
                    SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("전체 갤러리");
                    if(dl.a.u0()) {
                        spannableStringBuilder0.append(' ');
                        spannableStringBuilder0.append(' ');
                        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(this, 0x7F0804E3, null, 0, 0, false, null, 0x7C, null));  // drawable:ranking_new_memo
                    }
                    s = spannableStringBuilder0;
                    break;
                }
                default: {
                    s = "현재 갤러리";
                }
            }
            tabLayout$i0.D(s);
        };
        new d(tabLayout0, k04.d, o0).a();
        K0 k05 = this.w;
        if(k05 == null) {
            L.S("binding");
        }
        else {
            k01 = k05;
        }
        k01.e.h(this.y);
    }

    // 检测为 Lambda 实现
    private static final void M1(UserMemoActivity userMemoActivity0, i tabLayout$i0, int v) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        K0 k00 = K0.c(this.getLayoutInflater());
        L.o(k00, "inflate(...)");
        this.w = k00;
        K0 k01 = null;
        if(k00 == null) {
            L.S("binding");
            k00 = null;
        }
        this.setContentView(k00.b());
        K0 k02 = this.w;
        if(k02 == null) {
            L.S("binding");
        }
        else {
            k01 = k02;
        }
        this.S0(k01.b);
        kr.bhbfhfb.designcompat.a.d(this);
        this.x = this.getIntent().getStringExtra("galleryId");
        if(!m0.a.a.i(this.x) && this.F1() != null) {
            this.L1();
            return;
        }
        Dl.D(this, 0x7F150651);  // string:memo_failed_initialize "이용자 메모 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
        this.finish();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        K0 k00 = this.w;
        if(k00 == null) {
            L.S("binding");
            k00 = null;
        }
        k00.e.N(this.y);
        super.onDestroy();
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

