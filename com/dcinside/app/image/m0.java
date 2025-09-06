package com.dcinside.app.image;

import A3.p;
import android.content.Context;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import androidx.core.net.UriKt;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.load.resource.bitmap.B;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.ol;
import com.dcinside.app.util.zk;
import com.github.chrisbanes.photoview.PhotoView;
import java.io.File;
import java.io.FileInputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import y4.l;
import y4.m;
import z3.f;

public final class m0 extends ViewHolder {
    @l
    @f
    public SubsamplingScaleImageView a;
    @l
    @f
    public PhotoView b;
    @l
    @f
    public View c;
    @l
    @f
    public View d;
    @m
    @f
    public o e;

    public m0(@l View view0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerPageHolder$1", f = "ImageViewerPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m0 l;

            a(m0 m00, d d0) {
                this.l = m00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.image.ImageViewerPageHolder$2", f = "ImageViewerPageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m0 l;

            b(m0 m00, d d0) {
                this.l = m00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0608);  // id:image_paging_item_bigger
        L.o(view1, "findViewById(...)");
        this.a = (SubsamplingScaleImageView)view1;
        View view2 = view0.findViewById(0x7F0B060A);  // id:image_paging_item_normal
        L.o(view2, "findViewById(...)");
        this.b = (PhotoView)view2;
        View view3 = view0.findViewById(0x7F0B060B);  // id:image_paging_item_progress
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B0609);  // id:image_paging_item_msg
        L.o(view4, "findViewById(...)");
        this.d = view4;
        this.a.setMaxScale(6.0f);
        this.b.setMaximumScale(6.0f);
        this.a.setOrientation(-1);
        r.M(this.a, null, new a(this, null), 1, null);
        this.a.setMinimumScaleType(3);
        this.a.setMinimumDpi(40);
        r.M(this.b, null, new b(this, null), 1, null);
    }

    private final void l() {
        this.b.setVisibility(8);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(0);
    }

    private final void m() {
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.image.ImageViewerActivity");
        if(!((ImageViewerActivity)context0).isFinishing()) {
            ((ImageViewerActivity)context0).D3();
        }
    }

    public final void n(@m String s) {
        static final class c extends N implements Function1 {
            final m0 e;
            final String f;

            c(m0 m00, String s) {
                this.e = m00;
                this.f = s;
                super(1);
            }

            public final g a(Uri uri0) {
                if(L.g(uri0.getScheme(), "file")) {
                    L.m(uri0);
                    return g.Q2(UriKt.a(uri0));
                }
                Context context0 = this.e.itemView.getContext();
                L.o(context0, "getContext(...)");
                Uri uri1 = Uri.parse(this.f);
                L.o(uri1, "parse(...)");
                return j.a.g(context0, uri1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Uri)object0));
            }
        }


        static final class com.dcinside.app.image.m0.d extends N implements Function1 {
            public static final com.dcinside.app.image.m0.d e;

            static {
                com.dcinside.app.image.m0.d.e = new com.dcinside.app.image.m0.d();
            }

            com.dcinside.app.image.m0.d() {
                super(1);
            }

            public final com.dcinside.app.image.f a(@l File file0) {
                boolean z3;
                Throwable throwable1;
                boolean z2;
                byte[] arr_b;
                FileInputStream fileInputStream0;
                L.p(file0, "file");
                String s = file0.getAbsolutePath();
                L.o(s, "getAbsolutePath(...)");
                boolean z = false;
                ol ol0 = com.dcinside.app.util.ol.b.c(ol.e, s, false, 2, null);
                boolean z1 = ol0.a() > 4000 || ol0.b() > 4000;
                if(!z1) {
                    try {
                        fileInputStream0 = new FileInputStream(file0);
                    }
                    catch(Exception unused_ex) {
                        return new com.dcinside.app.image.f(file0, z1, z, false);
                    }
                    try {
                        arr_b = new byte[0x40];
                        fileInputStream0.read(arr_b);
                        z2 = Gk.C(arr_b);
                    }
                    catch(Throwable throwable0) {
                        throwable1 = throwable0;
                        throw throwable1;
                    }
                    try {
                        z3 = Gk.H(arr_b);
                        goto label_24;
                    }
                    catch(Throwable throwable2) {
                        throwable1 = throwable2;
                        z = z2;
                    }
                    try {
                        throw throwable1;
                    }
                    catch(Throwable throwable3) {
                        try {
                            kotlin.io.c.a(fileInputStream0, throwable1);
                            throw throwable3;
                        }
                        catch(Exception unused_ex) {
                            return new com.dcinside.app.image.f(file0, z1, z, false);
                        }
                    }
                    try {
                    label_24:
                        kotlin.io.c.a(fileInputStream0, null);
                    }
                    catch(Exception unused_ex) {
                    }
                    return new com.dcinside.app.image.f(file0, false, z2, z3);
                }
                return new com.dcinside.app.image.f(file0, z1, z, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }


        static final class e extends N implements Function1 {
            final m0 e;

            e(m0 m00) {
                this.e = m00;
                super(1);
            }

            public final t a(@l com.dcinside.app.image.f f0) {
                L.p(f0, "info");
                File file0 = f0.a();
                try {
                    if(!f0.b() && f0.c()) {
                        if(Build.VERSION.SDK_INT >= 28) {
                            ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(file0);
                            L.o(imageDecoder$Source0, "createSource(...)");
                            Drawable drawable0 = ImageDecoder.decodeDrawable(imageDecoder$Source0);
                            AnimatedImageDrawable animatedImageDrawable0 = com.bumptech.glide.load.resource.drawable.a.a(drawable0) ? ((AnimatedImageDrawable)drawable0) : null;
                            return animatedImageDrawable0 == null ? new com.dcinside.app.image.a(this.e.a, file0) : new com.dcinside.app.image.b(this.e.b, animatedImageDrawable0);
                        }
                        com.bumptech.glide.load.resource.gif.c c0 = (com.bumptech.glide.load.resource.gif.c)com.dcinside.app.glide.a.l(this.e.b).j0().s2(file0).Q1(com.dcinside.app.image.o.b.b).H1().get();
                        return new com.dcinside.app.image.c(this.e.b, c0);
                    }
                    if(!f0.b() && f0.d()) {
                        B b0 = new B();
                        com.dcinside.app.glide.c c1 = com.dcinside.app.glide.a.l(this.e.b).q0(file0).E2(b0);
                        com.bumptech.glide.integration.webp.decoder.o o0 = new com.bumptech.glide.integration.webp.decoder.o(b0);
                        Object object0 = c1.F2(com.bumptech.glide.integration.webp.decoder.l.class, o0).Q1(com.dcinside.app.image.o.b.c).H1().get();
                        L.n(object0, "null cannot be cast to non-null type com.bumptech.glide.integration.webp.decoder.WebpDrawable");
                        return new v0(this.e.b, ((com.bumptech.glide.integration.webp.decoder.l)object0));
                    }
                }
                catch(Exception unused_ex) {
                }
                return new com.dcinside.app.image.a(this.e.a, file0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.image.f)object0));
            }
        }


        static final class com.dcinside.app.image.m0.f extends N implements Function1 {
            final m0 e;

            com.dcinside.app.image.m0.f(m0 m00) {
                this.e = m00;
                super(1);
            }

            public final void a(@l t t0) {
                L.p(t0, "printer");
                if(t0 instanceof com.dcinside.app.image.a) {
                    this.e.a.setVisibility(0);
                    this.e.b.setVisibility(8);
                }
                else {
                    this.e.a.setVisibility(8);
                    this.e.b.setVisibility(0);
                }
                this.e.c.setVisibility(8);
                this.e.d.setVisibility(8);
                t0.a();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((t)object0));
                return S0.a;
            }
        }

        if(s == null) {
            return;
        }
        this.b.setVisibility(8);
        this.b.setImageDrawable(null);
        this.a.setVisibility(8);
        this.a.recycle();
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        o o0 = this.e;
        if(o0 != null) {
            o0.l();
        }
        this.e = g.Q2(Uri.parse(s)).A5(rx.schedulers.c.e()).f2((Object object0) -> {
            L.p(new c(this, s), "$tmp0");
            return (g)new c(this, s).invoke(object0);
        }).g3((Object object0) -> {
            L.p(com.dcinside.app.image.m0.d.e, "$tmp0");
            return (com.dcinside.app.image.f)com.dcinside.app.image.m0.d.e.invoke(object0);
        }).g3((Object object0) -> {
            L.p(new e(this), "$tmp0");
            return (t)new e(this).invoke(object0);
        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.image.m0.f(this), "$tmp0");
            new com.dcinside.app.image.m0.f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            this.l();
        });
        try {
            Context context0 = Dl.b(this.itemView);
            if(context0 instanceof ImageViewerActivity) {
                rx.subscriptions.b b0 = ((ImageViewerActivity)context0).S2();
                if(b0 != null) {
                    b0.a(this.e);
                }
            }
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
            zk.a(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final g o(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.image.f p(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final t q(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s(m0 m00, Throwable throwable0) [...]
}

