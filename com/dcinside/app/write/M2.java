package com.dcinside.app.write;

import A3.p;
import Z.d;
import android.content.Context;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteLinkPreviewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteLinkPreviewHolder.kt\ncom/dcinside/app/write/PostWriteLinkPreviewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,190:1\n119#2,15:191\n257#2,2:206\n257#2,2:208\n257#2,2:210\n257#2,2:212\n*S KotlinDebug\n*F\n+ 1 PostWriteLinkPreviewHolder.kt\ncom/dcinside/app/write/PostWriteLinkPreviewHolder\n*L\n54#1:191,15\n127#1:206,2\n132#1:208,2\n137#1:210,2\n143#1:212,2\n*E\n"})
public final class m2 extends e implements d {
    @l
    private final ImageView a;
    @l
    private final TextView b;
    @l
    private final ImageView c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final TextView f;
    @l
    private final View g;
    @l
    private final View h;
    @l
    private final View i;
    @l
    private final View j;
    @l
    private final View k;
    @l
    private final View l;
    @l
    private final View m;
    @l
    private final TextView n;
    @m
    private o o;

    public m2(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$2", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            a(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
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
                this.l.E();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$3", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            b(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
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
                this.l.F();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$4", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            c(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
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
                this.l.A();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$5", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPostWriteLinkPreviewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteLinkPreviewHolder.kt\ncom/dcinside/app/write/PostWriteLinkPreviewHolder$5\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,190:1\n255#2:191\n*S KotlinDebug\n*F\n+ 1 PostWriteLinkPreviewHolder.kt\ncom/dcinside/app/write/PostWriteLinkPreviewHolder$5\n*L\n61#1:191\n*E\n"})
        static final class com.dcinside.app.write.m2.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            com.dcinside.app.write.m2.d(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.m2.d(this.l, d0).invokeSuspend(S0.a);
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
                if(this.l.h.getVisibility() == 0) {
                    this.l.z();
                    return S0.a;
                }
                this.l.D();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$6", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.m2.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            com.dcinside.app.write.m2.e(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.m2.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$7", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.m2.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            com.dcinside.app.write.m2.f(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.m2.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$8", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            g(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteLinkPreviewHolder$9", f = "PostWriteLinkPreviewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m2 l;

            h(m2 m20, kotlin.coroutines.d d0) {
                this.l = m20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.y(false);
                return S0.a;
            }
        }


        @s0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n+ 2 PostWriteLinkPreviewHolder.kt\ncom/dcinside/app/write/PostWriteLinkPreviewHolder\n*L\n1#1,129:1\n55#2,2:130\n*E\n"})
        public static final class com.dcinside.app.write.m2.m implements View.OnAttachStateChangeListener {
            final View a;
            final m2 b;

            public com.dcinside.app.write.m2.m(View view0, m2 m20) {
                this.a = view0;
                this.b = m20;
                super();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                this.a.removeOnAttachStateChangeListener(this);
                o o0 = this.b.o;
                if(o0 != null) {
                    o0.l();
                }
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02BB);  // layout:view_write_item_og_link
        View view0 = this.itemView.findViewById(0x7F0B0BA2);  // id:post_write_item_link_preview_delete
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0BA4);  // id:post_write_item_link_preview_edit
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = this.itemView.findViewById(0x7F0B0BA6);  // id:post_write_item_link_preview_image
        L.o(view2, "findViewById(...)");
        this.c = (ImageView)view2;
        View view3 = this.itemView.findViewById(0x7F0B0BAC);  // id:post_write_item_link_preview_title
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.itemView.findViewById(0x7F0B0BA1);  // id:post_write_item_link_preview_contents
        L.o(view4, "findViewById(...)");
        this.e = (TextView)view4;
        View view5 = this.itemView.findViewById(0x7F0B0BA3);  // id:post_write_item_link_preview_domain
        L.o(view5, "findViewById(...)");
        this.f = (TextView)view5;
        View view6 = this.itemView.findViewById(0x7F0B0BAD);  // id:post_write_item_link_preview_wrap
        L.o(view6, "findViewById(...)");
        this.g = view6;
        View view7 = this.itemView.findViewById(0x7F0B0BA5);  // id:post_write_item_link_preview_edit_wrap
        L.o(view7, "findViewById(...)");
        this.h = view7;
        View view8 = this.itemView.findViewById(0x7F0B0BAA);  // id:post_write_item_link_preview_text_icon
        L.o(view8, "findViewById(...)");
        this.i = view8;
        View view9 = this.itemView.findViewById(0x7F0B0BAB);  // id:post_write_item_link_preview_text_title
        L.o(view9, "findViewById(...)");
        this.j = view9;
        View view10 = this.itemView.findViewById(0x7F0B0BA7);  // id:post_write_item_link_preview_image_icon
        L.o(view10, "findViewById(...)");
        this.k = view10;
        View view11 = this.itemView.findViewById(0x7F0B0BA8);  // id:post_write_item_link_preview_image_title
        L.o(view11, "findViewById(...)");
        this.l = view11;
        View view12 = this.itemView.findViewById(0x7F0B0BA9);  // id:post_write_item_link_preview_loading
        L.o(view12, "findViewById(...)");
        this.m = view12;
        View view13 = this.itemView.findViewById(0x7F0B0BAE);  // id:post_write_item_loading_message
        L.o(view13, "findViewById(...)");
        this.n = (TextView)view13;
        View view14 = this.itemView;
        L.o(view14, "itemView");
        if(view14.isAttachedToWindow()) {
            view14.addOnAttachStateChangeListener(new com.dcinside.app.write.m2.m(view14, this));
        }
        else {
            o o0 = this.o;
            if(o0 != null) {
                o0.l();
            }
        }
        L.o(this.itemView, "itemView");
        a m2$a0 = new a(this, null);
        r.M(this.itemView, null, m2$a0, 1, null);
        L.o(this.itemView, "itemView");
        b m2$b0 = new b(this, null);
        r.S(this.itemView, null, false, m2$b0, 3, null);
        r.M(((ImageView)view0), null, new c(this, null), 1, null);
        r.M(((TextView)view1), null, new com.dcinside.app.write.m2.d(this, null), 1, null);
        r.M(view8, null, new com.dcinside.app.write.m2.e(this, null), 1, null);
        r.M(view9, null, new com.dcinside.app.write.m2.f(this, null), 1, null);
        r.M(view10, null, new g(this, null), 1, null);
        r.M(view11, null, new h(this, null), 1, null);
    }

    private final void A() {
        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A2);  // string:alert_delete "정말 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class k extends N implements Function1 {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
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


        static final class com.dcinside.app.write.m2.l extends N implements Function1 {
            final m2 e;

            com.dcinside.app.write.m2.l(m2 m20) {
                this.e = m20;
                super(1);
            }

            public final void a(Boolean boolean0) {
                i i0 = com.dcinside.app.internal.c.p(this.e);
                if(i0 == null) {
                    return;
                }
                ((d1)i0.h()).q(i0.i());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.internal.c.A(this);
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(j.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(k.e, "$tmp0");
            return (Boolean)k.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.m2.l(this), "$tmp0");
            new com.dcinside.app.write.m2.l(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean B(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void C(Function1 function10, Object object0) [...]

    private final void D() {
        this.b.setText("완료");
        this.h.setVisibility(0);
    }

    private final void E() {
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

    private final void F() {
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

    private final void G(com.dcinside.app.model.N n0) {
        com.dcinside.app.glide.a.l(this.c).t0(n0.k()).e2(0x7F08044F).q1(this.c);  // drawable:not_import_img
        this.d.setText(n0.m());
        this.e.setText(n0.i());
        this.f.setText(n0.j());
        this.g.setVisibility(0);
        this.m.setVisibility(8);
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

    public final void v(@l k0 k00) {
        static final class com.dcinside.app.write.m2.i extends N implements Function1 {
            final k0 e;
            final String f;
            final m2 g;

            com.dcinside.app.write.m2.i(k0 k00, String s, m2 m20) {
                this.e = k00;
                this.f = s;
                this.g = m20;
                super(1);
            }

            public final void a(com.dcinside.app.model.N n0) {
                if(L.g(n0.l(), Boolean.TRUE)) {
                    L.m(n0);
                    String s = com.dcinside.app.write.i.a.e(n0, this.f);
                    this.e.p6(s);
                    this.g.G(n0);
                    return;
                }
                this.g.n.setText("미리보기가 제공되지 않는 URL입니다.");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.N)object0));
                return S0.a;
            }
        }

        L.p(k00, "data");
        this.g.setVisibility(8);
        String s = k00.b6();
        if(s == null) {
            String s1 = k00.V5();
            if(s1 == null) {
                return;
            }
            this.m.setVisibility(0);
            o o0 = this.o;
            if(o0 != null) {
                o0.l();
            }
            this.o = com.dcinside.app.write.i.a.i(s1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                L.p(new com.dcinside.app.write.m2.i(k00, s1, this), "$tmp0");
                new com.dcinside.app.write.m2.i(k00, s1, this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                this.n.setText("미리보기를 불러올 수 없습니다.");
            });
            return;
        }
        com.dcinside.app.model.N n0 = com.dcinside.app.write.i.a.c(s);
        if(n0 == null) {
            return;
        }
        this.G(n0);
    }

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void x(m2 m20, Throwable throwable0) [...]

    private final void y(boolean z) {
        if(z) {
            this.c.setVisibility(8);
            this.i.setSelected(true);
            this.j.setSelected(true);
            this.k.setSelected(false);
            this.l.setSelected(false);
            return;
        }
        this.c.setVisibility(0);
        this.i.setSelected(false);
        this.j.setSelected(false);
        this.k.setSelected(true);
        this.l.setSelected(true);
    }

    private final void z() {
        this.b.setText("수정");
        this.h.setVisibility(8);
    }
}

