package com.dcinside.app.view.colorpicker;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.n;
import com.dcinside.app.util.Al;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nColorPickerGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerGridAdapter.kt\ncom/dcinside/app/view/colorpicker/ColorPickerGridAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,51:1\n257#2,2:52\n*S KotlinDebug\n*F\n+ 1 ColorPickerGridAdapter.kt\ncom/dcinside/app/view/colorpicker/ColorPickerGridAdapter\n*L\n36#1:52,2\n*E\n"})
public final class a extends Adapter {
    public static final class com.dcinside.app.view.colorpicker.a.a extends ViewHolder {
        @l
        private final View a;
        @l
        private final View b;

        public com.dcinside.app.view.colorpicker.a.a(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B02CF);  // id:color_picker_grid_outline
            L.o(view1, "findViewById(...)");
            this.a = view1;
            View view2 = view0.findViewById(0x7F0B02CE);  // id:color_picker_grid_item
            L.o(view2, "findViewById(...)");
            this.b = view2;
        }

        @l
        public final View e() {
            return this.b;
        }

        @l
        public final View f() {
            return this.a;
        }
    }

    @l
    private List a;
    @m
    private Integer b;
    @m
    private Integer c;

    public a() {
        this.a = u.H();
    }

    public final void A(@l List list0) {
        L.p(list0, "<set-?>");
        this.a = list0;
    }

    public final void B(@m Integer integer0) {
        if(!u.W1(this.a, integer0)) {
            integer0 = null;
        }
        this.b = integer0;
    }

    public final void C(@m Integer integer0) {
        this.c = integer0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((com.dcinside.app.view.colorpicker.a.a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    @l
    public final List v() {
        return this.a;
    }

    @m
    public final Integer w() {
        return this.b;
    }

    @m
    public final Integer x() {
        return this.c;
    }

    public void y(@l com.dcinside.app.view.colorpicker.a.a a$a0, int v) {
        @f(c = "com.dcinside.app.view.colorpicker.ColorPickerGridAdapter$onBindViewHolder$1", f = "ColorPickerGridAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final com.dcinside.app.view.colorpicker.a.a l;
            final int m;
            final int n;

            b(com.dcinside.app.view.colorpicker.a.a a$a0, int v, int v1, d d0) {
                this.l = a$a0;
                this.m = v;
                this.n = v1;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                Context context0 = Al.h(this.l.itemView.getContext());
                if(context0 != null) {
                    c.a(context0, new n(this.m, this.n));
                }
                return S0.a;
            }
        }

        L.p(a$a0, "holder");
        int v1 = ((Number)this.a.get(v)).intValue();
        a$a0.e().setBackgroundColor(v1);
        a$a0.f().setVisibility((this.b != null && ((int)this.b) == v1 ? 0 : 8));
        L.o(a$a0.itemView, "itemView");
        b a$b0 = new b(a$a0, v1, v, null);
        r.M(a$a0.itemView, null, a$b0, 1, null);
    }

    @l
    public com.dcinside.app.view.colorpicker.a.a z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01AF, viewGroup0, false);  // layout:view_color_picker_grid_item
        L.m(view0);
        return new com.dcinside.app.view.colorpicker.a.a(view0);
    }
}

