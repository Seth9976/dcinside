package com.dcinside.app.history.holder;

import A3.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.a.a;
import com.dcinside.app.history.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.view.DividerLinearLayout;
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

@s0({"SMAP\nPostHistoryHeadHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryHeadHolder.kt\ncom/dcinside/app/history/holder/PostHistoryHeadHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n257#2,2:47\n257#2,2:49\n1#3:51\n*S KotlinDebug\n*F\n+ 1 PostHistoryHeadHolder.kt\ncom/dcinside/app/history/holder/PostHistoryHeadHolder\n*L\n31#1:47,2\n32#1:49,2\n*E\n"})
public final class c extends a {
    @l
    private final TextView a;
    @l
    private final View b;
    @l
    private final View c;

    public c(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.history.holder.PostHistoryHeadHolder$1", f = "PostHistoryHeadHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.holder.c.a extends o implements p {
            int k;
            final c l;

            com.dcinside.app.history.holder.c.a(c c0, d d0) {
                this.l = c0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.history.holder.c.a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.l();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0227, viewGroup0, false));  // layout:view_post_history_item_head
        View view0 = this.itemView.findViewById(0x7F0B0A5D);  // id:post_history_item_head_title
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0A5C);  // id:post_history_item_head_down
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0A5E);  // id:post_history_item_head_up
        L.o(view2, "findViewById(...)");
        this.c = view2;
        L.o(this.itemView, "itemView");
        com.dcinside.app.history.holder.c.a c$a0 = new com.dcinside.app.history.holder.c.a(this, null);
        r.M(this.itemView, null, c$a0, 1, null);
    }

    @l
    public final View i() {
        return this.b;
    }

    @l
    public final TextView j() {
        return this.a;
    }

    @l
    public final View k() {
        return this.c;
    }

    private final void l() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        i i0 = recyclerView$Adapter0 instanceof i ? ((i)recyclerView$Adapter0) : null;
        if(i0 == null) {
            return;
        }
        Integer integer1 = this.getAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            i0.n0(i0.z(((int)integer0)));
        }
    }

    public final void m(boolean z, boolean z1) {
        int v = 8;
        this.c.setVisibility((z ? 0 : 8));
        View view0 = this.b;
        if(!z) {
            v = 0;
        }
        view0.setVisibility(v);
        DividerLinearLayout dividerLinearLayout0 = this.itemView instanceof DividerLinearLayout ? ((DividerLinearLayout)this.itemView) : null;
        if(dividerLinearLayout0 != null) {
            dividerLinearLayout0.setDrawBottom(z1);
        }
    }
}

