package com.dcinside.app.read.holder;

import A3.p;
import android.view.View;
import com.dcinside.app.internal.r;
import com.dcinside.app.read.S;
import com.dcinside.app.read.x;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;

@s0({"SMAP\nReplyTopProgressHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTopProgressHolder.kt\ncom/dcinside/app/read/holder/ReplyTopProgressHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,36:1\n257#2,2:37\n*S KotlinDebug\n*F\n+ 1 ReplyTopProgressHolder.kt\ncom/dcinside/app/read/holder/ReplyTopProgressHolder\n*L\n28#1:37,2\n*E\n"})
public final class m extends b {
    @l
    private final View b;
    @l
    private final View c;
    @y4.m
    private o d;

    public m(@l View view0) {
        @f(c = "com.dcinside.app.read.holder.ReplyTopProgressHolder$1", f = "ReplyTopProgressHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            a(m m0, d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                x x0 = this.l.e();
                if(x0 != null) {
                    S s0 = x0.R();
                    if(s0 != null) {
                        s0.N0();
                    }
                }
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0C98);  // id:read_top_progress
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = view0.findViewById(0x7F0B0C89);  // id:read_reply_top_more
        L.o(view2, "findViewById(...)");
        this.c = view2;
        r.M(view2, null, new a(this, null), 1, null);
    }

    @l
    public final View h() {
        return this.b;
    }

    @y4.m
    public final o i() {
        return this.d;
    }

    public final void j(@y4.m Boolean boolean0, boolean z) {
        int v = 0;
        if(L.g(boolean0, Boolean.TRUE)) {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        if(z) {
            this.b.setVisibility(8);
            View view0 = this.c;
            x x0 = this.e();
            if(x0 == null) {
                v = 8;
            }
            else {
                S s0 = x0.R();
                if(s0 == null || !s0.K()) {
                    v = 8;
                }
            }
            view0.setVisibility(v);
            return;
        }
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    public final void k(@y4.m o o0) {
        this.d = o0;
    }
}

