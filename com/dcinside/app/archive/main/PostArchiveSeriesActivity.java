package com.dcinside.app.archive.main;

import Y.i0;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.archive.page.f;
import com.dcinside.app.base.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPostArchiveSeriesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostArchiveSeriesActivity.kt\ncom/dcinside/app/archive/main/PostArchiveSeriesActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class PostArchiveSeriesActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private i0 w;
    @l
    public static final a x = null;
    @l
    public static final String y = "PostArchiveSeriesActivity.EXTRA_SERIES_INPUT_MODE";

    static {
        PostArchiveSeriesActivity.x = new a(null);
    }

    private final void K1() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B0E39);  // id:series_post_archive_fragment
        if(fragment0 instanceof f) {
            ((f)fragment0).S0();
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        i0 i00 = i0.c(this.getLayoutInflater());
        L.o(i00, "inflate(...)");
        this.w = i00;
        i0 i01 = null;
        if(i00 == null) {
            L.S("binding");
            i00 = null;
        }
        this.setContentView(i00.b());
        i0 i02 = this.w;
        if(i02 == null) {
            L.S("binding");
        }
        else {
            i01 = i02;
        }
        this.S0(i01.c);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle("글 추가하기 - 글 보관함");
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        if(fragmentManager0.r0(0x7F0B0E39) == null) {  // id:series_post_archive_fragment
            f f0 = new f();
            f0.setArguments(this.getIntent().getExtras());
            fragmentManager0.u().C(0x7F0B0E39, f0).q();  // id:series_post_archive_fragment
        }
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F10000B, menu0);  // mipmap:ic_launcher15
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
            case 0x7F0B0E37: {  // id:series_menu_post_apply
                this.K1();
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

