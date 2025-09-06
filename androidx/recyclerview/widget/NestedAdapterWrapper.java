package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

class NestedAdapterWrapper {
    interface Callback {
        void a(@NonNull NestedAdapterWrapper arg1, int arg2, int arg3, @Nullable Object arg4);

        void b(@NonNull NestedAdapterWrapper arg1, int arg2, int arg3);

        void c(NestedAdapterWrapper arg1);

        void d(@NonNull NestedAdapterWrapper arg1, int arg2, int arg3);

        void e(@NonNull NestedAdapterWrapper arg1, int arg2, int arg3);

        void f(@NonNull NestedAdapterWrapper arg1, int arg2, int arg3);

        void g(@NonNull NestedAdapterWrapper arg1);
    }

    @NonNull
    private final ViewTypeLookup a;
    @NonNull
    private final StableIdLookup b;
    public final Adapter c;
    final Callback d;
    int e;
    private AdapterDataObserver f;

    NestedAdapterWrapper(Adapter recyclerView$Adapter0, Callback nestedAdapterWrapper$Callback0, ViewTypeStorage viewTypeStorage0, StableIdLookup stableIdStorage$StableIdLookup0) {
        this.f = new AdapterDataObserver() {
            final NestedAdapterWrapper a;

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void f() {
                NestedAdapterWrapper.this.e = NestedAdapterWrapper.this.c.getItemCount();
                NestedAdapterWrapper.this.d.g(NestedAdapterWrapper.this);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void g(int v, int v1) {
                NestedAdapterWrapper.this.d.a(NestedAdapterWrapper.this, v, v1, null);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void h(int v, int v1, @Nullable Object object0) {
                NestedAdapterWrapper.this.d.a(NestedAdapterWrapper.this, v, v1, object0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void i(int v, int v1) {
                NestedAdapterWrapper.this.e += v1;
                NestedAdapterWrapper.this.d.f(NestedAdapterWrapper.this, v, v1);
                if(NestedAdapterWrapper.this.e > 0 && NestedAdapterWrapper.this.c.getStateRestorationPolicy() == StateRestorationPolicy.b) {
                    NestedAdapterWrapper.this.d.c(NestedAdapterWrapper.this);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void k(int v, int v1, int v2) {
                Preconditions.b(v2 == 1, "moving more than 1 item is not supported in RecyclerView");
                NestedAdapterWrapper.this.d.b(NestedAdapterWrapper.this, v, v1);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void l(int v, int v1) {
                NestedAdapterWrapper.this.e -= v1;
                NestedAdapterWrapper.this.d.e(NestedAdapterWrapper.this, v, v1);
                if(NestedAdapterWrapper.this.e < 1 && NestedAdapterWrapper.this.c.getStateRestorationPolicy() == StateRestorationPolicy.b) {
                    NestedAdapterWrapper.this.d.c(NestedAdapterWrapper.this);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void m() {
                NestedAdapterWrapper.this.d.c(NestedAdapterWrapper.this);
            }
        };
        this.c = recyclerView$Adapter0;
        this.d = nestedAdapterWrapper$Callback0;
        this.a = viewTypeStorage0.b(this);
        this.b = stableIdStorage$StableIdLookup0;
        this.e = recyclerView$Adapter0.getItemCount();
        recyclerView$Adapter0.registerAdapterDataObserver(this.f);
    }

    void a() {
        this.c.unregisterAdapterDataObserver(this.f);
        this.a.dispose();
    }

    int b() {
        return this.e;
    }

    public long c(int v) {
        return this.b.a(this.c.getItemId(v));
    }

    int d(int v) {
        return this.a.a(this.c.getItemViewType(v));
    }

    void e(ViewHolder recyclerView$ViewHolder0, int v) {
        this.c.bindViewHolder(recyclerView$ViewHolder0, v);
    }

    ViewHolder f(ViewGroup viewGroup0, int v) {
        int v1 = this.a.b(v);
        return this.c.onCreateViewHolder(viewGroup0, v1);
    }
}

