package com.dcinside.app.write;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Lk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.A1;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,378:1\n1#2:379\n25#3:380\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer\n*L\n37#1:380\n*E\n"})
public final class d {
    @l
    public static final d a;

    static {
        d.a = new d();
    }

    @m
    public final Object a(@l PostWriteActivity postWriteActivity0, @l Collection collection0, @l RecyclerView recyclerView0, int v, long v1, long v2, boolean z, @l String s, boolean z1, int v3, @l kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.write.ImageResizer", f = "ImageResizer.kt", i = {0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {0x2F, 0x3F, 75, 89, 97, 101, 104, 107, 0x71}, m = "addImagesToAdapter", n = {"ctx", "ctx", "ctx", "this", "nickname", "ctx", "adapter", "addPosition", "imageMaxCount", "imageMaxSize", "resize", "isDefImage", "defIndex", "addAtPosition", "this", "nickname", "ctx", "adapter", "addPosition", "imageMaxCount", "imageMaxSize", "resize", "isDefImage", "defIndex", "addAtPosition", "this", "nickname", "ctx", "adapter", "addPosition", "imageMaxCount", "imageMaxSize", "resize", "isDefImage", "defIndex", "addAtPosition", "this", "nickname", "ctx", "adapter", "addPosition", "imageMaxCount", "imageMaxSize", "resize", "isDefImage", "defIndex", "addAtPosition"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "Z$0", "Z$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "Z$0", "Z$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "Z$0", "Z$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "Z$0", "Z$1", "I$0", "I$1"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            long q;
            long r;
            boolean s;
            boolean t;
            int u;
            int v;
            Object w;
            final d x;
            int y;

            a(d d0, kotlin.coroutines.d d1) {
                this.x = d0;
                super(d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.w = object0;
                this.y |= 0x80000000;
                return this.x.a(null, null, null, 0, 0L, 0L, false, null, false, 0, this);
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$2", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.o {
            int k;
            final PostWriteActivity l;
            final String m;

            b(PostWriteActivity postWriteActivity0, String s, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new b(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
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
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$3", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            final PostWriteActivity l;

            c(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new c(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504E7);  // string:image_resize_fail "이미지 크기 조정에 실패했습니다."
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$4", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.d.d extends o implements A3.o {
            int k;
            final PostWriteActivity l;

            com.dcinside.app.write.d.d(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.d.d(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.d.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504F3);  // string:image_watermark_insert_fail "이미지 서명에 실패했습니다."
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$5", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.o {
            int k;
            final PostWriteActivity l;
            final String m;

            e(PostWriteActivity postWriteActivity0, String s, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                this.m = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new e(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.G(this.l, this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$6", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.d.f extends o implements A3.o {
            int k;
            final d1 l;
            final kotlin.jvm.internal.l0.f m;

            com.dcinside.app.write.d.f(d1 d10, kotlin.jvm.internal.l0.f l0$f0, kotlin.coroutines.d d0) {
                this.l = d10;
                this.m = l0$f0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.d.f(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.d.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.notifyItemInserted(this.m.a);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$7", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements A3.o {
            int k;
            final d1 l;
            final ArrayList m;

            g(d1 d10, ArrayList arrayList0, kotlin.coroutines.d d0) {
                this.l = d10;
                this.m = arrayList0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new g(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((g)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.notifyItemInserted(this.m.size() - 1);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$8", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements A3.o {
            int k;
            final PostWriteActivity l;

            h(PostWriteActivity postWriteActivity0, kotlin.coroutines.d d0) {
                this.l = postWriteActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new h(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addImagesToAdapter$9", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends o implements A3.o {
            int k;
            final d1 l;

            i(d1 d10, kotlin.coroutines.d d0) {
                this.l = d10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new i(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((i)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.p0(new int[0]);
                return S0.a;
            }
        }

        PostWriteActivity postWriteActivity9;
        ArrayList arrayList0;
        int v30;
        boolean z15;
        a d$a2;
        PostWriteActivity postWriteActivity8;
        PostWriteActivity postWriteActivity7;
        k0 k00;
        String s7;
        File file0;
        int v29;
        Iterator iterator6;
        int v28;
        kotlin.jvm.internal.l0.f l0$f6;
        d d6;
        d1 d16;
        long v23;
        kotlin.jvm.internal.l0.f l0$f4;
        int v22;
        Iterator iterator4;
        Object object2;
        d1 d15;
        long v20;
        boolean z11;
        int v19;
        d1 d14;
        d d4;
        PostWriteActivity postWriteActivity6;
        boolean z10;
        boolean z9;
        int v16;
        long v14;
        PostWriteActivity postWriteActivity5;
        int v13;
        d1 d12;
        boolean z6;
        d d2;
        PostWriteActivity postWriteActivity4;
        kotlin.jvm.internal.l0.f l0$f2;
        Iterator iterator2;
        long v12;
        boolean z4;
        int v10;
        PostWriteActivity postWriteActivity1;
        String s1;
        boolean z3;
        long v8;
        long v7;
        Iterator iterator1;
        d d1;
        a d$a1;
        kotlin.jvm.internal.l0.f l0$f1;
        d1 d10;
        PostWriteActivity postWriteActivity3;
        int v6;
        int v5;
        boolean z2;
        a d$a0;
        if(d0 instanceof a) {
            d$a0 = (a)d0;
            int v4 = d$a0.y;
            if((v4 & 0x80000000) == 0) {
                d$a0 = new a(this, d0);
            }
            else {
                d$a0.y = v4 ^ 0x80000000;
            }
        }
        else {
            d$a0 = new a(this, d0);
        }
        Object object0 = d$a0.w;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(d$a0.y) {
            case 0: {
                f0.n(object0);
                PostWriteActivity postWriteActivity2 = postWriteActivity0.q1() ? postWriteActivity0 : null;
                if(postWriteActivity2 == null) {
                    return S0.a;
                }
                Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
                if(!(recyclerView$Adapter0 instanceof d1)) {
                    recyclerView$Adapter0 = null;
                }
                if(((d1)recyclerView$Adapter0) == null) {
                    return S0.a;
                }
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                l0$f0.a = v;
                Iterator iterator0 = collection0.iterator();
                z2 = z1;
                v5 = v3;
                v6 = v < 0 ? 0 : 1;
                postWriteActivity3 = postWriteActivity2;
                d10 = (d1)recyclerView$Adapter0;
                l0$f1 = l0$f0;
                d$a1 = d$a0;
                d1 = this;
                iterator1 = iterator0;
                v7 = v1;
                v8 = v2;
                z3 = z;
                s1 = s;
                goto label_153;
            }
            case 1: {
                postWriteActivity1 = (PostWriteActivity)d$a0.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    goto label_392;
                }
            }
            case 2: {
                postWriteActivity1 = (PostWriteActivity)d$a0.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    goto label_392;
                }
            }
            case 3: {
                postWriteActivity1 = (PostWriteActivity)d$a0.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    goto label_392;
                }
            }
            case 4: {
                int v9 = d$a0.v;
                v10 = d$a0.u;
                z4 = d$a0.t;
                boolean z5 = d$a0.s;
                long v11 = d$a0.r;
                v12 = d$a0.q;
                iterator2 = (Iterator)d$a0.p;
                l0$f2 = (kotlin.jvm.internal.l0.f)d$a0.o;
                d1 d11 = (d1)d$a0.n;
                postWriteActivity4 = (PostWriteActivity)d$a0.m;
                String s2 = (String)d$a0.l;
                d2 = (d)d$a0.k;
                try {
                    f0.n(object0);
                    z6 = z5;
                    d12 = d11;
                    s1 = s2;
                    v13 = v9;
                    postWriteActivity5 = postWriteActivity4;
                    v14 = v11;
                    goto label_239;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity1 = postWriteActivity4;
                    goto label_392;
                }
            }
            case 5: {
                int v15 = d$a0.v;
                v16 = d$a0.u;
                boolean z7 = d$a0.t;
                boolean z8 = d$a0.s;
                long v17 = d$a0.r;
                v12 = d$a0.q;
                iterator2 = (Iterator)d$a0.p;
                l0$f2 = (kotlin.jvm.internal.l0.f)d$a0.o;
                d1 d13 = (d1)d$a0.n;
                postWriteActivity4 = (PostWriteActivity)d$a0.m;
                String s3 = (String)d$a0.l;
                d d3 = (d)d$a0.k;
                try {
                    f0.n(object0);
                    z9 = z7;
                    z10 = z8;
                    postWriteActivity6 = postWriteActivity4;
                    s1 = s3;
                    v13 = v15;
                    d4 = d3;
                    d14 = d13;
                    v14 = v17;
                    goto label_289;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity1 = postWriteActivity4;
                    goto label_392;
                }
            }
            case 6: {
                int v18 = d$a0.v;
                v19 = d$a0.u;
                z11 = d$a0.t;
                boolean z12 = d$a0.s;
                v20 = d$a0.r;
                long v21 = d$a0.q;
                Iterator iterator3 = (Iterator)d$a0.p;
                kotlin.jvm.internal.l0.f l0$f3 = (kotlin.jvm.internal.l0.f)d$a0.o;
                d15 = (d1)d$a0.n;
                postWriteActivity4 = (PostWriteActivity)d$a0.m;
                String s4 = (String)d$a0.l;
                d2 = (d)d$a0.k;
                try {
                    f0.n(object0);
                    object2 = object1;
                    z10 = z12;
                    iterator4 = iterator3;
                    s1 = s4;
                    v22 = v18;
                    l0$f4 = l0$f3;
                    v23 = v21;
                    goto label_336;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity1 = postWriteActivity4;
                    goto label_392;
                }
            }
            case 7: {
                int v24 = d$a0.v;
                int v25 = d$a0.u;
                boolean z13 = d$a0.t;
                boolean z14 = d$a0.s;
                long v26 = d$a0.r;
                long v27 = d$a0.q;
                Iterator iterator5 = (Iterator)d$a0.p;
                kotlin.jvm.internal.l0.f l0$f5 = (kotlin.jvm.internal.l0.f)d$a0.o;
                d16 = (d1)d$a0.n;
                postWriteActivity1 = (PostWriteActivity)d$a0.m;
                String s5 = (String)d$a0.l;
                d d5 = (d)d$a0.k;
                try {
                    f0.n(object0);
                    d6 = d5;
                    object2 = object1;
                    l0$f6 = l0$f5;
                    z2 = z13;
                    v28 = v24;
                    v5 = v25;
                    s1 = s5;
                    postWriteActivity3 = postWriteActivity1;
                    iterator6 = iterator5;
                    d$a1 = d$a0;
                    z3 = z14;
                    v14 = v26;
                    v12 = v27;
                    break;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    goto label_392;
                }
            }
            case 8: {
                f0.n(object0);
                return S0.a;
            }
            case 9: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            object1 = object2;
            d10 = d16;
            v6 = v28;
            v7 = v12;
            d1 = d6;
            l0$f1 = l0$f6;
            v8 = v14;
            iterator1 = iterator6;
            while(true) {
            label_153:
                if(!iterator1.hasNext()) {
                    goto label_406;
                }
                Object object3 = iterator1.next();
                String s6 = (String)object3;
                try {
                    v29 = d10.O();
                    if(((long)v29) >= v7) {
                        break alab1;
                    }
                    file0 = new File(s6);
                    if(!z2) {
                        goto label_160;
                    }
                    goto label_161;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity7 = postWriteActivity3;
                    postWriteActivity1 = postWriteActivity7;
                    goto label_391;
                }
                try {
                label_160:
                    if(!file0.canRead()) {
                        continue;
                    }
                label_161:
                    if(z3) {
                        File file1 = d1.o(file0, v29);
                        s7 = file1 == null ? null : file1.getPath();
                    }
                    else {
                        s7 = s6;
                    }
                    if(s7 == null) {
                        c d$c0 = new c(postWriteActivity3, null);
                        d$a1.k = postWriteActivity3;
                        d$a1.l = null;
                        d$a1.m = null;
                        d$a1.n = null;
                        d$a1.o = null;
                        d$a1.p = null;
                        d$a1.y = 2;
                        return kotlinx.coroutines.i.h(h0.e(), d$c0, d$a1) == object1 ? object1 : S0.a;
                    }
                    goto label_181;
                }
                catch(Exception exception0) {
                    goto label_389;
                }
                return object1;
                try {
                label_181:
                    if(dl.a.B2()) {
                        goto label_182;
                    }
                    goto label_184;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity7 = postWriteActivity3;
                    postWriteActivity1 = postWriteActivity7;
                    goto label_391;
                }
                try {
                label_182:
                    if(s1.length() > 0) {
                        s7 = M2.a.b(postWriteActivity3, s1, s7);
                    }
                label_184:
                    if(s7 == null) {
                        com.dcinside.app.write.d.d d$d0 = new com.dcinside.app.write.d.d(postWriteActivity3, null);
                        d$a1.k = postWriteActivity3;
                        d$a1.l = null;
                        d$a1.m = null;
                        d$a1.n = null;
                        d$a1.o = null;
                        d$a1.p = null;
                        d$a1.y = 3;
                        return kotlinx.coroutines.i.h(h0.e(), d$d0, d$a1) == object1 ? object1 : S0.a;
                    }
                    if(z2) {
                        k00 = k0.r.c(s7, v5);
                        v14 = v8;
                        goto label_207;
                    }
                }
                catch(Exception exception0) {
                    goto label_389;
                }
                try {
                    v14 = v8;
                    k00 = k0.r.q(s7, v14);
                }
                catch(Exception exception0) {
                    object2 = object1;
                    postWriteActivity7 = postWriteActivity3;
                    postWriteActivity1 = postWriteActivity7;
                    goto label_391;
                }
                try {
                label_207:
                    if(k00 == null) {
                        String s8 = postWriteActivity3.getString(0x7F150800, new Object[]{Gk.b(v14)});  // string:post_write_less_max_upload_bytes "%1$s 이하의 이미지만 첨부할 수 있습니다."
                        L.o(s8, "getString(...)");
                        postWriteActivity8 = postWriteActivity3;
                        e d$e0 = new e(postWriteActivity3, s8, null);
                        d$a1.k = d1;
                        d$a1.l = s1;
                        d$a1.m = postWriteActivity3;
                        d12 = d10;
                        d$a1.n = d12;
                        d$a1.o = l0$f1;
                        postWriteActivity8 = postWriteActivity3;
                        iterator2 = iterator1;
                        d$a1.p = iterator2;
                        d$a1.q = v7;
                        d$a1.r = v14;
                        d$a1.s = z3;
                        d$a1.t = z2;
                        d$a1.u = v5;
                        v13 = v6;
                        d$a1.v = v13;
                        d$a1.y = 4;
                        if(kotlinx.coroutines.i.h(h0.e(), d$e0, d$a1) == object1) {
                            return object1;
                        }
                        v10 = v5;
                        z4 = z2;
                        postWriteActivity5 = postWriteActivity8;
                        l0$f2 = l0$f1;
                        z6 = z3;
                        d2 = d1;
                        d$a0 = d$a1;
                        v12 = v7;
                    label_239:
                        z10 = z6;
                        object2 = object1;
                        d$a2 = d$a0;
                        z15 = z4;
                        v30 = v10;
                        d16 = d12;
                    }
                    else {
                        postWriteActivity8 = postWriteActivity3;
                        iterator2 = iterator1;
                        v13 = v6;
                        if(z2) {
                            d10.r0(true);
                        }
                        arrayList0 = d10.S();
                        if(v13 == 0) {
                            goto label_301;
                        }
                        else {
                            goto label_253;
                        }
                    }
                    goto label_346;
                }
                catch(Exception exception0) {
                    postWriteActivity1 = postWriteActivity8;
                    object2 = object1;
                    goto label_391;
                }
                try {
                label_253:
                    arrayList0.add(l0$f1.a, k00);
                    postWriteActivity9 = postWriteActivity8;
                    com.dcinside.app.write.d.f d$f0 = new com.dcinside.app.write.d.f(d10, l0$f1, null);
                    d$a1.k = d1;
                    d$a1.l = s1;
                    d$a1.m = postWriteActivity8;
                    d$a1.n = d10;
                    d$a1.o = l0$f1;
                    d$a1.p = iterator2;
                    d$a1.q = v7;
                    d$a1.r = v14;
                    d$a1.s = z3;
                    d$a1.t = z2;
                    d$a1.u = v5;
                    d$a1.v = v13;
                    postWriteActivity9 = postWriteActivity8;
                    d$a1.y = 5;
                    if(kotlinx.coroutines.i.h(h0.e(), d$f0, d$a1) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                    postWriteActivity1 = postWriteActivity9;
                    while(true) {
                        try {
                            object2 = object1;
                            goto label_391;
                        }
                        catch(Exception exception0) {
                        }
                        break;
                    }
                    postWriteActivity1 = postWriteActivity8;
                    object2 = object1;
                    goto label_391;
                }
                postWriteActivity6 = postWriteActivity9;
                z9 = z2;
                d4 = d1;
                v12 = v7;
                l0$f2 = l0$f1;
                v16 = v5;
                d14 = d10;
                z10 = z3;
                d$a0 = d$a1;
                try {
                label_289:
                    ++l0$f2.a;
                    d2 = d4;
                    z15 = z9;
                    object2 = object1;
                    d$a2 = d$a0;
                    v30 = v16;
                    d16 = d14;
                    postWriteActivity5 = postWriteActivity6;
                    goto label_346;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    goto label_392;
                }
                try {
                label_301:
                    postWriteActivity7 = postWriteActivity8;
                    arrayList0.add(k00);
                    g d$g0 = new g(d10, arrayList0, null);
                    d$a1.k = d1;
                    d$a1.l = s1;
                    d$a1.m = postWriteActivity7;
                    d$a1.n = d10;
                    d$a1.o = l0$f1;
                    d$a1.p = iterator2;
                    d$a1.q = v7;
                    d$a1.r = v14;
                    d$a1.s = z3;
                    d$a1.t = z2;
                    d$a1.u = v5;
                    v22 = 0;
                    d$a1.v = 0;
                    d$a1.y = 6;
                    object2 = object1;
                    if(kotlinx.coroutines.i.h(h0.e(), d$g0, d$a1) == object2) {
                        return object2;
                    }
                }
                catch(Exception exception0) {
                    postWriteActivity1 = postWriteActivity7;
                    goto label_391;
                }
                z11 = z2;
                d2 = d1;
                l0$f4 = l0$f1;
                v19 = v5;
                v20 = v14;
                d15 = d10;
                postWriteActivity4 = postWriteActivity7;
                iterator4 = iterator2;
                z10 = z3;
                d$a0 = d$a1;
                v23 = v7;
            label_336:
                v30 = v19;
                d16 = d15;
                z15 = z11;
                d$a2 = d$a0;
                iterator2 = iterator4;
                l0$f2 = l0$f4;
                v13 = v22;
                v12 = v23;
                postWriteActivity5 = postWriteActivity4;
                v14 = v20;
                try {
                label_346:
                    d$a2.k = d2;
                    d$a2.l = s1;
                    d$a2.m = postWriteActivity5;
                    d$a2.n = d16;
                    d$a2.o = l0$f2;
                    d$a2.p = iterator2;
                    d$a2.q = v12;
                    d$a2.r = v14;
                    d$a2.s = z10;
                    d$a2.t = z15;
                    d$a2.u = v30;
                    d$a2.v = v13;
                    d6 = d2;
                    d$a2.y = 7;
                    if(A1.a(d$a2) == object2) {
                        return object2;
                    }
                }
                catch(Exception exception0) {
                    d$a0 = d$a2;
                    postWriteActivity1 = postWriteActivity5;
                    goto label_392;
                }
                v28 = v13;
                v5 = v30;
                iterator6 = iterator2;
                postWriteActivity3 = postWriteActivity5;
                z2 = z15;
                z3 = z10;
                l0$f6 = l0$f2;
                d$a1 = d$a2;
                break;
            }
        }
        try {
            String s9 = postWriteActivity3.getString(0x7F1507FE, new Object[]{kotlin.coroutines.jvm.internal.b.g(v7)});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
            L.o(s9, "getString(...)");
            b d$b0 = new b(postWriteActivity3, s9, null);
            d$a1.k = postWriteActivity3;
            d$a1.l = null;
            d$a1.m = null;
            d$a1.n = null;
            d$a1.o = null;
            d$a1.p = null;
            d$a1.y = 1;
            return kotlinx.coroutines.i.h(h0.e(), d$b0, d$a1) == object1 ? object1 : S0.a;
        }
        catch(Exception exception0) {
        label_389:
            object2 = object1;
            postWriteActivity1 = postWriteActivity3;
        }
    label_391:
        d$a0 = d$a1;
    label_392:
        timber.log.b.a.y(exception0);
        h d$h0 = new h(postWriteActivity1, null);
        d$a0.k = null;
        d$a0.l = null;
        d$a0.m = null;
        d$a0.n = null;
        d$a0.o = null;
        d$a0.p = null;
        d$a0.y = 8;
        return kotlinx.coroutines.i.h(h0.e(), d$h0, d$a0) == object2 ? object2 : S0.a;
    label_406:
        i d$i0 = new i(d10, null);
        d$a1.k = null;
        d$a1.l = null;
        d$a1.m = null;
        d$a1.n = null;
        d$a1.o = null;
        d$a1.p = null;
        d$a1.y = 9;
        return kotlinx.coroutines.i.h(h0.e(), d$i0, d$a1) == object1 ? object1 : S0.a;
    }

    @m
    public final Object b(@l Context context0, @l String s, boolean z, @l String s1, long v, @m View view0, @l kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.write.ImageResizer", f = "ImageResizer.kt", i = {0, 0, 0, 0, 0, 0, 0, 5}, l = {0x7A, 0x80, 0x8E, 0x9C, 0xA8, 0xAE}, m = "addQuickImage", n = {"this", "ctx", "path", "nickname", "progressView", "resize", "imageMaxSize", "finalImagePath"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "J$0", "L$0"})
        static final class j extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            boolean p;
            long q;
            Object r;
            final d s;
            int t;

            j(d d0, kotlin.coroutines.d d1) {
                this.s = d0;
                super(d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.r = object0;
                this.t |= 0x80000000;
                return this.s.b(null, null, false, null, 0L, null, this);
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$2", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$2\n*L\n123#1:379,2\n*E\n"})
        static final class k extends o implements A3.o {
            int k;
            final View l;

            k(View view0, kotlin.coroutines.d d0) {
                this.l = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new k(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((k)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = this.l;
                if(view0 != null) {
                    view0.setVisibility(0);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$3", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$3\n*L\n130#1:379,2\n*E\n"})
        static final class com.dcinside.app.write.d.l extends o implements A3.o {
            int k;
            final Context l;
            final View m;

            com.dcinside.app.write.d.l(Context context0, View view0, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.d.l(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.d.l)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504E7);  // string:image_resize_fail "이미지 크기 조정에 실패했습니다."
                View view0 = this.m;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$4", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$4\n*L\n144#1:379,2\n*E\n"})
        static final class com.dcinside.app.write.d.m extends o implements A3.o {
            int k;
            final Context l;
            final View m;

            com.dcinside.app.write.d.m(Context context0, View view0, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.d.m(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.d.m)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504E7);  // string:image_resize_fail "이미지 크기 조정에 실패했습니다."
                View view0 = this.m;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$5", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$5\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$5\n*L\n158#1:379,2\n*E\n"})
        static final class n extends o implements A3.o {
            int k;
            final Context l;
            final View m;

            n(Context context0, View view0, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new n(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((n)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Dl.D(this.l, 0x7F1504F3);  // string:image_watermark_insert_fail "이미지 서명에 실패했습니다."
                View view0 = this.m;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$6", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$6\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$6\n*L\n169#1:379,2\n*E\n"})
        static final class com.dcinside.app.write.d.o extends o implements A3.o {
            int k;
            final View l;
            final Context m;
            final String n;

            com.dcinside.app.write.d.o(View view0, Context context0, String s, kotlin.coroutines.d d0) {
                this.l = view0;
                this.m = context0;
                this.n = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.d.o(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.write.d.o)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = this.l;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                Dl.G(this.m, this.n);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.ImageResizer$addQuickImage$7", f = "ImageResizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$7\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,378:1\n257#2,2:379\n*S KotlinDebug\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$addQuickImage$7\n*L\n175#1:379,2\n*E\n"})
        static final class p extends o implements A3.o {
            int k;
            final View l;

            p(View view0, kotlin.coroutines.d d0) {
                this.l = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new p(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((p)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = this.l;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                return S0.a;
            }
        }

        d d1;
        j d$j0;
        if(d0 instanceof j) {
            d$j0 = (j)d0;
            int v1 = d$j0.t;
            if((v1 & 0x80000000) == 0) {
                d$j0 = new j(this, d0);
            }
            else {
                d$j0.t = v1 ^ 0x80000000;
            }
        }
        else {
            d$j0 = new j(this, d0);
        }
        Object object0 = d$j0.r;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(d$j0.t) {
            case 0: {
                f0.n(object0);
                k d$k0 = new k(view0, null);
                d$j0.k = this;
                d$j0.l = context0;
                d$j0.m = s;
                d$j0.n = s1;
                d$j0.o = view0;
                d$j0.p = z;
                d$j0.q = v;
                d$j0.t = 1;
                if(kotlinx.coroutines.i.h(h0.e(), d$k0, d$j0) == object1) {
                    return object1;
                }
                d1 = this;
                break;
            }
            case 1: {
                v = d$j0.q;
                z = d$j0.p;
                view0 = (View)d$j0.o;
                s1 = (String)d$j0.n;
                s = (String)d$j0.m;
                context0 = (Context)d$j0.l;
                d1 = (d)d$j0.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return null;
            }
            case 3: {
                f0.n(object0);
                return null;
            }
            case 4: {
                f0.n(object0);
                return null;
            }
            case 5: {
                f0.n(object0);
                return null;
            }
            case 6: {
                String s2 = (String)d$j0.k;
                f0.n(object0);
                return s2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        File file0 = new File(s);
        if(!file0.canRead()) {
            com.dcinside.app.write.d.l d$l0 = new com.dcinside.app.write.d.l(context0, view0, null);
            d$j0.k = null;
            d$j0.l = null;
            d$j0.m = null;
            d$j0.n = null;
            d$j0.o = null;
            d$j0.t = 2;
            return kotlinx.coroutines.i.h(h0.e(), d$l0, d$j0) == object1 ? object1 : null;
        }
        if(z) {
            File file1 = d1.o(file0, 0);
            s = file1 == null ? null : file1.getPath();
        }
        if(s == null) {
            com.dcinside.app.write.d.m d$m0 = new com.dcinside.app.write.d.m(context0, view0, null);
            d$j0.k = null;
            d$j0.l = null;
            d$j0.m = null;
            d$j0.n = null;
            d$j0.o = null;
            d$j0.t = 3;
            return kotlinx.coroutines.i.h(h0.e(), d$m0, d$j0) == object1 ? object1 : null;
        }
        if(dl.a.B2() && s1.length() > 0) {
            s = M2.a.b(context0, s1, s);
        }
        if(s == null) {
            n d$n0 = new n(context0, view0, null);
            d$j0.k = null;
            d$j0.l = null;
            d$j0.m = null;
            d$j0.n = null;
            d$j0.o = null;
            d$j0.t = 4;
            return kotlinx.coroutines.i.h(h0.e(), d$n0, d$j0) == object1 ? object1 : null;
        }
        if(k0.r.q(s, v) == null) {
            String s3 = context0.getString(0x7F150800, new Object[]{Gk.b(v)});  // string:post_write_less_max_upload_bytes "%1$s 이하의 이미지만 첨부할 수 있습니다."
            L.o(s3, "getString(...)");
            com.dcinside.app.write.d.o d$o0 = new com.dcinside.app.write.d.o(view0, context0, s3, null);
            d$j0.k = null;
            d$j0.l = null;
            d$j0.m = null;
            d$j0.n = null;
            d$j0.o = null;
            d$j0.t = 5;
            return kotlinx.coroutines.i.h(h0.e(), d$o0, d$j0) == object1 ? object1 : null;
        }
        p d$p0 = new p(view0, null);
        d$j0.k = s;
        d$j0.l = null;
        d$j0.m = null;
        d$j0.n = null;
        d$j0.o = null;
        d$j0.t = 6;
        return kotlinx.coroutines.i.h(h0.e(), d$p0, d$j0) == object1 ? object1 : s;
    }

    @l
    public final String c(@l String s, @m File file0, int v, @l Bitmap.CompressFormat bitmap$CompressFormat0, @m Function1 function10) {
        L.p(s, "path");
        L.p(bitmap$CompressFormat0, "format");
        int v1 = ol.e.a(s);
        ol ol0 = null;
        ol ol1 = com.dcinside.app.util.ol.b.c(ol.e, s, false, 2, null);
        if(function10 != null) {
            ol ol2 = (ol)function10.invoke(this.p(ol1, v1));
            if(ol2 != null) {
                ol0 = this.p(ol2, v1);
            }
        }
        if(v1 != 0 || ol0 != null) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            if(ol0 != null) {
                int v2 = ol1.k(ol0.j(), ol0.g());
                if(v2 > 1) {
                    bitmapFactory$Options0.inSampleSize = v2 / 2;
                }
            }
            Bitmap bitmap0 = BitmapFactory.decodeFile(s, bitmapFactory$Options0);
            L.m(bitmap0);
            Bitmap bitmap1 = this.e(bitmap0, v1, ol0);
            if(!L.g(bitmap1, bitmap0)) {
                bitmap0.recycle();
            }
            if(file0 == null) {
                file0 = this.i();
            }
            File file1 = file0.getParentFile();
            if(file1 != null && !file1.exists()) {
                file1.mkdirs();
            }
            com.dcinside.app.internal.a.a(bitmap1, file0, bitmap$CompressFormat0, v);
            bitmap1.recycle();
            s = file0.getPath();
            L.m(s);
        }
        return s;
    }

    public static String d(d d0, String s, File file0, int v, Bitmap.CompressFormat bitmap$CompressFormat0, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            file0 = null;
        }
        if((v1 & 8) != 0) {
            bitmap$CompressFormat0 = Bitmap.CompressFormat.WEBP;
        }
        return d0.c(s, file0, ((v1 & 4) == 0 ? v : 0x60), bitmap$CompressFormat0, function10);
    }

    private final Bitmap e(Bitmap bitmap0, int v, ol ol0) {
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        Matrix matrix0 = new Matrix();
        if(ol0 != null) {
            matrix0.postScale(((float)ol0.a()) / ((float)v1), ((float)ol0.b()) / ((float)v2));
        }
        if(v % 360 != 0) {
            matrix0.postRotate(((float)(v % 360)), ((float)v1) / 2.0f, ((float)v2) / 2.0f);
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, v1, v2, matrix0, true);
        L.o(bitmap1, "createBitmap(...)");
        return bitmap1;
    }

    @l
    public final Bitmap f(@l Bitmap bitmap0, @m Function1 function10) {
        L.p(bitmap0, "bitmap");
        ol ol0 = function10 == null ? null : ((ol)function10.invoke(new ol(bitmap0.getWidth(), bitmap0.getHeight(), false, false, 8, null)));
        return ol0 == null ? bitmap0 : this.e(bitmap0, 0, ol0);
    }

    static Bitmap g(d d0, Bitmap bitmap0, int v, ol ol0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            ol0 = null;
        }
        return d0.e(bitmap0, v, ol0);
    }

    @l
    public final String h(@l Context context0) {
        L.p(context0, "context");
        switch(dl.a.a2()) {
            case 1: {
                L.o("480px", "getString(...)");
                return "480px";
            }
            case 2: {
                L.o("640px", "getString(...)");
                return "640px";
            }
            case 3: {
                L.o("850px", "getString(...)");
                return "850px";
            }
            case 4: {
                L.o("1024px", "getString(...)");
                return "1024px";
            }
            default: {
                L.o("원본", "getString(...)");
                return "원본";
            }
        }
    }

    private final File i() {
        return new File(new File(Application.e.c().getCacheDir(), "resizeImage"), "r_" + System.nanoTime());
    }

    private final int j() {
        switch(dl.a.a2()) {
            case 1: {
                return 480;
            }
            case 2: {
                return 640;
            }
            case 3: {
                return 850;
            }
            case 4: {
                return 0x400;
            }
            default: {
                return -1;
            }
        }
    }

    public final boolean k(@l String s) {
        L.p(s, "filePath");
        return v.M1(s, ".gif", true);
    }

    public final boolean l(@l String s) {
        L.p(s, "filePath");
        return v.M1(s, ".png", true);
    }

    public final boolean m(@l String s) {
        L.p(s, "filePath");
        return v.M1(s, ".webp", true);
    }

    private final File n(File file0, File file1, Function1 function10) {
        Bitmap bitmap1;
        Matrix matrix0;
        Lk lk0 = com.dcinside.app.util.Lk.a.h(Lk.g, file0, false, false, false, 14, null);
        Lk lk1 = (Lk)function10.invoke(lk0);
        if(lk1 == null) {
            return file0;
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        int v = lk0.y(lk1.n(), lk1.i());
        if(v > 1) {
            bitmapFactory$Options0.inSampleSize = v;
        }
        Bitmap bitmap0 = BitmapFactory.decodeFile(file0.getPath(), bitmapFactory$Options0);
        if(bitmap0 == null) {
            return file0;
        }
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        if(lk1.p(lk0)) {
            matrix0 = new Matrix();
            if(!lk1.o(lk0) || (lk0.l() - lk1.l()) % 180 == 0) {
                matrix0.postScale(((float)lk1.n()) / ((float)v1), ((float)lk1.i()) / ((float)v2));
            }
            else {
                matrix0.postScale(((float)lk1.i()) / ((float)v1), ((float)lk1.n()) / ((float)v2));
            }
        }
        else {
            matrix0 = null;
        }
        if(lk1.o(lk0)) {
            if(matrix0 == null) {
                matrix0 = new Matrix();
            }
            matrix0.postRotate(((float)(lk0.l() - lk1.l())), ((float)v1) / 2.0f, ((float)v2) / 2.0f);
        }
        if(matrix0 != null) {
            try {
                bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, v1, v2, matrix0, true);
            }
            catch(Throwable throwable0) {
                bitmap0.recycle();
                throw throwable0;
            }
            bitmap0.recycle();
            L.m(bitmap1);
            bitmap0 = bitmap1;
        }
        File file2 = file1.getParentFile();
        if(file2 != null && !file2.exists()) {
            file2.mkdirs();
        }
        com.dcinside.app.internal.a.a(bitmap0, file1, lk1.j(), lk1.k());
        bitmap0.recycle();
        return file1;
    }

    private final File o(File file0, int v) {
        @s0({"SMAP\nImageResizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResizer.kt\ncom/dcinside/app/write/ImageResizer$optimizeImage$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
        static final class q extends N implements Function1 {
            public final class com.dcinside.app.write.d.q.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[com.dcinside.app.util.Lk.b.values().length];
                    try {
                        arr_v[com.dcinside.app.util.Lk.b.c.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.dcinside.app.util.Lk.b.d.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.dcinside.app.util.Lk.b.b.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.dcinside.app.util.Lk.b.a.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.dcinside.app.util.Lk.b.e.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.write.d.q.a.a = arr_v;
                }
            }

            final int e;

            q(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Lk a(@l Lk lk0) {
                Lk lk1;
                L.p(lk0, "dim");
                switch(lk0.m()) {
                    case 1: 
                    case 2: {
                        return null;
                    }
                    case 3: {
                        lk1 = Lk.u(lk0, this.e, 0, 2, null).x();
                        if(lk1.o(lk0) || lk1.p(lk0)) {
                            lk1 = lk1.r(0x60, Bitmap.CompressFormat.JPEG);
                        }
                        return lk1.p(lk0) || lk1.o(lk0) || lk1.q() ? lk1 : null;
                    }
                    case 4: 
                    case 5: {
                        lk1 = Lk.u(lk0, this.e, 0, 2, null).x();
                        return !lk1.p(lk0) && !lk1.o(lk0) && !lk1.q() ? null : lk1;
                    }
                    default: {
                        throw new J();
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Lk)object0));
            }
        }

        int v1 = this.j();
        File file1 = new File(new File(Application.e.c().getCacheDir(), "resizeImage"), "resizeImage_" + v + kotlin.io.m.d0(file0) + ".jpg");
        try {
            return this.n(file0, file1, new q(v1));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    private final ol p(ol ol0, int v) {
        return v % 180 == 0 ? ol0 : new ol(ol0.g(), ol0.j(), ol0.i(), ol0.h());
    }
}

