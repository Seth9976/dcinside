package com.dcinside.app.write;

import A3.p;
import A3.q;
import Z.d;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.load.resource.bitmap.B;
import com.dcinside.app.base.e;
import com.dcinside.app.image.j;
import com.dcinside.app.internal.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import com.dcinside.app.util.ol;
import java.io.File;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteAiImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteAiImageHolder.kt\ncom/dcinside/app/write/PostWriteAiImageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
public final class r1 extends e implements d {
    @l
    private final View a;
    @l
    private final View b;
    @l
    private final View c;
    @l
    private final ImageView d;
    @l
    private final View e;
    @l
    private final View f;
    @l
    private final CheckBox g;
    @l
    private final View h;
    @l
    private final ImageView i;
    @m
    private o j;
    private final int k;

    public r1(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.write.PostWriteAiImageHolder$1", f = "PostWriteAiImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            a(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.O();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiImageHolder$2", f = "PostWriteAiImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            b(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.P();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiImageHolder$3", f = "PostWriteAiImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            c(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.L();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiImageHolder$4", f = "PostWriteAiImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.r1.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final r1 l;

            com.dcinside.app.write.r1.d(r1 r10, kotlin.coroutines.d d0) {
                this.l = r10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.r1.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.L();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiImageHolder$5", f = "PostWriteAiImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.r1.e extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            boolean l;
            final r1 m;

            com.dcinside.app.write.r1.e(r1 r10, kotlin.coroutines.d d0) {
                this.m = r10;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.r1.e r1$e0 = new com.dcinside.app.write.r1.e(this.m, d0);
                r1$e0.l = z;
                return r1$e0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.I(this.l);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02B7);  // layout:view_write_item_ai_image
        View view0 = this.itemView.findViewById(0x7F0B0B85);  // id:post_write_item_ai_resample_text
        L.o(view0, "findViewById(...)");
        this.a = view0;
        View view1 = this.itemView.findViewById(0x7F0B0B86);  // id:post_write_item_ai_resample_wrap
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0B7D);  // id:post_write_item_ai_image_wrap
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.itemView.findViewById(0x7F0B0B84);  // id:post_write_item_ai_resample_image
        L.o(view3, "findViewById(...)");
        this.d = (ImageView)view3;
        View view4 = this.itemView.findViewById(0x7F0B0B7B);  // id:post_write_item_ai_image_delete
        L.o(view4, "findViewById(...)");
        this.e = view4;
        View view5 = this.itemView.findViewById(0x7F0B0B81);  // id:post_write_item_ai_resample_delete
        L.o(view5, "findViewById(...)");
        this.f = view5;
        View view6 = this.itemView.findViewById(0x7F0B0B7C);  // id:post_write_item_ai_image_hide_prompt
        L.o(view6, "findViewById(...)");
        this.g = (CheckBox)view6;
        View view7 = this.itemView.findViewById(0x7F0B0B87);  // id:post_write_item_ai_text
        L.o(view7, "findViewById(...)");
        this.h = view7;
        View view8 = this.itemView.findViewById(0x7F0B0B7A);  // id:post_write_item_ai_image
        L.o(view8, "findViewById(...)");
        this.i = (ImageView)view8;
        this.k = Dk.b(0x7F07040D);  // dimen:write_ai_image_min_size
        L.o(this.itemView, "itemView");
        a r1$a0 = new a(this, null);
        r.M(this.itemView, null, r1$a0, 1, null);
        L.o(this.itemView, "itemView");
        b r1$b0 = new b(this, null);
        r.S(this.itemView, null, false, r1$b0, 3, null);
        r.M(view4, null, new c(this, null), 1, null);
        r.M(view5, null, new com.dcinside.app.write.r1.d(this, null), 1, null);
        r.J(((CheckBox)view6), null, new com.dcinside.app.write.r1.e(this, null), 1, null);
    }

    @l
    public final ImageView A() {
        return this.i;
    }

    private final V B(d1 d10, k0 k00, File file0, boolean z, Uri uri0) {
        float f2;
        com.dcinside.app.write.e e0 = k00 == null ? null : this.y(d10, k00, z);
        if(e0 != null) {
            return r0.a(e0, uri0);
        }
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        ol ol0 = ol.e.b(s, true);
        V v0 = r0.a(Dk.d(ol0.j()), Dk.d(ol0.g()));
        int v1 = ((Number)v0.a()).intValue();
        int v2 = ((Number)v0.b()).intValue();
        float f = s.A(0.0f, 3700.0f);
        float f1 = 0.5f;
        if(((float)v2) > 0.5f) {
            f2 = 0.5f / Math.max(v2, 1.0f);
        }
        else {
            f1 = (float)v2;
            f2 = 1.0f;
        }
        float f3 = Math.max(((float)v1) * f2, 1.0f);
        if(f3 > f) {
            f1 *= f / f3;
        }
        else {
            f = f3;
        }
        com.dcinside.app.write.e e1 = new com.dcinside.app.write.e(new ol(v1, v2, false, false, 12, null), new ol(((int)f), ((int)f1), false, false, 12, null), false, false);
        if(k00 != null) {
            if(z) {
                d10.Q().put(k00, e1);
                return r0.a(e1, uri0);
            }
            d10.R().put(k00, e1);
        }
        return r0.a(e1, uri0);
    }

    @l
    public final View C() {
        return this.h;
    }

    @l
    public final View D() {
        return this.c;
    }

    @l
    public final View E() {
        return this.f;
    }

    @l
    public final ImageView F() {
        return this.d;
    }

    @l
    public final View G() {
        return this.a;
    }

    @l
    public final View H() {
        return this.b;
    }

    private final void I(boolean z) {
        i i0 = com.dcinside.app.internal.c.p(this);
        if(i0 == null) {
            return;
        }
        ((d1)i0.h()).X(this.getBindingAdapterPosition(), z);
    }

    private final g J(Context context0, d1 d10, k0 k00, Uri uri0, boolean z) {
        static final class h extends N implements Function1 {
            final r1 e;
            final d1 f;
            final k0 g;
            final boolean h;
            final Uri i;

            h(r1 r10, d1 d10, k0 k00, boolean z, Uri uri0) {
                this.e = r10;
                this.f = d10;
                this.g = k00;
                this.h = z;
                this.i = uri0;
                super(1);
            }

            public final V a(File file0) {
                L.m(file0);
                return this.e.B(this.f, this.g, file0, this.h, this.i);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }

        String s = uri0.getPath();
        if(s == null) {
            s = null;
        }
        else {
            String s1 = uri0.getScheme();
            if(s1 == null) {
                s = null;
            }
            else {
                L.m(s1);
                if(!v.v2(s1, "file", false, 2, null)) {
                    s = null;
                }
            }
        }
        g g0 = (s == null ? j.a.g(context0, uri0) : g.Q2(new File(s))).g3((Object object0) -> {
            L.p(new h(this, d10, k00, z, uri0), "$tmp0");
            return (V)new h(this, d10, k00, z, uri0).invoke(object0);
        });
        L.o(g0, "map(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final V K(Function1 function10, Object object0) [...]

    private final void L() {
        static final class com.dcinside.app.write.r1.i extends N implements Function1 {
            final k0 e;

            com.dcinside.app.write.r1.i(k0 k00) {
                this.e = k00;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                String s = this.e.Q5();
                return s == null || s.length() <= 0 ? p$a0.m(0x7F1500A2) : p$a0.m(0x7F1505B0);  // string:alert_delete "정말 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.r1.j extends N implements Function1 {
            public static final com.dcinside.app.write.r1.j e;

            static {
                com.dcinside.app.write.r1.j.e = new com.dcinside.app.write.r1.j();
            }

            com.dcinside.app.write.r1.j() {
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


        static final class k extends N implements Function1 {
            final d1 e;
            final int f;

            k(d1 d10, int v) {
                this.e = d10;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.q(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.internal.c.A(this);
        i i0 = com.dcinside.app.internal.c.p(this);
        if(i0 != null) {
            d1 d10 = (d1)i0.h();
            if(d10 != null) {
                int v = this.getBindingAdapterPosition();
                Object object0 = d10.S().get(v);
                L.o(object0, "get(...)");
                Context context0 = Dl.b(this.itemView);
                L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(new com.dcinside.app.write.r1.i(((k0)object0))).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.write.r1.j.e, "$tmp0");
                    return (Boolean)com.dcinside.app.write.r1.j.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new k(d10, v), "$tmp0");
                    new k(d10, v).invoke(object0);
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean M(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void N(Function1 function10, Object object0) [...]

    private final void O() {
        i i0 = com.dcinside.app.internal.c.q(this);
        if(i0 == null) {
            return;
        }
        com.dcinside.app.internal.c.A(this);
        d1 d10 = (d1)i0.h();
        Nk.a.a(i0.g());
        ((PostWriteActivity)i0.g()).m9();
        int v = i0.i();
        if(v + 1 == d10.S().size()) {
            d10.z(v + 1);
            return;
        }
        k0 k00 = (k0)d10.S().get(v + 1);
        if(k0.r.J(k00)) {
            d10.G(v + 1);
            return;
        }
        d10.z(v + 1);
    }

    private final void P() {
        i i0 = com.dcinside.app.internal.c.q(this);
        if(i0 == null) {
            return;
        }
        com.dcinside.app.internal.c.A(this);
        Nk.a.a(i0.g());
        Wk wk0 = (Wk)((d1)i0.h()).J().a();
        if(wk0 != null) {
            wk0.u(this);
        }
    }

    @Override  // Z.d
    public void a() {
        this.itemView.setBackgroundColor(0xFFCCCCCC);
        this.itemView.setAlpha(0.7f);
    }

    @Override  // Z.d
    public void c() {
        this.itemView.setBackgroundColor(0);
        this.itemView.setAlpha(1.0f);
    }

    public final void s() {
        com.dcinside.app.image.o.a.a(this.i);
        com.dcinside.app.image.o.a.a(this.d);
        o o0 = this.j;
        if(o0 != null) {
            o0.l();
        }
        this.j = null;
    }

    private final void t(d1 d10, List list0, k0 k00) {
        static final class com.dcinside.app.write.r1.f extends N implements A3.o {
            public static final com.dcinside.app.write.r1.f e;

            static {
                com.dcinside.app.write.r1.f.e = new com.dcinside.app.write.r1.f();
            }

            com.dcinside.app.write.r1.f() {
                super(2);
            }

            public final V[] a(V v0, V v1) {
                return new V[]{v0, v1};
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((V)object0), ((V)object1));
            }
        }


        @s0({"SMAP\nPostWriteAiImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteAiImageHolder.kt\ncom/dcinside/app/write/PostWriteAiImageHolder$display$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,291:1\n13411#2,3:292\n*S KotlinDebug\n*F\n+ 1 PostWriteAiImageHolder.kt\ncom/dcinside/app/write/PostWriteAiImageHolder$display$6\n*L\n190#1:292,3\n*E\n"})
        static final class com.dcinside.app.write.r1.g extends N implements Function1 {
            final r1 e;

            com.dcinside.app.write.r1.g(r1 r10) {
                this.e = r10;
                super(1);
            }

            public final void a(V[] arr_v) {
                L.m(arr_v);
                r1 r10 = this.e;
                int v = 0;
                for(int v1 = 0; v < arr_v.length; ++v1) {
                    V v2 = arr_v[v];
                    com.dcinside.app.write.e e0 = (com.dcinside.app.write.e)v2.e();
                    if(e0 != null) {
                        ol ol0 = e0.b();
                        boolean z = e0.d();
                        Uri uri0 = (Uri)v2.f();
                        if(uri0 != Uri.EMPTY) {
                            ImageView imageView0 = v1 == 0 ? r10.A() : r10.F();
                            int v3 = ol0.a();
                            int v4 = ol0.b();
                            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).p0(uri0).I2(0x7F08044F).e2(0x7F08044F);  // drawable:not_import_img
                            L.o(c0, "error(...)");
                            if(z) {
                                B b0 = new B();
                                com.dcinside.app.glide.c c1 = c0.E2(b0);
                                com.bumptech.glide.integration.webp.decoder.o o0 = new com.bumptech.glide.integration.webp.decoder.o(b0);
                                c1.F2(com.bumptech.glide.integration.webp.decoder.l.class, o0).H2(v3, v4).q1(imageView0);
                            }
                            else {
                                c0.k2().H2(v3, v4).q1(imageView0);
                            }
                        }
                    }
                    ++v;
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V[])object0));
                return S0.a;
            }
        }

        g g1;
        g g0;
        Context context0 = Dl.b(this.i);
        com.dcinside.app.write.e e0 = null;
        com.dcinside.app.write.e e1 = k00 == null ? null : this.y(d10, k00, false);
        if(e1 == null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.i.getLayoutParams();
            viewGroup$LayoutParams1.width = -2;
            viewGroup$LayoutParams1.height = -2;
        }
        else {
            ol ol0 = e1.h();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
            viewGroup$LayoutParams0.width = ol0.j();
            viewGroup$LayoutParams0.height = ol0.g();
        }
        if(list0.size() > 1) {
            if(k00 != null) {
                e0 = this.y(d10, k00, true);
            }
            if(e0 == null) {
                ViewGroup.LayoutParams viewGroup$LayoutParams3 = this.d.getLayoutParams();
                viewGroup$LayoutParams3.width = -2;
                viewGroup$LayoutParams3.height = -2;
            }
            else {
                ol ol1 = e0.h();
                ViewGroup.LayoutParams viewGroup$LayoutParams2 = this.d.getLayoutParams();
                viewGroup$LayoutParams2.width = ol1.j();
                viewGroup$LayoutParams2.height = ol1.g();
            }
            L.m(context0);
            g0 = this.J(context0, d10, k00, ((Uri)list0.get(0)), false);
            g1 = this.J(context0, d10, k00, ((Uri)list0.get(1)), true);
        }
        else {
            L.m(context0);
            g0 = this.J(context0, d10, k00, ((Uri)list0.get(0)), false);
            g1 = g.Q2(r0.a(null, Uri.EMPTY));
        }
        this.j = g.u0(g0, g1, (Object object0, Object object1) -> {
            L.p(com.dcinside.app.write.r1.f.e, "$tmp0");
            return (V[])com.dcinside.app.write.r1.f.e.invoke(object0, object1);
        }).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.r1.g(this), "$tmp0");
            new com.dcinside.app.write.r1.g(this).invoke(object0);
        }, (Throwable throwable0) -> throwable0.printStackTrace());
        ((PostWriteActivity)context0).P6().a(this.j);
        ((PostWriteActivity)context0).G6().add(this.j);
    }

    // 检测为 Lambda 实现
    private static final void u(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final V[] v(A3.o o0, Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    public final void x(@l d1 d10, @l List list0, @m k0 k00) {
        L.p(d10, "adapter");
        L.p(list0, "sources");
        if(list0.isEmpty()) {
            return;
        }
        this.s();
        this.t(d10, list0, k00);
    }

    // 去混淆评级： 低(20)
    private final com.dcinside.app.write.e y(d1 d10, k0 k00, boolean z) {
        return z ? ((com.dcinside.app.write.e)d10.Q().get(k00)) : ((com.dcinside.app.write.e)d10.R().get(k00));
    }

    @l
    public final CheckBox z() {
        return this.g;
    }
}

