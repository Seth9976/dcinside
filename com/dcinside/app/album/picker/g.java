package com.dcinside.app.album.picker;

import A3.p;
import android.content.Context;
import android.view.View;
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

public final class g extends ViewHolder {
    public g(@l View view0) {
        @f(c = "com.dcinside.app.album.picker.PickerHeaderHolder$1", f = "PickerHeaderHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;

            a(d d0) {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a g$a0 = new a(d0);
                g$a0.l = view0;
                return g$a0.invokeSuspend(S0.a);
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
                Context context0 = ((View)this.l).getContext();
                PickerActivity pickerActivity0 = context0 instanceof PickerActivity ? ((PickerActivity)context0) : null;
                if(pickerActivity0 != null) {
                    pickerActivity0.r2();
                }
                return S0.a;
            }
        }

        L.p(view0, "view");
        super(view0);
        L.o(this.itemView, "itemView");
        a g$a0 = new a(null);
        r.M(this.itemView, null, g$a0, 1, null);
    }
}

