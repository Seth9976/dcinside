package com.dcinside.app.image;

import A3.p;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import m0.a;
import rx.o;
import y4.l;
import y4.m;

public final class g0 extends Adapter {
    @l
    private e0 a;
    private boolean b;

    public g0() {
        this.a = new a0(u.H());
    }

    @l
    public m0 A(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01EC, viewGroup0, false);  // layout:view_image_paging_item
        L.m(view0);
        return new m0(view0);
    }

    public void B(@l m0 m00) {
        L.p(m00, "holder");
        super.onViewRecycled(m00);
        o o0 = m00.e;
        if(o0 != null) {
            L.m(o0);
            o0.l();
        }
        com.dcinside.app.image.o.a.a(m00.b);
        m00.a.recycle();
    }

    public final void C(@l Cursor cursor0) {
        L.p(cursor0, "cursor");
        this.D(new c0(cursor0));
    }

    private final void D(e0 e00) {
        this.a = e00;
        this.notifyDataSetChanged();
    }

    public final void E(@l List list0) {
        L.p(list0, "list");
        this.D(new a0(list0));
    }

    public final void F(boolean z) {
        this.b = z;
        this.notifyDataSetChanged();
    }

    @l
    public final List G(@m String s, int v, @m String s1, @l int[] arr_v) {
        L.p(arr_v, "positions");
        List list0 = new ArrayList();
        int v1 = 0;
        if(arr_v.length == 0) {
            int v2 = this.a.getCount();
            while(v1 < v2) {
                list0.add(this.w(v1, s, v, s1));
                ++v1;
            }
            return list0;
        }
        while(v1 < arr_v.length) {
            list0.add(this.w(arr_v[v1], s, v, s1));
            ++v1;
        }
        return list0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.getCount();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((m0)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
        this.B(((m0)recyclerView$ViewHolder0));
    }

    public final int v(@m String s) {
        if(a.a.j(s)) {
            int v = this.a.getCount();
            int v1 = 0;
            while(v1 < v) {
                V v2 = this.a.get(v1).a();
                if(!L.g(s, ((String)v2.a())) && !L.g(s, ((String)v2.b()))) {
                    ++v1;
                    continue;
                }
                return v1;
            }
        }
        return -1;
    }

    private final z w(int v, String s, int v1, String s1) {
        String s2 = this.a.get(v).b(this.b);
        return z.m.a(v, s, v1, s1, s2, this.b);
    }

    @l
    public final e0 x() {
        return this.a;
    }

    public final boolean y() {
        return this.b;
    }

    public void z(@l m0 m00, int v) {
        @f(c = "com.dcinside.app.image.ImageViewerPageAdapter$onBindViewHolder$1", f = "ImageViewerPageAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.g0.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m0 l;
            final String m;

            com.dcinside.app.image.g0.a(m0 m00, String s, d d0) {
                this.l = m00;
                this.m = s;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.image.g0.a(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.n(this.m);
                return S0.a;
            }
        }

        L.p(m00, "holder");
        String s = this.a.get(v).b(this.b);
        m00.a.recycle();
        r.M(m00.d, null, new com.dcinside.app.image.g0.a(m00, s, null), 1, null);
        m00.n(s);
    }
}

