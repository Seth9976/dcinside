package com.dcinside.app.settings.block.dccon;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockDcconChildHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDcconChildHolder.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconChildHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class d extends ViewHolder {
    @l
    private final SimpleDraweeView a;
    @l
    private final View b;

    public d(@l View view0) {
        @f(c = "com.dcinside.app.settings.block.dccon.BlockDcconChildHolder$1", f = "BlockDcconChildHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
                this.l.f();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B01E2);  // id:block_dccon_detail_item_image
        L.o(view1, "findViewById(...)");
        this.a = (SimpleDraweeView)view1;
        View view2 = view0.findViewById(0x7F0B01E1);  // id:block_dccon_detail_item_delete
        L.o(view2, "findViewById(...)");
        this.b = view2;
        r.M(view2, null, new a(this, null), 1, null);
    }

    private final void f() {
        ViewParent viewParent0 = this.itemView.getParent();
        Integer integer0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        Adapter recyclerView$Adapter0 = recyclerView0 == null ? null : recyclerView0.getAdapter();
        com.dcinside.app.settings.block.dccon.f f0 = recyclerView$Adapter0 instanceof com.dcinside.app.settings.block.dccon.f ? ((com.dcinside.app.settings.block.dccon.f)recyclerView$Adapter0) : null;
        if(f0 == null) {
            return;
        }
        Integer integer1 = this.getBindingAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            f0.w(((int)integer0));
        }
    }

    @l
    public final View h() {
        return this.b;
    }

    @l
    public final SimpleDraweeView i() {
        return this.a;
    }
}

