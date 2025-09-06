package com.dcinside.app.gif;

import Y.v;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.dcinside.app.base.g;
import com.dcinside.app.util.Dl;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import kr.bhbfhfb.designcompat.a;
import y4.l;
import y4.m;

public final class GifMakeActivity extends g {
    private v w;
    @m
    private I0 x;
    private long y;

    public GifMakeActivity() {
        this.y = -1L;
    }

    public final long K1() {
        return this.y;
    }

    public final void L1(@l String s) {
        @f(c = "com.dcinside.app.gif.GifMakeActivity$onError$1", f = "GifMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            final GifMakeActivity l;
            final String m;

            b(GifMakeActivity gifMakeActivity0, String s, d d0) {
                this.l = gifMakeActivity0;
                this.m = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new b(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.G(this.l, this.m);
                this.l.finish();
                return S0.a;
            }
        }

        L.p(s, "msg");
        k.f(P.a(h0.e()), null, null, new b(this, s, null), 3, null);
    }

    @SuppressLint({"CommitTransaction"})
    public final void M1(@l Fragment fragment0, @l Bundle bundle0) {
        com.dcinside.app.gif.k k0;
        L.p(fragment0, "fragment");
        L.p(bundle0, "bundle");
        if(fragment0 instanceof com.dcinside.app.gif.o) {
            k0 = com.dcinside.app.gif.maker.d.f.a(bundle0);
        }
        else if(fragment0 instanceof com.dcinside.app.gif.k) {
            k0 = com.dcinside.app.gif.maker.d.f.b(bundle0);
        }
        else {
            k0 = null;
        }
        if(k0 == null) {
            this.setResult(-1, new Intent().putExtras(bundle0));
            this.finish();
            return;
        }
        this.getSupportFragmentManager().u().C(0x7F0B051C, k0).o(null).r();  // id:gif_make_fragment
    }

    @Override  // com.dcinside.app.base.g
    @SuppressLint({"CommitTransaction"})
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        v v0 = v.c(this.getLayoutInflater());
        L.o(v0, "inflate(...)");
        this.w = v0;
        v v1 = null;
        if(v0 == null) {
            L.S("binding");
            v0 = null;
        }
        this.setContentView(v0.b());
        v v2 = this.w;
        if(v2 == null) {
            L.S("binding");
        }
        else {
            v1 = v2;
        }
        L.o(v1.b, "gifDcToolbar");
        this.S0(v1.b);
        a.d(this);
        long v3 = this.getIntent().getLongExtra("extra_max_upload_size", -1L);
        this.y = v3;
        if(v3 == -1L) {
            this.finish();
            return;
        }
        switch(this.getIntent().getIntExtra("extra_type", -1)) {
            case 0: {
                FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().u();
                Bundle bundle1 = this.getIntent().getExtras();
                fragmentTransaction0.C(0x7F0B051C, com.dcinside.app.gif.maker.d.f.a(bundle1)).q();  // id:gif_make_fragment
                return;
            }
            case 1: {
                FragmentTransaction fragmentTransaction1 = this.getSupportFragmentManager().u();
                Bundle bundle2 = this.getIntent().getExtras();
                fragmentTransaction1.C(0x7F0B051C, com.dcinside.app.gif.maker.d.f.c(bundle2)).q();  // id:gif_make_fragment
                return;
            }
            default: {
                this.finish();
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        @f(c = "com.dcinside.app.gif.GifMakeActivity$onDestroy$1", f = "GifMakeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nGifMakeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMakeActivity.kt\ncom/dcinside/app/gif/GifMakeActivity$onDestroy$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,110:1\n13346#2:111\n13346#2,2:112\n13347#2:114\n*S KotlinDebug\n*F\n+ 1 GifMakeActivity.kt\ncom/dcinside/app/gif/GifMakeActivity$onDestroy$1\n*L\n65#1:111\n68#1:112,2\n65#1:114\n*E\n"})
        static final class com.dcinside.app.gif.GifMakeActivity.a extends o implements A3.o {
            int k;

            com.dcinside.app.gif.GifMakeActivity.a(d d0) {
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.gif.GifMakeActivity.a(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.gif.GifMakeActivity.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                File[] arr_file = {com.dcinside.app.gif.maker.d.f.d(), com.dcinside.app.gif.maker.d.f.e()};
                for(int v = 0; v < 2; ++v) {
                    File file0 = arr_file[v];
                    if(file0.exists() && file0.isDirectory()) {
                        File[] arr_file1 = file0.listFiles();
                        if(arr_file1 == null) {
                            arr_file1 = new File[0];
                        }
                        else {
                            L.m(arr_file1);
                        }
                        int v1 = arr_file1.length;
                        for(int v2 = 0; v2 < v1; ++v2) {
                            arr_file1[v2].delete();
                        }
                    }
                }
                return S0.a;
            }
        }

        I0 i00 = this.x;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.x = null;
        k.f(P.a(h0.c()), null, null, new com.dcinside.app.gif.GifMakeActivity.a(null), 3, null);
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

