package com.dcinside.app.gif.maker;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.dcinside.app.Application;
import com.dcinside.app.gif.GifMakeActivity;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.gif.k;
import com.dcinside.app.gif.o;
import com.dcinside.app.util.ol.b;
import com.dcinside.app.util.ol;
import com.waynejo.androidndkgif.GifEncoder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.U;
import kotlin.collections.u;
import kotlin.coroutines.i;
import kotlin.f0;
import kotlin.io.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.h0;
import y4.l;
import y4.m;

@s0({"SMAP\nGifMaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1863#2,2:422\n2669#2,7:431\n796#2:439\n1872#2,2:440\n797#2,2:442\n1874#2:444\n799#2:445\n796#2:446\n1872#2,2:447\n797#2,2:449\n1874#2:451\n799#2:452\n12511#3,2:424\n11192#3:426\n11303#3,4:427\n1#4:438\n*S KotlinDebug\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker\n*L\n47#1:422,2\n113#1:431,7\n199#1:439\n199#1:440,2\n199#1:442,2\n199#1:444\n199#1:445\n204#1:446\n204#1:447,2\n204#1:449,2\n204#1:451\n204#1:452\n59#1:424,2\n112#1:426\n112#1:427,4\n*E\n"})
public final class d {
    @s0({"SMAP\nGifMaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1863#2:422\n1864#2:424\n1628#2,3:425\n1863#2,2:428\n1#3:423\n*S KotlinDebug\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker$Companion\n*L\n308#1:422\n308#1:424\n325#1:425,3\n335#1:428,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final k a(@m Bundle bundle0) {
            k k0 = new k();
            k0.setArguments(bundle0);
            return k0;
        }

        @l
        public final com.dcinside.app.gif.m b(@m Bundle bundle0) {
            com.dcinside.app.gif.m m0 = new com.dcinside.app.gif.m();
            m0.setArguments(bundle0);
            return m0;
        }

        @l
        public final o c(@m Bundle bundle0) {
            o o0 = new o();
            o0.setArguments(bundle0);
            return o0;
        }

        @l
        public final File d() {
            return new File(Application.e.c().getCacheDir(), "image_extractor_tmp");
        }

        @l
        public final File e() {
            return new File(Application.e.c().getCacheDir(), "video_extractor_tmp");
        }

        public final int f(@l String s) {
            L.p(s, "path");
            switch(new ExifInterface(s).l("Orientation", 1)) {
                case 3: {
                    return 180;
                }
                case 6: {
                    return 90;
                }
                case 8: {
                    return 270;
                }
                default: {
                    return 0;
                }
            }
        }

        private final String g(int v) {
            String s = Application.e.c().getString(v);
            L.o(s, "getString(...)");
            return s;
        }

        @m
        public final Object h(@l List list0, @l kotlin.coroutines.d d0) throws Exception {
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = list0.iterator();
            int v = 0;
            int v1 = 0;
            while(true) {
                String s = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                int v2 = ((Frame)object0).e();
                int v3 = ((Frame)object0).a();
                ol ol0 = b.e(ol.e, v2, v3, 700, 0, 8, null);
                v = Math.max(v, ol0.j());
                v1 = Math.max(v1, ol0.g());
                String s1 = ((Frame)object0).c();
                if(s1.length() > 0) {
                    s = s1;
                }
                if(s != null) {
                    arrayList0.add(s);
                }
            }
            com.dcinside.app.gif.maker.b b0 = new com.dcinside.app.gif.maker.b(arrayList0, v, v1);
            if(b0.f1() <= 0L) {
                throw new IllegalArgumentException(this.g(0x7F1503EC));  // string:gif_not_supported "지원하지 않는 파일형식입니다."
            }
            TreeSet treeSet0 = new TreeSet();
            Iterator iterator1 = s.e2(0L, arrayList0.size()).iterator();
            while(iterator1.hasNext()) {
                treeSet0.add(kotlin.coroutines.jvm.internal.b.g(((U)iterator1).b()));
            }
            d d1 = new d(b0, treeSet0, null);
            if(!d1.e()) {
                throw new t(b0.h1(), null, this.g(0x7F1503EA), 2, null);  // string:gif_mkdir_fail "임시 파일을 생성할 수 없습니다."
            }
            return d1;
        }

        @m
        public final Object i(@l File file0, @l kotlin.coroutines.d d0) {
            String s = file0.getPath();
            L.m(s);
            c c0 = new c(s);
            if(c0.f1() <= 0L) {
                throw new IllegalArgumentException(this.g(0x7F1503EC));  // string:gif_not_supported "지원하지 않는 파일형식입니다."
            }
            d d1 = new d(c0, null, 2, null);
            if(!d1.e()) {
                throw new t(c0.h1(), null, this.g(0x7F1503EA), 2, null);  // string:gif_mkdir_fail "임시 파일을 생성할 수 없습니다."
            }
            return d1;
        }

        public final void j(@l List list0) {
            L.p(list0, "list");
            for(Object object0: list0) {
                Frame frame0 = (Frame)object0;
                if(frame0.e() == 0 || frame0.a() == 0) {
                    int v = d.f.f(frame0.c());
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(frame0.c(), bitmapFactory$Options0);
                    if(v % 180 == 0) {
                        frame0.g(bitmapFactory$Options0.outWidth);
                        frame0.f(bitmapFactory$Options0.outHeight);
                    }
                    else {
                        frame0.g(bitmapFactory$Options0.outHeight);
                        frame0.f(bitmapFactory$Options0.outWidth);
                    }
                }
            }
        }

        public final void k(@l Activity activity0, @l String s, long v) {
            L.p(activity0, "activity");
            L.p(s, "videoPath");
            Intent intent0 = new Intent(activity0, GifMakeActivity.class);
            intent0.putExtra("extra_type", 1);
            intent0.putExtra("extra_max_upload_size", v);
            intent0.putExtra("extra_video_path", s);
            activity0.startActivityForResult(intent0, 0x3FE);
        }

        public final void l(@l Activity activity0, @l ArrayList arrayList0, long v) {
            L.p(activity0, "activity");
            L.p(arrayList0, "list");
            Intent intent0 = new Intent(activity0, GifMakeActivity.class);
            intent0.putExtra("extra_type", 0);
            intent0.putExtra("extra_max_upload_size", v);
            intent0.putExtra("extra_image_frames", arrayList0);
            activity0.startActivityForResult(intent0, 0x3FD);
        }
    }

    public final class com.dcinside.app.gif.maker.d.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.gif.maker.a.values().length];
            try {
                arr_v[com.dcinside.app.gif.maker.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.gif.maker.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.gif.maker.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.gif.maker.d.b.a = arr_v;
        }
    }

    @l
    private final f a;
    @l
    private final TreeSet b;
    @l
    private final TreeSet c;
    @l
    private LongSparseArray d;
    @m
    private Function1 e;
    @l
    public static final a f = null;
    @l
    public static final String g = "extra_image_frames";
    @l
    public static final String h = "extra_video_path";
    @l
    public static final String i = "extra_from_video";
    @l
    public static final String j = "extra_type";
    @l
    public static final String k = "extra_gif_path";
    @l
    public static final String l = "extra_frame_interval_ms";
    @l
    public static final String m = "extra_max_upload_size";
    public static final int n = 0;
    public static final int o = 1;
    public static final long p = 200L;
    public static final int q = 700;
    public static final long r = 10000L;

    static {
        d.f = new a(null);
    }

    private d(f f0, TreeSet treeSet0) {
        this.a = f0;
        this.b = treeSet0;
        TreeSet treeSet1 = new TreeSet();
        this.c = treeSet1;
        this.d = new LongSparseArray();
        treeSet1.addAll(treeSet0);
    }

    d(f f0, TreeSet treeSet0, int v, w w0) {
        if((v & 2) != 0) {
            treeSet0 = new TreeSet();
        }
        this(f0, treeSet0);
    }

    public d(f f0, TreeSet treeSet0, w w0) {
        this(f0, treeSet0);
    }

    // 去混淆评级： 低(20)
    public static final int b(d d0) {
        return 8;
    }

    public static final Object c(d d0, long v, boolean z, boolean z1, boolean z2, int v1, boolean z3, boolean z4, File file0, long v2, com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0, A3.o o0, kotlin.coroutines.d d1) {
        return d0.m(v, z, z1, z2, v1, z3, z4, file0, v2, gifEncoder$a0, o0, d1);
    }

    public final void d(@l com.dcinside.app.gif.maker.a a0, boolean z) {
        int v = 0;
        L.p(a0, "bulk");
        int v1 = com.dcinside.app.gif.maker.d.b.a[a0.ordinal()];
        if(v1 == 1) {
            this.c.clear();
            this.c.addAll(this.b);
            if(z) {
                Function1 function12 = this.e;
                if(function12 != null) {
                    function12.invoke(this);
                }
            }
        }
        else {
            switch(v1) {
                case 2: {
                    this.c.clear();
                    TreeSet treeSet0 = this.c;
                    for(Object object0: this.b) {
                        if(v < 0) {
                            u.Z();
                        }
                        ((Number)object0).longValue();
                        if((v + 1) % 4 != 0) {
                            treeSet0.add(object0);
                        }
                        ++v;
                    }
                    if(z) {
                        Function1 function10 = this.e;
                        if(function10 != null) {
                            function10.invoke(this);
                            return;
                        }
                    }
                    break;
                }
                case 3: {
                    this.c.clear();
                    TreeSet treeSet1 = this.c;
                    for(Object object1: this.b) {
                        if(v < 0) {
                            u.Z();
                        }
                        ((Number)object1).longValue();
                        if((v + 1) % 2 != 0) {
                            treeSet1.add(object1);
                        }
                        ++v;
                    }
                    if(z) {
                        Function1 function11 = this.e;
                        if(function11 != null) {
                            function11.invoke(this);
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }

    private final boolean e() {
        if(this.a.h1().exists()) {
            File[] arr_file = this.a.h1().listFiles();
            if(arr_file == null) {
                arr_file = new File[0];
            }
            for(int v = 0; v < arr_file.length; ++v) {
                if(!arr_file[v].delete()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(long v) {
        if(this.c.remove(v)) {
            Function1 function10 = this.e;
            if(function10 != null) {
                function10.invoke(this);
            }
        }
    }

    @l
    public final TreeSet g() {
        return this.b;
    }

    @l
    public final LongSparseArray h() {
        return this.d;
    }

    @m
    public final Function1 i() {
        return this.e;
    }

    @l
    public final f j() {
        return this.a;
    }

    private final int k() [...] // 潜在的解密器

    @l
    public final TreeSet l() {
        return this.c;
    }

    private final Object m(long v, boolean z, boolean z1, boolean z2, int v1, boolean z3, boolean z4, File file0, long v2, com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0, A3.o o0, kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gif.maker.GifMaker$gifAsync$2", f = "GifMaker.kt", i = {0, 0, 0, 0, 0}, l = {0xB0}, m = "invokeSuspend", n = {"encoder", "outputPath", "size", "index$iv", "index"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
        @s0({"SMAP\nGifMaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker$gifAsync$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n177#2,6:422\n183#2,3:440\n1557#3:428\n1628#3,3:429\n1557#3:433\n1628#3,3:434\n1872#3,3:437\n1#4:432\n*S KotlinDebug\n*F\n+ 1 GifMaker.kt\ncom/dcinside/app/gif/maker/GifMaker$gifAsync$2\n*L\n162#1:422,6\n162#1:440,3\n163#1:428\n163#1:429,3\n174#1:433\n174#1:434,3\n175#1:437,3\n*E\n"})
        static final class com.dcinside.app.gif.maker.d.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
            final boolean A;
            final boolean B;
            final boolean C;
            final A3.o D;
            final long E;
            Object k;
            Object l;
            Object m;
            Object n;
            int o;
            int p;
            int q;
            long r;
            int s;
            final com.waynejo.androidndkgif.GifEncoder.a t;
            final d u;
            final File v;
            final long w;
            final int x;
            final boolean y;
            final boolean z;

            com.dcinside.app.gif.maker.d.c(com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0, d d0, File file0, long v, int v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, A3.o o0, long v2, kotlin.coroutines.d d1) {
                this.t = gifEncoder$a0;
                this.u = d0;
                this.v = file0;
                this.w = v;
                this.x = v1;
                this.y = z;
                this.z = z1;
                this.A = z2;
                this.B = z3;
                this.C = z4;
                this.D = o0;
                this.E = v2;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.maker.d.c(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.maker.d.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gif.maker.GifMaker$gifAsync$2$1$3$1", f = "GifMaker.kt", i = {}, l = {0xAE}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.maker.d.c.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final X l;

                    com.dcinside.app.gif.maker.d.c.a(X x0, kotlin.coroutines.d d0) {
                        this.l = x0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.maker.d.c.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.maker.d.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                object0 = this.l.o(this);
                                return object0 == object1 ? object1 : BitmapFactory.decodeFile(((Frame)object0).c());
                            }
                            case 1: {
                                f0.n(object0);
                                return BitmapFactory.decodeFile(((Frame)object0).c());
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                Iterator iterator2;
                int v8;
                A3.o o1;
                int v7;
                long v6;
                String s;
                h l0$h0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
            alab1:
                switch(this.s) {
                    case 0: {
                        f0.n(object0);
                        l0$h0 = new h();
                        try {
                            int v = this.u.l().size();
                            s = new File(this.v, System.currentTimeMillis() + "_" + this.w + "_" + this.t.ordinal() + ".gif").getPath();
                            boolean z = this.x % 180 != 0;
                            int v1 = z ? this.u.j().getHeight() : this.u.j().getWidth();
                            int v2 = z ? this.u.j().getWidth() : this.u.j().getHeight();
                            GifEncoder gifEncoder0 = new GifEncoder();
                            l0$h0.a = gifEncoder0;
                            gifEncoder0.e(this.y);
                            int v3 = s.u(d.b(this.u) - 1, 2);
                            ((GifEncoder)l0$h0.a).f(v3);
                            ((GifEncoder)l0$h0.a).d(v1, v2, s, this.t);
                            d d0 = this.u;
                            com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0 = this.t;
                            boolean z1 = this.z;
                            int v4 = this.x;
                            boolean z2 = this.A;
                            boolean z3 = this.B;
                            boolean z4 = this.C;
                            A3.o o0 = this.D;
                            try {
                                TreeSet treeSet0 = d0.l();
                                long v5 = this.E;
                                List list0 = new ArrayList(u.b0(treeSet0, 10));
                                for(Object object2: treeSet0) {
                                    list0.add(d0.j().g1(gifEncoder$a0, z1, v4, z2, z3, ((Number)object2).longValue()));
                                }
                                if(z4) {
                                    list0 = u.X4(list0);
                                }
                                ArrayList arrayList0 = new ArrayList(u.b0(list0, 10));
                                for(Object object3: list0) {
                                    com.dcinside.app.gif.maker.d.c.a d$c$a0 = new com.dcinside.app.gif.maker.d.c.a(((X)object3), null);
                                    arrayList0.add(kotlinx.coroutines.k.b(() -> i.a, null, null, d$c$a0, 3, null));
                                }
                                v6 = v5;
                                v7 = v;
                                o1 = o0;
                                v8 = 0;
                                iterator2 = arrayList0.iterator();
                                goto label_63;
                            }
                            catch(Exception unused_ex) {
                                break;
                            }
                        }
                        catch(Throwable throwable0) {
                            goto label_82;
                        }
                    }
                    case 1: {
                        v8 = this.q;
                        int v9 = this.p;
                        v6 = this.r;
                        v7 = this.o;
                        iterator2 = (Iterator)this.n;
                        o1 = (A3.o)this.m;
                        s = (String)this.l;
                        l0$h0 = (h)this.k;
                        try {
                            f0.n(object0);
                            int v10 = v9;
                            Object object4 = object0;
                            while(true) {
                                ((GifEncoder)l0$h0.a).b(((Bitmap)object4), ((int)v6));
                                ((Bitmap)object4).recycle();
                                if(o1 != null) {
                                    o1.invoke(kotlin.coroutines.jvm.internal.b.f(v8), kotlin.coroutines.jvm.internal.b.f(v7));
                                }
                                v8 = v10;
                            label_63:
                                if(!iterator2.hasNext()) {
                                    break alab1;
                                }
                                Object object5 = iterator2.next();
                                v10 = v8 + 1;
                                if(v8 < 0) {
                                    u.Z();
                                }
                                this.k = l0$h0;
                                this.l = s;
                                this.m = o1;
                                this.n = iterator2;
                                this.o = v7;
                                this.r = v6;
                                this.p = v10;
                                this.q = v8;
                                this.s = 1;
                                object4 = ((X)object5).o(this);
                                if(object4 != object1) {
                                    continue;
                                }
                                return object1;
                            }
                        }
                        catch(Exception unused_ex) {
                            break;
                        }
                        catch(Throwable throwable0) {
                            goto label_82;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                goto label_86;
            label_82:
                GifEncoder gifEncoder1 = (GifEncoder)l0$h0.a;
                if(gifEncoder1 != null) {
                    gifEncoder1.a();
                }
                throw throwable0;
            label_86:
                GifEncoder gifEncoder2 = (GifEncoder)l0$h0.a;
                if(gifEncoder2 != null) {
                    gifEncoder2.a();
                }
                return s;
            }
        }

        com.dcinside.app.gif.maker.d.c d$c0 = new com.dcinside.app.gif.maker.d.c(gifEncoder$a0, this, file0, v, v1, z, z1, z3, z4, z2, o0, v2, null);
        return kotlinx.coroutines.k.b(() -> i.a, h0.c(), null, d$c0, 2, null);
    }

    static Object n(d d0, long v, boolean z, boolean z1, boolean z2, int v1, boolean z3, boolean z4, File file0, long v2, com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0, A3.o o0, kotlin.coroutines.d d1, int v3, Object object0) {
        return (v3 & 0x400) == 0 ? d0.m(v, z, z1, z2, v1, z3, z4, file0, v2, gifEncoder$a0, o0, d1) : d0.m(v, z, z1, z2, v1, z3, z4, file0, v2, gifEncoder$a0, null, d1);
    }

    public final boolean o(long v) {
        return this.c.contains(v);
    }

    @l
    public final X p(boolean z, long v) {
        return this.a.g1(com.waynejo.androidndkgif.GifEncoder.a.a, z, 0, false, false, v);
    }

    @m
    public final Object q(boolean z, boolean z1, long v, @m A3.o o0, @l kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.gif.maker.GifMaker", f = "GifMaker.kt", i = {0, 0}, l = {0x7F}, m = "makeGifFastAsync", n = {"this", "id"}, s = {"L$0", "J$0"})
        static final class com.dcinside.app.gif.maker.d.d extends kotlin.coroutines.jvm.internal.d {
            Object k;
            long l;
            Object m;
            final d n;
            int o;

            com.dcinside.app.gif.maker.d.d(d d0, kotlin.coroutines.d d1) {
                this.n = d0;
                super(d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.o |= 0x80000000;
                return this.n.q(false, false, 0L, null, this);
            }
        }

        long v5;
        d d1;
        com.dcinside.app.gif.maker.d.d d$d0;
        int v1 = 0;
        if(d0 instanceof com.dcinside.app.gif.maker.d.d) {
            d$d0 = (com.dcinside.app.gif.maker.d.d)d0;
            int v2 = d$d0.o;
            if((v2 & 0x80000000) == 0) {
                d$d0 = new com.dcinside.app.gif.maker.d.d(this, d0);
            }
            else {
                d$d0.o = v2 ^ 0x80000000;
            }
        }
        else {
            d$d0 = new com.dcinside.app.gif.maker.d.d(this, d0);
        }
        Object object0 = d$d0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(d$d0.o) {
            case 0: {
                f0.n(object0);
                Boolean[] arr_boolean = {kotlin.coroutines.jvm.internal.b.a(z), kotlin.coroutines.jvm.internal.b.a(z1)};
                ArrayList arrayList0 = new ArrayList(2);
                for(int v3 = 0; v1 < 2; ++v3) {
                    arrayList0.add(kotlin.coroutines.jvm.internal.b.g((arr_boolean[v1].booleanValue() ? 1L << v3 : 0L)));
                    ++v1;
                }
                Iterator iterator0 = arrayList0.iterator();
                if(!iterator0.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
                }
                Long long0;
                for(long0 = iterator0.next(); iterator0.hasNext(); long0 = kotlin.coroutines.jvm.internal.b.g(long0.longValue() | ((Number)object2).longValue())) {
                    Object object2 = iterator0.next();
                }
                long v4 = long0.longValue();
                File file0 = this.a.h1();
                com.waynejo.androidndkgif.GifEncoder.a gifEncoder$a0 = com.waynejo.androidndkgif.GifEncoder.a.a;
                X x0 = (X)this.d.get(v4);
                if(x0 != null && (!x0.k() || x0.x0() == null)) {
                    return x0;
                }
                d$d0.k = this;
                d$d0.l = v4;
                d$d0.o = 1;
                object0 = this.m(v4, true, z, z1, 0, false, false, file0, v, gifEncoder$a0, o0, d$d0);
                if(object0 == object1) {
                    return object1;
                }
                d1 = this;
                v5 = v4;
                break;
            }
            case 1: {
                v5 = d$d0.l;
                d1 = (d)d$d0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d1.d.put(v5, ((X)object0));
        return object0;
    }

    public static Object r(d d0, boolean z, boolean z1, long v, A3.o o0, kotlin.coroutines.d d1, int v1, Object object0) {
        if((v1 & 8) != 0) {
            o0 = null;
        }
        return d0.q(z, z1, v, o0, d1);
    }

    @m
    public final Object s(boolean z, boolean z1, int v, boolean z2, boolean z3, long v1, @m A3.o o0, @l kotlin.coroutines.d d0) {
        File file0 = com.dcinside.app.album.l.a.d();
        if(!file0.exists() && !file0.mkdirs()) {
            throw new t(file0, null, "Failed create dir.", 2, null);
        }
        return this.m(System.currentTimeMillis(), true, z, z1, v, z2, z3, file0, v1, com.waynejo.androidndkgif.GifEncoder.a.c, o0, d0);
    }

    public static Object t(d d0, boolean z, boolean z1, int v, boolean z2, boolean z3, long v1, A3.o o0, kotlin.coroutines.d d1, int v2, Object object0) {
        return (v2 & 0x40) == 0 ? d0.s(z, z1, v, z2, z3, v1, o0, d1) : d0.s(z, z1, v, z2, z3, v1, null, d1);
    }

    @m
    public final Object u(boolean z, boolean z1, int v, boolean z2, boolean z3, long v1, @m A3.o o0, @l kotlin.coroutines.d d0) {
        File file0 = com.dcinside.app.album.l.a.c();
        if(!file0.exists() && !file0.mkdirs()) {
            throw new t(file0, null, "Failed create dir.", 2, null);
        }
        return this.m(System.currentTimeMillis(), true, z, z1, v, z2, z3, file0, v1, com.waynejo.androidndkgif.GifEncoder.a.c, o0, d0);
    }

    public static Object v(d d0, boolean z, boolean z1, int v, boolean z2, boolean z3, long v1, A3.o o0, kotlin.coroutines.d d1, int v2, Object object0) {
        return (v2 & 0x40) == 0 ? d0.u(z, z1, v, z2, z3, v1, o0, d1) : d0.u(z, z1, v, z2, z3, v1, null, d1);
    }

    public final void w() {
        this.e = null;
        Iterator iterator0 = s.W1(0, this.d.size()).iterator();
        while(iterator0.hasNext()) {
            int v = ((T)iterator0).b();
            X x0 = (X)this.d.valueAt(v);
            if(x0 != null) {
                L.m(x0);
                kotlinx.coroutines.I0.a.b(x0, null, 1, null);
            }
        }
        this.d.clear();
        this.b.clear();
        this.c.clear();
        this.a.release();
    }

    public final void x(long v) {
        if(this.c.add(v)) {
            Function1 function10 = this.e;
            if(function10 != null) {
                function10.invoke(this);
            }
        }
    }

    public final void y(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<set-?>");
        this.d = longSparseArray0;
    }

    public final void z(@m Function1 function10) {
        this.e = function10;
    }
}

