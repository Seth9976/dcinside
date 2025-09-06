package com.dcinside.app.write;

import Z.d;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.B;
import com.dcinside.app.glide.c;
import com.dcinside.app.image.j;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.ol;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Locale;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.v;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteImageHolder.kt\ncom/dcinside/app/write/PostWriteImageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
public final class h2 extends I1 implements d {
    private boolean a;
    @l
    private final ImageView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @l
    private final View e;
    private final int f;
    @m
    private o g;

    public h2(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02BA);  // layout:view_write_item_image
        View view0 = this.itemView.findViewById(0x7F0B0B9B);  // id:post_write_item_image
        L.o(view0, "findViewById(...)");
        this.b = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0B9E);  // id:post_write_item_image_info
        L.o(view1, "findViewById(...)");
        this.c = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B0B98);  // id:post_write_item_edit
        L.o(view2, "findViewById(...)");
        this.d = view2;
        View view3 = this.itemView.findViewById(0x7F0B0B96);  // id:post_write_item_delete
        L.o(view3, "findViewById(...)");
        this.e = view3;
        this.f = Dk.b(0x7F070411);  // dimen:write_image_min_size
        view2.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.d0();
        });
        view3.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.g0();
        });
        g2 g20 = (View view0) -> {
            L.p(this, "this$0");
            this.v();
        };
        this.itemView.setOnClickListener(g20);
        X1 x10 = (View view0) -> {
            L.p(this, "this$0");
            return this.w();
        };
        this.itemView.setOnLongClickListener(x10);
    }

    // 检测为 Lambda 实现
    private static final void I(h2 h20, View view0) [...]

    // 检测为 Lambda 实现
    private static final void J(h2 h20, View view0) [...]

    // 检测为 Lambda 实现
    private static final void K(h2 h20, View view0) [...]

    // 检测为 Lambda 实现
    private static final boolean L(h2 h20, View view0) [...]

    public final void O() {
        com.dcinside.app.image.o.a.a(this.b);
        o o0 = this.g;
        if(o0 != null) {
            o0.l();
        }
        this.g = null;
    }

    private final void P() {
        this.c.setText(0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
        viewGroup$LayoutParams0.width = -2;
        viewGroup$LayoutParams0.height = -2;
        this.b.setImageResource(0x7F08044F);  // drawable:not_import_img
    }

    private final void R(d1 d10, Uri uri0, String s, k0 k00) {
        static final class a extends N implements Function1 {
            final h2 e;
            final d1 f;
            final k0 g;

            a(h2 h20, d1 d10, k0 k00) {
                this.e = h20;
                this.f = d10;
                this.g = k00;
                super(1);
            }

            public final e a(File file0) {
                L.m(file0);
                return this.e.b0(this.f, this.g, file0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }


        static final class b extends N implements Function1 {
            final h2 e;
            final Uri f;
            final String g;

            b(h2 h20, Uri uri0, String s) {
                this.e = h20;
                this.f = uri0;
                this.g = s;
                super(1);
            }

            public final void a(e e0) {
                ol ol0 = e0.a();
                ol ol1 = e0.b();
                boolean z = e0.c();
                boolean z1 = e0.d();
                int v = ol0.a();
                int v1 = ol0.b();
                int v2 = ol1.a();
                int v3 = ol1.b();
                this.e.i0(v, v1, "0");
                c c0 = com.dcinside.app.glide.a.l(this.e.a0()).p0(this.f).I2(0x7F08044F).e2(0x7F08044F);  // drawable:not_import_img
                L.o(c0, "error(...)");
                if(z1) {
                    B b0 = new B();
                    c c1 = c0.E2(b0);
                    com.bumptech.glide.integration.webp.decoder.o o0 = new com.bumptech.glide.integration.webp.decoder.o(b0);
                    c1.F2(com.bumptech.glide.integration.webp.decoder.l.class, o0).H2(v2, v3).o2(new f(this.e, v, v1, this.g)).q1(this.e.a0());
                }
                else {
                    c0.k2().H2(v2, v3).o2(new f(this.e, v, v1, this.g)).q1(this.e.a0());
                }
                this.e.Y().setVisibility((z || z1 ? 8 : this.e.Y().getVisibility()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((e)object0));
                return S0.a;
            }
        }

        Context context0 = Dl.b(this.b);
        e e0 = k00 == null ? null : this.X(d10, k00);
        if(e0 == null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.b.getLayoutParams();
            viewGroup$LayoutParams1.width = -2;
            viewGroup$LayoutParams1.height = -2;
        }
        else {
            ol ol0 = e0.h();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
            viewGroup$LayoutParams0.width = ol0.j();
            viewGroup$LayoutParams0.height = ol0.g();
        }
        this.g = g.v1(new a2(uri0, context0)).g3((Object object0) -> {
            L.p(new a(this, d10, k00), "$tmp0");
            return (e)new a(this, d10, k00).invoke(object0);
        }).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new b(this, uri0, s), "$tmp0");
            new b(this, uri0, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            throwable0.printStackTrace();
            this.c.setText(0x7F1504CE);  // string:image_load_fail "이미지를 불러올 수 없습니다."
            this.b.setImageResource(0x7F08044F);  // drawable:not_import_img
        });
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.write.PostWriteActivity");
        ((PostWriteActivity)context0).P6().a(this.g);
        ((PostWriteActivity)context0).G6().add(this.g);
        this.a = k00 == null ? false : L.g(k00.W5(), Boolean.TRUE);
    }

    private static final g S(Uri uri0, Context context0) {
        L.p(uri0, "$source");
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
        if(s != null) {
            return g.Q2(new File(s));
        }
        L.m(context0);
        return j.a.g(context0, uri0);
    }

    // 检测为 Lambda 实现
    private static final e T(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V(h2 h20, Throwable throwable0) [...]

    public final void W(@l d1 d10, @l Uri uri0, @l String s, @m k0 k00) {
        L.p(d10, "adapter");
        L.p(uri0, "source");
        L.p(s, "size");
        this.O();
        if(uri0 == Uri.EMPTY) {
            this.P();
            return;
        }
        this.R(d10, uri0, s, k00);
    }

    private final e X(d1 d10, k0 k00) {
        return (e)d10.R().get(k00);
    }

    @l
    public final View Y() {
        return this.d;
    }

    @Override  // Z.d
    public void a() {
        this.itemView.setBackgroundColor(0xFFCCCCCC);
        this.itemView.setAlpha(0.7f);
    }

    @l
    public final ImageView a0() {
        return this.b;
    }

    private final e b0(d1 d10, k0 k00, File file0) {
        Throwable throwable1;
        byte[] arr_b;
        boolean z1;
        FileInputStream fileInputStream0;
        e e0 = k00 == null ? null : this.X(d10, k00);
        if(e0 != null) {
            return e0;
        }
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        ol ol0 = ol.e.b(s, true);
        int v = ol0.a();
        int v1 = ol0.b();
        int v2 = s.B(0, 3700);
        int v3 = s.B(0, 3700);
        ol ol1 = ol.e.d(v, v1, v2, v3);
        int v4 = s.u(this.f, ol1.a());
        int v5 = s.u(this.f, ol1.b());
        boolean z = false;
        try {
            fileInputStream0 = new FileInputStream(file0);
        }
        catch(Exception unused_ex) {
            z1 = false;
            goto label_35;
        }
        try {
            arr_b = new byte[0x40];
            fileInputStream0.read(arr_b);
            z1 = Gk.H(arr_b);
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            z1 = false;
            throw throwable1;
        }
        try {
            z = Gk.C(arr_b);
            goto label_34;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable3) {
            try {
                kotlin.io.c.a(fileInputStream0, throwable1);
                throw throwable3;
            label_34:
                kotlin.io.c.a(fileInputStream0, null);
            }
            catch(Exception unused_ex) {
            }
        }
    label_35:
        e e1 = new e(new ol(v, v1, false, false, 12, null), new ol(v4, v5, false, false, 12, null), z, z1);
        if(k00 != null) {
            d10.R().put(k00, e1);
        }
        return e1;
    }

    @Override  // Z.d
    public void c() {
        this.itemView.setBackgroundColor(0);
        this.itemView.setAlpha(1.0f);
    }

    @l
    public final TextView c0() {
        return this.c;
    }

    private final void d0() {
        if(this.a) {
            this.k0();
            return;
        }
        this.h0();
    }

    private final void g0() {
        if(this.a) {
            this.r();
            return;
        }
        this.n();
    }

    private final void h0() {
        if(this.getBindingAdapterPosition() < 0) {
            return;
        }
        RecyclerView recyclerView0 = this.e();
        if(recyclerView0 == null) {
            return;
        }
        Context context0 = Dl.b(recyclerView0);
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.write.PostWriteActivity");
        ((PostWriteActivity)context0).H7(this.getBindingAdapterPosition());
    }

    public final void i0(int v, int v1, @l String s) {
        L.p(s, "size");
        String s1 = String.format(Locale.ENGLISH, "%d x %d | %s", Arrays.copyOf(new Object[]{v, v1, s}, 3));
        L.o(s1, "format(...)");
        this.c.setText(s1);
    }

    private final void k0() {
        static final class com.dcinside.app.write.h2.c extends N implements Function1 {
            public static final com.dcinside.app.write.h2.c e;

            static {
                com.dcinside.app.write.h2.c.e = new com.dcinside.app.write.h2.c();
            }

            com.dcinside.app.write.h2.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1504D5);  // string:image_note_edit_desc "이미지 편집시 이미지 댓글이 삭제됩니다.\n댓글이 있는 이미지를 편집하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.h2.d extends N implements Function1 {
            public static final com.dcinside.app.write.h2.d e;

            static {
                com.dcinside.app.write.h2.d.e = new com.dcinside.app.write.h2.d();
            }

            com.dcinside.app.write.h2.d() {
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


        static final class com.dcinside.app.write.h2.e extends N implements Function1 {
            final h2 e;

            com.dcinside.app.write.h2.e(h2 h20) {
                this.e = h20;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.h0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.write.h2.c.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.write.h2.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.write.h2.d.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.h2.e(this), "$tmp0");
            new com.dcinside.app.write.h2.e(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(Dl.b(this.itemView), 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean l0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void n0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void o0(h2 h20, Throwable throwable0) [...]
}

