package com.dcinside.app.view.popupmenu;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nSectionedRecyclerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionedRecyclerViewAdapter.kt\ncom/dcinside/app/view/popupmenu/SectionedRecyclerViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n2979#2,5:191\n*S KotlinDebug\n*F\n+ 1 SectionedRecyclerViewAdapter.kt\ncom/dcinside/app/view/popupmenu/SectionedRecyclerViewAdapter\n*L\n57#1:191,5\n*E\n"})
public abstract class a0 extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private int[] a;
    @m
    private int[] b;
    @m
    private boolean[] c;
    private int d;
    @l
    public static final a e = null;
    public static final int f = -1;
    public static final int g = -2;

    static {
        a0.e = new a(null);
    }

    protected int A(int v, int v1) {
        return -2;
    }

    private final boolean B(int v) {
        if(this.c == null) {
            this.J();
        }
        boolean[] arr_z = this.c;
        L.m(arr_z);
        return arr_z[v];
    }

    private final boolean C(int v) {
        return v == -1;
    }

    protected abstract void D(@l ViewHolder arg1, int arg2, int arg3);

    protected abstract void E(@l ViewHolder arg1, int arg2);

    @l
    protected abstract ViewHolder F(@l ViewGroup arg1, int arg2);

    @l
    protected abstract ViewHolder G(@l ViewGroup arg1, int arg2);

    private final void H() {
        int v = this.y();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            this.I(v2, true, v1, 0);
            ++v2;
            int v3 = this.x(v1);
            for(int v4 = 0; v4 < v3; ++v4) {
                this.I(v2, false, v1, v4);
                ++v2;
            }
        }
    }

    private final void I(int v, boolean z, int v1, int v2) {
        boolean[] arr_z = this.c;
        if(arr_z != null) {
            arr_z[v] = z;
        }
        int[] arr_v = this.a;
        if(arr_v != null) {
            arr_v[v] = v1;
        }
        int[] arr_v1 = this.b;
        if(arr_v1 != null) {
            arr_v1[v] = v2;
        }
    }

    public final void J() {
        int v = this.w();
        this.d = v;
        this.v(v);
        this.H();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.d;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(this.a == null) {
            this.J();
        }
        int[] arr_v = this.a;
        L.m(arr_v);
        int v1 = arr_v[v];
        int[] arr_v1 = this.b;
        L.m(arr_v1);
        int v2 = arr_v1[v];
        return this.B(v) ? -1 : this.A(v1, v2);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        int[] arr_v = this.a;
        L.m(arr_v);
        int v1 = arr_v[v];
        int[] arr_v1 = this.b;
        L.m(arr_v1);
        int v2 = arr_v1[v];
        if(this.B(v)) {
            this.E(recyclerView$ViewHolder0, v1);
            return;
        }
        this.D(recyclerView$ViewHolder0, v1, v2);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return this.C(v) ? this.G(viewGroup0, v) : this.F(viewGroup0, v);
    }

    private final void v(int v) {
        this.a = new int[v];
        this.b = new int[v];
        this.c = new boolean[v];
    }

    private final int w() {
        int v = 0;
        Iterator iterator0 = s.W1(0, this.y()).iterator();
        while(iterator0.hasNext()) {
            v += this.x(((T)iterator0).b()) + 1;
        }
        return v;
    }

    protected abstract int x(int arg1);

    protected abstract int y();

    private final int z(int v) [...] // Inlined contents
}

