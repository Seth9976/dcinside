package com.dcinside.app.read.holder;

import A3.p;
import android.view.View;
import com.dcinside.app.internal.r;
import com.dcinside.app.read.S;
import com.dcinside.app.read.x;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyBottomSpaceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyBottomSpaceHolder.kt\ncom/dcinside/app/read/holder/ReplyBottomSpaceHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n257#2,2:38\n*S KotlinDebug\n*F\n+ 1 ReplyBottomSpaceHolder.kt\ncom/dcinside/app/read/holder/ReplyBottomSpaceHolder\n*L\n29#1:38,2\n*E\n"})
public final class f extends b {
    @l
    private final View b;
    @l
    private final View c;
    @l
    private View d;
    @m
    private o e;

    public f(@l View view0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.holder.ReplyBottomSpaceHolder$1", f = "ReplyBottomSpaceHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            a(f f0, d d0) {
                this.l = f0;
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
                x x0 = this.l.e();
                if(x0 != null) {
                    S s0 = x0.R();
                    if(s0 != null) {
                        s0.M0();
                    }
                }
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0C23);  // id:read_bottom_space_progress
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = view0.findViewById(0x7F0B0C20);  // id:read_bottom_space
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = view0.findViewById(0x7F0B0C22);  // id:read_bottom_space_more
        L.o(view3, "findViewById(...)");
        this.d = view3;
        r.M(view3, null, new a(this, null), 1, null);
    }

    @l
    public final View h() {
        return this.b;
    }

    @l
    public final View i() {
        return this.c;
    }

    @m
    public final o j() {
        return this.e;
    }

    public final void k(@m Boolean boolean0, boolean z) {
        int v = 0;
        if(L.g(boolean0, Boolean.TRUE)) {
            this.b.setVisibility(0);
            this.d.setVisibility(8);
            return;
        }
        if(z) {
            this.b.setVisibility(8);
            View view0 = this.d;
            x x0 = this.e();
            if(x0 == null) {
                v = 8;
            }
            else {
                S s0 = x0.R();
                if(s0 == null || !s0.J()) {
                    v = 8;
                }
            }
            view0.setVisibility(v);
            return;
        }
        this.b.setVisibility(8);
        this.d.setVisibility(8);
    }

    public final void l(@m o o0) {
        this.e = o0;
    }
}

