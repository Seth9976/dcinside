package com.dcinside.app.read.holder;

import A3.p;
import android.view.View;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.read.S;
import com.dcinside.app.type.G;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nReplySortHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplySortHolder.kt\ncom/dcinside/app/read/holder/ReplySortHolder\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,29:1\n147#2:30\n*S KotlinDebug\n*F\n+ 1 ReplySortHolder.kt\ncom/dcinside/app/read/holder/ReplySortHolder\n*L\n11#1:30\n*E\n"})
public final class i extends b {
    @l
    private final t b;
    @l
    private final View c;
    @l
    private final View d;
    @l
    private final View e;

    public i(@l View view0, @l S s0) {
        @f(c = "com.dcinside.app.read.holder.ReplySortHolder$1", f = "ReplySortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final i l;

            a(i i0, d d0) {
                this.l = i0;
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
                S s0 = (S)this.l.b.a();
                if(s0 != null) {
                    s0.u1(G.b);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplySortHolder$2", f = "ReplySortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.i.b extends o implements p {
            int k;
            final i l;

            com.dcinside.app.read.holder.i.b(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.read.holder.i.b(this.l, d0).invokeSuspend(S0.a);
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
                S s0 = (S)this.l.b.a();
                if(s0 != null) {
                    s0.u1(G.c);
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplySortHolder$3", f = "ReplySortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final i l;

            c(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                S s0 = (S)this.l.b.a();
                if(s0 != null) {
                    s0.u1(G.d);
                }
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        L.p(s0, "manager");
        super(view0, null, 2, null);
        this.b = new t(s0);
        View view1 = view0.findViewById(0x7F0B0C87);  // id:read_reply_sort_def
        L.o(view1, "findViewById(...)");
        this.c = view1;
        View view2 = view0.findViewById(0x7F0B0C88);  // id:read_reply_sort_new
        L.o(view2, "findViewById(...)");
        this.d = view2;
        View view3 = view0.findViewById(0x7F0B0C86);  // id:read_reply_sort_cnt
        L.o(view3, "findViewById(...)");
        this.e = view3;
        r.M(view1, null, new a(this, null), 1, null);
        r.M(view2, null, new com.dcinside.app.read.holder.i.b(this, null), 1, null);
        r.M(view3, null, new c(this, null), 1, null);
    }

    public final void i() {
        S s0 = (S)this.b.a();
        G g0 = s0 == null ? null : s0.s0();
        boolean z = false;
        this.c.setSelected(g0 == G.b);
        this.d.setSelected(g0 == G.c);
        View view0 = this.e;
        if(g0 == G.d) {
            z = true;
        }
        view0.setSelected(z);
    }
}

