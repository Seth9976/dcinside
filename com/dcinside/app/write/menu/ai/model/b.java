package com.dcinside.app.write.menu.ai.model;

import A3.p;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
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
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class b extends ViewHolder {
    @l
    private final ImageView a;
    @l
    private final View b;

    public b(@l View view0) {
        @f(c = "com.dcinside.app.write.menu.ai.model.AiModelHolder$1", f = "AiModelHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final b l;

            a(b b0, d d0) {
                this.l = b0;
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
                this.l.a();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0682);  // id:item_ai_model_image
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0683);  // id:item_ai_model_image_border
        L.o(view2, "findViewById(...)");
        this.b = view2;
        r.M(view0, null, new a(this, null), 1, null);
    }

    private final void a() {
        ViewParent viewParent0 = this.itemView.getParent();
        com.dcinside.app.write.menu.ai.model.a a0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.write.menu.ai.model.a) {
            a0 = (com.dcinside.app.write.menu.ai.model.a)recyclerView$Adapter0;
        }
        if(a0 == null) {
            return;
        }
        a0.e(this.getBindingAdapterPosition());
    }

    @l
    public final ImageView f() {
        return this.a;
    }

    @l
    public final View h() {
        return this.b;
    }
}

