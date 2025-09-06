package com.dcinside.app.image.edit.menu;

import Y.b2;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import java.io.OutputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,159:1\n25#2:160\n*S KotlinDebug\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment\n*L\n78#1:160\n*E\n"})
public final class c extends a implements com.dcinside.app.image.edit.menu.b.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private b2 c;

    public c() {
        this(null, 1, null);
    }

    public c(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public c(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.menu.b$a
    public void T(int v) {
        b2 b20 = this.p0();
        L.o(b20.d, "imageEditMenuList");
        Adapter recyclerView$Adapter0 = b20.d.getAdapter();
        ImageEditActivity imageEditActivity0 = null;
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof ImageEditActivity) {
            imageEditActivity0 = (ImageEditActivity)fragmentActivity0;
        }
        if(imageEditActivity0 != null) {
            imageEditActivity0.S1(((b)recyclerView$Adapter0).v(v));
        }
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        @f(c = "com.dcinside.app.image.edit.menu.ImageEditMenuFragment$save$1", f = "ImageEditMenuFragment.kt", i = {0, 1}, l = {86, 0x8A, 0x90}, m = "invokeSuspend", n = {"vwProgress", "vwProgress"}, s = {"L$0", "L$0"})
        @s0({"SMAP\nImageEditMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,159:1\n255#2:160\n1#3:161\n13346#4,2:162\n*S KotlinDebug\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1\n*L\n85#1:160\n135#1:162,2\n*E\n"})
        static final class com.dcinside.app.image.edit.menu.c.a extends o implements A3.o {
            Object k;
            int l;
            final c m;

            com.dcinside.app.image.edit.menu.c.a(c c0, d d0) {
                this.m = c0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.image.edit.menu.c.a(this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.image.edit.menu.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.menu.ImageEditMenuFragment$save$1$1", f = "ImageEditMenuFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,159:1\n257#2,2:160\n*S KotlinDebug\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1$1\n*L\n87#1:160,2\n*E\n"})
                static final class com.dcinside.app.image.edit.menu.c.a.a extends o implements A3.o {
                    int k;
                    final ProgressBar l;

                    com.dcinside.app.image.edit.menu.c.a.a(ProgressBar progressBar0, d d0) {
                        this.l = progressBar0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.menu.c.a.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.menu.c.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.menu.ImageEditMenuFragment$save$1$4", f = "ImageEditMenuFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.menu.c.a.b extends o implements A3.o {
                    int k;
                    final FragmentActivity l;
                    final Intent m;

                    com.dcinside.app.image.edit.menu.c.a.b(FragmentActivity fragmentActivity0, Intent intent0, d d0) {
                        this.l = fragmentActivity0;
                        this.m = intent0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.menu.c.a.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.menu.c.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setResult(-1, this.m);
                        this.l.finish();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.menu.ImageEditMenuFragment$save$1$5", f = "ImageEditMenuFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1$5\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,159:1\n257#2,2:160\n*S KotlinDebug\n*F\n+ 1 ImageEditMenuFragment.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuFragment$save$1$5\n*L\n146#1:160,2\n*E\n"})
                static final class com.dcinside.app.image.edit.menu.c.a.c extends o implements A3.o {
                    int k;
                    final c l;
                    final String m;
                    final ProgressBar n;

                    com.dcinside.app.image.edit.menu.c.a.c(c c0, String s, ProgressBar progressBar0, d d0) {
                        this.l = c0;
                        this.m = s;
                        this.n = progressBar0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.image.edit.menu.c.a.c(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.menu.c.a.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Dl.G(this.l.getActivity(), this.m);
                        this.n.setVisibility(0);
                        return S0.a;
                    }
                }

                String s1;
                File file1;
                boolean z;
                ProgressBar progressBar0;
                ProgressBar progressBar1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        progressBar1 = this.m.p0().e;
                        L.o(progressBar1, "imageEditMenuProgress");
                        if(progressBar1.getVisibility() == 0) {
                            return S0.a;
                        }
                        com.dcinside.app.image.edit.menu.c.a.a c$a$a0 = new com.dcinside.app.image.edit.menu.c.a.a(progressBar1, null);
                        this.k = progressBar1;
                        this.l = 1;
                        if(i.h(h0.e(), c$a$a0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        progressBar1 = (ProgressBar)this.k;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        progressBar0 = (ProgressBar)this.k;
                        try {
                            f0.n(object0);
                            return S0.a;
                        }
                        catch(Exception exception0) {
                            goto label_87;
                        }
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                try {
                    FragmentActivity fragmentActivity0 = this.m.getActivity();
                    if(fragmentActivity0 == null || com.dcinside.app.internal.c.o(fragmentActivity0)) {
                        throw new Exception(this.m.getString(0x7F150485));  // string:image_edit_file_access_failed "파일을 생성할 수 없습니다."
                    }
                    File file0 = new File(this.m.i0());
                    Bitmap bitmap0 = this.m.o0(file0);
                    int v = bitmap0.getWidth();
                    int v1 = bitmap0.getHeight();
                    Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
                    if(bitmap$Config0 == null) {
                        bitmap$Config0 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmap1 = Bitmap.createBitmap(v, v1, bitmap$Config0);
                    L.o(bitmap1, "createBitmap(...)");
                    Canvas canvas0 = new Canvas(bitmap1);
                    canvas0.drawColor(-1);
                    canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
                    bitmap0.recycle();
                    if(Build.VERSION.SDK_INT == 29) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("_display_name", "edit_" + System.currentTimeMillis() + ".jpg");
                        contentValues0.put("relative_path", Environment.DIRECTORY_PICTURES + "/DCINSIDE");
                        contentValues0.put("mime_type", "image/jpeg");
                        ContentResolver contentResolver0 = fragmentActivity0.getContentResolver();
                        Uri uri0 = contentResolver0.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues0);
                        if(uri0 == null) {
                            throw new NullPointerException();
                        }
                        OutputStream outputStream0 = contentResolver0.openOutputStream(uri0);
                        if(outputStream0 == null) {
                            throw new NullPointerException();
                        }
                        z = com.dcinside.app.internal.a.d(bitmap1, outputStream0, Bitmap.CompressFormat.JPEG, 0, 4, null);
                        String s = Gk.r(uri0);
                        if(s == null) {
                            throw new Exception(this.m.getString(0x7F150485));  // string:image_edit_file_access_failed "파일을 생성할 수 없습니다."
                        }
                        file1 = new File(s);
                        s1 = file1.getPath();
                        L.o(s1, "getPath(...)");
                    }
                    else {
                        File file2 = com.dcinside.app.album.l.a.c();
                        if(!file2.exists() && !file2.mkdirs()) {
                            throw new Exception(this.m.getString(0x7F150485));  // string:image_edit_file_access_failed "파일을 생성할 수 없습니다."
                        }
                        file1 = new File(file2, "edit_" + System.currentTimeMillis() + ".jpg");
                        s1 = file1.getPath();
                        L.o(s1, "getPath(...)");
                        z = com.dcinside.app.internal.a.c(bitmap1, file1, Bitmap.CompressFormat.JPEG, 0, 4, null);
                    }
                    bitmap1.recycle();
                    if(!z) {
                        throw new Exception(this.m.getString(0x7F150485));  // string:image_edit_file_access_failed "파일을 생성할 수 없습니다."
                    }
                    com.dcinside.app.scan.a.a.a(s1);
                    File file3 = wk.c.c();
                    if(file3 != null) {
                        File[] arr_file = file3.listFiles();
                        if(arr_file != null) {
                            for(int v2 = 0; v2 < arr_file.length; ++v2) {
                                arr_file[v2].delete();
                            }
                        }
                    }
                    Intent intent0 = new Intent();
                    intent0.setData(Uri.fromFile(file1));
                    com.dcinside.app.image.edit.menu.c.a.b c$a$b0 = new com.dcinside.app.image.edit.menu.c.a.b(fragmentActivity0, intent0, null);
                    this.k = progressBar1;
                    this.l = 2;
                    return i.h(h0.e(), c$a$b0, this) == object1 ? object1 : S0.a;
                }
                catch(Exception exception0) {
                    progressBar0 = progressBar1;
                }
            label_87:
                String s2 = exception0.getMessage();
                if(s2 == null) {
                    s2 = this.m.getString(0x7F150485);  // string:image_edit_file_access_failed "파일을 생성할 수 없습니다."
                    L.o(s2, "getString(...)");
                }
                com.dcinside.app.image.edit.menu.c.a.c c$a$c0 = new com.dcinside.app.image.edit.menu.c.a.c(this.m, s2, progressBar0, null);
                this.k = null;
                this.l = 3;
                return i.h(h0.e(), c$a$c0, this) == object1 ? object1 : S0.a;
            }
        }

        k.f(this, h0.c(), null, new com.dcinside.app.image.edit.menu.c.a(this, null), 2, null);
    }

    private final Bitmap o0(File file0) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap0 = BitmapFactory.decodeFile(file0.getPath());
        L.o(bitmap0, "decodeFile(...)");
        return bitmap0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = b2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.c = null;
    }

    @Override  // com.dcinside.app.image.edit.a
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        b2 b20 = this.p0();
        b20.c.setMinimumScaleType(3);
        b20.c.setMinimumDpi(40);
        ImageSource imageSource0 = ImageSource.uri(this.i0());
        b20.c.setImage(imageSource0);
        RecyclerView recyclerView0 = this.p0().d;
        if(recyclerView0 != null) {
            recyclerView0.setLayoutManager(new NonPredictiveLayoutManager(0, false));
            recyclerView0.setAdapter(new b(this));
        }
    }

    private final b2 p0() {
        b2 b20 = this.c;
        L.m(b20);
        return b20;
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

