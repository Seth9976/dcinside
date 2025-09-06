package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

public abstract class SortedListAdapterCallback extends Callback {
    final Adapter a;

    public SortedListAdapterCallback(@SuppressLint({"UnknownNullness", "MissingNullability"}) Adapter recyclerView$Adapter0) {
        this.a = recyclerView$Adapter0;
    }

    @Override  // androidx.recyclerview.widget.SortedList$Callback
    @SuppressLint({"UnknownNullness"})
    public void b(int v, int v1, Object object0) {
        this.a.notifyItemRangeChanged(v, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void g(int v, int v1) {
        this.a.notifyItemRangeInserted(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void i(int v, int v1) {
        this.a.notifyItemRangeRemoved(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void j(int v, int v1) {
        this.a.notifyItemMoved(v, v1);
    }

    @Override  // androidx.recyclerview.widget.SortedList$Callback
    public void p(int v, int v1) {
        this.a.notifyItemRangeChanged(v, v1);
    }
}

