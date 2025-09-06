package com.dcinside.app.gallery.status;

import Y.u;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.target.p;
import com.dcinside.app.base.d;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.g0;
import com.dcinside.app.model.h0;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.hjq.toast.s;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryTransferActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTransferActivity.kt\ncom/dcinside/app/gallery/status/GalleryTransferActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,173:1\n257#2,2:174\n257#2,2:176\n257#2,2:178\n257#2,2:180\n257#2,2:182\n257#2,2:184\n257#2,2:186\n257#2,2:188\n257#2,2:190\n*S KotlinDebug\n*F\n+ 1 GalleryTransferActivity.kt\ncom/dcinside/app/gallery/status/GalleryTransferActivity\n*L\n56#1:174,2\n57#1:176,2\n58#1:178,2\n59#1:180,2\n60#1:182,2\n61#1:184,2\n62#1:186,2\n63#1:188,2\n64#1:190,2\n*E\n"})
public final class GalleryTransferActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l String s, @m ActivityResultLauncher activityResultLauncher0) {
            S0 s00;
            L.p(context0, "context");
            L.p(s, "transferNo");
            Intent intent0 = new Intent(context0, GalleryTransferActivity.class).putExtra("GalleryTransferActivity.EXTRA_TRANSFER_NO", s);
            L.o(intent0, "putExtra(...)");
            if(activityResultLauncher0 == null) {
                s00 = null;
            }
            else {
                activityResultLauncher0.b(intent0);
                s00 = S0.a;
            }
            if(s00 == null) {
                context0.startActivity(intent0);
            }
        }
    }

    private String u;
    private u v;
    @m
    private o w;
    @m
    private o x;
    @l
    public static final a y = null;
    @l
    private static final String z = "GalleryTransferActivity.EXTRA_TRANSFER_NO";

    static {
        GalleryTransferActivity.y = new a(null);
    }

    private final void N1(String s) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1503D8);  // string:gallery_transfer_cancel_alert "양도 요청을 취소하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            final GalleryTransferActivity e;
            final String f;

            c(GalleryTransferActivity galleryTransferActivity0, String s) {
                this.e = galleryTransferActivity0;
                this.f = s;
                super(1);
            }

            public final void c(Boolean boolean0) {
                static final class com.dcinside.app.gallery.status.GalleryTransferActivity.c.a extends N implements Function1 {
                    final GalleryTransferActivity e;

                    com.dcinside.app.gallery.status.GalleryTransferActivity.c.a(GalleryTransferActivity galleryTransferActivity0) {
                        this.e = galleryTransferActivity0;
                        super(1);
                    }

                    public final void a(f0 f00) {
                        this.e.setResult(1150);
                        this.e.finish();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((f0)object0));
                        return S0.a;
                    }
                }

                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    o o0 = uk.Uj(this.f).y5((Object object0) -> {
                        L.p(new com.dcinside.app.gallery.status.GalleryTransferActivity.c.a(this.e), "$tmp0");
                        new com.dcinside.app.gallery.status.GalleryTransferActivity.c.a(this.e).invoke(object0);
                    }, (Throwable throwable0) -> s.C(throwable0.getMessage()));
                    this.e.x = o0;
                }
            }

            // 检测为 Lambda 实现
            private static final void d(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void e(Throwable throwable0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(b.e).z(0x7F1500AA).x(0x1040000).b().y5((Object object0) -> {
            L.p(new c(this, s), "$tmp0");
            new c(this, s).invoke(object0);
        }, (Throwable throwable0) -> s.C(throwable0.getMessage()));
    }

    // 检测为 Lambda 实现
    private static final void O1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void P1(Throwable throwable0) [...]

    private final void Q1(String s) {
        Intent intent0 = new Intent(this, ImageViewerActivity.class);
        intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", "");
        intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", 0);
        intent0.putExtra("com.dcinside.app.extra.IMAGE_SELECTED", s);
        intent0.putExtra("com.dcinside.app.extra.SHOW_PATH_CHANGE", false);
        intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_IMAGE_MODE", com.dcinside.app.image.f0.b.ordinal());
        this.startActivity(intent0);
    }

    private final void R1() {
        @s0({"SMAP\nGalleryTransferActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTransferActivity.kt\ncom/dcinside/app/gallery/status/GalleryTransferActivity$refresh$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,173:1\n257#2,2:174\n257#2,2:176\n257#2,2:178\n257#2,2:180\n257#2,2:182\n257#2,2:184\n257#2,2:186\n257#2,2:188\n257#2,2:190\n*S KotlinDebug\n*F\n+ 1 GalleryTransferActivity.kt\ncom/dcinside/app/gallery/status/GalleryTransferActivity$refresh$1\n*L\n70#1:174,2\n71#1:176,2\n72#1:178,2\n73#1:180,2\n74#1:182,2\n76#1:184,2\n78#1:186,2\n80#1:188,2\n82#1:190,2\n*E\n"})
        static final class com.dcinside.app.gallery.status.GalleryTransferActivity.d extends N implements Function1 {
            final GalleryTransferActivity e;

            com.dcinside.app.gallery.status.GalleryTransferActivity.d(GalleryTransferActivity galleryTransferActivity0) {
                this.e = galleryTransferActivity0;
                super(1);
            }

            public final void a(h0 h00) {
                public static final class com.dcinside.app.gallery.status.GalleryTransferActivity.d.a implements h {
                    final GalleryTransferActivity a;

                    com.dcinside.app.gallery.status.GalleryTransferActivity.d.a(GalleryTransferActivity galleryTransferActivity0) {
                        this.a = galleryTransferActivity0;
                        super();
                    }

                    public boolean a(@l Drawable drawable0, @l Object object0, @m p p0, @l com.bumptech.glide.load.a a0, boolean z) {
                        L.p(drawable0, "resource");
                        L.p(object0, "model");
                        L.p(a0, "dataSource");
                        u u0 = this.a.v;
                        if(u0 == null) {
                            L.S("binding");
                            u0 = null;
                        }
                        int v = kotlin.ranges.s.u(Dk.d(drawable0.getIntrinsicWidth()), 0);
                        u0.g.setMinimumWidth(v);
                        return false;
                    }

                    @Override  // com.bumptech.glide.request.h
                    public boolean onLoadFailed(@m q q0, @m Object object0, @l p p0, boolean z) {
                        L.p(p0, "target");
                        return false;
                    }

                    @Override  // com.bumptech.glide.request.h
                    public boolean onResourceReady(Object object0, Object object1, p p0, com.bumptech.glide.load.a a0, boolean z) {
                        return this.a(((Drawable)object0), object1, p0, a0, z);
                    }
                }


                @f(c = "com.dcinside.app.gallery.status.GalleryTransferActivity$refresh$1$2", f = "GalleryTransferActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gallery.status.GalleryTransferActivity.d.b extends kotlin.coroutines.jvm.internal.o implements A3.p {
                    int k;
                    final g0 l;
                    final GalleryTransferActivity m;

                    com.dcinside.app.gallery.status.GalleryTransferActivity.d.b(g0 g00, GalleryTransferActivity galleryTransferActivity0, kotlin.coroutines.d d0) {
                        this.l = g00;
                        this.m = galleryTransferActivity0;
                        super(3, d0);
                    }

                    @m
                    public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gallery.status.GalleryTransferActivity.d.b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                        kotlin.f0.n(object0);
                        this.m.Q1("");
                        return S0.a;
                    }
                }

                if(h00.l() == null) {
                    return;
                }
                u u0 = this.e.v;
                if(u0 == null) {
                    L.S("binding");
                    u0 = null;
                }
                L.o(u0.f, "galleryTransferGalleryTitle");
                u0.f.setVisibility(0);
                u u1 = this.e.v;
                if(u1 == null) {
                    L.S("binding");
                    u1 = null;
                }
                L.o(u1.d, "galleryTransferDateTitle");
                u1.d.setVisibility(0);
                u u2 = this.e.v;
                if(u2 == null) {
                    L.S("binding");
                    u2 = null;
                }
                L.o(u2.j, "galleryTransferReasonTitle");
                u2.j.setVisibility(0);
                u u3 = this.e.v;
                if(u3 == null) {
                    L.S("binding");
                    u3 = null;
                }
                L.o(u3.h, "galleryTransferProgress");
                u3.h.setVisibility(8);
                u u4 = this.e.v;
                if(u4 == null) {
                    L.S("binding");
                    u4 = null;
                }
                L.o(u4.e, "galleryTransferGalleryContent");
                u4.e.setVisibility(0);
                u u5 = this.e.v;
                if(u5 == null) {
                    L.S("binding");
                    u5 = null;
                }
                u5.e.setText("");
                u u6 = this.e.v;
                if(u6 == null) {
                    L.S("binding");
                    u6 = null;
                }
                L.o(u6.c, "galleryTransferDateContent");
                u6.c.setVisibility(0);
                u u7 = this.e.v;
                if(u7 == null) {
                    L.S("binding");
                    u7 = null;
                }
                u7.c.setText("");
                u u8 = this.e.v;
                if(u8 == null) {
                    L.S("binding");
                    u8 = null;
                }
                L.o(u8.i, "galleryTransferReasonContent");
                u8.i.setVisibility(0);
                u u9 = this.e.v;
                if(u9 == null) {
                    L.S("binding");
                    u9 = null;
                }
                u9.i.setText("");
                u u10 = this.e.v;
                if(u10 == null) {
                    L.S("binding");
                    u10 = null;
                }
                L.o(u10.b, "galleryTransferCancel");
                u10.b.setVisibility(0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((h0)object0));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.status.GalleryTransferActivity$refresh$3", f = "GalleryTransferActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.status.GalleryTransferActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final GalleryTransferActivity l;

            com.dcinside.app.gallery.status.GalleryTransferActivity.e(GalleryTransferActivity galleryTransferActivity0, kotlin.coroutines.d d0) {
                this.l = galleryTransferActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.gallery.status.GalleryTransferActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                GalleryTransferActivity galleryTransferActivity0 = this.l;
                String s = galleryTransferActivity0.u;
                if(s == null) {
                    L.S("transferNo");
                    s = null;
                }
                galleryTransferActivity0.N1(s);
                return S0.a;
            }
        }

        u u0 = this.v;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        L.o(u0.f, "galleryTransferGalleryTitle");
        u0.f.setVisibility(8);
        u u1 = this.v;
        if(u1 == null) {
            L.S("binding");
            u1 = null;
        }
        L.o(u1.d, "galleryTransferDateTitle");
        u1.d.setVisibility(8);
        u u2 = this.v;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        L.o(u2.j, "galleryTransferReasonTitle");
        u2.j.setVisibility(8);
        u u3 = this.v;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        L.o(u3.e, "galleryTransferGalleryContent");
        u3.e.setVisibility(8);
        u u4 = this.v;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        L.o(u4.c, "galleryTransferDateContent");
        u4.c.setVisibility(8);
        u u5 = this.v;
        if(u5 == null) {
            L.S("binding");
            u5 = null;
        }
        L.o(u5.i, "galleryTransferReasonContent");
        u5.i.setVisibility(8);
        u u6 = this.v;
        if(u6 == null) {
            L.S("binding");
            u6 = null;
        }
        L.o(u6.h, "galleryTransferProgress");
        u6.h.setVisibility(0);
        u u7 = this.v;
        if(u7 == null) {
            L.S("binding");
            u7 = null;
        }
        L.o(u7.g, "galleryTransferImg");
        u7.g.setVisibility(8);
        u u8 = this.v;
        if(u8 == null) {
            L.S("binding");
            u8 = null;
        }
        L.o(u8.b, "galleryTransferCancel");
        u8.b.setVisibility(8);
        String s = this.u;
        if(s == null) {
            L.S("transferNo");
            s = null;
        }
        this.w = uk.Lk(s).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.gallery.status.GalleryTransferActivity.d(this), "$tmp0");
            new com.dcinside.app.gallery.status.GalleryTransferActivity.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.G(this, throwable0.getMessage());
            this.finish();
        });
        u u9 = this.v;
        if(u9 == null) {
            L.S("binding");
            u9 = null;
        }
        L.o(u9.b, "galleryTransferCancel");
        com.dcinside.app.gallery.status.GalleryTransferActivity.e galleryTransferActivity$e0 = new com.dcinside.app.gallery.status.GalleryTransferActivity.e(this, null);
        r.M(u9.b, null, galleryTransferActivity$e0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void S1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T1(GalleryTransferActivity galleryTransferActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        u u0 = u.c(this.getLayoutInflater());
        L.o(u0, "inflate(...)");
        this.v = u0;
        u u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        this.setContentView(u0.b());
        u u2 = this.v;
        if(u2 == null) {
            L.S("binding");
        }
        else {
            u1 = u2;
        }
        this.S0(u1.k);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("GalleryTransferActivity.EXTRA_TRANSFER_NO");
        if(s == null) {
            s = "";
        }
        this.u = s;
        if(s.length() == 0) {
            Dl.D(this, 0x7F150B28);  // string:unknown_gallery "갤러리 정보를 확인할 수 없습니다."
            this.finish();
            return;
        }
        this.R1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

