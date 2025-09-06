package com.dcinside.app.settings.block.report;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.view.DividerLinearLayout;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockReportPostHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockReportPostHolder.kt\ncom/dcinside/app/settings/block/report/BlockReportPostHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class d extends ViewHolder {
    @l
    private final DividerLinearLayout a;
    @l
    private final TextView b;
    @l
    private final TextView c;

    public d(@l View view0) {
        @f(c = "com.dcinside.app.settings.block.report.BlockReportPostHolder$1", f = "BlockReportPostHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
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
                this.l.j();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B023E);  // id:block_report_item_post_wrap
        L.o(view1, "findViewById(...)");
        this.a = (DividerLinearLayout)view1;
        View view2 = view0.findViewById(0x7F0B023C);  // id:block_report_item_post_subject
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B023D);  // id:block_report_item_post_summary
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        r.M(view0, null, new a(this, null), 1, null);
    }

    @l
    public final TextView f() {
        return this.b;
    }

    @l
    public final TextView h() {
        return this.c;
    }

    @l
    public final DividerLinearLayout i() {
        return this.a;
    }

    private final void j() {
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
            Context context0 = this.itemView.getContext();
            L.o(context0, "getContext(...)");
            b0.w(context0, ((int)integer0));
        }
    }
}

