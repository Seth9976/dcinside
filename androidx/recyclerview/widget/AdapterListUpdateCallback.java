package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

public final class AdapterListUpdateCallback implements ListUpdateCallback {
    @NonNull
    private final Adapter a;

    public AdapterListUpdateCallback(@NonNull Adapter recyclerView$Adapter0) {
        this.a = recyclerView$Adapter0;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
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
}

