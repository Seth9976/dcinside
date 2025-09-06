package com.dcinside.app.image.edit.draw;

import A3.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditDrawHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditDrawHolder.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,25:1\n1#2:26\n20#3:27\n25#4:28\n*S KotlinDebug\n*F\n+ 1 ImageEditDrawHolder.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawHolder\n*L\n21#1:27\n21#1:28\n*E\n"})
public final class d extends e {
    @l
    private final ImageView a;

    public d(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.image.edit.draw.ImageEditDrawHolder$1", f = "ImageEditDrawHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E01E2);  // layout:view_image_edit_draw_item
        View view0 = this.itemView.findViewById(0x7F0B059B);  // id:image_edit_draw_item_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        L.o(this.itemView, "itemView");
        a d$a0 = new a(this, null);
        r.M(this.itemView, null, d$a0, 1, null);
    }

    @l
    public final ImageView i() {
        return this.a;
    }

    private final void j() {
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                if(recyclerView$Adapter1 instanceof com.dcinside.app.image.edit.draw.a) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 != null) {
                ((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0).A(v);
            }
        }
    }
}

