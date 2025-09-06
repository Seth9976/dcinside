package com.dcinside.app.settings;

import A3.p;
import Y.t0;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.dl;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nImageSizeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSizeActivity.kt\ncom/dcinside/app/settings/ImageSizeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1863#2,2:85\n*S KotlinDebug\n*F\n+ 1 ImageSizeActivity.kt\ncom/dcinside/app/settings/ImageSizeActivity\n*L\n39#1:85,2\n*E\n"})
public final class ImageSizeActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "context");
            appCompatActivity0.startActivityForResult(new Intent(appCompatActivity0, ImageSizeActivity.class), 0x400);
        }
    }

    private t0 u;
    @l
    private List v;
    @l
    private List w;
    @l
    public static final a x;

    static {
        ImageSizeActivity.x = new a(null);
    }

    public ImageSizeActivity() {
        this.v = u.H();
        this.w = u.H();
    }

    private final void F1() {
        int v = dl.a.a2();
        this.G1(((View)this.v.get(v)));
        this.setResult(-1);
    }

    private final void G1(View view0) {
        if(view0 == null) {
            return;
        }
        int v = this.v.size();
        for(int v1 = 0; v1 < v; ++v1) {
            boolean z = view0.getId() == ((View)this.v.get(v1)).getId();
            ((RadioButton)this.w.get(v1)).setChecked(z);
            if(z) {
                dl.a.M5(v1);
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.ImageSizeActivity$onCreate$1$1", f = "ImageSizeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final ImageSizeActivity m;

            b(ImageSizeActivity imageSizeActivity0, kotlin.coroutines.d d0) {
                this.m = imageSizeActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                b imageSizeActivity$b0 = new b(this.m, d0);
                imageSizeActivity$b0.l = view0;
                return imageSizeActivity$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.G1(((View)this.l));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        t0 t00 = t0.c(this.getLayoutInflater());
        L.o(t00, "inflate(...)");
        this.u = t00;
        if(t00 == null) {
            L.S("binding");
            t00 = null;
        }
        this.setContentView(t00.b());
        t0 t01 = this.u;
        if(t01 == null) {
            L.S("binding");
            t01 = null;
        }
        this.S0(t01.l);
        kr.bhbfhfb.designcompat.a.d(this);
        t0 t02 = this.u;
        if(t02 == null) {
            L.S("binding");
            t02 = null;
        }
        LinearLayout linearLayout0 = t02.b;
        t0 t03 = this.u;
        if(t03 == null) {
            L.S("binding");
            t03 = null;
        }
        LinearLayout linearLayout1 = t03.c;
        t0 t04 = this.u;
        if(t04 == null) {
            L.S("binding");
            t04 = null;
        }
        LinearLayout linearLayout2 = t04.d;
        t0 t05 = this.u;
        if(t05 == null) {
            L.S("binding");
            t05 = null;
        }
        LinearLayout linearLayout3 = t05.e;
        t0 t06 = this.u;
        if(t06 == null) {
            L.S("binding");
            t06 = null;
        }
        this.v = u.O(new LinearLayout[]{linearLayout0, linearLayout1, linearLayout2, linearLayout3, t06.f});
        t0 t07 = this.u;
        if(t07 == null) {
            L.S("binding");
            t07 = null;
        }
        RadioButton radioButton0 = t07.g;
        L.o(radioButton0, "imageSizeSettingButton0");
        t0 t08 = this.u;
        if(t08 == null) {
            L.S("binding");
            t08 = null;
        }
        RadioButton radioButton1 = t08.h;
        L.o(radioButton1, "imageSizeSettingButton1");
        t0 t09 = this.u;
        if(t09 == null) {
            L.S("binding");
            t09 = null;
        }
        RadioButton radioButton2 = t09.i;
        L.o(radioButton2, "imageSizeSettingButton2");
        t0 t010 = this.u;
        if(t010 == null) {
            L.S("binding");
            t010 = null;
        }
        RadioButton radioButton3 = t010.j;
        L.o(radioButton3, "imageSizeSettingButton3");
        t0 t011 = this.u;
        if(t011 == null) {
            L.S("binding");
            t011 = null;
        }
        L.o(t011.k, "imageSizeSettingButton4");
        this.w = u.O(new RadioButton[]{radioButton0, radioButton1, radioButton2, radioButton3, t011.k});
        for(Object object0: this.v) {
            r.M(((View)object0), null, new b(this, null), 1, null);
        }
        this.F1();
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

