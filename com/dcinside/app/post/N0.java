package com.dcinside.app.post;

import A3.p;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
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

public final class n0 extends ViewHolder {
    @l
    private final CheckBox a;
    @l
    private final TextView b;

    public n0(@l View view0) {
        @f(c = "com.dcinside.app.post.PostHeadSettingHolder$1", f = "PostHeadSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final n0 l;

            a(n0 n00, d d0) {
                this.l = n00;
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
                this.l.i();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0A50);  // id:post_head_setting_check
        L.o(view1, "findViewById(...)");
        this.a = (CheckBox)view1;
        View view2 = view0.findViewById(0x7F0B0A54);  // id:post_head_setting_text
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        r.M(view0, null, new a(this, null), 1, null);
    }

    @l
    public final CheckBox f() {
        return this.a;
    }

    @l
    public final TextView h() {
        return this.b;
    }

    private final void i() {
        Adapter recyclerView$Adapter0 = this.getBindingAdapter();
        m0 m00 = recyclerView$Adapter0 instanceof m0 ? ((m0)recyclerView$Adapter0) : null;
        if(m00 == null) {
            return;
        }
        m00.w(this.getBindingAdapterPosition());
    }
}

