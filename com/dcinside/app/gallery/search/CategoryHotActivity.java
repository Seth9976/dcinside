package com.dcinside.app.gallery.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.dcinside.app.base.g;
import com.dcinside.app.type.m;
import java.util.Arrays;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nCategoryHotActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryHotActivity.kt\ncom/dcinside/app/gallery/search/CategoryHotActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,82:1\n192#2,7:83\n192#2,7:90\n*S KotlinDebug\n*F\n+ 1 CategoryHotActivity.kt\ncom/dcinside/app/gallery/search/CategoryHotActivity\n*L\n59#1:83,7\n64#1:90,7\n*E\n"})
public final class CategoryHotActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l m m0) {
            L.p(context0, "context");
            L.p(m0, "type");
            Intent intent0 = new Intent(context0, CategoryHotActivity.class);
            intent0.putExtra("com.dcinside.app.gallery.search.EXTRA_GALLERY_GRADE_TYPE", m0.c());
            context0.startActivity(intent0);
        }
    }

    @y4.m
    private f w;
    @y4.m
    private com.dcinside.app.gallery.a x;
    @l
    public static final a y = null;
    @l
    public static final String z = "com.dcinside.app.gallery.search.EXTRA_GALLERY_GRADE_TYPE";

    static {
        CategoryHotActivity.y = new a(null);
    }

    public final void K1() {
        f f0 = this.w;
        if(f0 != null) {
            f0.dismissAllowingStateLoss();
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = f.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.gallery.search.f");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.gallery.search.AboutMiniGuideDialog");
        }
        ((f)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        ((f)fragment0).show(fragmentManager0, "com.dcinside.app.gallery.search.f");
        this.w = (f)fragment0;
    }

    public final void L1() {
        com.dcinside.app.gallery.a a0 = this.x;
        if(a0 != null) {
            a0.dismissAllowingStateLoss();
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = com.dcinside.app.gallery.a.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.gallery.a");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.gallery.AboutPersonGuideDialog");
        }
        ((com.dcinside.app.gallery.a)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        ((com.dcinside.app.gallery.a)fragment0).show(fragmentManager0, "com.dcinside.app.gallery.a");
        this.x = (com.dcinside.app.gallery.a)fragment0;
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@y4.m Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0073);  // layout:activity_settings
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
        n n0 = new n();
        n0.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.gallery.search.EXTRA_GALLERY_GRADE_TYPE", this.getIntent().getIntExtra("com.dcinside.app.gallery.search.EXTRA_GALLERY_GRADE_TYPE", 0))}));
        fragmentTransaction0.C(0x7F0B0EE9, n0).q();  // id:settings_fragment_container
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        f f0 = this.w;
        if(f0 != null) {
            f0.dismissAllowingStateLoss();
        }
        com.dcinside.app.gallery.a a0 = this.x;
        if(a0 != null) {
            a0.dismissAllowingStateLoss();
        }
        super.onDestroy();
        this.w = null;
        this.x = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

