package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.F;
import com.bumptech.glide.load.resource.bitmap.H;
import com.bumptech.glide.load.resource.bitmap.J;
import com.bumptech.glide.load.resource.bitmap.M;
import com.bumptech.glide.load.resource.bitmap.O;
import com.bumptech.glide.load.resource.bitmap.S;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.load.resource.drawable.g;
import com.bumptech.glide.load.resource.drawable.n;
import com.bumptech.glide.load.resource.gif.h;
import com.bumptech.glide.load.resource.gif.j;
import com.bumptech.glide.load.resource.transcode.d;
import com.bumptech.glide.module.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

final class l {
    static k a(c c0, List list0, @Nullable a a0) {
        Context context0 = c0.k().getApplicationContext();
        f f0 = c0.k().g();
        k k0 = new k();
        l.b(context0, k0, c0.h(), c0.g(), f0);
        l.c(context0, c0, k0, list0, a0);
        return k0;
    }

    private static void b(Context context0, k k0, e e0, b b0, f f0) {
        com.bumptech.glide.load.resource.bitmap.k k1;
        M m0;
        k0.t(new q());
        int v = Build.VERSION.SDK_INT;
        if(v >= 27) {
            k0.t(new A());
        }
        Resources resources0 = context0.getResources();
        List list0 = k0.g();
        com.bumptech.glide.load.resource.gif.a a0 = new com.bumptech.glide.load.resource.gif.a(context0, list0, e0, b0);
        com.bumptech.glide.load.l l0 = S.m(e0);
        x x0 = new x(k0.g(), resources0.getDisplayMetrics(), e0, b0);
        if(v < 28 || !f0.b(com.bumptech.glide.d.c.class)) {
            k1 = new com.bumptech.glide.load.resource.bitmap.k(x0);
            m0 = new M(x0, b0);
        }
        else {
            m0 = new F();
            k1 = new m();
        }
        Class class0 = ByteBuffer.class;
        Class class1 = Drawable.class;
        Class class2 = InputStream.class;
        if(v >= 28) {
            k0.e("Animation", class2, class1, g.f(list0, b0));
            k0.e("Animation", class0, class1, g.a(list0, b0));
        }
        com.bumptech.glide.load.resource.drawable.m m1 = new com.bumptech.glide.load.resource.drawable.m(context0);
        com.bumptech.glide.load.resource.bitmap.e e1 = new com.bumptech.glide.load.resource.bitmap.e(b0);
        com.bumptech.glide.load.resource.transcode.a a1 = new com.bumptech.glide.load.resource.transcode.a();
        d d0 = new d();
        ContentResolver contentResolver0 = context0.getContentResolver();
        k k2 = k0.a(class0, new com.bumptech.glide.load.model.c()).a(class2, new v(b0));
        Class class3 = Bitmap.class;
        k2.e("Bitmap", class0, class3, k1).e("Bitmap", class2, class3, m0);
        Class class4 = ParcelFileDescriptor.class;
        k0.e("Bitmap", class4, class3, new H(x0));
        com.bumptech.glide.load.l l1 = S.c(e0);
        k0.e("Bitmap", AssetFileDescriptor.class, class3, l1);
        k k3 = k0.e("Bitmap", class4, class3, l0);
        Class class5 = AssetFileDescriptor.class;
        k k4 = k3.d(class3, class3, com.bumptech.glide.load.model.x.a.a()).e("Bitmap", class3, class3, new O()).b(class3, e1);
        com.bumptech.glide.load.resource.bitmap.a a2 = new com.bumptech.glide.load.resource.bitmap.a(resources0, k1);
        k k5 = k4.e("BitmapDrawable", class0, BitmapDrawable.class, a2).e("BitmapDrawable", class2, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources0, m0)).e("BitmapDrawable", class4, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources0, l0)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(e0, e1));
        j j0 = new j(list0, a0, b0);
        Class class6 = com.bumptech.glide.load.resource.gif.c.class;
        k k6 = k5.e("Animation", class2, class6, j0).e("Animation", class0, class6, a0).b(class6, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.load.model.x.a.a());
        h h0 = new h(e0);
        k k7 = k6.e("Bitmap", com.bumptech.glide.gifdecoder.a.class, class3, h0);
        Class class7 = Uri.class;
        k k8 = k7.c(class7, class1, m1).c(class7, class3, new J(m1, e0)).u(new q.a.a());
        com.bumptech.glide.load.model.d.b d$b0 = new com.bumptech.glide.load.model.d.b();
        Class class8 = File.class;
        k8.d(class8, class0, d$b0).d(class8, class2, new com.bumptech.glide.load.model.g.e()).c(class8, class8, new r.a()).d(class8, class4, new com.bumptech.glide.load.model.g.b()).d(class8, class8, com.bumptech.glide.load.model.x.a.a()).u(new com.bumptech.glide.load.data.k.a(b0));
        Class class9 = BitmapDrawable.class;
        k0.u(new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.a());
        p p0 = com.bumptech.glide.load.model.f.g(context0);
        p p1 = com.bumptech.glide.load.model.f.c(context0);
        p p2 = com.bumptech.glide.load.model.f.e(context0);
        Class class10 = Integer.TYPE;
        k0.d(class10, class2, p0).d(Integer.class, class2, p0).d(class10, class5, p1).d(Integer.class, class5, p1).d(class10, class1, p2).d(Integer.class, class1, p2).d(class7, class2, u.f(context0)).d(class7, class5, u.e(context0));
        com.bumptech.glide.load.model.t.d t$d0 = new com.bumptech.glide.load.model.t.d(resources0);
        com.bumptech.glide.load.model.t.a t$a0 = new com.bumptech.glide.load.model.t.a(resources0);
        com.bumptech.glide.load.model.t.c t$c0 = new com.bumptech.glide.load.model.t.c(resources0);
        k0.d(Integer.class, class7, t$d0).d(class10, class7, t$d0).d(Integer.class, class5, t$a0).d(class10, class5, t$a0).d(Integer.class, class2, t$c0).d(class10, class2, t$c0);
        com.bumptech.glide.load.model.e.c e$c0 = new com.bumptech.glide.load.model.e.c();
        k k9 = k0.d(String.class, class2, e$c0).d(class7, class2, new com.bumptech.glide.load.model.e.c());
        com.bumptech.glide.load.model.w.c w$c0 = new com.bumptech.glide.load.model.w.c();
        k k10 = k9.d(String.class, class2, w$c0);
        com.bumptech.glide.load.model.w.b w$b0 = new com.bumptech.glide.load.model.w.b();
        k k11 = k10.d(String.class, class4, w$b0);
        com.bumptech.glide.load.model.w.a w$a0 = new com.bumptech.glide.load.model.w.a();
        k11.d(String.class, class5, w$a0).d(class7, class2, new com.bumptech.glide.load.model.a.c(context0.getAssets())).d(class7, class5, new com.bumptech.glide.load.model.a.b(context0.getAssets())).d(class7, class2, new com.bumptech.glide.load.model.stream.d.a(context0)).d(class7, class2, new com.bumptech.glide.load.model.stream.e.a(context0));
        if(v >= 29) {
            k0.d(class7, class2, new com.bumptech.glide.load.model.stream.f.c(context0));
            k0.d(class7, class4, new com.bumptech.glide.load.model.stream.f.b(context0));
        }
        k k12 = k0.d(class7, class2, new com.bumptech.glide.load.model.y.d(contentResolver0)).d(class7, class4, new com.bumptech.glide.load.model.y.b(contentResolver0)).d(class7, class5, new com.bumptech.glide.load.model.y.a(contentResolver0)).d(class7, class2, new com.bumptech.glide.load.model.z.a());
        com.bumptech.glide.load.model.stream.i.a i$a0 = new com.bumptech.glide.load.model.stream.i.a();
        k k13 = k12.d(URL.class, class2, i$a0).d(class7, class8, new com.bumptech.glide.load.model.l.a(context0));
        com.bumptech.glide.load.model.stream.b.a b$a0 = new com.bumptech.glide.load.model.stream.b.a();
        k k14 = k13.d(com.bumptech.glide.load.model.h.class, class2, b$a0);
        com.bumptech.glide.load.model.b.a b$a1 = new com.bumptech.glide.load.model.b.a();
        k k15 = k14.d(byte[].class, class0, b$a1);
        com.bumptech.glide.load.model.b.d b$d0 = new com.bumptech.glide.load.model.b.d();
        k k16 = k15.d(byte[].class, class2, b$d0).d(class7, class7, com.bumptech.glide.load.model.x.a.a()).d(class1, class1, com.bumptech.glide.load.model.x.a.a()).c(class1, class1, new n()).x(class3, class9, new com.bumptech.glide.load.resource.transcode.b(resources0)).x(class3, byte[].class, a1);
        com.bumptech.glide.load.resource.transcode.c c0 = new com.bumptech.glide.load.resource.transcode.c(e0, a1, d0);
        k16.x(class1, byte[].class, c0).x(class6, byte[].class, d0);
        if(v >= 23) {
            com.bumptech.glide.load.l l2 = S.d(e0);
            k0.c(class0, class3, l2);
            k0.c(class0, class9, new com.bumptech.glide.load.resource.bitmap.a(resources0, l2));
        }
    }

    private static void c(Context context0, c c0, k k0, List list0, @Nullable a a0) {
        for(Object object0: list0) {
            com.bumptech.glide.module.c c1 = (com.bumptech.glide.module.c)object0;
            try {
                c1.b(context0, c0, k0);
            }
            catch(AbstractMethodError abstractMethodError0) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: " + c1.getClass().getName(), abstractMethodError0);
            }
        }
        if(a0 != null) {
            a0.b(context0, c0, k0);
        }
    }

    static com.bumptech.glide.util.h.b d(c c0, List list0, @Nullable a a0) {
        class com.bumptech.glide.l.a implements com.bumptech.glide.util.h.b {
            private boolean a;
            final c b;
            final List c;
            final a d;

            com.bumptech.glide.l.a(c c0, List list0, a a0) {
                this.c = list0;
                this.d = a0;
                super();
            }

            public k a() {
                if(!this.a) {
                    Trace.c("Glide registry");
                    this.a = true;
                    try {
                        return l.a(this.b, this.c, this.d);
                    }
                    finally {
                        this.a = false;
                        Trace.f();
                    }
                }
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!");
            }

            @Override  // com.bumptech.glide.util.h$b
            public Object get() {
                return this.a();
            }
        }

        return new com.bumptech.glide.l.a(c0, list0, a0);
    }
}

