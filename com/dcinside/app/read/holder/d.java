package com.dcinside.app.read.holder;

import A3.p;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Q;
import com.dcinside.app.post.n;
import com.dcinside.app.read.x;
import com.dcinside.app.rx.bus.v0;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.ResizeTextView;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kr.better.widget.BetterTextView;
import rx.o;
import y4.l;
import y4.m;

public final class d extends b {
    private final long b;
    @l
    private final BetterTextView c;
    @l
    private final View d;
    @l
    private final View[] e;
    @l
    private final ResizeTextView f;
    @l
    private final View g;
    @l
    private final View h;
    @m
    private final View i;
    @m
    private final View j;
    @m
    private final View k;
    @m
    private final View l;
    @m
    private o m;
    @m
    private Q n;
    @m
    private String o;

    public d(@l View view0, boolean z) {
        @f(c = "com.dcinside.app.read.holder.CountHolder$1", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            a(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
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
                x x0 = this.l.e();
                if(x0 != null) {
                    x0.H0();
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.CountHolder$2", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.d.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            com.dcinside.app.read.holder.d.b(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.holder.d.b(this.l, d0).invokeSuspend(S0.a);
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
                x x0 = this.l.e();
                if(x0 != null) {
                    x0.G0();
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.CountHolder$3", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            c(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
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
                x x0 = this.l.e();
                if(x0 != null) {
                    x0.m0();
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.CountHolder$4", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.d.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            com.dcinside.app.read.holder.d.d(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.holder.d.d(this.l, d0).invokeSuspend(S0.a);
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
                x x0 = this.l.e();
                if(x0 != null) {
                    x0.I0(false);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.CountHolder$5", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            e(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                x x0 = this.l.e();
                if(x0 != null) {
                    x0.I0(false);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.CountHolder$6", f = "CountHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.d.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final d l;

            com.dcinside.app.read.holder.d.f(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.holder.d.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        this.b = System.nanoTime();
        View view1 = view0.findViewById(0x7F0B0D1C);  // id:reply_count
        L.o(view1, "findViewById(...)");
        this.c = (BetterTextView)view1;
        View view2 = view0.findViewById(0x7F0B0D1E);  // id:reply_count_wrap
        L.o(view2, "findViewById(...)");
        this.d = view2;
        View view3 = view0.findViewById(0x7F0B0D68);  // id:reply_prev
        L.o(view3, "findViewById(...)");
        View view4 = view0.findViewById(0x7F0B0D66);  // id:reply_next
        L.o(view4, "findViewById(...)");
        View[] arr_view = {view3, view4};
        this.e = arr_view;
        View view5 = view0.findViewById(0x7F0B0D67);  // id:reply_page
        L.o(view5, "findViewById(...)");
        this.f = (ResizeTextView)view5;
        View view6 = view0.findViewById(0x7F0B0D1D);  // id:reply_count_refresh
        L.o(view6, "findViewById(...)");
        this.g = view6;
        View view7 = view0.findViewById(0x7F0B0D69);  // id:reply_progress
        L.o(view7, "findViewById(...)");
        this.h = view7;
        View view8 = z ? view0.findViewById(0x7F0B0D71) : null;  // id:reply_to_top
        this.i = view8;
        View view9 = z ? null : view0.findViewById(0x7F0B0D2A);  // id:reply_filter_button
        this.j = view9;
        this.k = z ? null : view0.findViewById(0x7F0B0D2B);  // id:reply_filter_loading
        this.l = z ? null : view0.findViewById(0x7F0B0D2C);  // id:reply_filter_progress
        r.M(arr_view[0], null, new a(this, null), 1, null);
        r.M(arr_view[1], null, new com.dcinside.app.read.holder.d.b(this, null), 1, null);
        if(view8 != null) {
            r.M(view8, null, new c(this, null), 1, null);
        }
        r.M(view6, null, new com.dcinside.app.read.holder.d.d(this, null), 1, null);
        r.M(view2, null, new e(this, null), 1, null);
        if(view9 != null) {
            r.M(view9, null, new com.dcinside.app.read.holder.d.f(this, null), 1, null);
        }
    }

    public final void h() {
        x x0 = this.e();
        if(x0 != null) {
            x0.w0();
        }
    }

    @l
    public final View[] i() {
        return this.e;
    }

    @l
    public final BetterTextView j() {
        return this.c;
    }

    @m
    public final View k() {
        return this.j;
    }

    public final long l() {
        return this.b;
    }

    @l
    public final ResizeTextView m() {
        return this.f;
    }

    @m
    public final Q n() {
        return this.n;
    }

    @l
    public final View o() {
        return this.g;
    }

    @m
    public final String p() {
        return this.o;
    }

    @m
    public final o q() {
        return this.m;
    }

    public final void r() {
        Context context0 = this.itemView.getContext();
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new v0());
        }
    }

    public final void s(boolean z) {
        if(z) {
            View view0 = this.i;
            if(view0 != null) {
                view0.setVisibility(4);
            }
            this.h.setVisibility(0);
            return;
        }
        View view1 = this.i;
        if(view1 != null) {
            view1.setVisibility(0);
        }
        this.h.setVisibility(8);
    }

    public final void t(@m Boolean boolean0) {
        boolean z = dl.a.I() || dl.a.Z() || dl.a.a0();
        View view0 = this.j;
        if(view0 != null) {
            view0.setSelected(z);
        }
        if(L.g(boolean0, Boolean.TRUE)) {
            View view1 = this.k;
            if(view1 != null) {
                view1.setVisibility(0);
            }
            View view2 = this.l;
            if(view2 != null) {
                view2.setVisibility(0);
            }
        }
        else {
            View view3 = this.k;
            if(view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.l;
            if(view4 != null) {
                view4.setVisibility(8);
            }
        }
    }

    public final void u(@m Q q0) {
        if(L.g(this.n, q0)) {
            return;
        }
        this.n = q0;
    }

    public final void v(@m String s) {
        this.o = s;
    }

    public final void w(@m o o0) {
        this.m = o0;
    }

    private final void x() {
        Q q0 = this.n;
        if(q0 == null) {
            return;
        }
        String s = q0.G0();
        int v = q0.c1();
        Context context0 = this.itemView.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.type.o o0 = n.y1.a(appCompatActivity0);
        new com.dcinside.app.util.Xk.a(s, v, 0, null, ((boolean)(1 ^ (o0 == com.dcinside.app.type.o.c ? 1 : 0))), false, o0 == com.dcinside.app.type.o.d, false, false, true, this.o, false, null, null, 0x39AC, null).a(appCompatActivity0);
    }
}

