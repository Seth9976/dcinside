package com.dcinside.app.settings.theme;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.type.g;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import n0.a;
import y4.l;

@s0({"SMAP\nThemeDividerDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeDividerDecoration.kt\ncom/dcinside/app/settings/theme/ThemeDividerDecoration\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,71:1\n25#2:72\n25#2:73\n*S KotlinDebug\n*F\n+ 1 ThemeDividerDecoration.kt\ncom/dcinside/app/settings/theme/ThemeDividerDecoration\n*L\n31#1:72\n50#1:73\n*E\n"})
public final class b extends a {
    public final class com.dcinside.app.settings.theme.b.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[g.values().length];
            try {
                arr_v[g.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.settings.theme.b.a.a = arr_v;
        }
    }

    @l
    private final D b;
    @l
    private final D c;

    public b(@l Context context0) {
        static final class com.dcinside.app.settings.theme.b.b extends N implements A3.a {
            final b e;

            com.dcinside.app.settings.theme.b.b(b b0) {
                this.e = b0;
                super(0);
            }

            @l
            public final Integer b() {
                return this.e.l().getIntrinsicHeight();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final b e;

            c(b b0) {
                this.e = b0;
                super(0);
            }

            @l
            public final Integer b() {
                return (int)(this.e.l().getIntrinsicHeight() * 4);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0);
        this.b = E.a(new c(this));
        this.c = E.a(new com.dcinside.app.settings.theme.b.b(this));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(@l Rect rect0, @l View view0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(rect0, "outRect");
        L.p(view0, "view");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        int v = recyclerView0.getChildAdapterPosition(view0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        g g0 = null;
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.settings.theme.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.settings.theme.a)recyclerView$Adapter0) != null) {
            g0 = ((com.dcinside.app.settings.theme.a)recyclerView$Adapter0).v(v);
        }
        if(this.o(g0)) {
            rect0.set(0, 0, 0, this.n());
            return;
        }
        rect0.set(0, 0, 0, this.m());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(@l Canvas canvas0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(canvas0, "c");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        int v = recyclerView0.getPaddingLeft();
        int v1 = recyclerView0.getWidth();
        int v2 = recyclerView0.getPaddingRight();
        int v3 = recyclerView0.getChildCount();
        for(int v4 = 0; v4 < v3 - 1; ++v4) {
            View view0 = recyclerView0.getChildAt(v4);
            int v5 = recyclerView0.getChildAdapterPosition(view0);
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            g g0 = null;
            if(!(recyclerView$Adapter0 instanceof com.dcinside.app.settings.theme.a)) {
                recyclerView$Adapter0 = null;
            }
            if(((com.dcinside.app.settings.theme.a)recyclerView$Adapter0) != null) {
                g0 = ((com.dcinside.app.settings.theme.a)recyclerView$Adapter0).v(v5);
            }
            int v6 = this.o(g0) ? this.n() : this.m();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int v7 = view0.getBottom() + ((LayoutParams)viewGroup$LayoutParams0).bottomMargin;
            this.l().setBounds(v, v7, v1 - v2, v6 + v7);
            this.l().draw(canvas0);
        }
    }

    private final int m() {
        return ((Number)this.c.getValue()).intValue();
    }

    private final int n() {
        return ((Number)this.b.getValue()).intValue();
    }

    private final boolean o(g g0) {
        int v = g0 == null ? -1 : com.dcinside.app.settings.theme.b.a.a[g0.ordinal()];
        return v == 1 || v == 2;
    }
}

