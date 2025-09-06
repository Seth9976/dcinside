package com.dcinside.app.read.holder;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import com.dcinside.app.read.x;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.ResizeTextView;
import com.facebook.drawee.controller.c;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.m;

@s0({"SMAP\nReplyImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyImageHolder.kt\ncom/dcinside/app/read/holder/ReplyImageHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,221:1\n297#2:222\n*S KotlinDebug\n*F\n+ 1 ReplyImageHolder.kt\ncom/dcinside/app/read/holder/ReplyImageHolder\n*L\n118#1:222\n*E\n"})
public final class h extends l {
    @s0({"SMAP\nReplyImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyImageHolder.kt\ncom/dcinside/app/read/holder/ReplyImageHolder$ReplyControllerListener\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,221:1\n147#2:222\n*S KotlinDebug\n*F\n+ 1 ReplyImageHolder.kt\ncom/dcinside/app/read/holder/ReplyImageHolder$ReplyControllerListener\n*L\n205#1:222\n*E\n"})
    static final class com.dcinside.app.read.holder.h.h extends c {
        private final boolean b;
        @y4.l
        private final t c;

        public com.dcinside.app.read.holder.h.h(@y4.l h h0, boolean z) {
            L.p(h0, "holder");
            super();
            this.b = z;
            this.c = new t(h0);
        }

        @Override  // com.facebook.drawee.controller.c
        public void d(@m String s, @m Throwable throwable0) {
            super.d(s, throwable0);
            h h0 = (h)this.c.a();
            if(h0 == null) {
                return;
            }
            if(this.b) {
                h0.V().setVisibility(0);
                h0.U().setVisibility(4);
                return;
            }
            h0.X().setVisibility(0);
            h0.W().setVisibility(4);
        }
    }

    @y4.l
    private final SimpleDraweeView n;
    @y4.l
    private final SimpleDraweeView o;
    @y4.l
    private final View p;
    @y4.l
    private final ImageView q;
    @y4.l
    private final ImageView r;
    @y4.l
    private final TextView s;
    @y4.l
    private final View t;
    @y4.l
    private final TextView u;
    @y4.l
    private final View v;
    @y4.l
    private final TextView w;
    @y4.l
    private final TextView x;
    @y4.l
    private final ResizeTextView y;

    public h(@y4.l View view0) {
        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$1", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final h l;

            a(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.a0(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$2", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final h l;

            b(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.a0(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$3", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyImageHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyImageHolder.kt\ncom/dcinside/app/read/holder/ReplyImageHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
        static final class com.dcinside.app.read.holder.h.c extends o implements p {
            int k;
            Object l;
            final h m;

            com.dcinside.app.read.holder.h.c(h h0, d d0) {
                this.m = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                com.dcinside.app.read.holder.h.c h$c0 = new com.dcinside.app.read.holder.h.c(this.m, d0);
                h$c0.l = view0;
                return h$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.Y();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$4", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.h.d extends o implements p {
            int k;
            final h l;

            com.dcinside.app.read.holder.h.d(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new com.dcinside.app.read.holder.h.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.c0(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$5", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final h l;

            e(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.c0(false);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$6", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.h.f extends o implements p {
            int k;
            final h l;

            com.dcinside.app.read.holder.h.f(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new com.dcinside.app.read.holder.h.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyImageHolder$7", f = "ReplyImageHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements p {
            int k;
            final h l;

            g(h h0, d d0) {
                this.l = h0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.N();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0D2F);  // id:reply_left_image
        L.o(view1, "findViewById(...)");
        this.n = (SimpleDraweeView)view1;
        View view2 = view0.findViewById(0x7F0B0D6A);  // id:reply_right_image
        L.o(view2, "findViewById(...)");
        this.o = (SimpleDraweeView)view2;
        View view3 = view0.findViewById(0x7F0B0D22);  // id:reply_dccon_buy
        L.o(view3, "findViewById(...)");
        this.p = view3;
        View view4 = view0.findViewById(0x7F0B0D20);  // id:reply_dccon_block_left_icon
        L.o(view4, "findViewById(...)");
        this.q = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B0D21);  // id:reply_dccon_block_right_icon
        L.o(view5, "findViewById(...)");
        this.r = (ImageView)view5;
        View view6 = view0.findViewById(0x7F0B0D1F);  // id:reply_dccon_block
        L.o(view6, "findViewById(...)");
        this.s = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0D24);  // id:reply_dccon_icon_block
        L.o(view7, "findViewById(...)");
        this.t = view7;
        View view8 = view0.findViewById(0x7F0B0D23);  // id:reply_dccon_down
        L.o(view8, "findViewById(...)");
        this.u = (TextView)view8;
        View view9 = view0.findViewById(0x7F0B0D25);  // id:reply_dccon_icon_down
        L.o(view9, "findViewById(...)");
        this.v = view9;
        View view10 = view0.findViewById(0x7F0B0D26);  // id:reply_dccon_left_image_alt
        L.o(view10, "findViewById(...)");
        this.w = (TextView)view10;
        View view11 = view0.findViewById(0x7F0B0D27);  // id:reply_dccon_right_image_alt
        L.o(view11, "findViewById(...)");
        this.x = (TextView)view11;
        View view12 = view0.findViewById(0x7F0B0D32);  // id:reply_mention
        L.o(view12, "findViewById(...)");
        this.y = (ResizeTextView)view12;
        r.M(((SimpleDraweeView)view1), null, new a(this, null), 1, null);
        r.M(((SimpleDraweeView)view2), null, new b(this, null), 1, null);
        r.M(view3, null, new com.dcinside.app.read.holder.h.c(this, null), 1, null);
        r.M(((ImageView)view4), null, new com.dcinside.app.read.holder.h.d(this, null), 1, null);
        r.M(((ImageView)view5), null, new e(this, null), 1, null);
        r.M(((TextView)view6), null, new com.dcinside.app.read.holder.h.f(this, null), 1, null);
        int v = dl.a.q2().m() ? 0x7F080246 : 0x7F080247;  // drawable:ic_dccon_block_dark
        ((ImageView)view4).setImageResource(v);
        ((ImageView)view5).setImageResource(v);
        r.M(((TextView)view8), null, new g(this, null), 1, null);
    }

    public final void J(@y4.l com.dcinside.app.dccon.a a0, boolean z) {
        L.p(a0, "dcconPack");
        this.K(a0.g());
        this.L(a0.h(), z);
    }

    private final void K(com.dcinside.app.dccon.b b0) {
        if(b0.l()) {
            this.n.setVisibility(8);
            this.q.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if(b0.m() && !b0.n()) {
            this.q.setVisibility(0);
            this.n.setVisibility(4);
            this.w.setVisibility(4);
            return;
        }
        this.q.setVisibility(4);
        this.n.setVisibility(0);
        this.w.setVisibility(4);
        this.w.setText("");
        com.facebook.drawee.controller.a a0 = ((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0("").U(this.n.getController())).L(new com.dcinside.app.read.holder.h.h(this, true))).I(true)).e();
        this.n.setController(a0);
    }

    private final void L(com.dcinside.app.dccon.b b0, boolean z) {
        if(b0 != null && !b0.l()) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.o.getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            if(this.n.getVisibility() == 8) {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(0);
            }
            else {
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(Dk.d((z ? 150 : 100)));
            }
            if(b0.m() && !b0.n()) {
                this.r.setVisibility(0);
                this.o.setVisibility(4);
                this.x.setVisibility(4);
                return;
            }
            this.r.setVisibility(4);
            this.o.setVisibility(0);
            this.x.setVisibility(4);
            this.x.setText("");
            com.facebook.drawee.controller.a a0 = ((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0("").U(this.o.getController())).L(new com.dcinside.app.read.holder.h.h(this, false))).I(true)).e();
            this.o.setController(a0);
            return;
        }
        this.r.setVisibility(8);
        this.o.setVisibility(8);
        this.x.setVisibility(8);
    }

    private final void M() {
        try {
            int v = this.getBindingAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            x x0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof x) {
                x0 = (x)recyclerView$Adapter0;
            }
            if(x0 == null) {
                return;
            }
            x0.A0(v);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private final void N() {
        try {
            int v = this.getBindingAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            x x0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof x) {
                x0 = (x)recyclerView$Adapter0;
            }
            if(x0 == null) {
                return;
            }
            x0.B0(v);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    @y4.l
    public final TextView O() {
        return this.s;
    }

    @y4.l
    public final View P() {
        return this.t;
    }

    @y4.l
    public final View R() {
        return this.p;
    }

    @y4.l
    public final TextView S() {
        return this.u;
    }

    @y4.l
    public final View T() {
        return this.v;
    }

    @y4.l
    public final SimpleDraweeView U() {
        return this.n;
    }

    @y4.l
    public final TextView V() {
        return this.w;
    }

    @y4.l
    public final SimpleDraweeView W() {
        return this.o;
    }

    @y4.l
    public final TextView X() {
        return this.x;
    }

    private final void Y() {
        try {
            int v = this.getBindingAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            x x0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof x) {
                x0 = (x)recyclerView$Adapter0;
            }
            if(x0 == null) {
                return;
            }
            x0.y0(v);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private final void a0(boolean z) {
        try {
            int v = this.getBindingAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
            L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.read.ContentAdapter");
            ((x)recyclerView$Adapter0).z0(v, z);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public final void b0(@m Mention mention0) {
        if(mention0 == null) {
            this.y.setVisibility(8);
            return;
        }
        this.y.setVisibility(0);
        Context context0 = this.itemView.getContext();
        L.o(context0, "getContext(...)");
        boolean z = J.a(mention0);
        SpannableStringBuilder spannableStringBuilder0 = com.dcinside.app.span.g.w(context0, Q0.d, "", "", "", z);
        this.y.setText(spannableStringBuilder0);
    }

    private final void c0(boolean z) {
        try {
            int v = this.getBindingAdapterPosition();
            if(v < 0) {
                return;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            x x0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof x) {
                x0 = (x)recyclerView$Adapter0;
            }
            if(x0 == null) {
                return;
            }
            x0.v0(v, z);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }
}

