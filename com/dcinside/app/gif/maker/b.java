package com.dcinside.app.gif.maker;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.util.ol;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nGifMakeInfoImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMakeInfoImage.kt\ncom/dcinside/app/gif/maker/GifMakeInfoImage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n11192#2:164\n11303#2,4:165\n2669#3,7:169\n1863#3,2:177\n1#4:176\n*S KotlinDebug\n*F\n+ 1 GifMakeInfoImage.kt\ncom/dcinside/app/gif/maker/GifMakeInfoImage\n*L\n53#1:164\n53#1:165,4\n54#1:169,7\n131#1:177,2\n*E\n"})
public final class b implements f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final Bitmap b(String s, int v, int v1) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inSampleSize = com.dcinside.app.util.ol.b.c(ol.e, s, false, 2, null).k(v, v1);
            Bitmap bitmap0 = BitmapFactory.decodeFile(s, bitmapFactory$Options0);
            L.o(bitmap0, "decodeFile(...)");
            return this.c(bitmap0, d.f.f(s));
        }

        private final Bitmap c(Bitmap bitmap0, int v) {
            if(v != 0) {
                Matrix matrix0 = new Matrix();
                matrix0.setRotate(((float)v), ((float)bitmap0.getWidth()) / 2.0f, ((float)bitmap0.getHeight()) / 2.0f);
                Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
                L.o(bitmap1, "createBitmap(...)");
                if(!L.g(bitmap0, bitmap1)) {
                    bitmap0.recycle();
                    return bitmap1;
                }
            }
            return bitmap0;
        }
    }

    @l
    private final List a;
    private final int b;
    private final int c;
    @l
    private final File d;
    private final int e;
    private final long f;
    @l
    private final LongSparseArray g;
    @l
    private final LongSparseArray h;
    @l
    public static final a i;

    static {
        b.i = new a(null);
    }

    public b(@l List list0, int v, int v1) {
        L.p(list0, "imageList");
        super();
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = d.f.d();
        this.f = (long)list0.size();
        this.g = new LongSparseArray();
        this.h = new LongSparseArray();
        if(!this.h1().exists() && !this.h1().mkdirs()) {
            throw new t(this.h1(), null, "임시 파일을 생성할 수 없습니다.", 2, null);
        }
    }

    private final Frame b(long v, boolean z, int v1, boolean z1, boolean z2, long v2) {
        float f1;
        float f;
        int v8;
        int v7;
        boolean z3 = v1 % 180 != 0;
        int v3 = z3 ? this.getHeight() : this.getWidth();
        int v4 = z3 ? this.getWidth() : this.getHeight();
        String s = (String)this.a.get(((int)v2));
        Bitmap bitmap0 = b.i.b(s, this.getWidth(), this.getHeight());
        int v5 = bitmap0.getWidth();
        int v6 = bitmap0.getHeight();
        if(z) {
            v7 = v3;
            v8 = v4;
        }
        else {
            ol ol0 = ol.e.d(v5, v6, this.getWidth(), this.getHeight());
            v7 = ol0.j();
            v8 = ol0.g();
        }
        if(!z3) {
            f = z1 ? -1.0f : 1.0f;
        }
        else if(z2) {
            f = -1.0f;
        }
        else {
            f = 1.0f;
        }
        if(!z3) {
            f1 = z2 ? -1.0f : 1.0f;
        }
        else if(z1) {
            f1 = -1.0f;
        }
        else {
            f1 = 1.0f;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(v3, v4, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        canvas0.drawColor(0);
        float f2 = ((float)v3) / 2.0f - ((float)v7) / 2.0f;
        float f3 = ((float)v4) / 2.0f - ((float)v8) / 2.0f;
        RectF rectF0 = new RectF(f2, f3, ((float)v7) + f2, ((float)v8) + f3);
        canvas0.save();
        canvas0.rotate(((float)v1), ((float)v3) / 2.0f, ((float)v4) / 2.0f);
        canvas0.scale(f, f1, ((float)v3) / 2.0f, ((float)v4) / 2.0f);
        canvas0.drawBitmap(bitmap0, null, rectF0, null);
        canvas0.restore();
        L.o(bitmap1, "also(...)");
        bitmap0.recycle();
        String s1 = String.format("%s_%010d_o.jpg", Arrays.copyOf(new Object[]{v, v2}, 2));
        L.o(s1, "format(...)");
        File file0 = new File(this.h1(), s1);
        if(!com.dcinside.app.gif.frame.d.a.a(bitmap1, file0)) {
            throw new NullPointerException("이미지를 생성할 수 없습니다.");
        }
        String s2 = file0.getPath();
        L.m(s2);
        return new Frame(v2, s2, v3, v4);
    }

    @Override  // com.dcinside.app.gif.maker.f
    public long f1() {
        return this.f;
    }

    @Override  // com.dcinside.app.gif.maker.f
    @l
    public X g1(@l com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0, boolean z, int v, boolean z1, boolean z2, long v1) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gif.maker.GifMakeInfoImage$getFrameAsync$1", f = "GifMakeInfoImage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.maker.b.b extends o implements A3.o {
            int k;
            final b l;
            final long m;
            final boolean n;
            final int o;
            final boolean p;
            final boolean q;
            final long r;

            com.dcinside.app.gif.maker.b.b(b b0, long v, boolean z, int v1, boolean z1, boolean z2, long v2, kotlin.coroutines.d d0) {
                this.l = b0;
                this.m = v;
                this.n = z;
                this.o = v1;
                this.p = z1;
                this.q = z2;
                this.r = v2;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.maker.b.b(this.l, this.m, this.n, this.o, this.p, this.q, this.r, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.maker.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l.b(this.m, this.n, this.o, this.p, this.q, this.r);
            }
        }

        L.p(gifEncoder$a0, "type");
        Boolean[] arr_boolean = new Boolean[10];
        arr_boolean[0] = Boolean.valueOf(z);
        arr_boolean[1] = Boolean.valueOf(v == 90);
        arr_boolean[2] = Boolean.valueOf(v == 180);
        arr_boolean[3] = Boolean.valueOf(v == 270);
        arr_boolean[4] = Boolean.valueOf(z2);
        arr_boolean[5] = Boolean.valueOf(z1);
        arr_boolean[6] = Boolean.valueOf(gifEncoder$a0 == com.waynejo.androidndkgif.GifEncoder.a.a);
        arr_boolean[7] = Boolean.valueOf(gifEncoder$a0 == com.waynejo.androidndkgif.GifEncoder.a.b);
        arr_boolean[8] = Boolean.valueOf(gifEncoder$a0 == com.waynejo.androidndkgif.GifEncoder.a.d);
        arr_boolean[9] = Boolean.valueOf(gifEncoder$a0 == com.waynejo.androidndkgif.GifEncoder.a.c);
        ArrayList arrayList0 = new ArrayList(10);
        int v3 = 0;
        for(int v2 = 0; v3 < 10; ++v2) {
            arrayList0.add(((long)(arr_boolean[v3].booleanValue() ? 1L << v2 : 0L)));
            ++v3;
        }
        Iterator iterator0 = arrayList0.iterator();
        if(!iterator0.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Long long0;
        for(long0 = iterator0.next(); iterator0.hasNext(); long0 = (long)(long0.longValue() | ((Number)object0).longValue())) {
            Object object0 = iterator0.next();
        }
        long v4 = long0.longValue();
        LongSparseArray longSparseArray0 = (LongSparseArray)this.g.get(v4);
        if(longSparseArray0 == null) {
            longSparseArray0 = new LongSparseArray();
            this.g.put(v4, longSparseArray0);
        }
        X x0 = (X)longSparseArray0.get(v1);
        if(x0 != null && (!x0.k() || x0.x0() == null)) {
            return x0;
        }
        com.dcinside.app.gif.maker.b.b b$b0 = new com.dcinside.app.gif.maker.b.b(this, v4, z, v, z1, z2, v1, null);
        X x1 = k.b(() -> i.a, null, null, b$b0, 3, null);
        longSparseArray0.put(v1, x1);
        return x1;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int getHeight() {
        return this.c;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int getWidth() {
        return this.b;
    }

    @Override  // com.dcinside.app.gif.maker.f
    @l
    public File h1() {
        return this.d;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int i1() {
        return this.e;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public void release() {
        this.h.clear();
        Iterator iterator0 = s.W1(0, this.g.size()).iterator();
        while(iterator0.hasNext()) {
            int v = ((T)iterator0).b();
            LongSparseArray longSparseArray0 = (LongSparseArray)this.g.valueAt(v);
            int v1 = longSparseArray0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                X x0 = (X)longSparseArray0.valueAt(v2);
                if(x0 != null) {
                    L.m(x0);
                    kotlinx.coroutines.I0.a.b(x0, null, 1, null);
                }
            }
            longSparseArray0.clear();
        }
    }
}

