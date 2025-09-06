package com.dcinside.app.gallery.status;

import Y.O;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.g;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nMyGalleryStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyGalleryStatusActivity.kt\ncom/dcinside/app/gallery/status/MyGalleryStatusActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1863#2,2:92\n1863#2,2:94\n*S KotlinDebug\n*F\n+ 1 MyGalleryStatusActivity.kt\ncom/dcinside/app/gallery/status/MyGalleryStatusActivity\n*L\n60#1:92,2\n36#1:94,2\n*E\n"})
public final class MyGalleryStatusActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, MyGalleryStatusActivity.class));
        }
    }

    @l
    public static final a A;
    private O w;
    @m
    private Boolean x;
    @m
    private Boolean y;
    @m
    private ActivityResultLauncher z;

    static {
        MyGalleryStatusActivity.A = new a(null);
    }

    private final void L1() {
        if(this.x != null && this.y != null && L.g(this.x, Boolean.TRUE) && L.g(this.y, Boolean.FALSE)) {
            O o0 = this.w;
            if(o0 == null) {
                L.S("binding");
                o0 = null;
            }
            o0.b.S(1, false);
        }
    }

    @m
    public final ActivityResultLauncher M1() {
        return this.z;
    }

    // 检测为 Lambda 实现
    private static final void N1(MyGalleryStatusActivity myGalleryStatusActivity0, ActivityResult activityResult0) [...]

    public final void O1(boolean z) {
        this.y = Boolean.valueOf(z);
        this.L1();
    }

    public final void P1(boolean z) {
        this.x = Boolean.valueOf(z);
        this.L1();
    }

    public final void Q1(@m ActivityResultLauncher activityResultLauncher0) {
        this.z = activityResultLauncher0;
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v1 == -1) {
            List list0 = this.getSupportFragmentManager().I0();
            L.o(list0, "getFragments(...)");
            for(Object object0: list0) {
                ((Fragment)object0).onActivityResult(v, -1, intent0);
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        O o0 = O.c(this.getLayoutInflater());
        L.o(o0, "inflate(...)");
        this.w = o0;
        O o1 = null;
        if(o0 == null) {
            L.S("binding");
            o0 = null;
        }
        this.setContentView(o0.b());
        O o2 = this.w;
        if(o2 == null) {
            L.S("binding");
            o2 = null;
        }
        this.S0(o2.e);
        kr.bhbfhfb.designcompat.a.d(this);
        this.z = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == 1150) {
                List list0 = this.getSupportFragmentManager().I0();
                L.o(list0, "getFragments(...)");
                for(Object object0: list0) {
                    Fragment fragment0 = (Fragment)object0;
                    if(fragment0 instanceof n) {
                        ((n)fragment0).t0();
                    }
                }
            }
        });
        O o3 = this.w;
        if(o3 == null) {
            L.S("binding");
            o3 = null;
        }
        TabLayout tabLayout0 = o3.c;
        O o4 = this.w;
        if(o4 == null) {
            L.S("binding");
            o4 = null;
        }
        tabLayout0.setupWithViewPager(o4.b);
        O o5 = this.w;
        if(o5 == null) {
            L.S("binding");
        }
        else {
            o1 = o5;
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        b b0 = new b(fragmentManager0);
        o1.b.setAdapter(b0);
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

