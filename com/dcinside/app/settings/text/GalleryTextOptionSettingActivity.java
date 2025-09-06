package com.dcinside.app.settings.text;

import A3.q;
import Y.r0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import com.dcinside.app.realm.o;
import com.dcinside.app.realm.r;
import com.dcinside.app.settings.c;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.view.ClearableEditText;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import top.defaults.colorpicker.ColorPickerView;
import top.defaults.colorpicker.e;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryTextOptionSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTextOptionSettingActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionSettingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,342:1\n1#2:343\n38#3:344\n*S KotlinDebug\n*F\n+ 1 GalleryTextOptionSettingActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionSettingActivity\n*L\n239#1:344\n*E\n"})
public final class GalleryTextOptionSettingActivity extends c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l String s, @l String s1) {
            L.p(context0, "context");
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            Intent intent0 = new Intent(context0, GalleryTextOptionSettingActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_NAME", s1);
            context0.startActivity(intent0);
        }
    }

    static final class b implements com.dcinside.app.settings.c.a {
        @l
        private final String a;
        @l
        private final String b;
        private final boolean c;
        @l
        private final String d;
        @l
        private final String e;
        @l
        private final String f;
        @l
        private final String g;
        private final boolean h;
        @l
        private final String i;

        public b(@l String s, @l String s1, boolean z, @l String s2, @l String s3, @l String s4, @l String s5, boolean z1, @l String s6) {
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            L.p(s2, "writePrefixColor");
            L.p(s3, "writePrefix");
            L.p(s4, "writeSuffixColor");
            L.p(s5, "writeSuffix");
            L.p(s6, "replySuffix");
            super();
            this.a = s;
            this.b = s1;
            this.c = z;
            this.d = s2;
            this.e = s3;
            this.f = s4;
            this.g = s5;
            this.h = z1;
            this.i = s6;
        }

        @Override  // com.dcinside.app.settings.c$a
        public boolean a(@l com.dcinside.app.settings.c.a c$a0) {
            L.p(c$a0, "other");
            return false;
        }

        @l
        public final String b() {
            return this.a;
        }

        @l
        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        @l
        public final String e() {
            return this.d;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(!L.g(this.a, ((b)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((b)object0).b)) {
                return false;
            }
            if(this.c != ((b)object0).c) {
                return false;
            }
            if(!L.g(this.d, ((b)object0).d)) {
                return false;
            }
            if(!L.g(this.e, ((b)object0).e)) {
                return false;
            }
            if(!L.g(this.f, ((b)object0).f)) {
                return false;
            }
            if(!L.g(this.g, ((b)object0).g)) {
                return false;
            }
            return this.h == ((b)object0).h ? L.g(this.i, ((b)object0).i) : false;
        }

        @Override  // com.dcinside.app.settings.c$a
        public void f() {
            r r0 = new r();
            r0.Z5(this.c);
            r0.b6(this.d);
            r0.a6(this.e);
            r0.d6(this.f);
            r0.c6(this.g);
            r0.X5(this.h);
            r0.Y5(this.i);
            com.dcinside.app.realm.o.a.n(o.h, this.a, this.b, r0, false, 8, null);
        }

        @l
        public final String g() {
            return this.e;
        }

        @l
        public final String h() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return (((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + androidx.compose.foundation.c.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + androidx.compose.foundation.c.a(this.h)) * 0x1F + this.i.hashCode();
        }

        @l
        public final String i() {
            return this.g;
        }

        public final boolean j() {
            return this.h;
        }

        @l
        public final String k() {
            return this.i;
        }

        @l
        public final b l(@l String s, @l String s1, boolean z, @l String s2, @l String s3, @l String s4, @l String s5, boolean z1, @l String s6) {
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            L.p(s2, "writePrefixColor");
            L.p(s3, "writePrefix");
            L.p(s4, "writeSuffixColor");
            L.p(s5, "writeSuffix");
            L.p(s6, "replySuffix");
            return new b(s, s1, z, s2, s3, s4, s5, z1, s6);
        }

        public static b m(b galleryTextOptionSettingActivity$b0, String s, String s1, boolean z, String s2, String s3, String s4, String s5, boolean z1, String s6, int v, Object object0) {
            String s7 = (v & 1) == 0 ? s : galleryTextOptionSettingActivity$b0.a;
            String s8 = (v & 2) == 0 ? s1 : galleryTextOptionSettingActivity$b0.b;
            boolean z2 = (v & 4) == 0 ? z : galleryTextOptionSettingActivity$b0.c;
            String s9 = (v & 8) == 0 ? s2 : galleryTextOptionSettingActivity$b0.d;
            String s10 = (v & 16) == 0 ? s3 : galleryTextOptionSettingActivity$b0.e;
            String s11 = (v & 0x20) == 0 ? s4 : galleryTextOptionSettingActivity$b0.f;
            String s12 = (v & 0x40) == 0 ? s5 : galleryTextOptionSettingActivity$b0.g;
            boolean z3 = (v & 0x80) == 0 ? z1 : galleryTextOptionSettingActivity$b0.h;
            return (v & 0x100) == 0 ? galleryTextOptionSettingActivity$b0.l(s7, s8, z2, s9, s10, s11, s12, z3, s6) : galleryTextOptionSettingActivity$b0.l(s7, s8, z2, s9, s10, s11, s12, z3, galleryTextOptionSettingActivity$b0.i);
        }

        @l
        public final String n() {
            return this.a;
        }

        @l
        public final String o() {
            return this.b;
        }

        public final boolean p() {
            return this.h;
        }

        @l
        public final String q() {
            return this.i;
        }

        public final boolean r() {
            return this.c;
        }

        @l
        public final String s() {
            return this.e;
        }

        @l
        public final String t() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "InitialValue(galleryId=" + this.a + ", galleryName=" + this.b + ", writeEnable=" + this.c + ", writePrefixColor=" + this.d + ", writePrefix=" + this.e + ", writeSuffixColor=" + this.f + ", writeSuffix=" + this.g + ", replyEnable=" + this.h + ", replySuffix=" + this.i + ")";
        }

        @l
        public final String u() {
            return this.g;
        }

        @l
        public final String v() {
            return this.f;
        }
    }

    @m
    private o A;
    private int B;
    private int C;
    @m
    private b D;
    @m
    private AlertDialog E;
    @l
    public static final a F;
    private r0 z;

    static {
        GalleryTextOptionSettingActivity.F = new a(null);
    }

    public GalleryTextOptionSettingActivity() {
        super(null, 1, null);
    }

    private final void A2(CompoundButton compoundButton0, boolean z) {
        r0 r00 = null;
        switch(compoundButton0.getId()) {
            case 0x7F0B0D6C: {  // id:reply_setting_enable
                r0 r01 = this.z;
                if(r01 == null) {
                    L.S("binding");
                    r01 = null;
                }
                r01.b.setEnabled(z);
                r0 r02 = this.z;
                if(r02 == null) {
                    L.S("binding");
                    r02 = null;
                }
                r02.f.setEnabled(z);
                r0 r03 = this.z;
                if(r03 == null) {
                    L.S("binding");
                    r03 = null;
                }
                r03.c.setChecked(z);
                break;
            }
            case 0x7F0B1108: {  // id:write_setting_enable
                r0 r04 = this.z;
                if(r04 == null) {
                    L.S("binding");
                    r04 = null;
                }
                r04.j.setEnabled(z);
                r0 r05 = this.z;
                if(r05 == null) {
                    L.S("binding");
                    r05 = null;
                }
                r05.r.setEnabled(z);
                r0 r06 = this.z;
                if(r06 == null) {
                    L.S("binding");
                    r06 = null;
                }
                r06.o.setEnabled(z);
                r0 r07 = this.z;
                if(r07 == null) {
                    L.S("binding");
                    r07 = null;
                }
                r07.m.setEnabled(z);
                r0 r08 = this.z;
                if(r08 == null) {
                    L.S("binding");
                    r08 = null;
                }
                r08.p.setEnabled(z);
                r0 r09 = this.z;
                if(r09 == null) {
                    L.S("binding");
                    r09 = null;
                }
                r09.k.setChecked(z);
            }
        }
        r0 r010 = this.z;
        if(r010 == null) {
            L.S("binding");
            r010 = null;
        }
        float f = 0.5f;
        float f1 = r010.j.isEnabled() ? 1.0f : 0.5f;
        r010.j.setAlpha(f1);
        r0 r011 = this.z;
        if(r011 == null) {
            L.S("binding");
        }
        else {
            r00 = r011;
        }
        LinearLayout linearLayout0 = r00.b;
        if(linearLayout0.isEnabled()) {
            f = 1.0f;
        }
        linearLayout0.setAlpha(f);
    }

    private final void B2(int v, Function1 function10) {
        AlertDialog alertDialog0 = this.E;
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        LayoutInflater layoutInflater0 = LayoutInflater.from(this);
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
        L.n(view0, "null cannot be cast to non-null type android.view.ViewGroup");
        View view1 = layoutInflater0.inflate(0x7F0E00C1, ((ViewGroup)view0), false);  // layout:dialog_color_picker
        View view2 = view1.findViewById(0x7F0B02D5);  // id:color_picker_selected
        L.o(view2, "findViewById(...)");
        view2.setBackgroundColor(v);
        View view3 = view1.findViewById(0x7F0B02D0);  // id:color_picker_palette
        L.o(view3, "findViewById(...)");
        com.dcinside.app.settings.text.b b0 = (int v, boolean z, boolean z1) -> {
            L.p(view2, "$colorPickerSelected");
            view2.setBackgroundColor(v);
        };
        ((ColorPickerView)view3).setInitialColor(v);
        ((ColorPickerView)view3).m(b0);
        this.E = new Builder(this).setView(view1).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> {
            L.p(function10, "$callback");
            L.p(((ColorPickerView)view3), "$colorPickerView");
            function10.invoke(((ColorPickerView)view3).getColor());
        }).setNegativeButton(0x1040000, new d()).v((DialogInterface dialogInterface0) -> {
            L.p(((ColorPickerView)view3), "$colorPickerView");
            L.p(b0, "$colorPickerObserver");
            ((ColorPickerView)view3).c(b0);
        }).I();
    }

    // 检测为 Lambda 实现
    private static final void C2(Function1 function10, ColorPickerView colorPickerView0, DialogInterface dialogInterface0, int v) [...]

    private static final void D2(DialogInterface dialogInterface0, int v) {
    }

    // 检测为 Lambda 实现
    private static final void E2(ColorPickerView colorPickerView0, e e0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    private static final void F2(View view0, int v, boolean z, boolean z1) [...]

    @Override  // com.dcinside.app.settings.c
    public boolean R1() {
        return true;
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a T1() {
        String s3;
        String s1;
        o o0 = this.A;
        if(o0 == null) {
            s1 = "";
        }
        else {
            String s = o0.Q5();
            s1 = s == null ? "" : s;
        }
        o o1 = this.A;
        if(o1 == null) {
            s3 = "";
        }
        else {
            String s2 = o1.R5();
            s3 = s2 == null ? "" : s2;
        }
        r0 r00 = this.z;
        if(r00 == null) {
            L.S("binding");
            r00 = null;
        }
        boolean z = r00.j.isEnabled();
        com.dcinside.app.realm.o.a o$a0 = o.h;
        String s4 = o$a0.c(this.B);
        r0 r01 = this.z;
        if(r01 == null) {
            L.S("binding");
            r01 = null;
        }
        String s5 = String.valueOf(r01.o.getText());
        String s6 = o$a0.c(this.C);
        r0 r02 = this.z;
        if(r02 == null) {
            L.S("binding");
            r02 = null;
        }
        String s7 = String.valueOf(r02.r.getText());
        r0 r03 = this.z;
        if(r03 == null) {
            L.S("binding");
            r03 = null;
        }
        boolean z1 = r03.b.isEnabled();
        r0 r04 = this.z;
        if(r04 == null) {
            L.S("binding");
            throw new NullPointerException();
        }
        return new b(s1, s3, z, s4, s5, s6, s7, z1, String.valueOf(r04.f.getText()));
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public com.dcinside.app.settings.c.a V1() {
        com.dcinside.app.settings.c.a c$a0 = this.D;
        L.m(c$a0);
        return c$a0;
    }

    public static void d2(DialogInterface dialogInterface0, int v) {
    }

    @Override  // android.app.Activity
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(motionEvent0.getAction() == 0) {
            View view0 = this.getCurrentFocus();
            if(view0 instanceof EditText) {
                Rect rect0 = new Rect();
                ((EditText)view0).getGlobalVisibleRect(rect0);
                if(!rect0.contains(((int)motionEvent0.getRawX()), ((int)motionEvent0.getRawY()))) {
                    ((EditText)view0).clearFocus();
                    Nk.a.c(view0);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        r0 r00 = r0.c(this.getLayoutInflater());
        L.o(r00, "inflate(...)");
        this.z = r00;
        r0 r01 = null;
        if(r00 == null) {
            L.S("binding");
            r00 = null;
        }
        this.setContentView(r00.b());
        r0 r02 = this.z;
        if(r02 == null) {
            L.S("binding");
        }
        else {
            r01 = r02;
        }
        L.o(r01.i, "settingGalleryTextOptionToolbar");
        this.S0(r01.i);
        kr.bhbfhfb.designcompat.a.d(this);
        this.t2(bundle0);
        this.u2();
        this.s2();
        com.dcinside.app.settings.c.a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.InitialValue");
        this.D = (b)c$a0;
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$onCreateOptionsMenu$1", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class p extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final GalleryTextOptionSettingActivity l;
            final MenuItem m;

            p(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, MenuItem menuItem0, kotlin.coroutines.d d0) {
                this.l = galleryTextOptionSettingActivity0;
                this.m = menuItem0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new p(this.l, this.m, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$item");
                this.l.onOptionsItemSelected(this.m);
                return S0.a;
            }
        }

        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100016, menu0);  // mipmap:ic_launcher25
        MenuItem menuItem0 = menu0.findItem(0x7F0B0070);  // id:action_save
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B082E));  // id:menu_save
            if(button0 != null) {
                com.dcinside.app.internal.r.M(button0, null, new p(this, menuItem0, null), 1, null);
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.settings.c
    protected void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog0 = this.E;
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        this.E = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B0070: {  // id:action_save
                this.Z1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        String s = null;
        bundle0.putString("com.dcinside.app.extra.GALLERY_ID", (this.A == null ? null : this.A.Q5()));
        o o0 = this.A;
        if(o0 != null) {
            s = o0.R5();
        }
        bundle0.putString("com.dcinside.app.extra.GALLERY_NAME", s);
    }

    private final void s2() {
        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initCallbacks$1", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;
            final GalleryTextOptionSettingActivity m;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.m = galleryTextOptionSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c galleryTextOptionSettingActivity$c0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c(this.m, d0);
                galleryTextOptionSettingActivity$c0.l = view0;
                return galleryTextOptionSettingActivity$c0.invokeSuspend(S0.a);
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
                this.m.w2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initCallbacks$2", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;
            final GalleryTextOptionSettingActivity m;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.m = galleryTextOptionSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d galleryTextOptionSettingActivity$d0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d(this.m, d0);
                galleryTextOptionSettingActivity$d0.l = view0;
                return galleryTextOptionSettingActivity$d0.invokeSuspend(S0.a);
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
                this.m.w2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initCallbacks$3", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;
            final GalleryTextOptionSettingActivity m;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.m = galleryTextOptionSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e galleryTextOptionSettingActivity$e0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e(this.m, d0);
                galleryTextOptionSettingActivity$e0.l = view0;
                return galleryTextOptionSettingActivity$e0.invokeSuspend(S0.a);
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
                this.m.v2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initCallbacks$4", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            Object l;
            final GalleryTextOptionSettingActivity m;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.m = galleryTextOptionSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f galleryTextOptionSettingActivity$f0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f(this.m, d0);
                galleryTextOptionSettingActivity$f0.l = view0;
                return galleryTextOptionSettingActivity$f0.invokeSuspend(S0.a);
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
                this.m.v2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initCallbacks$5", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final GalleryTextOptionSettingActivity l;

            g(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.l = galleryTextOptionSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.x2();
                return S0.a;
            }
        }

        r0 r00 = this.z;
        if(r00 == null) {
            L.S("binding");
            r00 = null;
        }
        L.o(r00.l, "writeSettingEnableView");
        com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c galleryTextOptionSettingActivity$c0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.c(this, null);
        com.dcinside.app.internal.r.M(r00.l, null, galleryTextOptionSettingActivity$c0, 1, null);
        r0 r01 = this.z;
        if(r01 == null) {
            L.S("binding");
            r01 = null;
        }
        L.o(r01.d, "replySettingEnableView");
        com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d galleryTextOptionSettingActivity$d0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.d(this, null);
        com.dcinside.app.internal.r.M(r01.d, null, galleryTextOptionSettingActivity$d0, 1, null);
        r0 r02 = this.z;
        if(r02 == null) {
            L.S("binding");
            r02 = null;
        }
        L.o(r02.m, "writeSettingPrefixColor");
        com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e galleryTextOptionSettingActivity$e0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.e(this, null);
        com.dcinside.app.internal.r.M(r02.m, null, galleryTextOptionSettingActivity$e0, 1, null);
        r0 r03 = this.z;
        if(r03 == null) {
            L.S("binding");
            r03 = null;
        }
        L.o(r03.p, "writeSettingSuffixColor");
        com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f galleryTextOptionSettingActivity$f0 = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.f(this, null);
        com.dcinside.app.internal.r.M(r03.p, null, galleryTextOptionSettingActivity$f0, 1, null);
        r0 r04 = this.z;
        if(r04 == null) {
            L.S("binding");
            r04 = null;
        }
        L.o(r04.g, "settingGalleryTextOptionRemoveButton");
        g galleryTextOptionSettingActivity$g0 = new g(this, null);
        com.dcinside.app.internal.r.M(r04.g, null, galleryTextOptionSettingActivity$g0, 1, null);
    }

    private final void t2(Bundle bundle0) {
        String s1;
        String s;
        if(bundle0 == null) {
            bundle0 = this.getIntent().getExtras();
            if(bundle0 == null) {
                bundle0 = BundleKt.a();
            }
        }
        V v0 = kotlin.r0.a(bundle0.getString("com.dcinside.app.extra.GALLERY_ID"), bundle0.getString("com.dcinside.app.extra.GALLERY_NAME"));
        com.dcinside.app.realm.o.a o$a0 = o.h;
        o o0 = o$a0.f(((String)v0.a()), ((String)v0.b()), false);
        this.A = o0;
        if(o0 == null) {
            s = null;
        }
        else {
            r r0 = o0.S5();
            s = r0 == null ? null : r0.U5();
        }
        this.B = com.dcinside.app.realm.o.a.b(o$a0, s, null, 2, null);
        o o1 = this.A;
        if(o1 == null) {
            s1 = null;
        }
        else {
            r r1 = o1.S5();
            s1 = r1 == null ? null : r1.W5();
        }
        this.C = com.dcinside.app.realm.o.a.b(o$a0, s1, null, 2, null);
    }

    private final void u2() {
        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initViews$2$1", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nGalleryTextOptionSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTextOptionSettingActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionSettingActivity$initViews$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        static final class h extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;
            final GalleryTextOptionSettingActivity n;

            h(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.n = galleryTextOptionSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                h galleryTextOptionSettingActivity$h0 = new h(this.n, d0);
                galleryTextOptionSettingActivity$h0.l = compoundButton0;
                galleryTextOptionSettingActivity$h0.m = z;
                return galleryTextOptionSettingActivity$h0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.n.A2(((CompoundButton)this.l), this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionSettingActivity$initViews$3$1", f = "GalleryTextOptionSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nGalleryTextOptionSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTextOptionSettingActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionSettingActivity$initViews$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        static final class i extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            boolean m;
            final GalleryTextOptionSettingActivity n;

            i(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0, kotlin.coroutines.d d0) {
                this.n = galleryTextOptionSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                i galleryTextOptionSettingActivity$i0 = new i(this.n, d0);
                galleryTextOptionSettingActivity$i0.l = compoundButton0;
                galleryTextOptionSettingActivity$i0.m = z;
                return galleryTextOptionSettingActivity$i0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.n.A2(((CompoundButton)this.l), this.m);
                return S0.a;
            }
        }


        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @l
            public final Boolean a(@l o o0) {
                L.p(o0, "it");
                return o0.S5() == null ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((o)object0));
            }
        }

        String s2;
        String s1;
        int v = 0;
        r0 r00 = null;
        r r0 = this.A == null ? null : this.A.S5();
        r0 r01 = this.z;
        if(r01 == null) {
            L.S("binding");
            r01 = null;
        }
        int v1 = r01.g.getPaintFlags();
        r01.g.setPaintFlags(v1 | 8);
        r0 r02 = this.z;
        if(r02 == null) {
            L.S("binding");
            r02 = null;
        }
        boolean z = r0 != null && r0.S5();
        r02.k.setChecked(z);
        L.m(r02.k);
        com.dcinside.app.internal.r.J(r02.k, null, new h(this, null), 1, null);
        this.A2(r02.k, r02.k.isChecked());
        r0 r03 = this.z;
        if(r03 == null) {
            L.S("binding");
            r03 = null;
        }
        boolean z1 = r0 != null && r0.Q5();
        r03.c.setChecked(z1);
        L.m(r03.c);
        com.dcinside.app.internal.r.J(r03.c, null, new i(this, null), 1, null);
        this.A2(r03.c, r03.c.isChecked());
        r0 r04 = this.z;
        if(r04 == null) {
            L.S("binding");
            r04 = null;
        }
        r04.m.setBackgroundColor(this.B);
        r0 r05 = this.z;
        if(r05 == null) {
            L.S("binding");
            r05 = null;
        }
        r05.p.setBackgroundColor(this.C);
        r0 r06 = this.z;
        if(r06 == null) {
            L.S("binding");
            r06 = null;
        }
        ClearableEditText clearableEditText0 = r06.o;
        String s = "";
        if(r0 == null) {
            s1 = "";
        }
        else {
            s1 = r0.T5();
            if(s1 == null) {
                s1 = "";
            }
        }
        clearableEditText0.setText(s1);
        r0 r07 = this.z;
        if(r07 == null) {
            L.S("binding");
            r07 = null;
        }
        ClearableEditText clearableEditText1 = r07.r;
        if(r0 == null) {
            s2 = "";
        }
        else {
            s2 = r0.V5();
            if(s2 == null) {
                s2 = "";
            }
        }
        clearableEditText1.setText(s2);
        r0 r08 = this.z;
        if(r08 == null) {
            L.S("binding");
            r08 = null;
        }
        ClearableEditText clearableEditText2 = r08.f;
        if(r0 != null) {
            String s3 = r0.R5();
            if(s3 != null) {
                s = s3;
            }
        }
        clearableEditText2.setText(s);
        String s4 = this.A == null ? null : this.A.Q5();
        if(L.g("__DC_GLOBAL_DEF_IMAGE_ID", s4)) {
            this.setTitle("기본 머리말 · 꼬리말");
            r0 r09 = this.z;
            if(r09 == null) {
                L.S("binding");
                r09 = null;
            }
            r09.h.setVisibility(8);
        }
        else {
            boolean z2 = o.h.d(s4, j.e);
            this.setTitle(this.getString(0x7F150973, new Object[]{(this.A == null ? null : this.A.R5())}));  // string:setting_gallery_text_gallery "머리말 · 꼬리말 - %1$s"
            r0 r010 = this.z;
            if(r010 == null) {
                L.S("binding");
                r010 = null;
            }
            TextView textView0 = r010.g;
            if(!z2) {
                v = 8;
            }
            textView0.setVisibility(v);
            textView0.setText(Dl.c("<u>설정 삭제</u>"));
        }
        o o0 = this.A;
        if(o0 == null) {
        label_96:
            if(L.g(s4, "hit") || L.g(s4, "superidea") || L.g(s4, "issuezoom") || L.g(s4, "know")) {
                r0 r011 = this.z;
                if(r011 == null) {
                    L.S("binding");
                    r011 = null;
                }
                r011.l.setVisibility(8);
                r0 r012 = this.z;
                if(r012 == null) {
                    L.S("binding");
                }
                else {
                    r00 = r012;
                }
                r00.j.setVisibility(8);
            }
        }
        else {
            r r1 = o0.S5();
            if(r1 == null || !r1.S5()) {
                goto label_96;
            }
        }
    }

    private final void v2(View view0) {
        static final class k extends N implements Function1 {
            final GalleryTextOptionSettingActivity e;

            k(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0) {
                this.e = galleryTextOptionSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                this.e.B = v;
                r0 r00 = this.e.z;
                if(r00 == null) {
                    L.S("binding");
                    r00 = null;
                }
                int v1 = this.e.B;
                r00.m.setBackgroundColor(v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.l extends N implements Function1 {
            final GalleryTextOptionSettingActivity e;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.l(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0) {
                this.e = galleryTextOptionSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                this.e.C = v;
                r0 r00 = this.e.z;
                if(r00 == null) {
                    L.S("binding");
                    r00 = null;
                }
                int v1 = this.e.C;
                r00.p.setBackgroundColor(v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }

        switch(view0.getId()) {
            case 0x7F0B110C: {  // id:write_setting_prefix_color
                this.B2(this.B, new k(this));
                return;
            }
            case 0x7F0B110F: {  // id:write_setting_suffix_color
                this.B2(this.C, new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.l(this));
            }
        }
    }

    private final void w2(View view0) {
        r0 r00 = null;
        switch(view0.getId()) {
            case 0x7F0B0D6D: {  // id:reply_setting_enable_view
                r0 r01 = this.z;
                if(r01 == null) {
                    L.S("binding");
                }
                else {
                    r00 = r01;
                }
                boolean z = r00.c.isChecked();
                r00.c.setChecked(!z);
                return;
            }
            case 0x7F0B1109: {  // id:write_setting_enable_view
                r0 r02 = this.z;
                if(r02 == null) {
                    L.S("binding");
                }
                else {
                    r00 = r02;
                }
                boolean z1 = r00.k.isChecked();
                r00.k.setChecked(!z1);
            }
        }
    }

    private final void x2() {
        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m extends N implements Function1 {
            public static final com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m e;

            static {
                com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m.e = new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m();
            }

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150976);  // string:setting_gallery_text_remove_msg "해당 갤러리의 머리말 · 꼬리말 설정이 삭제됩니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class n extends N implements Function1 {
            public static final n e;

            static {
                n.e = new n();
            }

            n() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.o extends N implements Function1 {
            final GalleryTextOptionSettingActivity e;

            com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.o(GalleryTextOptionSettingActivity galleryTextOptionSettingActivity0) {
                this.e = galleryTextOptionSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                o o0 = this.e.A;
                String s = o0 == null ? null : o0.Q5();
                o.h.l(s, r.class);
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.m.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(n.e, "$tmp0");
            return (Boolean)n.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.o(this), "$tmp0");
            new com.dcinside.app.settings.text.GalleryTextOptionSettingActivity.o(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean y2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void z2(Function1 function10, Object object0) [...]
}

