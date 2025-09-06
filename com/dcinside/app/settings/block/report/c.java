package com.dcinside.app.settings.block.report;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
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

@s0({"SMAP\nBlockReportPostHeadHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockReportPostHeadHolder.kt\ncom/dcinside/app/settings/block/report/BlockReportPostHeadHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n257#2,2:36\n257#2,2:38\n1#3:40\n*S KotlinDebug\n*F\n+ 1 BlockReportPostHeadHolder.kt\ncom/dcinside/app/settings/block/report/BlockReportPostHeadHolder\n*L\n24#1:36,2\n25#1:38,2\n*E\n"})
public final class c extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final View c;
    @l
    private final View d;

    public c(@l View view0) {
        @f(c = "com.dcinside.app.settings.block.report.BlockReportPostHeadHolder$1", f = "BlockReportPostHeadHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final c l;

            a(c c0, d d0) {
                this.l = c0;
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
                this.l.k();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D7E);  // id:report_post_header_wrap
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0D7C);  // id:report_post_header_title
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0D7B);  // id:report_post_header_down
        L.o(view3, "findViewById(...)");
        this.c = view3;
        View view4 = view0.findViewById(0x7F0B0D7D);  // id:report_post_header_up
        L.o(view4, "findViewById(...)");
        this.d = view4;
        r.M(view0, null, new a(this, null), 1, null);
    }

    @l
    public final View f() {
        return this.c;
    }

    @l
    public final TextView h() {
        return this.b;
    }

    @l
    public final View i() {
        return this.d;
    }

    @l
    public final View j() {
        return this.a;
    }

    private final void k() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        b b0 = recyclerView$Adapter0 instanceof b ? ((b)recyclerView$Adapter0) : null;
        if(b0 == null) {
            return;
        }
        Integer integer1 = this.getBindingAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            b0.y(((int)integer0));
        }
    }

    public final void l(boolean z) {
        this.a.setBackgroundResource((z ? 0x7F080556 : 0x7F080557));  // drawable:report_header_closed
        int v = 8;
        this.d.setVisibility((z ? 0 : 8));
        View view0 = this.c;
        if(!z) {
            v = 0;
        }
        view0.setVisibility(v);
    }
}

