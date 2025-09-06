package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract class ListAdapter extends Adapter {
    final AsyncListDiffer a;
    private final ListListener b;

    protected ListAdapter(@NonNull AsyncDifferConfig asyncDifferConfig0) {
        androidx.recyclerview.widget.ListAdapter.1 listAdapter$10 = new ListListener() {
            final ListAdapter a;

            @Override  // androidx.recyclerview.widget.AsyncListDiffer$ListListener
            public void a(@NonNull List list0, @NonNull List list1) {
            }
        };
        this.b = listAdapter$10;
        AsyncListDiffer asyncListDiffer0 = new AsyncListDiffer(new AdapterListUpdateCallback(this), asyncDifferConfig0);
        this.a = asyncListDiffer0;
        asyncListDiffer0.a(listAdapter$10);
    }

    protected ListAdapter(@NonNull ItemCallback diffUtil$ItemCallback0) {
        androidx.recyclerview.widget.ListAdapter.1 listAdapter$10 = new ListListener() {
            final ListAdapter a;

            @Override  // androidx.recyclerview.widget.AsyncListDiffer$ListListener
            public void a(@NonNull List list0, @NonNull List list1) {
            }
        };
        this.b = listAdapter$10;
        AsyncListDiffer asyncListDiffer0 = new AsyncListDiffer(new AdapterListUpdateCallback(this), new Builder(diffUtil$ItemCallback0).a());
        this.a = asyncListDiffer0;
        asyncListDiffer0.a(listAdapter$10);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.b().size();
    }

    @NonNull
    public List v() {
        return this.a.b();
    }

    protected Object w(int v) {
        return this.a.b().get(v);
    }

    public void x(@NonNull List list0, @NonNull List list1) {
    }

    public void y(@Nullable List list0) {
        this.a.f(list0);
    }

    public void z(@Nullable List list0, @Nullable Runnable runnable0) {
        this.a.g(list0, runnable0);
    }
}

