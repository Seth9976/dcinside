package com.codewaves.stickyheadergrid;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public abstract class a extends Adapter {
    public static class com.codewaves.stickyheadergrid.a.a extends d {
        public com.codewaves.stickyheadergrid.a.a(View view0) {
            super(view0);
        }

        @Override  // com.codewaves.stickyheadergrid.a$d
        public boolean f() {
            return true;
        }
    }

    public static class b extends d {
        public b(View view0) {
            super(view0);
        }
    }

    static class c {
        private int a;
        private int b;
        private int c;

        private c() {
        }

        c(com.codewaves.stickyheadergrid.b b0) {
        }
    }

    public static class d extends ViewHolder {
        public d(View view0) {
            super(view0);
        }

        public int e() {
            return a.v(this.getItemViewType());
        }

        public boolean f() {
            return false;
        }
    }

    private ArrayList a;
    private int[] b;
    private int c;
    public static final String d = "StickyHeaderGridAdapter";
    public static final int e = 0;
    public static final int f = 1;

    private int A(int v) {
        return this.F(this.z(v));
    }

    public int B(int v, int v1) {
        if(this.a == null) {
            this.w();
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("section " + v + " < 0");
        }
        if(v >= this.a.size()) {
            throw new IndexOutOfBoundsException("section " + v + " >=" + this.a.size());
        }
        c a$c0 = (c)this.a.get(v);
        int v2 = v1 - a$c0.a;
        if(v2 >= a$c0.c) {
            throw new IndexOutOfBoundsException("localPosition: " + v2 + " >=" + a$c0.c);
        }
        return v2 - 1;
    }

    protected int C(int v) {
        int v1 = this.z(v);
        return this.D(v1, v - ((c)this.a.get(v1)).a);
    }

    private int D(int v, int v1) {
        return v1 == 0 ? 0 : 1;
    }

    public int E() {
        return 0;
    }

    public int F(int v) {
        return this.y(v, 0);
    }

    public int G(int v) {
        return 0;
    }

    public int H(int v) {
        return 0;
    }

    public int I(int v, int v1) {
        return this.y(v, v1 + 1);
    }

    public int J(int v, int v1) {
        return 0;
    }

    private static int K(int v) [...] // Inlined contents

    public boolean L(int v) {
        return true;
    }

    public void N() {
        this.w();
        this.notifyDataSetChanged();
    }

    public void O(int v) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        this.notifyItemRangeChanged(a$c0.a, a$c0.c);
    }

    public void P(int v) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        this.notifyItemRangeChanged(((c)arrayList0.get(v)).a, 1);
    }

    public void Q(int v) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        this.notifyItemRangeInserted(a$c0.a, a$c0.c);
    }

    public void R(int v, int v1) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        if(v1 >= a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v1 + ", size is " + a$c0.b);
        }
        this.notifyItemChanged(a$c0.a + v1 + 1);
    }

    public void S(int v, int v1) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        if(v1 < 0 || v1 >= a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v1 + ", size is " + a$c0.b);
        }
        this.notifyItemInserted(a$c0.a + v1 + 1);
    }

    public void T(int v, int v1, int v2) {
        this.w();
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        if(v1 < 0 || v1 >= a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v1 + ", size is " + a$c0.b);
        }
        int v3 = v1 + v2;
        if(v3 > a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v3 + ", size is " + a$c0.b);
        }
        this.notifyItemRangeInserted(a$c0.a + v1 + 1, v2);
    }

    public void U(int v, int v1, int v2) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.w();
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        if(v1 < 0 || v1 >= a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v1 + ", size is " + a$c0.b);
        }
        int v3 = v1 + v2;
        if(v3 > a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v3 + ", size is " + a$c0.b);
        }
        this.w();
        this.notifyItemRangeRemoved(a$c0.a + v1 + 1, v2);
    }

    public void V(int v, int v1) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.w();
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        if(v1 < 0 || v1 >= a$c0.b) {
            throw new IndexOutOfBoundsException("Invalid index " + v1 + ", size is " + a$c0.b);
        }
        this.w();
        this.notifyItemRemoved(a$c0.a + v1 + 1);
    }

    public void W(int v) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            this.w();
            this.N();
            return;
        }
        c a$c0 = (c)arrayList0.get(v);
        this.w();
        this.notifyItemRangeRemoved(a$c0.a, a$c0.c);
    }

    public abstract void X(com.codewaves.stickyheadergrid.a.a arg1, int arg2);

    public abstract void Y(b arg1, int arg2, int arg3);

    public final void Z(@NonNull d a$d0, int v) {
        if(this.a == null) {
            this.w();
        }
        int v1 = this.b[v];
        int v2 = a.K(a$d0.getItemViewType());
        switch(v2) {
            case 0: {
                this.X(((com.codewaves.stickyheadergrid.a.a)a$d0), v1);
                return;
            }
            case 1: {
                this.Y(((b)a$d0), v1, this.B(v1, v));
                return;
            }
            default: {
                throw new InvalidParameterException("invalid viewType: " + v2);
            }
        }
    }

    public abstract com.codewaves.stickyheadergrid.a.a a0(ViewGroup arg1, int arg2);

    public abstract b b0(ViewGroup arg1, int arg2);

    @NonNull
    public final d c0(@NonNull ViewGroup viewGroup0, int v) {
        switch(v & 0xFF) {
            case 0: {
                return this.a0(viewGroup0, v >> 8);
            }
            case 1: {
                return this.b0(viewGroup0, v >> 8);
            }
            default: {
                throw new InvalidParameterException("Invalid viewType: " + v);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        if(this.a == null) {
            this.w();
        }
        return this.c;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemViewType(int v) {
        int v1 = this.z(v);
        int v2 = v - ((c)this.a.get(v1)).a;
        int v3 = this.D(v1, v2);
        switch(v3) {
            case 0: {
                return (this.G(v1) & 0xFF) << 8;
            }
            case 1: {
                return (this.J(v1, v2 - 1) & 0xFF) << 8 | 1;
            }
            default: {
                return v3 & 0xFF;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.Z(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.c0(viewGroup0, v);
    }

    static int v(int v) {
        return v >> 8;
    }

    private void w() {
        this.a = new ArrayList();
        int v = this.E();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            c a$c0 = new c(null);
            a$c0.a = v2;
            a$c0.b = this.H(v1);
            a$c0.c = a$c0.b + 1;
            this.a.add(a$c0);
            v2 += a$c0.c;
        }
        this.c = v2;
        this.b = new int[v2];
        int v4 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            c a$c1 = (c)this.a.get(v3);
            for(int v5 = 0; v5 < a$c1.c; ++v5) {
                this.b[v4 + v5] = v3;
            }
            v4 += a$c1.c;
        }
    }

    private static int x(int v) [...] // Inlined contents

    private int y(int v, int v1) {
        if(this.a == null) {
            this.w();
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("section " + v + " < 0");
        }
        if(v >= this.a.size()) {
            throw new IndexOutOfBoundsException("section " + v + " >=" + this.a.size());
        }
        return ((c)this.a.get(v)).a + v1;
    }

    public int z(int v) {
        if(this.a == null) {
            this.w();
        }
        if(this.getItemCount() == 0) {
            return -1;
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("position " + v + " < 0");
        }
        if(v >= this.getItemCount()) {
            throw new IndexOutOfBoundsException("position " + v + " >=" + this.getItemCount());
        }
        return this.b[v];
    }
}

