package com.dcinside.app.image.edit;

import A3.p;
import Y.y;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.g;
import com.dcinside.app.image.edit.menu.c;
import com.dcinside.app.image.edit.rotate.d;
import com.dcinside.app.image.j;
import com.dcinside.app.internal.r;
import com.dcinside.app.read.H;
import com.dcinside.app.rx.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditActivity.kt\ncom/dcinside/app/image/edit/ImageEditActivity\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n235#1,10:335\n235#1,10:345\n235#1,10:355\n235#1,10:365\n235#1,10:375\n235#1,10:385\n235#1,10:395\n235#1,10:405\n235#1,10:415\n235#1,10:425\n38#2:319\n11102#3:320\n11437#3,3:321\n865#4,2:324\n1557#4:326\n1628#4,3:327\n37#5,2:330\n257#6,2:332\n1#7:334\n*S KotlinDebug\n*F\n+ 1 ImageEditActivity.kt\ncom/dcinside/app/image/edit/ImageEditActivity\n*L\n188#1:335,10\n191#1:345,10\n194#1:355,10\n197#1:365,10\n200#1:375,10\n203#1:385,10\n206#1:395,10\n209#1:405,10\n212#1:415,10\n215#1:425,10\n66#1:319\n70#1:320\n70#1:321,3\n70#1:324,2\n99#1:326\n99#1:327,3\n99#1:330,2\n123#1:332,2\n*E\n"})
public final class ImageEditActivity extends g implements a {
    public static final class com.dcinside.app.image.edit.ImageEditActivity.a {
        private com.dcinside.app.image.edit.ImageEditActivity.a() {
        }

        public com.dcinside.app.image.edit.ImageEditActivity.a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.image.edit.menu.a.values().length];
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.d.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.i.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.j.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.k.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.image.edit.menu.a.h.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @m
    private H A;
    @l
    public static final com.dcinside.app.image.edit.ImageEditActivity.a B = null;
    @l
    public static final String C = "extra_history";
    public static final int D = 100;
    private final a w;
    private y x;
    @l
    private LinkedHashSet y;
    @l
    private LinkedHashSet z;

    static {
        ImageEditActivity.B = new com.dcinside.app.image.edit.ImageEditActivity.a(null);
    }

    public ImageEditActivity() {
        this(null, 1, null);
    }

    public ImageEditActivity(@l a a0) {
        L.p(a0, "scope");
        super();
        this.w = a0;
        this.y = new LinkedHashSet();
        this.z = new LinkedHashSet();
    }

    public ImageEditActivity(a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    private final void P1(File file0) {
        this.y.add(file0);
        this.z.clear();
        this.T1();
        this.S1(null);
    }

    private final void Q1() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        L.o(fragmentFactory0, "getFragmentFactory(...)");
        L.y(4, "T");
        ClassLoader classLoader0 = Fragment.class.getClassLoader();
        L.m(classLoader0);
        L.y(4, "T");
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "androidx.fragment.app.Fragment");
        L.o(fragment0, "instantiate(...)");
        fragment0.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
        fragmentManager0.u().C(0x7F0B05AC, fragment0).q();  // id:image_edit_fragment_container
    }

    private final boolean R1() {
        Fragment fragment0 = this.getSupportFragmentManager().r0(0x7F0B05AC);  // id:image_edit_fragment_container
        if(fragment0 == null || fragment0 instanceof c) {
            fragment0 = null;
        }
        return fragment0 != null;
    }

    public final void S1(@m com.dcinside.app.image.edit.menu.a a0) {
        y y0 = null;
        if(this.getSupportFragmentManager().d1()) {
            return;
        }
        this.setTitle((a0 == null ? null : this.getString(a0.d())));
        switch((a0 == null ? -1 : b.a[a0.ordinal()])) {
            case -1: {
                FragmentManager fragmentManager0 = this.getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                L.o(fragmentFactory0, "getFragmentFactory(...)");
                ClassLoader classLoader0 = c.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.image.edit.menu.c");
                L.o(fragment0, "instantiate(...)");
                fragment0.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager0.u().C(0x7F0B05AC, fragment0).q();  // id:image_edit_fragment_container
                y y1 = this.x;
                if(y1 == null) {
                    L.S("binding");
                    y1 = null;
                }
                y1.h.setVisibility(0);
                y y2 = this.x;
                if(y2 == null) {
                    L.S("binding");
                    y2 = null;
                }
                y2.f.setVisibility(0);
                y y3 = this.x;
                if(y3 == null) {
                    L.S("binding");
                }
                else {
                    y0 = y3;
                }
                L.o(y0.d, "imageEditPositive");
                r.o0(y0.d, 0x7F1504B2);  // string:image_edit_finish "저장"
                return;
            }
            case 1: {
                FragmentManager fragmentManager1 = this.getSupportFragmentManager();
                L.o(fragmentManager1, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory1 = fragmentManager1.G0();
                L.o(fragmentFactory1, "getFragmentFactory(...)");
                ClassLoader classLoader1 = com.dcinside.app.image.edit.filter.b.class.getClassLoader();
                L.m(classLoader1);
                Fragment fragment1 = fragmentFactory1.a(classLoader1, "com.dcinside.app.image.edit.filter.b");
                L.o(fragment1, "instantiate(...)");
                fragment1.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager1.u().C(0x7F0B05AC, fragment1).q();  // id:image_edit_fragment_container
                break;
            }
            case 2: {
                FragmentManager fragmentManager2 = this.getSupportFragmentManager();
                L.o(fragmentManager2, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory2 = fragmentManager2.G0();
                L.o(fragmentFactory2, "getFragmentFactory(...)");
                ClassLoader classLoader2 = d.class.getClassLoader();
                L.m(classLoader2);
                Fragment fragment2 = fragmentFactory2.a(classLoader2, "com.dcinside.app.image.edit.rotate.d");
                L.o(fragment2, "instantiate(...)");
                fragment2.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager2.u().C(0x7F0B05AC, fragment2).q();  // id:image_edit_fragment_container
                break;
            }
            case 3: {
                FragmentManager fragmentManager3 = this.getSupportFragmentManager();
                L.o(fragmentManager3, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory3 = fragmentManager3.G0();
                L.o(fragmentFactory3, "getFragmentFactory(...)");
                ClassLoader classLoader3 = com.dcinside.app.image.edit.resize.c.class.getClassLoader();
                L.m(classLoader3);
                Fragment fragment3 = fragmentFactory3.a(classLoader3, "com.dcinside.app.image.edit.resize.c");
                L.o(fragment3, "instantiate(...)");
                fragment3.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager3.u().C(0x7F0B05AC, fragment3).q();  // id:image_edit_fragment_container
                break;
            }
            case 4: {
                FragmentManager fragmentManager4 = this.getSupportFragmentManager();
                L.o(fragmentManager4, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory4 = fragmentManager4.G0();
                L.o(fragmentFactory4, "getFragmentFactory(...)");
                ClassLoader classLoader4 = com.dcinside.app.image.edit.crop.d.class.getClassLoader();
                L.m(classLoader4);
                Fragment fragment4 = fragmentFactory4.a(classLoader4, "com.dcinside.app.image.edit.crop.d");
                L.o(fragment4, "instantiate(...)");
                fragment4.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager4.u().C(0x7F0B05AC, fragment4).q();  // id:image_edit_fragment_container
                break;
            }
            case 5: {
                FragmentManager fragmentManager5 = this.getSupportFragmentManager();
                L.o(fragmentManager5, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory5 = fragmentManager5.G0();
                L.o(fragmentFactory5, "getFragmentFactory(...)");
                ClassLoader classLoader5 = com.dcinside.app.image.edit.blur.b.class.getClassLoader();
                L.m(classLoader5);
                Fragment fragment5 = fragmentFactory5.a(classLoader5, "com.dcinside.app.image.edit.blur.b");
                L.o(fragment5, "instantiate(...)");
                fragment5.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager5.u().C(0x7F0B05AC, fragment5).q();  // id:image_edit_fragment_container
                break;
            }
            case 6: {
                FragmentManager fragmentManager6 = this.getSupportFragmentManager();
                L.o(fragmentManager6, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory6 = fragmentManager6.G0();
                L.o(fragmentFactory6, "getFragmentFactory(...)");
                ClassLoader classLoader6 = com.dcinside.app.image.edit.stcker.b.class.getClassLoader();
                L.m(classLoader6);
                Fragment fragment6 = fragmentFactory6.a(classLoader6, "com.dcinside.app.image.edit.stcker.b");
                L.o(fragment6, "instantiate(...)");
                fragment6.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager6.u().C(0x7F0B05AC, fragment6).q();  // id:image_edit_fragment_container
                break;
            }
            case 7: {
                FragmentManager fragmentManager7 = this.getSupportFragmentManager();
                L.o(fragmentManager7, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory7 = fragmentManager7.G0();
                L.o(fragmentFactory7, "getFragmentFactory(...)");
                ClassLoader classLoader7 = com.dcinside.app.image.edit.emoji.b.class.getClassLoader();
                L.m(classLoader7);
                Fragment fragment7 = fragmentFactory7.a(classLoader7, "com.dcinside.app.image.edit.emoji.b");
                L.o(fragment7, "instantiate(...)");
                fragment7.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager7.u().C(0x7F0B05AC, fragment7).q();  // id:image_edit_fragment_container
                break;
            }
            case 8: {
                FragmentManager fragmentManager8 = this.getSupportFragmentManager();
                L.o(fragmentManager8, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory8 = fragmentManager8.G0();
                L.o(fragmentFactory8, "getFragmentFactory(...)");
                ClassLoader classLoader8 = com.dcinside.app.image.edit.text.d.class.getClassLoader();
                L.m(classLoader8);
                Fragment fragment8 = fragmentFactory8.a(classLoader8, "com.dcinside.app.image.edit.text.d");
                L.o(fragment8, "instantiate(...)");
                fragment8.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager8.u().C(0x7F0B05AC, fragment8).q();  // id:image_edit_fragment_container
                break;
            }
            case 9: {
                FragmentManager fragmentManager9 = this.getSupportFragmentManager();
                L.o(fragmentManager9, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory9 = fragmentManager9.G0();
                L.o(fragmentFactory9, "getFragmentFactory(...)");
                ClassLoader classLoader9 = com.dcinside.app.image.edit.draw.c.class.getClassLoader();
                L.m(classLoader9);
                Fragment fragment9 = fragmentFactory9.a(classLoader9, "com.dcinside.app.image.edit.draw.c");
                L.o(fragment9, "instantiate(...)");
                fragment9.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.extra.IMAGE_PATH", ((File)u.n3(this.y)).getPath())}));
                fragmentManager9.u().C(0x7F0B05AC, fragment9).q();  // id:image_edit_fragment_container
            }
        }
        y y4 = this.x;
        if(y4 == null) {
            L.S("binding");
            y4 = null;
        }
        y4.h.setVisibility(8);
        y y5 = this.x;
        if(y5 == null) {
            L.S("binding");
            y5 = null;
        }
        y5.f.setVisibility(8);
        y y6 = this.x;
        if(y6 == null) {
            L.S("binding");
        }
        else {
            y0 = y6;
        }
        L.o(y0.d, "imageEditPositive");
        r.o0(y0.d, 0x7F1504B5);  // string:image_edit_make "적용"
    }

    private final void T1() {
        y y0 = this.x;
        y y1 = null;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        ImageView imageView0 = y0.h;
        if(this.y.size() > 1) {
            imageView0.setEnabled(true);
            imageView0.setAlpha(1.0f);
        }
        else {
            imageView0.setEnabled(false);
            imageView0.setAlpha(0.3f);
        }
        y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
        }
        else {
            y1 = y2;
        }
        ImageView imageView1 = y1.f;
        if(this.z.size() > 0) {
            imageView1.setEnabled(true);
            imageView1.setAlpha(1.0f);
            return;
        }
        imageView1.setEnabled(false);
        imageView1.setAlpha(0.3f);
    }

    private final void U1() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B05AC);  // id:image_edit_fragment_container
        com.dcinside.app.image.edit.a a0 = fragment0 instanceof com.dcinside.app.image.edit.a ? ((com.dcinside.app.image.edit.a)fragment0) : null;
        if(a0 == null) {
            return;
        }
        a0.j0();
    }

    private final void V1() {
        if(this.z.size() > 0) {
            File file0 = (File)u.n3(this.z);
            this.z.remove(file0);
            this.y.add(file0);
        }
        this.T1();
        this.S1(null);
    }

    private final void W1() {
        if(this.y.size() > 1) {
            File file0 = (File)u.n3(this.y);
            this.y.remove(file0);
            this.z.add(file0);
        }
        this.T1();
        this.S1(null);
    }

    public final void X1(@m String s) {
        if(s != null && !L.g(s, ((File)u.n3(this.y)).getPath())) {
            this.P1(new File(s));
        }
        this.S1(null);
    }

    private final void Y1(Uri uri0) {
        @f(c = "com.dcinside.app.image.edit.ImageEditActivity$prepareAsync$1", f = "ImageEditActivity.kt", i = {1}, l = {0x80, 0x90, 0xA7, 0xAC}, m = "invokeSuspend", n = {"file"}, s = {"L$0"})
        @s0({"SMAP\nImageEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditActivity.kt\ncom/dcinside/app/image/edit/ImageEditActivity$prepareAsync$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,318:1\n1#2:319\n13346#3,2:320\n*S KotlinDebug\n*F\n+ 1 ImageEditActivity.kt\ncom/dcinside/app/image/edit/ImageEditActivity$prepareAsync$1\n*L\n151#1:320,2\n*E\n"})
        static final class com.dcinside.app.image.edit.ImageEditActivity.f extends o implements A3.o {
            Object k;
            int l;
            final Uri m;
            final ImageEditActivity n;

            com.dcinside.app.image.edit.ImageEditActivity.f(Uri uri0, ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                this.m = uri0;
                this.n = imageEditActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.ImageEditActivity.f(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.edit.ImageEditActivity.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.ImageEditActivity$prepareAsync$1$1", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.ImageEditActivity.f.a extends o implements A3.o {
                    int k;
                    final ImageEditActivity l;

                    com.dcinside.app.image.edit.ImageEditActivity.f.a(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                        this.l = imageEditActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.image.edit.ImageEditActivity.f.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.ImageEditActivity.f.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.Z1(true);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.ImageEditActivity$prepareAsync$1$2", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.ImageEditActivity.f.b extends o implements A3.o {
                    int k;
                    final ImageEditActivity l;

                    com.dcinside.app.image.edit.ImageEditActivity.f.b(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                        this.l = imageEditActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.image.edit.ImageEditActivity.f.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.ImageEditActivity.f.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        String s = this.l.getString(0x7F1501C6, new Object[]{kotlin.coroutines.jvm.internal.b.f(100)});  // string:cannot_edit_image "이미지는 최대 %1$dMB까지 편집 가능합니다."
                        Dl.G(this.l, s);
                        this.l.finish();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.ImageEditActivity$prepareAsync$1$3", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.ImageEditActivity.f.c extends o implements A3.o {
                    int k;
                    final ImageEditActivity l;

                    com.dcinside.app.image.edit.ImageEditActivity.f.c(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                        this.l = imageEditActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.image.edit.ImageEditActivity.f.c(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.ImageEditActivity.f.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Dl.D(this.l, 0x7F1504B6);  // string:image_edit_not_found "편집할 이미지를 찾을 수 없습니다."
                        this.l.finish();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.ImageEditActivity$prepareAsync$1$4", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.ImageEditActivity.f.d extends o implements A3.o {
                    int k;
                    final ImageEditActivity l;
                    final File m;

                    com.dcinside.app.image.edit.ImageEditActivity.f.d(ImageEditActivity imageEditActivity0, File file0, kotlin.coroutines.d d0) {
                        this.l = imageEditActivity0;
                        this.m = file0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.image.edit.ImageEditActivity.f.d(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.ImageEditActivity.f.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.Z1(false);
                        this.l.P1(this.m);
                        this.l.S1(null);
                        return S0.a;
                    }
                }

                File file2;
                File file0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.image.edit.ImageEditActivity.f.a imageEditActivity$f$a0 = new com.dcinside.app.image.edit.ImageEditActivity.f.a(this.n, null);
                        this.l = 1;
                        if(i.h(h0.e(), imageEditActivity$f$a0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        file0 = (File)this.k;
                        f0.n(object0);
                        goto label_31;
                    }
                    case 3: 
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                String s = this.m.getScheme();
                if(s == null || v.v2(s, "file", false, 2, null)) {
                    String s1 = this.m.getPath();
                    file0 = s1 == null ? null : new File(s1);
                }
                else if(v.v2(s, "http", false, 2, null)) {
                    file0 = (File)j.a.g(this.n, this.m).x6().b();
                }
                else {
                    file0 = null;
                }
                if((file0 == null ? 0L : file0.length()) > 0x6400000L) {
                    com.dcinside.app.image.edit.ImageEditActivity.f.b imageEditActivity$f$b0 = new com.dcinside.app.image.edit.ImageEditActivity.f.b(this.n, null);
                    this.k = file0;
                    this.l = 2;
                    if(i.h(h0.e(), imageEditActivity$f$b0, this) == object1) {
                        return object1;
                    }
                }
            label_31:
                File file1 = wk.c.c();
                if(file1 == null || file0 == null || !file0.canRead() || !file0.isFile()) {
                    file2 = null;
                }
                else {
                    File[] arr_file = file1.listFiles();
                    if(arr_file != null) {
                        for(int v = 0; v < arr_file.length; ++v) {
                            arr_file[v].delete();
                        }
                    }
                    file2 = new File(file1, System.nanoTime() + ".def");
                    String s2 = file0.getPath();
                    L.o(s2, "getPath(...)");
                    String s3 = com.dcinside.app.write.d.d(com.dcinside.app.write.d.a, s2, file2, 0, null, null, 12, null);
                    if(!L.g(file2.getPath(), s3)) {
                        file2 = kotlin.io.m.T(file0, file2, true, 0, 4, null);
                    }
                }
                if(file2 == null) {
                    com.dcinside.app.image.edit.ImageEditActivity.f.c imageEditActivity$f$c0 = new com.dcinside.app.image.edit.ImageEditActivity.f.c(this.n, null);
                    this.k = null;
                    this.l = 3;
                    if(i.h(h0.e(), imageEditActivity$f$c0, this) == object1) {
                        return object1;
                    }
                }
                else {
                    com.dcinside.app.image.edit.ImageEditActivity.f.d imageEditActivity$f$d0 = new com.dcinside.app.image.edit.ImageEditActivity.f.d(this.n, file2, null);
                    this.k = null;
                    this.l = 4;
                    if(i.h(h0.e(), imageEditActivity$f$d0, this) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        }

        k.f(this, null, null, new com.dcinside.app.image.edit.ImageEditActivity.f(uri0, this, null), 3, null);
    }

    private final void Z1(boolean z) {
        y y0 = this.x;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        L.o(y0.e, "imageEditProgress");
        y0.e.setVisibility((z ? 0 : 8));
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.w.getCoroutineContext();
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if((this.A == null || !this.A.i()) && (this.A == null || !this.A.j())) {
            if(this.R1()) {
                this.S1(null);
                return;
            }
            super.onBackPressed();
        }
        else {
            H h0 = this.A;
            if(h0 != null) {
                h0.k(this);
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.image.edit.ImageEditActivity$onCreate$2$1", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.edit.ImageEditActivity.c extends o implements p {
            int k;
            final ImageEditActivity l;

            com.dcinside.app.image.edit.ImageEditActivity.c(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                this.l = imageEditActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.ImageEditActivity.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.W1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.edit.ImageEditActivity$onCreate$3$1", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.edit.ImageEditActivity.d extends o implements p {
            int k;
            final ImageEditActivity l;

            com.dcinside.app.image.edit.ImageEditActivity.d(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                this.l = imageEditActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.ImageEditActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.edit.ImageEditActivity$onCreate$4$1", f = "ImageEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final ImageEditActivity l;

            e(ImageEditActivity imageEditActivity0, kotlin.coroutines.d d0) {
                this.l = imageEditActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.U1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        Uri uri0 = intent0 == null ? null : intent0.getData();
        if(uri0 == null) {
            Dl.D(this, 0x7F1504B6);  // string:image_edit_not_found "편집할 이미지를 찾을 수 없습니다."
            return;
        }
        y y0 = y.c(this.getLayoutInflater());
        L.o(y0, "inflate(...)");
        this.x = y0;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        this.setContentView(y0.b());
        y y1 = this.x;
        if(y1 == null) {
            L.S("binding");
            y1 = null;
        }
        this.S0(y1.g);
        kr.bhbfhfb.designcompat.a.d(this);
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        this.A = new H((viewGroup0 == null ? null : viewGroup0.getChildAt(0)), null, null);
        if(bundle0 != null) {
            String[] arr_s = bundle0.getStringArray("extra_history");
            if(arr_s != null) {
                ArrayList arrayList0 = new ArrayList(arr_s.length);
                for(int v = 0; v < arr_s.length; ++v) {
                    arrayList0.add(new File(arr_s[v]));
                }
                LinkedHashSet linkedHashSet0 = this.y;
                for(Object object0: arrayList0) {
                    if(((File)object0).canRead()) {
                        linkedHashSet0.add(object0);
                    }
                }
            }
        }
        y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
            y2 = null;
        }
        L.m(y2.h);
        com.dcinside.app.image.edit.ImageEditActivity.c imageEditActivity$c0 = new com.dcinside.app.image.edit.ImageEditActivity.c(this, null);
        r.M(y2.h, null, imageEditActivity$c0, 1, null);
        y y3 = this.x;
        if(y3 == null) {
            L.S("binding");
            y3 = null;
        }
        L.m(y3.f);
        com.dcinside.app.image.edit.ImageEditActivity.d imageEditActivity$d0 = new com.dcinside.app.image.edit.ImageEditActivity.d(this, null);
        r.M(y3.f, null, imageEditActivity$d0, 1, null);
        y y4 = this.x;
        if(y4 == null) {
            L.S("binding");
            y4 = null;
        }
        L.m(y4.d);
        e imageEditActivity$e0 = new e(this, null);
        r.M(y4.d, null, imageEditActivity$e0, 1, null);
        if(this.getSupportFragmentManager().r0(0x7F0B05AC) == null) {  // id:image_edit_fragment_container
            if(this.y.isEmpty()) {
                this.Y1(uri0);
                return;
            }
            this.S1(null);
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        this.t();
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

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        LinkedHashSet linkedHashSet0 = this.y;
        ArrayList arrayList0 = new ArrayList(u.b0(linkedHashSet0, 10));
        for(Object object0: linkedHashSet0) {
            arrayList0.add(((File)object0).getPath());
        }
        bundle0.putStringArray("extra_history", ((String[])arrayList0.toArray(new String[0])));
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.w.t();
    }
}

